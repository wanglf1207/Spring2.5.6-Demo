package com.cn.demo.aop.principle.dao;
import com.cn.demo.aop.principle.model.User;

public interface UserDAO {
	 void save(User user);
	 void delete();
}
