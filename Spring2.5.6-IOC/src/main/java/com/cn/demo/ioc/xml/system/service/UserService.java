package com.cn.demo.ioc.xml.system.service;
import com.cn.demo.ioc.xml.system.dao.UserDAO;
import com.cn.demo.ioc.xml.system.model.User;



public class UserService {
	
	private UserDAO userDAO;  
	
	public void add(User user) {
		userDAO.save(user);
	}
	
	public int deleteUser(User user) {
		return userDAO.deleteUser(user);
	}
	public UserDAO getUserDAO() {
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
}
