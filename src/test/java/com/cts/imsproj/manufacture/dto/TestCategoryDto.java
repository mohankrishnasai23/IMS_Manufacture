package com.cts.imsproj.manufacture.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.cts.imsproj.manufacture.entity.Product;

public class TestCategoryDto {
	
	@Test
	public void testSetCategoryId() {
		CategoryDto dto = new CategoryDto();
		dto.setCategoryId(100);
		assertEquals(dto.getCategoryId(),100);
	}
	
	@Test
	public void testGetCategoryId() {
		CategoryDto dto = new CategoryDto();
		dto.setCategoryId(100);
		assertEquals(dto.getCategoryId(),100);
	}
	
	@Test
	public void testSetCategoryName() {
		CategoryDto dto = new CategoryDto();
		dto.setCategoryName("Mobiles");
		assertEquals(dto.getCategoryName(),"Mobiles");
	}
	
	@Test
	public void testGetCategoryName() {
		CategoryDto dto = new CategoryDto();
		dto.setCategoryName("Mobiles");
		assertEquals(dto.getCategoryName(),"Mobiles");
	}
	
	@Test
	public void testProducts() {
		List<Product> list = new ArrayList();
		Product product = new Product();
		CategoryDto dto = new CategoryDto();
		product.setProductId(11);
		product.setProductName("Bike");
		product.setProductsellingPrice(50000);
		
		Product product1 = new Product();
		product1.setProductId(11);
		product1.setProductName("Bike");
		product1.setProductsellingPrice(50000);
		list.add(product1);
		list.add(product);
		assertEquals(dto.getProducts(), null);
	}
}
