package com.cn.demo.ioc.xml.lifecycle;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LifeCycleExampleTest {

	@Test
	public void test() {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-ioc-lifecycle.xml");
		
		applicationContext.getBeanDefinitionCount();
		
		/*
		 * ApplicationContext里没有destroy方法
		 * web容器管理的时候会自动调用destroy方法，这里只是模拟
		 */
		applicationContext.destroy();
		
	}

}
