package com.cn.demo.aop.annotation.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//aspect是切面的意思，@Aspect修饰的类说明可以切到别的类上
//注意这里类本身也要使用@Component初始化
@Aspect
@Component
public class LogInterceptor {
	//before的意思是说在方法执行之前先执行我这个
	//要想把这个业务逻辑织到某个类的某个方法上
	//那个类必须是Spring管理起来的
	//before有自己的语法，称为织入点语法
	//看下面很神奇的织入进去了，更确切的说是切进去
	
	
	@Before("execution(public * com.cn.demo.aop.annotation.dao.impl.UserDAOImpl.save(com.cn.demo.aop.annotation.model.User))")
	public void before() {
		System.out.println("method start...");
	}
	//2：还可以这样
	/*@Before("execution(public * com.dao..*.*(..))")
	public void before() {
		System.out.println("method start...");
	}*/
	//3: afterreturning 表示方法正常执行返回
	/*@Before("execution(public * com.dao..*.*(..))")
	public void before() {
		System.out.println("method start...");
	}
	
	@AfterReturning("execution(public * com.dao..*.*(..))")
	public void after() {
		System.out.println("method end...");
	}*/
	
	//4:比较怪异的语法，Poingcut相当于一个切入点的集合，myMethod相当于给这个
	//集合起了个名字，没什么道理可讲
	/*@Pointcut("execution(public * com.dao..*.*(..))")
	public void myMethod() {}
	
	@Before("myMethod()")
	public void before() {
		System.out.println("method start...");
	}
	
	@AfterReturning("myMethod()")
	public void after() {
		System.out.println("method  afterreturning...");
	}*/
	
	//5: 测试@AfterThrowing
	/*@Pointcut("execution(public * com.dao..*.*(..))")
	public void myMethod() {}
	
	@Before("myMethod()")
	public void before() {
		System.out.println("method start...");
	}
	
	@AfterThrowing("myMethod()")
	public void after() {
		System.out.println("method after throwing...");
	}*/
	//6:around
	/*@Pointcut("execution(public * com.dao..*.*(..))")
	public void myMethod() {}
	
	@Before("myMethod()")
	public void before() {
		System.out.println("method start...");
	}
	
	@Around("myMethod()")
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("method around start...");
		pjp.proceed();
		System.out.println("method around end...");
	}*/
	//7:把业务逻辑织到业务层
	//注意UserService没有实现接口，如果类实现了接口，系统会使用JDK自带的invocationhandler
	//产生代理，否则所以要用二进制的形式才能产生代理，所以这里需要引包
	/*@Pointcut("execution(public * com.service..*.add(..))")
	public void myMethod() {}*/
	
	/*@Before("myMethod()")
	public void before() {
		System.out.println("method start...");
	}*/
	
	/*@Around("myMethod()")
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("method around start...");
		pjp.proceed();
		System.out.println("method around end...");
	}*/
	
}
