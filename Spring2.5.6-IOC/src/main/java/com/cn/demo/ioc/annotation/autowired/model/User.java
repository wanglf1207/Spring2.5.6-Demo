package com.cn.demo.ioc.annotation.autowired.model;

public class User {
	
	private String name;
	private String password;
	
	public User() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
