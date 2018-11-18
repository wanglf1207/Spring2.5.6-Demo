package com.cn.demo.aop.principle.spring;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;

/**
 * 模拟Spring原理
 * @author wanglf
 *
 */
public class ClassPathXmlApplicationContext implements BeanFactory {
	
	private String id = "";
	private String clazz = "";
	private Object object = null;
	private Element element = null;
	
	private Map<String , Object> beans = new HashMap<String, Object>();
	 
	@SuppressWarnings("unchecked")
	public ClassPathXmlApplicationContext() throws Exception {
		
		System.out.println("this.getClass()" + this.getClass() + "this: " + this.toString());
		// 获取beans
		SAXBuilder saxBuilder = new SAXBuilder();
	    Document doc = saxBuilder.build(this.getClass().getClassLoader().getResourceAsStream("beans-aop-principle.xml"));
	    Element rootElement = doc.getRootElement(); 
	    List<?> list = rootElement.getChildren("bean");
	    
	    for(int i = 0;i<list.size();i++) {
	    	element = (Element)list.get(i);
	    	id = element.getAttributeValue("id");
	        clazz = element.getAttributeValue("class");
	        
	       // 实例化对象,把实例化的对象存到List中
	       object = Class.forName(clazz).newInstance();
	       beans.put(id, object);
	       
	       for(Element propertyElement : (List<Element>)element.getChildren("property")) {
	    	   
	    	   String name = propertyElement.getAttributeValue("name");
	    	   String bean = propertyElement.getAttributeValue("bean");
	    	   
	    	   Object beanObject = beans.get(bean);//UserDAOImpl instance
	    	   String methodName = "set" + name.substring(0, 1).toUpperCase() + name.substring(1);
	    	   Method m = object.getClass().getMethod(methodName, beanObject.getClass().getInterfaces()[0]);
	    	   m.invoke(object, beanObject);
	       }
	    }  
	}
	
	public Object getBean(String id) {
		return beans.get(id);
	}

}
