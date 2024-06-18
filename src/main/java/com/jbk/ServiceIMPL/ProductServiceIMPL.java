package com.jbk.ServiceIMPL;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Dao.ProductDao;
import com.jbk.Entity.Product;
import com.jbk.Service.ProductService;

@Service
public class ProductServiceIMPL implements ProductService {

	@Autowired
	private ProductDao productDao;
	
	@Override
	public Boolean AddProduct(Product product) {
	
		String id= new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new java.util.Date());
		product.setProductId(Long.parseLong(id));
		
		return productDao.AddProduct(product);
	}

	@Override
	public List<Product> getAllProducts() {
	
		return productDao.getAllProducts();
	
	}

}
