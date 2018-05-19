package com.liumapp.demo.spring.aop.time;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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

    @Before("eat()")
    public void beginTime () {
        System.out.println("eat begin at : " + new Date());
    }

    @After("eat()")
    public void afterTime () {
        System.out.println("eat end at : " + new Date());
    }

}
