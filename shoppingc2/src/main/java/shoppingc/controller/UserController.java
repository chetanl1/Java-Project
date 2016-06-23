package shoppingc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import shoppingc.dao.UserDAO;

@Controller
public class UserController {
	   @Autowired
	   private UserDAO userDAO;

	   @RequestMapping("/isValidUser")
	   public ModelAndView showmessage(@RequestParam(value="name") String name,
	    @RequestParam(value="password") String password)
	   	   {	        
	    	String message;
	    	if(userDAO.isValidUser(name,password))
	    	{
	    		message="Valid Credentials";
	        	ModelAndView mv = new ModelAndView("adminHome");
	 	 	   mv.addObject("message",message);
	 	 	   mv.addObject("name",name);
		 	   return mv;
	 		    	}
	    	else
	    	{
	    		message="Invalid Credentials";
	        	ModelAndView mv = new ModelAndView("Login");
	 	 	   mv.addObject("message",message);
	 	 	   mv.addObject("name",name);
		 	   return mv;
	 		    	}
	 		    
	    }
}