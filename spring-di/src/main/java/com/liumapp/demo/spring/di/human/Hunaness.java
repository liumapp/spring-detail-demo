package com.liumapp.demo.spring.di.human;

import com.liumapp.demo.spring.di.food.Food;

/**
 * @author liumapp
 * @file Hunaness.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/17/18
 */
public class Hunaness implements Human {

    private Food food;

    public Hunaness(Food food) {
        this.food = food;
    }

    @Override
    public void eat() {
        food.beEaten();
    }

}
