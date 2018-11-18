package com.cn.demo.aop.principle.dao.impl;

import com.cn.demo.aop.principle.dao.UserDAO;
import com.cn.demo.aop.principle.model.User;

public class UserDAOImpl implements UserDAO {

	public void save(User user) {
		System.out.println("user saved!");
	}

	public void delete() {
		System.out.println("user delete!");
	}
	
}
