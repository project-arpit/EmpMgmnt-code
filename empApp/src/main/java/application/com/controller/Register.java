package application.com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import application.com.controller.*;
import application.com.dao.*;
import application.com.entities.*;
import application.com.validators.MailValidator;

@Controller
public class Register {

	//Dependency of the controller
	@Autowired
	UserDao dao;
	@Autowired
	MailValidator validator;
	
	
	//method to serve signup form
	@RequestMapping(value="/signup.mvc",
			method=RequestMethod.GET)
	public ModelAndView registrationForm()
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("signup");
		mav.addObject("user",new User());
		return mav;
	}
	
	
	@RequestMapping(value="/register.mvc",
			method=RequestMethod.POST)
	public ModelAndView registerUser(
	@Valid @ModelAttribute	User user,
	BindingResult validationResult)
	throws Exception
	{
		//custom validation is applied
		if(validator.supports(User.class))
		{
		validator.validate(user, validationResult);
		}
		ModelAndView mav=new ModelAndView();
		if(validationResult.hasErrors())
		{
			mav.setViewName("signup");
			mav.addObject("user",user);
			return mav;
		}
		else
		{	
		user.setRole(User.user);
		user.setStatus(User.active);
		dao.save(user);
		//viewName is stored in the ModelAndView
		mav.setViewName("registered");
		return mav;
		}
	}
	
	
	
}
