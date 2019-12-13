package com.company.patterns.object.behavior.quack;

/**
 * @author yizhang
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
