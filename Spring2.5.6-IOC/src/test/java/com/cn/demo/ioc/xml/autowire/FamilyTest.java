package com.cn.demo.ioc.xml.autowire;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FamilyTest {

	@Test
	public void test() {
		BeanFactory applicationContext = new ClassPathXmlApplicationContext("beans-ioc-autowire.xml");
		// 执行 applicationContext.getBean("family")的时候隐形调用applicationContext).start()
		((ClassPathXmlApplicationContext) applicationContext).start();
		Family family = (Family) applicationContext.getBean("family");
		System.out.println(family.getGirl().getGirlId());
	}

}
