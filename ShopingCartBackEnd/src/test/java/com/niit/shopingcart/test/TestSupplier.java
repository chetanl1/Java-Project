package com.niit.shopingcart.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shopingcart.dao.SupplierDAO;
import com.niit.shopingcart.model.Supplier;



public class TestSupplier {
	
	static AnnotationConfigApplicationContext context;
	
	public TestSupplier()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shopingcart");
		context.refresh();
	}
	
	public static void createSupplier(Supplier supplier)
	{
		
		SupplierDAO  supplierDAO =  (SupplierDAO) context.getBean("supplierDAO");
		supplierDAO.saveOrUpdate(supplier);
		
		
	}
	
	

	public static void main(String[] args) {
		
		TestSupplier t1 = new TestSupplier();
		Supplier supplier =(Supplier) context.getBean("supplier");
		supplier.setId("admin");
		supplier.setAddress("Bangalore");
		supplier.setName("Chetan");
		
		t1.createSupplier(supplier);
		
		
	}


}
