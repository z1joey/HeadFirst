package com.company.patterns.decorator.coffee;

/**
 * @author yizhang
 */
public class Mocha extends AbstractCondimentDecorator {
    private AbstractBeverage beverage;

    Mocha(AbstractBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
