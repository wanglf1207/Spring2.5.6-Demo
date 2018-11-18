package com.cn.demo.ioc.annotation.autowired.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.cn.demo.ioc.annotation.autowired.dao.UserDAO;
import com.cn.demo.ioc.annotation.autowired.model.User;

@Scope("prototype")
@Service(value="userService")
public class UserService {

	private UserDAO userDAO;

	@PostConstruct
	public void init() {
		System.out.println("init...");
	}
	public void add( User user) {
		userDAO.save(user);
	}

	public UserDAO getUserDao() {
		return userDAO;
	}
	/* 自动从容器找一个对应类型的bean注入进来，默认是byType
	 * 当配置文件里有两个bean，虽然名字不一样，但是也会报错，用@qualifier区分
	 * @AutoWired可以和@Qualifier混合使用，但是autowire用的并不多
	 *
	 * resouce默认byName，如果找不到就按类型找
	 * @Resource(name="u")
	 * @Resource的含义是在这里引用的一个资源，这个资源的类型和userDAO一样
	 * 推荐使用resource，不推荐autowired
	 */
	/*@Autowired
	public void setUserDAO(@Qualifier("userDAO")UserDAO userDAO) {
		this.userDAO = userDAO;
	}*/
	@Resource(name="userDAO")
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy...");
	}

}
