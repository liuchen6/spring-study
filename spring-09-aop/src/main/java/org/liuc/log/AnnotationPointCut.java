package org.liuc.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;

@Aspect //标注这个类是一个切面类
public class AnnotationPointCut {

    @Before("execution(* org.liuc.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("在方法执行前执行的log！");
    }

    @After("execution(* org.liuc.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("在方法执行后执行的log！");
    }

    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        Signature signature = jp.getSignature();//获得签名
        System.out.println("signature: " + jp.getSignature());

        Object proceed = jp.proceed();
        System.out.println("环绕后");

        System.out.println(proceed);
    }
}
