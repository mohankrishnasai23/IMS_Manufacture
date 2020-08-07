package com.cts.imsproj.manufacture.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cts.imsproj.manufacture.dto.ProductDto;
import com.cts.imsproj.manufacture.entity.Product;
import com.cts.imsproj.manufacture.service.ProductService;

public class ProductControllerTest {

	@InjectMocks
	private ProductController productController ;
	@Mock
	 public ProductService productService;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void testGetAllProducts() {
		Iterable<Product> iterable = new ArrayList<Product>();
		when(productService.findAll()).thenReturn(iterable);
		Iterable<Product> actualIterable = productController.getAllProducts();
		assertEquals(iterable, actualIterable);
	}
	
	@Test
	public void testSearchProduct() {
		Optional<Product> optional = Optional.of(new Product()) ;
		when(productService.find(123)).thenReturn(optional);
		Optional<Product> actualOptional = productController.searchProduct(123);
		assertEquals(optional, actualOptional);
	}
	@Test
	public void testAddProduct() {
		ProductDto productDto = new ProductDto();
		productDto.setProductId(123);
		productController.addProduct(productDto);
		verify(productService).insert(productDto);
	}
	@Test
	public void testUpdateProduct() {
		ProductDto productDto = new ProductDto();
		productController.updateProduct(productDto);
		verify(productService).updateProduct(productDto);
	}
	@Test
	public void testDeleteProduct() {
		productController.deleteProduct(123);
		verify(productService).deleteProduct(123);
	}
}
