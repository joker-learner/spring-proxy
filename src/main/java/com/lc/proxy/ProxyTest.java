package com.lc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.*;
import java.util.Set;

public class ProxyTest {
    public static void main(String[] args) throws SQLException {

        final TargetObj target = new TargetObj();
        TargetObjInterface peoxObj =(TargetObjInterface) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        method.invoke(target,args);
                        return null;
                    }
                });
        peoxObj.save();

    }
}
