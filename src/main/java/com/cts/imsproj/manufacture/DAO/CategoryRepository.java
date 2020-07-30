package com.cts.imsproj.manufacture.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.imsproj.manufacture.entity.Category;


@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {


}
