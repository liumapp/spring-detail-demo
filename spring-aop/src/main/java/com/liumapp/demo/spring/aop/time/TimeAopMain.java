package com.liumapp.demo.spring.aop.time;

import com.liumapp.demo.spring.aop.config.Config;
import com.liumapp.demo.spring.aop.human.Human;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author liumapp
 * @file TimeAopMain.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/19/18
 */
public class TimeAopMain {

    public static void main (String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();
        try {
            Human human = context.getBean(Human.class);
            human.eat();
            String likeWhat = human.getLiked();
            human.sayNo();
        } catch (Exception e) {
            e.printStackTrace();
        }
        context.close();
    }

}
