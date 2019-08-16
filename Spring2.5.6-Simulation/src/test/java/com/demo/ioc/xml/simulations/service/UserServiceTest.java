package com.demo.ioc.xml.simulations.service;

import com.demo.ioc.xml.simulations.domain.User;
import com.demo.ioc.xml.simulations.service.UserService;
import com.demo.ioc.xml.simulations.spring.BeanFactory;
import com.demo.ioc.xml.simulations.spring.ClassPathXmlApplicationContext;
import org.junit.Test;

public class UserServiceTest {
	@Test
	public void testAdd() throws Exception {
		BeanFactory applicationContext = new ClassPathXmlApplicationContext();
		UserService service = (UserService)applicationContext.getBean("userService");
		User u = new User();
		u.setUsername("admin");
		u.setPassword("password");
		service.add(u);
	}
}
