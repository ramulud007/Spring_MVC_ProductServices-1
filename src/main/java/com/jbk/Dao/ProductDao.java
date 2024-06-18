package com.jbk.Dao;

import java.util.List;

import com.jbk.Entity.Product;

public interface ProductDao {

	public Boolean AddProduct(Product product);
	public List<Product> getAllProducts();

}
