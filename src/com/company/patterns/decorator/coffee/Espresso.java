package com.company.patterns.decorator.coffee;

/**
 * @author yizhang
 */
public class Espresso extends AbstractBeverage {
    Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
