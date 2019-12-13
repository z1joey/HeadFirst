package com.company.patterns.object;

import com.company.patterns.object.behavior.fly.FlyRocketPowered;
import com.company.patterns.object.duck.AbstractDuck;
import com.company.patterns.object.duck.MallardDuck;
import com.company.patterns.object.duck.ModelDuck;

/**
 * @author yizhang
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        AbstractDuck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        AbstractDuck model = new ModelDuck();
        model.performFly();
        model.performQuack();

        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
