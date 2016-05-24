package com.nayeem.joy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "users")
public class User {
	
	@Id
	@GeneratedValue
	protected int id;
	protected String username;
	
	protected String password;
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + "]";
	}
	
	
}
