package com.cts.imsproj.manufacture.dto;

import java.io.Serializable;
import java.util.List;

import com.cts.imsproj.manufacture.entity.Product;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class CategoryDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private int categoryId;

	private String categoryName;

	private List<Product> products;

	public int getCategoryId() {
		return this.categoryId;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@JsonIgnore
	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
