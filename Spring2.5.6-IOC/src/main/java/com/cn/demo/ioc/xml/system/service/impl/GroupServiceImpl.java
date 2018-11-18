package com.cn.demo.ioc.xml.system.service.impl;

import com.cn.demo.ioc.xml.system.dao.GroupDAO;
import com.cn.demo.ioc.xml.system.model.Group;
import com.cn.demo.ioc.xml.system.service.GroupService;

public class GroupServiceImpl implements GroupService {

	GroupDAO groupDAO;
	
	public int saveGroup(Group group) {
		return groupDAO.insertGroup(group);
	}

	public GroupServiceImpl(GroupDAO groupDAO) {
		super();
		this.groupDAO = groupDAO;
	}

}
