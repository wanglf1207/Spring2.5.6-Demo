package com.cn.demo.ioc.xml.system.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cn.demo.ioc.xml.system.model.Group;

public class GroupServiceTest {

	@Test
	public void testSaveGroup() {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-ioc-injection.xml");
		GroupService groupService = (GroupService) applicationContext.getBean("groupService");
		
		Group group = new Group();
		group.setGroupId("123");
		group.setGroupName("¿ª·¢×é");
		groupService.saveGroup(group);
	}

}
