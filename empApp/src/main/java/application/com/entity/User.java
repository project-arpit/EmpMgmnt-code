package application.com.entity;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class User {

	private int id;
	@NotEmpty(message="Name is mandatory.")
	@Pattern(regexp="[a-z,A-Z]{2}[a-z,A-Z, ]*",
	message="Name can contain only alphabets, min length 2.")
	private String name;
	@NotEmpty(message="MailId is required.")
	@Email(message="MailId should be in proper format.")
	private String mailId;
	@NotEmpty(message="Password is required.")
	@Length(min=4,message="Password must have at least 4 chars.")
	private String password;
	private int role,status;
	
	//constants to represent the value of roles
	public static int user=1;
	public static int admin=2;
	
	//constants to represent the value of status
		public static int active=1;
		public static int inactive=2;
		public static int blocked=3;
		
		//Method to return role as a String
		public String getStatusAsString()
		{
			if(status == 1)
				return "Active";
			else if(status == 2)
				return "Inactive";
			else 
				return "Blocked";
				
		}	
		
	//Method to return role as a String
	public String getRoleAsString()
	{
		if(role==1)
			return "User";
		else
			return "Admin";
			
	}
	//getter and setter methods.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
