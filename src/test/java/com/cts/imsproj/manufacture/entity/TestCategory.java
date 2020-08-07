package com.cts.imsproj.manufacture.entity;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestCategory {

	@Test
	public void testSetCategoryId() {
		Category entity = new Category();
		entity.setCategoryId(100);
		assertTrue(entity.getCategoryId()==100);
	}
	
	@Test
	public void testGetCategoryId() {
		Category entity = new Category();
		entity.setCategoryId(100);
		assertTrue(entity.getCategoryId()==100);
	}
	
	@Test
	public void testSetCategoryName() {
		Category entity = new Category();
		entity.setCategoryName("Mobiles");
		assertTrue(entity.getCategoryName()=="Mobiles");
	}
	
	@Test
	public void testGetCategoryName() {
		Category entity = new Category();
		entity.setCategoryName("Mobiles");
		assertTrue(entity.getCategoryName()=="Mobiles");
	}
	
	@Test
	public void testProducts() {
		List<Product> list = new ArrayList();
		Product product = new Product();
		Category entity = new Category();
		product.setProductId(11);
		product.setProductName("Bike");
		product.setProductsellingPrice(50000);
		
		Product product1 = new Product();
		product1.setProductId(11);
		product1.setProductName("Bike");
		product1.setProductsellingPrice(50000);
		list.add(product1);
		list.add(product);
		assertEquals(entity.getProducts(), null);
	}

}
