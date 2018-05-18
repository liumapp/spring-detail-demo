package com.liumapp.demo.spring.aop.config;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author liumapp
 * @file AopConfig.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/18/18
 */
@Component
@Aspect
public class AopConfig {

    @Pointcut("execution(* com.liumapp.demo.spring.aop.*(..))")
    public void pointCut () {};

    @Before("pointCut()")
    public void beginTime () {

    }

    @After("pointCut()")
    public void afterTime () {

    }

}
