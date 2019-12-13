package com.company.patterns.object.duck;

import com.company.patterns.object.behavior.fly.FlyBehavior;
import com.company.patterns.object.behavior.quack.QuackBehavior;

/**
 * @author yizhang
 */
public abstract class AbstractDuck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    /**
     * All ducks should have display function
     */
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    /**
     * Set fly behavior
     * @param flyBehavior FlyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * Set quack behavior
     * @param quackBehavior QuackBehavior
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
