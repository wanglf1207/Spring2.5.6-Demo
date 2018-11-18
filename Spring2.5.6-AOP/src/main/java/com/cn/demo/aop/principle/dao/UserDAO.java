package com.cn.demo.aop.principle.dao;
import com.cn.demo.aop.principle.model.User;

public interface UserDAO {
	public void save(User user);
	public void delete();
}
