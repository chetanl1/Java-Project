package com.niit.shopingcart.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shopingcart.dao.UserDetailsDAO;
import com.niit.shopingcart.model.UserDetails;

public class UserDetailsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shopingcart");
		context.refresh();
		
		UserDetails u =(UserDetails)	  context.getBean("userDetails");
	
		UserDetailsDAO userDetailsDAO = (UserDetailsDAO)  context.getBean("userDetailsDAO");
	
		u.setId("sa7");
		u.setName("Sahil");
		u.setemail("sahildj96@gmail.com");
		u.setAddress("Bangalore");
		u.setmobile("9538906570");
		
		userDetailsDAO.saveOrUpdate(u); 
		
	}

}
