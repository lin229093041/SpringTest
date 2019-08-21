package com.rony.aspectJ;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectJ  {
    public void myBefore(JoinPoint joinpoint){
        System.out.println("AspectJ 前置检查");
        System.out.println("目标类为："+joinpoint.getTarget());
        System.out.println("被植入增强处理的方法为"+joinpoint.getSignature().getName());
    }
    public void myAfterReturning(JoinPoint joinPoint){
        System.out.println("AspectJ 后置检查");
    }
    public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("AspectJ 环绕检查");
        return joinPoint.proceed();
    }
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("AspectJ 异常通知，错误信息为:"+e.getMessage());
    }
    public void myAfter(){
        System.out.println("AspectJ 最终通知");
    }
}
