package com.rony.dao.test;

import com.rony.dao.UserDao;
import com.rony.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config.xml");
//        UserDao dao = (UserDao) context.getBean("userDao");
//        dao.say();
//        UserService service= (UserService) context.getBean("userService");
        UserService service= (UserService) context.getBean("service2");
        service.say();
//        System.out.println(context.getBean("userService"));
//        System.out.println(context.getBean("userService"));
//        ------------------------------------------------------
        System.out.println(service);
    }
}
