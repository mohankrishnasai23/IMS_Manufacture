package com.cts.imsproj.manufacture.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.imsproj.manufacture.dao.CategoryRepository;
import com.cts.imsproj.manufacture.dto.CategoryDto;
import com.cts.imsproj.manufacture.entity.Category;

@Transactional
@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public void insert(CategoryDto category) {
		Category entity = new Category();
		BeanUtils.copyProperties(category, entity);
		categoryRepository.save(entity);
	}

	public Optional<Category> findById(int id) {
		return categoryRepository.findById(id);
	}

	public Iterable<Category> findAll() {
		return categoryRepository.findAll();
	}

	public void updateCategory(CategoryDto category) {
		Category entity = new Category();
		BeanUtils.copyProperties(category, entity);
		categoryRepository.save(entity);
	}

	public void deleteCategory(int id) {

		categoryRepository.deleteById(id);
	}

}
