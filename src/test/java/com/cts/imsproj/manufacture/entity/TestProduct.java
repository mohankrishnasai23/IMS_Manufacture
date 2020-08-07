package com.cts.imsproj.manufacture.entity;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestProduct {

	@Test
	public void testSetProductId() {
		Product entity = new Product();
		entity.setProductId(1);
		assertTrue(entity.getProductId()==1);
	}
	
	@Test
	public void testGetProductId() {
		Product entity = new Product();
		entity.setProductId(1);
		assertTrue(entity.getProductId()==1);
	}
	
	@Test
	public void testSetProdsellingPrice() {
		Product entity = new Product();
		entity.setProductsellingPrice(1000);
		assertTrue(entity.getProductsellingPrice()==1000);
	}
	
	@Test
	public void testGetProdsellingPrice() {
		Product entity = new Product();
		entity.setProductsellingPrice(1000);
		assertTrue(entity.getProductsellingPrice()==1000);
	}
	
	@Test
	public void testSetProductName() {
		Product entity = new Product();
		entity.setProductName("Bike");
		assertTrue(entity.getProductName()=="Bike");
	}
	
	@Test
	public void testGetProductName() {
		Product entity = new Product();
		entity.setProductName("Bike");
		assertTrue(entity.getProductName()=="Bike");
	}
	
	@Test
	public void testGetProductName_1() {
		Product entity = new Product();
		entity.setProductName("");
		assertTrue(entity.getProductName()=="");
	}

}
