package com.company.patterns.object.behavior.fly;

/**
 * @author yizhang
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}
