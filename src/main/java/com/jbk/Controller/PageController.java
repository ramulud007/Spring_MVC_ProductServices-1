package com.jbk.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {


	@GetMapping(value="/")
	public String LoginPage() {
		return "login";
	}
	

	@GetMapping(value="/home-Page")
	public String homePage() {
		return "homePage";
	}
	
	@GetMapping(value="/add-User-Page")
	public String addUserPage() {
		return "addUser";
	}
	
	
	@GetMapping(value="/add-Product-Page")
	public String addProductPage() {
		return "add-Product";
	}


}
