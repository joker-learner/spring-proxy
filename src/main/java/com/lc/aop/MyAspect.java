package com.lc.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void before(){

        System.out.println("前置通知....");
    }
    public void afterReturnning(){

    }
    public Object around(ProceedingJoinPoint pjb) throws Throwable {
        System.out.println("环绕前...");
        Object proceed = pjb.proceed();
        System.out.println("环绕后...");
        return proceed;
    }
    public void after(){
        System.out.println("its 最终通知，都会执行");
    }
}
