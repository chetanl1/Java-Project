package com.niit.shopingcart.test;

import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shopingcart.dao.CartDAO;
import com.niit.shopingcart.model.Cart;

public class CartTest {
	
public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shopingcart");
		context.refresh();
		
	Cart c =(Cart)	  context.getBean("cart");
	
	CartDAO cartDAO = (CartDAO)  context.getBean("cartDAO");
	
	//c.setId(001);
	c.setProductName("Product 7");
	c.setPrice(1200.0);
	c.setQuantity(2);
	c.setStatus('s');
	c.setUserID("as");
	
	cartDAO.saveOrUpdate(c);
	
	
		
		
		
	}
}


	

