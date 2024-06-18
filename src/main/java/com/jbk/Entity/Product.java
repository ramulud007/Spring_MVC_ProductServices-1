package com.jbk.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	
	@Column(unique=true,nullable=false)
	private Long productId;
	
	@Column(unique=true,nullable=false)
	private String productName;
	
	@Column(nullable=false)
	private Double productPrice;
	
	@Column(nullable=false)
	private Double productQTY;
	
	@Column(nullable=false)
	private Long supplierId;
	
	@Column(nullable=false)
	private Long categoryId;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(Long productId, String productName, Double productPrice, Double productQTY, Long supplierId,
			Long categoryId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQTY = productQTY;
		this.supplierId = supplierId;
		this.categoryId = categoryId;
	}


	public Long getProductId() {
		return productId;
	}


	public void setProductId(Long productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public Double getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}


	public Double getProductQTY() {
		return productQTY;
	}


	public void setProductQTY(Double productQTY) {
		this.productQTY = productQTY;
	}


	public Long getSupplierId() {
		return supplierId;
	}


	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}


	public Long getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productQTY=" + productQTY + ", supplierId=" + supplierId + ", categoryId=" + categoryId + "]";
	}
	
	
}
