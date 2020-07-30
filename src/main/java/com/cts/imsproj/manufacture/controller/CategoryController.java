package com.cts.imsproj.manufacture.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.imsproj.manufacture.dto.CategoryDto;
import com.cts.imsproj.manufacture.entity.Category;
import com.cts.imsproj.manufacture.service.CategoryService;


@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    public CategoryService categoryService;

    @GetMapping("/getall")
    public Iterable<Category> getAllCategory() {
        return categoryService.findAll();
    }

    @GetMapping("find/{id}")
    public Optional<Category> searchCategory(@PathVariable int id) {
        return categoryService.findById(id);
    }

    @PostMapping("/add")
    public void addCategory(@RequestBody CategoryDto category) {
        categoryService.insert(category);
    }

    @PutMapping("update/{id}")
    public void updateCategory(@RequestBody CategoryDto category) {
        categoryService.updateCategory(category);
    }

    @DeleteMapping("delete/{id}")
    public void deleteCategory(@PathVariable int id) {
        categoryService.deleteCategory(id);
    }


}
