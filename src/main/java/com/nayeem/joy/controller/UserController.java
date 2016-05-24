package com.nayeem.joy.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nayeem.joy.entity.User;

@Controller
public class UserController {
	@RequestMapping(value = "/users", params = "register")
	public String createForm(){
		return "user/register";
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public String saveUser(User user){
		
		
		System.out.println(user.toString());
		return "redirect:/user/"+user.getUsername();
	}
	@RequestMapping(value = "/user/{userId}")
	public String getUser(@PathVariable String userId , Map<String, Object> model){
		System.out.println(userId);
		User user = new User();
		user.setUsername(userId);
		user.setPassword("a");
//		System.out.println(user.toString());
		
		model.put("user", user);
		return "user/view";
	}
}
