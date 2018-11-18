package com.demo.datasource.service;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.demo.datasource.dao.UserDAO;
import com.demo.datasource.model.User;


@Component("userService")
public class UserService {
	
	private UserDAO userDAO;  
	
	public void init() {
		System.out.println("init");
	}
	
	public void add(User user) {
		userDAO.save(user);
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	
	@Resource(name="u")
	public void setUserDAO( UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
