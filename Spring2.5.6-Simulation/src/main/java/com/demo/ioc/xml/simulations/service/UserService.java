package com.demo.ioc.xml.simulations.service;

import com.demo.ioc.xml.simulations.dao.UserDAO;
import com.demo.ioc.xml.simulations.domain.User;

public class UserService {
	
	private UserDAO userDAO;
	
	public void add(User user) {
		userDAO.save(user);
	}
	
	public UserDAO getUserDAO() {
		return userDAO;
	}
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
}
