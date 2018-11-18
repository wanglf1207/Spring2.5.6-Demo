package com.cn.demo.ioc.annotation.autowired.dao.impl;

import org.springframework.stereotype.Component;

import com.cn.demo.ioc.annotation.autowired.dao.UserDAO;
import com.cn.demo.ioc.annotation.autowired.model.User;

/*
 * @Component /默认它的key就是userDAOImpl
 */
@Component(value="userDAO")
public class UserDAOImpl implements UserDAO {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void save(User user) {
		System.out.println("user saved...");
	}

	@Override
	public String toString() {
		return "id" + id;
	}
}
