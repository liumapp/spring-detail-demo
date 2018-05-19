package com.liumapp.demo.spring.aop.human;

import com.liumapp.demo.spring.aop.food.Food;
import org.springframework.stereotype.Component;

@Component
public class Hunaness implements Human {

    private Food food;

    public Hunaness(Food food) {
        this.food = food;
    }

    @Override
    public void eat() {
        food.beEaten();
    }

    @Override
    public String getLiked () {
        return "something like pepper";
    }

    @Override
    public String sayNo () throws Exception {
        throw new Exception("Exception from hunaness");
    }

}
