package com.cts.imsproj.manufacture.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.imsproj.manufacture.dao.ProductRepository;
import com.cts.imsproj.manufacture.dto.ProductDto;
import com.cts.imsproj.manufacture.entity.Product;

@Transactional
@Service
public class ProductService {

    @Autowired
    public ProductRepository productRepository;

    public void insert(ProductDto product) {
    	Product entity = new Product();
    	BeanUtils.copyProperties(product, entity);
        productRepository.save(entity);
    }

    public Optional<Product> find(int id) {
        return productRepository.findById(id);
    }

    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    public void updateProduct(ProductDto product) {
    	Product entity = new Product();
    	BeanUtils.copyProperties(product, entity);
        productRepository.save(entity);
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
