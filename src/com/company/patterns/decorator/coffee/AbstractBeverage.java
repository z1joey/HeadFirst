package com.company.patterns.decorator.coffee;

/**
 * @author yizhang
 */
public abstract class AbstractBeverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return this.description;
    }

    /**
     * Return price of coffee
     * @return double
     */
    public abstract double cost();
}
