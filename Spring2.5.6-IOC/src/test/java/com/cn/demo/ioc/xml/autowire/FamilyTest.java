package com.cn.demo.ioc.xml.autowire;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FamilyTest {

	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-ioc-autowire.xml");
		Family family = (Family) applicationContext.getBean("family");
		System.out.println(family.getGirl().getGirlId());
	}

}
