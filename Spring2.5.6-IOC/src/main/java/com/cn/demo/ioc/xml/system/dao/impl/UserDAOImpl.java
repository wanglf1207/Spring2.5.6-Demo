package com.cn.demo.ioc.xml.system.dao.impl;

import com.cn.demo.ioc.xml.system.dao.UserDAO;
import com.cn.demo.ioc.xml.system.model.User;


public class UserDAOImpl implements UserDAO {

	public void save(User user) {
		//Hibernate
		//JDBC
		//XML
		//NetWork
		System.out.println("user saved!");
	}

	public int deleteUser(User user) {
		System.out.println("user deleted...");
		return 0;
	}

}
