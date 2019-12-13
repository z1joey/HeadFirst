package com.company.patterns.object.behavior.quack;

/**
 * @author yizhang
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
