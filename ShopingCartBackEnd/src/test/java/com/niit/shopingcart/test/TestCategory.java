package com.niit.shopingcart.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shopingcart.dao.CategoryDAO;
import com.niit.shopingcart.model.Category;


public class TestCategory {
	
	static AnnotationConfigApplicationContext context;
	
	public TestCategory()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shopingcart");
		context.refresh();
	}
	
	public static void createCategory(Category category)
	{
		
		CategoryDAO  categoryDAO =  (CategoryDAO) context.getBean("categoryDAO");
		categoryDAO.saveOrUpdate(category);
		
		
	}
	
	

	public static void main(String[] args) {
		
		TestCategory t1 = new TestCategory();
		Category category =(Category) context.getBean("category");
		category.setId("admin");
		category.setDescription("Item");
		category.setName("Chetan");
		
		t1.createCategory(category);
		
		
	}


}
