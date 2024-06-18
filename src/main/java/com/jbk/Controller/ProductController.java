package com.jbk.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.jbk.Entity.Product;
import com.jbk.Service.ProductService;


@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping(value="/add-Product")
	public String AddProduct(@ModelAttribute Product product, Model model) {
		
		Boolean isAdded=productService.AddProduct(product);
		
		if(isAdded) {
			model.addAttribute("status", 1);
			model.addAttribute("msg", "Product Added Successfully with Name: "+product.getProductName());
			return "homePage";
		}else {
			model.addAttribute("status", 0);
			model.addAttribute("msg", "Product Already Exists with this Name: "+product.getProductName());
			return "homePage";
		}
		
	}

	

	@GetMapping("/get-All-Products")
	public String getAllProducts(Model model) {
		
		List<Product> allProducts = productService.getAllProducts();
		model.addAttribute("products", allProducts);
		return "ListOfProducts";
	}
	
	
}
