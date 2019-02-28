package application.com.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import application.com.dao.UserDao;
import application.com.entities.User;

@Component
public class MailValidator implements Validator {

	@Autowired
	UserDao dao;
	
	
	public boolean supports(Class<?> c) {
		// this method is used to specify objects
		// of which classes can be validated using
		//this validator
		return c.equals(User.class);
	}


	public void validate(Object model, Errors bindingResult) 
	{
		// this method contains the custom validation
		//logic.
		User user=(User)model;
		if(dao.exists(user.getMailId()))
		{
			//An error message is stored in the
			//bindingResult object.
			bindingResult.rejectValue(
				"mailId",
				"error.mailId", 
				"MailId already registered."	);
		}

	}

}
