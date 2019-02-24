package application.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import application.com.entities.User;

@Repository
public class UserDao 
{
//Dependency of the Dao
	@Autowired
	JdbcTemplate template;
	
	//Method to save User object.
	public void save(User user) throws Exception
	{
	final String query="insert into Users (name,mailId,password,role,status) values(?,?,?,?,?)";	
	template.update(query, user.getName(),user.getMailId(),
			user.getPassword(),user.getRole(),user.getStatus());
	}
	//Method to update User object.
   public void update(User user) throws Exception
	{
	final String query="update Users set name=?, mailId=? where id=?";
	template.update(query, user.getName(),
			user.getMailId(),user.getId());
	
	}
 //Method to search a User using mailId and password
   public User find(String m, String p) 
	{
	  User user=null; 
	final String query="select * from Users where mailId=? and password=?";
	try
	{
		return (User) template.queryForObject(query,new String[]{m,p},
				new UserMapper());
		
	}catch(Exception e)
	{
		System.out.println(e);
		return user;
	}
	
	}
   
 //Method to search a User using mailId
   public boolean exists(String m) 
	{
	  boolean flag=false;
	final String query="select * from Users where mailId=?";
	try
	{
		template.queryForObject(query,new String[]{m},
				new UserMapper());
		flag=true;
	}catch(Exception e)
	{
		System.out.println(e);
		
	}
	return flag;
	}
	
	
   //class to map a record to the UserObject
   class UserMapper implements RowMapper<User>
   {

	public User mapRow(ResultSet rset, int index)throws SQLException {
		User user=new User();
		user.setId(rset.getInt(1));
		user.setName(rset.getString(2));
		user.setMailId(rset.getString(3));
		user.setPassword(rset.getString(4));
		user.setRole(rset.getInt(5));
		user.setStatus(rset.getInt(6));
		return user;
	}
   
   }
}

















