package com.company.patterns.object.duck;

import com.company.patterns.object.behavior.fly.FlyWithWings;
import com.company.patterns.object.behavior.quack.Quack;

/**
 * @author yizhang
 */
public class MallardDuck extends AbstractDuck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
