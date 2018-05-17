package com.liumapp.demo.spring.di.config;

import com.liumapp.demo.spring.di.food.Food;
import com.liumapp.demo.spring.di.food.Pepper;
import com.liumapp.demo.spring.di.human.Human;
import com.liumapp.demo.spring.di.human.Hunaness;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liumapp
 * @file HumanConfig.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/17/18
 */
@Configuration
public class HumanConfig {

    @Bean
    public Human human () {
        return new Hunaness(food());
    }

    @Bean
    public Food food () {
        return new Pepper(System.out);
    }

}
