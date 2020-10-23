package com.lc.proxy.cdglib;

import com.lc.proxy.Advice;
import com.lc.proxy.TargetObj;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibTest {
    public static void main(String[] args) {
        final TargetObj target = new TargetObj();

        final Advice advice = new Advice();

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                advice.before();
                Object invoke = method.invoke(target, args);
                advice.afterReturn();
                return invoke;
            }
        });
        TargetObj o = (TargetObj)enhancer.create();
        o.save();

    }
}
