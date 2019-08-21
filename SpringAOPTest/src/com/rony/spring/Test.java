package com.rony.spring;

import com.rony.dao.UserDao;
import com.rony.dao.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("spring-proxy.xml");
        UserDaoImpl dao = (UserDaoImpl) app.getBean("userDaoProxy");
        dao.addUser();
        dao.deleteUser();
    }
}
