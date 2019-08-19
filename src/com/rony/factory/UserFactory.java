package com.rony.factory;

import com.rony.service.UserService;
import com.rony.service.UserServiceImpl;

public class UserFactory {
    public UserServiceImpl getUserService(){
        System.out.println("实例工厂实例化UserService");
        return new UserServiceImpl();
    }
}
