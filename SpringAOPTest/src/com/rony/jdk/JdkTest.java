package com.rony.jdk;

import com.rony.dao.UserDao;
import com.rony.dao.UserDaoImpl;

public class JdkTest {
    public static void main(String[] args) {
        JdkProxy jdkProxy=new JdkProxy();
        UserDaoImpl dao=new UserDaoImpl();
        UserDao dao2= (UserDao) jdkProxy.createProxy(dao);
        dao2.addUser();
        dao2.deleteUser();
    }
}

