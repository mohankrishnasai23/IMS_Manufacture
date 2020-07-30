package com.cts.imsproj.manufacture.dto;

import java.io.Serializable;

import com.cts.imsproj.manufacture.entity.Category;

public class ProductDto implements Serializable {
		private static final long serialVersionUID = 1L;

		private int productId;

		private String productName;

		private double productsellingPrice;

		private Category category;

		public int getProductId() {
			return this.productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}


		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public double getProductsellingPrice() {
			return this.productsellingPrice;
		}

		public void setProductsellingPrice(double productsellingPrice) {
			this.productsellingPrice = productsellingPrice;
		}

		public Category getCategory() {
			return this.category;
		}

		public void setCategory(Category category) {
			this.category = category;
		}
	}
