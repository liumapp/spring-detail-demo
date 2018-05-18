package com.liumapp.demo.spring.aop.config;

import com.liumapp.demo.spring.aop.food.Food;
import com.liumapp.demo.spring.aop.food.Pepper;
import com.liumapp.demo.spring.aop.human.Human;
import com.liumapp.demo.spring.aop.human.Hunaness;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author liumapp
 * @file Configuration.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/18/18
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class Config {

    @Bean
    public Human human () {
        return new Hunaness(food());
    }

    @Bean
    public Food food () {
        return new Pepper();
    }

}
