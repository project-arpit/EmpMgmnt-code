package application.com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import application.com.dao.UserDao;
import application.com.entities.User;

@Controller
public class UserController {

	//Dependency of the controller
	@Autowired
	UserDao dao;
	
	@Autowired
	HttpSession session;
	
	
	//Method to generate login form
		@RequestMapping(value="/signin.mvc",
				method=RequestMethod.GET)
		public String loginForm()
		throws Exception
		{
		return "signin";
		}
	
	
	//Method to process login request
	@RequestMapping(value="/login.mvc",
			method=RequestMethod.POST)
	public String registerUser(
    @RequestParam("mailId")	String m, 
    @RequestParam("password") String p)
	throws Exception
	{
		User user=dao.find(m,p);
		if(user==null)
		{
			return "relogin";
		}
		else
		{
			//user object is stored in the session
			session.setAttribute("user",user);
			return "home";
		}
	}
	
	//Method to process logout request
		@RequestMapping("/logout.mvc")
		public String logout()
		throws Exception
		{
			//session is invalidated
				session.invalidate();
				return "loggedOut";
		}
		//Method to process view profile request
		@RequestMapping("/profile.mvc")
		public String viewProfile()
				throws Exception
		{
					return "userProfile";
		}
		//Method to process update profile request
		@RequestMapping(value="/profileUpdate.mvc",
				method=RequestMethod.POST)
		public String updateProfile(
			@ModelAttribute	User user)
						throws Exception
		{
			//user details are also updated in the session
			User current=(User)session.getAttribute("user");
			current.setName(user.getName());
			current.setMailId(user.getMailId());
			//UserId is set in the new object
			user.setId(current.getId());
			//user is updated in the db
			dao.update(user);
			
			return "profileUpdated";
		}
			
}
