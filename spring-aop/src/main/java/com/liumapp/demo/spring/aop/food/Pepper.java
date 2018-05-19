package com.liumapp.demo.spring.aop.food;

import org.springframework.stereotype.Component;

/**
 * @author liumapp
 * @file Pepper.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/18/18
 */
@Component
public class Pepper implements Food {

    @Override
    public void beEaten() {
        System.out.println("a pepper had been eaten");
    }

}
