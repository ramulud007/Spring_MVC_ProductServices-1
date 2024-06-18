package com.jbk.Service;

import java.util.List;

import com.jbk.Entity.Product;

public interface ProductService {

	public Boolean AddProduct(Product product);
	public List<Product> getAllProducts();
}
