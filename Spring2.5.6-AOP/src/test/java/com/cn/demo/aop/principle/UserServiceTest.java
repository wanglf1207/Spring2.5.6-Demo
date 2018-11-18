package com.cn.demo.aop.principle;

import java.lang.reflect.Proxy;

import org.junit.Test;

import com.cn.demo.aop.principle.aop.LogInterceptor;
import com.cn.demo.aop.principle.dao.UserDAO;
import com.cn.demo.aop.principle.dao.impl.UserDAOImpl;
import com.cn.demo.aop.principle.model.User;
import com.cn.demo.aop.principle.service.UserService;
import com.cn.demo.aop.principle.spring.BeanFactory;
import com.cn.demo.aop.principle.spring.ClassPathXmlApplicationContext;

public class UserServiceTest {
	
	@Test
	public void testAdd() throws Exception {
		BeanFactory applicationContext = new ClassPathXmlApplicationContext();
		UserService service = (UserService)applicationContext.getBean("userService");
		User u = new User();
		u.setUsername("zhangsan");
		u.setPassword("zhangsan");
		service.add(u);
	}
	
	@Test
	public void testProxy() throws Exception {
		UserDAO userDAO = new UserDAOImpl();
		// 把UserDAO交给被代理的对象
		LogInterceptor li = new LogInterceptor();
		li.setTarget(userDAO);
		/*
		 * 根据被代理对象产生一个代理
		 * 参数说明：loader：用哪个classloader产生代理对象，要和被代理对象用同一个classLoder
		 * interfaces:产生的被代理对象要实现哪些接口
		 * h:用哪个handler进行处理
		 * 注意：接口interfaces里有哪些方法，生成代理里就有哪些方法
		 * 代理中的方法每一次被调用的时候都会传给InvocationHandler
		 * 也就是传给public Object invoke(Object proxy, Method method, Object[] args)
		 * 以下指定interfaces的两种方式都行
		 */
		ClassLoader loader = userDAO.getClass().getClassLoader();
		//Class[] interfaces = new Class[]{UserDAO.class};
		@SuppressWarnings("rawtypes")
		Class[] interfaces = userDAO.getClass().getInterfaces();
		UserDAO userDAOProxy = (UserDAO) Proxy.newProxyInstance(loader, interfaces, li);
		// 打印代理的名字
		//System.out.println(userDAOProxy.getClass().getName());
		userDAOProxy.save(new User());
		userDAOProxy.delete();
		
		//可以想象的到产生的代理为
		/*class $Proxy4 implements UserDAO 
		 * {
		 * 	save(User u) {
		 * 	Method m = UserDAO.getclass.getmethod 
		 * li.invoke(this, m, u)
		 * }
		 * }
		 */

	}
}
