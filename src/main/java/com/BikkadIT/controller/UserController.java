package com.BikkadIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.BikkadIT.entity.User;
import com.BikkadIT.service.UserServiceI;

@Controller
public class UserController {
	@Autowired
	private UserServiceI userServiceI;
	@GetMapping("/welcome")
	
	public String loadForm() {
		
		return "registration";
		
	}
	@PostMapping("/reg")
	public String userRegistration(User user,Model model) {
		System.out.println("Controller layer Method");
		
		System.out.println(user);
		User user2=userServiceI.saveUser(user);
		model.addAttribute("USER",user2);
		return "userSuccess";
		
	}

}
