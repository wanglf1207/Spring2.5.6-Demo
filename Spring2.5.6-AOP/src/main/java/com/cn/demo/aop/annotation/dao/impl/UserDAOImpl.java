package com.cn.demo.aop.annotation.dao.impl;

import org.springframework.stereotype.Component;

import com.cn.demo.aop.annotation.dao.UserDAO;
import com.cn.demo.aop.annotation.model.User;

@Component("u")
public class UserDAOImpl implements UserDAO {

	public void save(User user) {
		System.out.println("user saved!");
		// 异常一般用struts2来处理
		//throw new RuntimeException("exception!");
	}

}
