package com.company.patterns.decorator.coffee;

/**
 * @author yizhang
 */
public abstract class AbstractCondimentDecorator extends AbstractBeverage {
    /**
     * get description
     * @return String
     */
    @Override
    public abstract String getDescription();
}
