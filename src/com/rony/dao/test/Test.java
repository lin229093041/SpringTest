package com.rony.dao.test;

import com.rony.controller.CourseController;
import com.rony.dao.UserDao;
import com.rony.service.CourseService;
import com.rony.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config-annotation.xml");
//        UserDao dao = (UserDao) context.getBean("userDao");
//        dao.say();
//        UserService service= (UserService) context.getBean("userService");
//        UserService service= (UserService) context.getBean("service2");
//        service.say();
//        System.out.println(context.getBean("userService"));
//        System.out.println(context.getBean("userService"));
//        ------------------------------------------------------
//        System.out.println(service);
        System.out.println("---------------------------------");
        CourseController cs= (CourseController) context.getBean("courseController");
        cs.save();
    }
}
