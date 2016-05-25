package com.nayeem.joy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nayeem.joy.dao.BaseDao;
import com.nayeem.joy.dao.BaseDaoImpl;
import com.nayeem.joy.entity.User;

@Controller
public class UserController {
	
	@Autowired
	private BaseDao baseDao;
	
	@RequestMapping(value = "user/create")
	public String createForm(){
		System.out.println("Register");
		return "user/register";
	}
	
	@RequestMapping(value = "/user/store", method = RequestMethod.POST)
	public String saveUser(User user){
		
		baseDao.persist(user);
		System.out.println(user.toString());
		return "user/success";
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
