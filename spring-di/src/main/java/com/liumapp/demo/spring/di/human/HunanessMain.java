package com.liumapp.demo.spring.di.human;

import com.liumapp.demo.spring.di.config.HumanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liumapp
 * @file HunanessMain.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/17/18
 */
public class HunanessMain {

    public static void main (String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(HumanConfig.class);
        context.refresh();
        Human human = context.getBean(Human.class);
        human.eat();
        context.close();
    }

}
