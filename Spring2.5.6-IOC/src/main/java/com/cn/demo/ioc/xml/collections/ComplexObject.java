package com.cn.demo.ioc.xml.collections;

import java.util.List;
import java.util.Properties;


public class ComplexObject {
	
	public Properties adminEmails;
	
	public List<String> someList;

	public Properties getAdminEmails() {
		return adminEmails;
	}

	public void setAdminEmails(Properties adminEmails) {
		this.adminEmails = adminEmails;
	}

	public List<String> getSomeList() {
		return someList;
	}

	public void setSomeList(List<String> someList) {
		this.someList = someList;
	}
	
}
