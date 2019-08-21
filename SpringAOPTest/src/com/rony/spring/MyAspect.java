package com.rony.spring;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        check_Permissions();
        Object o = mi.proceed();
        log();
        return o;
    }
    public void check_Permissions(){
        System.out.println("Spring-模拟检查权限");
    }
    public void log(){
        System.out.println("Spring-模拟记录日志");
    }
}
