package com.liumapp.demo.spring.aop.time;

import com.liumapp.demo.spring.aop.config.Config;
import com.liumapp.demo.spring.aop.human.Human;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liumapp
 * @file TimeAopTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/18/18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class TimeAopTest {

    @Autowired
    private Human human;

    @Test
    public void testAop () {
        human.eat();
    }

}
