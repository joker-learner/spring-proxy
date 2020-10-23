

package com.lc.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("myAspect")  //载入容器 id  myAspect
@Aspect                 //设置为切面
public class MyAspect {


    @Before(value = "execution(* com.lc.anno.*.*(..))")
    public void before() {  //前置增强

        System.out.println("前置通知....");
    }

    @AfterReturning(value = "execution( * com.lc.anno.*.*())")
    public void afterReturnning() {
        System.out.println("后置增强....");
    }

    public Object around(ProceedingJoinPoint pjb) throws Throwable {
        System.out.println("环绕前...");
        Object proceed = pjb.proceed();
        System.out.println("环绕后...");
        return proceed;
    }

    @After(value = "execution(* com.lc.anno.TargetObj.save())")
    public void after() {
        System.out.println("its 最终通知，都会执行");
    }
}
