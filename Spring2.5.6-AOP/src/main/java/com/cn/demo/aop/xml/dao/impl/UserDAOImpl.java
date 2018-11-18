package com.cn.demo.aop.xml.dao.impl;

import org.springframework.stereotype.Component;

import com.cn.demo.aop.xml.dao.UserDAO;
import com.cn.demo.aop.xml.model.User;

@Component("u") 
public class UserDAOImpl implements UserDAO {

	public void save(User user) {
		System.out.println("user saved!");
		// 异常一般用struts2来处理
		//throw new RuntimeException("exception!");
	}

}
