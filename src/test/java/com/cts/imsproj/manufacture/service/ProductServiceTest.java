package com.cts.imsproj.manufacture.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cts.imsproj.manufacture.dao.ProductRepository;
import com.cts.imsproj.manufacture.dto.ProductDto;
import com.cts.imsproj.manufacture.entity.Product;

public class ProductServiceTest {

	@InjectMocks
	private ProductService productService ;
	@Mock
	public ProductRepository productRepository;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void testInsert() {
		ProductDto productDto = new ProductDto();
		productDto.setProductId(123);
		ArgumentCaptor<Product> productArgumentCaptor = ArgumentCaptor.forClass(Product.class) ;
		when(productRepository.save(productArgumentCaptor.capture())).thenReturn(new Product()) ;
		productService.insert(productDto);
		assertEquals(productDto.getProductId(), productArgumentCaptor.getAllValues().get(0).getProductId());
	}
	@Test
	public void testFind() {
		Optional<Product> optional = Optional.of(new Product()) ;
		when(productRepository.findById(123)).thenReturn(optional);
		Optional<Product> actualOptional = productService.find(123);
		assertEquals(optional, actualOptional);
	}
	
	@Test
	public void testFindAll() {
		Iterable<Product> iterable = new ArrayList<Product>();
		when(productRepository.findAll()).thenReturn(iterable);
		Iterable<Product> actualIterable = productService.findAll();
		assertEquals(iterable, actualIterable);
	}
	
	@Test
	public void testUpdateProduct() {
		ProductDto productDto = new ProductDto();
		productDto.setProductId(123);
		ArgumentCaptor<Product> productArgumentCaptor = ArgumentCaptor.forClass(Product.class) ;
		when(productRepository.save(productArgumentCaptor.capture())).thenReturn(new Product());
		productService.updateProduct(productDto);
		assertEquals(productDto.getProductId(), productArgumentCaptor.getAllValues().get(0).getProductId());
	}
	@Test
	public void testDeleteProduct() {
		productService.deleteProduct(123);
		verify(productRepository).deleteById(123);
	}
}
