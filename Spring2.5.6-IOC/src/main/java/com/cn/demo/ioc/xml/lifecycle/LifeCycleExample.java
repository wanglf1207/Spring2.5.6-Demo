package com.cn.demo.ioc.xml.lifecycle;

public class LifeCycleExample {

		public void init() {
			System.out.println("init method...");
		}
		
		public void cleanup() {
			System.out.println("destroy method...");
		}
}
