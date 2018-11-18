package com.demo.datasource.service;


import com.demo.datasource.model.User;
import com.demo.datasource.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

    @Test
    public void addUser() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans-datasource.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");

        // create user object
        User user = new User();
        user.setUsername("wanglf");
        user.setPassword("123456");

        // add user object
        userService.add(user);
    }
}
