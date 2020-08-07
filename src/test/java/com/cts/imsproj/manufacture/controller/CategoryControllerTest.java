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

import com.cts.imsproj.manufacture.dto.CategoryDto;
import com.cts.imsproj.manufacture.entity.Category;
import com.cts.imsproj.manufacture.service.CategoryService;

public class CategoryControllerTest {

	@InjectMocks
	private CategoryController categoryController ;
	@Mock
	public CategoryService categoryService;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetAllCategory() {
		Iterable<Category> iterable = new ArrayList<Category>();
		when(categoryService.findAll()).thenReturn(iterable);
		Iterable<Category> actualIterable = categoryController.getAllCategory();
		assertEquals(iterable, actualIterable);
	}
	
	@Test
	public void testSearchCategory() {
		Optional<Category> optional = Optional.of(new Category()) ;
		when(categoryService.findById(123)).thenReturn(optional);
		Optional<Category> actualOptional = categoryController.searchCategory(123);
		assertEquals(optional, actualOptional);
	}
	@Test
	public void testAddCategory() {
		CategoryDto category  = new CategoryDto();
		category.setCategoryId(123);
		categoryController.addCategory(category);
		verify(categoryService).insert(category);
	}
	@Test
	public void testUpdateCategory() {
		CategoryDto category  = new CategoryDto();
		categoryController.updateCategory(category);
		verify(categoryService).updateCategory(category);
	}
	@Test
	public void testDeleteCategory() {
		categoryController.deleteCategory(123);
		verify(categoryService).deleteCategory(123);
	}
}
