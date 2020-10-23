package com.lc.proxy;

public class Advice {

    public void before(){
        System.out.println("前置...通知");
    }

    public void afterReturn(){
        System.out.println("后置通知........");
    }
}
