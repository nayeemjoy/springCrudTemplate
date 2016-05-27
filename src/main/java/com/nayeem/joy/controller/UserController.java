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
	
	@RequestMapping(value = "/users")
	public String users(){
		
		return "index";
	}
	@RequestMapping(value = "/user/create")
	public String create(){
		System.out.println("Create Form");
		return "index";
	}
}
