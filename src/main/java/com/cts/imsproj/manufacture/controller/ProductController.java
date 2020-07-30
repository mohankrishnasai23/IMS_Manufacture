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

import com.cts.imsproj.manufacture.dto.ProductDto;
import com.cts.imsproj.manufacture.entity.Product;
import com.cts.imsproj.manufacture.service.ProductService;

@RestController
@RequestMapping("categories/{id}/products")
public class ProductController {


    @Autowired
    public ProductService productService;

    @GetMapping("")
    public Iterable<Product> getAllProducts() {
        return productService.findAll();
    }

    @GetMapping("find/{id}")
    public Optional<Product> searchProduct(@PathVariable int id) {
        return productService.find(id);
    }

    @PostMapping("/add")
    public void addProduct(@RequestBody ProductDto product) {
        productService.insert(product);
    }

    @PutMapping("update/{id}")
    public void updateProduct(@RequestBody ProductDto product) {
        productService.updateProduct(product);
    }

    @DeleteMapping("delete/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
    }
}
