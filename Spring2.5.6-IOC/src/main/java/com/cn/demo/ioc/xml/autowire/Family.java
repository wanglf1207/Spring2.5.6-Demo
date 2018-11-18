package com.cn.demo.ioc.xml.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Family {
	
	public Girl girl;

	public Girl getGirl() {
		return girl;
	}
	
	@Autowired
	public void setGirl(Girl girl) {
		this.girl = girl;
	}
	
}
