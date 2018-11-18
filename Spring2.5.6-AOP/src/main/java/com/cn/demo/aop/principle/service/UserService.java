package com.cn.demo.aop.principle.service;

import com.cn.demo.aop.principle.dao.UserDAO;
import com.cn.demo.aop.principle.model.User;

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
