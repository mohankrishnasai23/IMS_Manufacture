package com.cts.imsproj.manufacture.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.cts.imsproj.manufacture.entity.Category;

public class TestProductDto {
	
	@Test
	public void testSetProductId() {
		ProductDto dto = new ProductDto();
		dto.setProductId(1);
		assertEquals(dto.getProductId(),1);
	}
	
	@Test
	public void testGetProductId() {
		ProductDto dto = new ProductDto();
		dto.setProductId(1);
		assertEquals(dto.getProductId(),1);
	}
	
	@Test
	public void testSetProdsellingPrice() {
		ProductDto dto = new ProductDto();
		dto.setProductsellingPrice(1000);
		assertEquals(dto.getProductsellingPrice(),1000);
	}
	
	@Test
	public void testGetProdsellingPrice() {
		ProductDto dto = new ProductDto();
		dto.setProductsellingPrice(1000);
		assertEquals(dto.getProductsellingPrice(),1000);
	}
	
	@Test
	public void testSetProductName() {
		ProductDto dto = new ProductDto();
		dto.setProductName("Bike");
		assertEquals(dto.getProductName(),"Bike");
	}
	
	@Test
	public void testGetProductName() {
		ProductDto dto = new ProductDto();
		dto.setProductName("Bike");
		assertEquals(dto.getProductName(),"Bike");
	}
	
	@Test
	public void testGetProductName_1() {
		ProductDto dto = new ProductDto();
		dto.setProductName("");
		assertEquals(dto.getProductName(),"");
	}
	
	@Test
	public void testCategory() {
		ProductDto dto = new ProductDto();
		Category category = new Category();
		category.setCategoryId(1);
		category.setCategoryName("Automobiles");
		assertEquals(dto.getCategory(), null);
	}
}
