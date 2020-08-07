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

import com.cts.imsproj.manufacture.dao.CategoryRepository;
import com.cts.imsproj.manufacture.dto.CategoryDto;
import com.cts.imsproj.manufacture.entity.Category;

public class CategoryServiceTest {

	@InjectMocks
	private CategoryService categoryService ;
	@Mock
	private CategoryRepository categoryRepository;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testInsert() {
		CategoryDto category  = new CategoryDto();
		category.setCategoryId(123);
		Category actualCategory = new Category();
		
		ArgumentCaptor<Category> categoryArgumentCaptor = ArgumentCaptor.forClass(Category.class) ;
		when(categoryRepository.save(categoryArgumentCaptor.capture())).thenReturn(actualCategory) ;
		categoryService.insert(category);
		assertEquals(category.getCategoryId(), categoryArgumentCaptor.getAllValues().get(0).getCategoryId());
	}
	
	@Test
	public void testFindById() {
		Optional<Category> optional = Optional.of(new Category()) ;
		when(categoryRepository.findById(123)).thenReturn(optional);
		Optional<Category> actualOptional = categoryService.findById(123);
		assertEquals(optional, actualOptional);
		
	}
	
	@Test
	public void testFindAll() {
		Iterable<Category> iterable = new ArrayList<Category>();
		when(categoryRepository.findAll()).thenReturn(iterable);
		Iterable<Category> actualIterable = categoryService.findAll();
		assertEquals(iterable, actualIterable);
	}
	@Test
	public void testUpdateCategory() {
		CategoryDto category = new CategoryDto();
		category.setCategoryId(123);
		ArgumentCaptor<Category> categoryArgumentCaptor = ArgumentCaptor.forClass(Category.class) ;
		when(categoryRepository.save(categoryArgumentCaptor.capture())).thenReturn(new Category());
		categoryService.updateCategory(category);
		assertEquals(category.getCategoryId(), categoryArgumentCaptor.getAllValues().get(0).getCategoryId());
	}
	@Test
	public void testDeleteCategory() {
		categoryService.deleteCategory(123);
		verify(categoryRepository).deleteById(123);
	}
}
