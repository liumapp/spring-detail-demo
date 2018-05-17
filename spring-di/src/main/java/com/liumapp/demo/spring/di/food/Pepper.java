package com.liumapp.demo.spring.di.food;

import java.io.PrintStream;

/**
 * @author liumapp
 * @file Pepper.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 5/17/18
 */
public class Pepper implements Food {

    private PrintStream printStream;

    public Pepper(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void beEaten() {
        printStream.println("a pepper had been eaten");
    }
}
