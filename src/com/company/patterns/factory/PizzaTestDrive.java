package com.company.patterns.factory;

import com.company.patterns.factory.pizza.AbstractPizza;
import com.company.patterns.factory.pizza.PizzaType;
import com.company.patterns.factory.store.AbstractPizzaStore;
import com.company.patterns.factory.store.NewYorkPizzaStore;

/**
 * @author yizhang
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        AbstractPizzaStore nyStore = new NewYorkPizzaStore();

        AbstractPizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Joey ordered a " + pizza.getName());
    }
}
