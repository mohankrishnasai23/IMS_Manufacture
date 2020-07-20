package com.cts.imsproj.manufacture.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.imsproj.manufacture.entity.Product;


@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
