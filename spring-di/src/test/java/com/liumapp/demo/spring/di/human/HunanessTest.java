package com.liumapp.demo.spring.di.human;

import com.liumapp.demo.spring.di.food.Food;
import org.junit.Test;
import static org.mockito.Mockito.*;
/**
 * @author liumapp
 * @file HunanessTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/17/18
 */
public class HunanessTest {

    /**
     * The function beEaten was tested that it was called only once .
     */
    @Test
    public void hunanessLoveEatPepper () {
        Food mockFood = mock(Food.class);
        Hunaness hunaness = new Hunaness(mockFood);
        hunaness.eat();
        verify(mockFood , times(1)).beEaten();
    }

}
