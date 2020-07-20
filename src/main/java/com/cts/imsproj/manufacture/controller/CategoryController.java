package com.cts.imsproj.manufacture.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.imsproj.manufacture.entity.Category;
//import com.example.entity.TheLogConverter;
//import com.example.service.CategoryLogService;
import com.cts.imsproj.manufacture.service.CategoryService;


@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    public CategoryService categoryService;

    @RequestMapping("/getall")
    public Iterable<Category> getAllCategory() {
        return categoryService.findAll();
    }

    @RequestMapping("find/{id}")
    public Optional<Category> searchCategory(@PathVariable int id) {
        return categoryService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public void addCategory(@RequestBody Category category) {
        categoryService.insert(category);
    }

    @RequestMapping(method = RequestMethod.PUT,value ="update/{id}")
    public void updateCategory(@RequestBody Category category) {
        categoryService.updateCategory(category);
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="delete/{id}")
    public void deleteCategory(@PathVariable int id) {
        categoryService.deleteCategory(id);
    }


}
