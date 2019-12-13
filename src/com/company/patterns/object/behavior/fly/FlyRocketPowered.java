package com.company.patterns.object.behavior.fly;

/**
 * @author yizhang
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
