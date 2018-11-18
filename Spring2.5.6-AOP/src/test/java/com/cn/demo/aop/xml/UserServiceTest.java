package com.cn.demo.aop.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cn.demo.aop.xml.model.User;
import com.cn.demo.aop.xml.service.UserService;

public class UserServiceTest {

	@Test 
	public void testService() throws Exception {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-aop-xml.xml");
		UserService service = (UserService)ctx.getBean("userService");
		//System.out.println(service.getClass().getName());
		service.add(new User());
		
	}

}
