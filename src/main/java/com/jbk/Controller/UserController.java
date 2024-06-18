package com.jbk.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jbk.Entity.User;
import com.jbk.Service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping(value="/addUser")
	public String addUser(@ModelAttribute User user, Model model) {
		
		Boolean isAdded = userService.addUser(user);
	
		if(isAdded) {
			
			model.addAttribute("status", 1);
			model.addAttribute("msg", "User Added Succefully with Name: "+user.getuserName());
			return "homePage";
		}
		else {

			model.addAttribute("status", 0);
			model.addAttribute("msg", "User Already Exists with Name: "+user.getuserName());
			return "homePage";
		}
		
	}
	
	@PostMapping(value="/update-user")
	public ModelAndView updateUser(@ModelAttribute User user,Model model) {
		
		Boolean isUpdate=userService.updateUser(user);
		
		if(isUpdate) {
			
			model.addAttribute("status", 1);
			model.addAttribute("msg", "Profile Updated");
			return new ModelAndView("homePage");
		}
		else {
			model.addAttribute("status", 0);
			model.addAttribute("msg", "Profile not Updated");
			return new ModelAndView("homePage");
		}
	}

	@GetMapping("/get-User-By-Id")
	public String getUserById(@RequestParam ("username") String username, Model model) {
		
		User user = userService.getUserById(username);
		model.addAttribute("user", user);
		return "profile";
				
	}
	
	@GetMapping("/get-All-Users")
	public String getAllUsers(Model model) {
	
		List<User> allUsers = userService.getAllUsers();
		model.addAttribute("users", allUsers);
		return "ListOfUsers";
	
		
	}
	
	@GetMapping("/delete-User-By-Id")
	public String deleteUserById(@RequestParam("username") String username, Model model) {
		Boolean isDeleted = userService.deleteUserById(username);
		
		List<User> allUsers = userService.getAllUsers();
		model.addAttribute("users", allUsers);
		return "ListOfUsers";
	}
	
	
}
