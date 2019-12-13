package com.company.patterns.object.duck;

import com.company.patterns.object.behavior.fly.FlyNoWay;
import com.company.patterns.object.behavior.quack.Quack;

/**
 * @author yizhang
 */
public class ModelDuck extends AbstractDuck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
