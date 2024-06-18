package com.jbk.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jbk.Entity.User;
import com.jbk.Service.AuthService;



@Controller
public class AuthController {

	@Autowired
	private AuthService service;
	
	
	@PostMapping(value = "/login") //request comes from Front - end.
	public String AddUserPage(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model, HttpSession session) {

		User user = service.addUserPage(username, password);
		
		if(user!=null) {
			//To set loin person name at menu bar. we can user HttpSession session
			session.setAttribute("role", user.getRole());
			session.setAttribute("username", username);
			
			return "homePage";
		}
		else{
			
			//responds to front-end.
			
			model.addAttribute("msg", "Invalid Creditional !!");
			return"login";
		}
	}


}
