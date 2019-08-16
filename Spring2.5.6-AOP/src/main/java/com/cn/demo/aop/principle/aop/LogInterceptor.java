package com.cn.demo.aop.principle.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogInterceptor implements InvocationHandler {

	// 声明被代理的对象
	private Object target;

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	public void beforeMethod(Method method) {
		System.out.println(method.getName() + "start...");
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// 在调用任何方法之前都调用beforeMethod
		beforeMethod(method);
		method.invoke(target, args);
		return null;
	}
}
