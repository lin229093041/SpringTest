package com.rony.aspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspectAnnotation {
    @Pointcut("execution(* com.rony.aspectJ.*.*(..))")
    private void myPointCut(){}
    @Before("myPointCut()")
    public void before(){
        System.out.println("AspectJ注解 前置检查");
    }
}
