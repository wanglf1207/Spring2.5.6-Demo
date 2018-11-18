package com.cn.demo.ioc.annotation.autowired.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cn.demo.ioc.annotation.autowired.model.User;

public class UserServiceTest {

	@Test
	public void testAdd() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-annotation.xml");
		UserService service1 = (UserService) applicationContext.getBean("userService");
		service1.add(new User());
		
		UserService service2 = (UserService) applicationContext.getBean("userService");
		service2.add(new User());
		
		//@Scope("prototype") 单利模式，所以不是同一个对象
		System.out.println(service1==service2);
	}

}
