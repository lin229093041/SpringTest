package com.rony.service;

import com.rony.dao.UserDao;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao;
    private List<String> list;
    public UserServiceImpl() {
        System.out.println("UserService 无参数构造方法");
    }
    public static UserServiceImpl getUserService(){
        System.out.println("UserService 静态构造方法");
        return new UserServiceImpl();
    }
    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void say() {
        dao.say();
        System.out.println("UserService say hello World");
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public UserServiceImpl(UserDao dao, List<String> list) {
        this.dao = dao;
        this.list = list;
    }

    @Override
    public String toString() {
        return "UserServiceImpl{" +
                "dao=" + dao +
                ", list=" + list +
                '}';
    }
}
