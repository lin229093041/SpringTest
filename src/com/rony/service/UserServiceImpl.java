package com.rony.service;

import com.rony.dao.UserDao;

public class UserServiceImpl implements UserService {
    private UserDao dao;

    public UserServiceImpl() {
        System.out.println("UserService 无参数构造方法");
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void say() {
        dao.say();
        System.out.println("UserService say hello World");
    }
}
