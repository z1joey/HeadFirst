package com.company.patterns.object.behavior.fly;

/**
 * @author yizhang
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
