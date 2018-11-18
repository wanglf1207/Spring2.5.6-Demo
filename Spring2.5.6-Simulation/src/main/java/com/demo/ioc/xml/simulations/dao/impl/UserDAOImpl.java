package com.demo.ioc.xml.simulations.dao.impl;

import com.demo.ioc.xml.simulations.dao.UserDAO;
import com.demo.ioc.xml.simulations.domain.User;

public class UserDAOImpl implements UserDAO {

	public void save(User user) {
		System.out.println("user saved!");
	}
}
