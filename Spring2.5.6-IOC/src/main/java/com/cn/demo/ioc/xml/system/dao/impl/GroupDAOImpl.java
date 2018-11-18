package com.cn.demo.ioc.xml.system.dao.impl;

import com.cn.demo.ioc.xml.system.dao.GroupDAO;
import com.cn.demo.ioc.xml.system.model.Group;


public class GroupDAOImpl implements GroupDAO{

	public int insertGroup(Group group) {
		System.out.println("group saved...");
		return 0;
	}

}
