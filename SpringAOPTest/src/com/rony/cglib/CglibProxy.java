package com.rony.cglib;

import com.rony.aspect.MyAspect;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
//    代理方法
    public Object createProxy(Object target){
//        创建一个动态类对象
        Enhancer e=new Enhancer();
//        确定要增强的类后，设置其父类
        e.setSuperclass(target.getClass());
//        添加回调函数
        e.setCallback(this);
//        创建动态类对象并返回
        return e.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        MyAspect ma=new MyAspect();
        ma.check_Permissions();
        Object o1 = methodProxy.invokeSuper(o, objects);
        ma.log();
        return o1;
    }
}
