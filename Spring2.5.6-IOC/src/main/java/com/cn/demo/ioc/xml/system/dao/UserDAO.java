package com.cn.demo.ioc.xml.system.dao;
import com.cn.demo.ioc.xml.system.model.User;


public interface UserDAO {
	
	public void save(User user);
	
	public int deleteUser(User user);
}
