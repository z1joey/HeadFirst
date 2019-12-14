package com.company.patterns.decorator.coffee;

/**
 * @author yizhang
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        AbstractBeverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        AbstractBeverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
