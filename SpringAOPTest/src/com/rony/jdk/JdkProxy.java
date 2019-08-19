package com.rony.jdk;

import com.rony.aspect.MyAspect;
import com.rony.dao.UserDao;
import com.rony.dao.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler {
//    声明目标类接口
    private UserDaoImpl dao;
//    创建代理方法
    public Object createProxy(UserDaoImpl dao){
        this.dao=dao;
        ClassLoader loader = JdkProxy.class.getClassLoader();
        Class[] clazz = dao.getClass().getInterfaces();
        return Proxy.newProxyInstance(loader,clazz,this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect myAspect=new MyAspect();
//        前增强
        myAspect.check_Permissions();
//        执行方法
        Object o = method.invoke(dao, args);
//        后增强
        myAspect.log();
        return o;
    }
}
