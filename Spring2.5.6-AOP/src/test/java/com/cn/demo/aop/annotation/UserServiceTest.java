package com.cn.demo.aop.annotation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cn.demo.aop.annotation.model.User;
import com.cn.demo.aop.annotation.service.UserService;

public class UserServiceTest {

	@Test 
	public void testService() throws Exception {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-aop-annotation.xml");
		UserService service = (UserService)ctx.getBean("userService");
		service.add(new User());
		
	}

}
