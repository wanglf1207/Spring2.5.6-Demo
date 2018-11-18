package com.cn.demo.ioc.xml.system.service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cn.demo.ioc.xml.system.model.User;

//Dependency Injection
//Inverse of Control
public class UserServiceTest {

	@Test
	public void testAdd() throws Exception {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-injection.xml");
		
		UserService service = (UserService)ctx.getBean("userService");
		UserService service2 = (UserService)ctx.getBean("userService");
		
		System.out.println(service == service2);
		
		/*
		 * ±éÀúctxÖÐµÄbean
		 */
		for (int i=0;i<ctx.getBeanDefinitionCount();i++) {
			System.out.println(ctx.getBeanDefinitionNames()[i]);
		}
		
		User u = new User();
		u.setUsername("zhangsan");
		u.setPassword("zhangsan");
		service.add(u);
	}

}
