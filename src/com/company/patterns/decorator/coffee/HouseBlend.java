package com.company.patterns.decorator.coffee;

/**
 * @author yizhang
 */
public class HouseBlend extends AbstractBeverage {
    HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
