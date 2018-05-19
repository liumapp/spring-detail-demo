package com.liumapp.demo.spring.aop.time;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author liumapp
 * @file AopConfig.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/18/18
 */
@Order(1)
@Component
@Aspect
public class TimeAop {

    @Pointcut("execution(* com.liumapp.demo.spring.aop.human.Hunaness.eat(..))")
    public void eat () {}

    @Pointcut("execution(* com.liumapp.demo.spring.aop.human.Hunaness.getLiked(..))")
    public void likeWhat () {}

    @Before("eat()")
    public void beginTime (JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName + " begin at : " + new Date());
    }

    @After("eat()")
    public void afterTime (JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println(methodName + " end at : " + new Date());
    }

    /**
     * 后置返回通知：在方法正常执行后执行的代码,可以获取到方法的返回值
     * @param joinPoint
     */
    @AfterReturning(value = "likeWhat()",
            returning="result")
    public void afterReturning(JoinPoint joinPoint, Object result) {

        String methodName = joinPoint.getSignature().getName();
        System.out.println(this.getClass().getSimpleName()+ " afterReturning execute: " + methodName + " end with result:"+result);
    }

    /**
     * 后置异常通知：在方法抛出异常之后执行,可以访问到异常信息,且可以指定出现特定异常信息时执行代码
     * @param joinPoint
     */
    @AfterThrowing(value = "pointcut1()",
            throwing="exception")
    public void afterThrowing(JoinPoint joinPoint, Exception /**NullPointerException*/ exception){

        String methodName = joinPoint.getSignature().getName();
        System.out.println(this.getClass().getSimpleName()+ " afterThrowing execute:"+methodName+" occurs exception:"+exception);
    }

    /**
     * 环绕通知, 围绕着方法执行
     */
    @Around(value = "pointcut1()")
    public Object around(ProceedingJoinPoint joinPoint){

        String methodName = joinPoint.getSignature().getName();
        System.out.println(this.getClass().getSimpleName()+ " around:"+methodName+" execute start");

        Object result = null;
        try {
            result = joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println(this.getClass().getSimpleName()+ " around:"+methodName+" execute end");
        return result;
    }

}
