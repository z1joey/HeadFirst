package com.company.patterns.factory.pizza;

import java.util.ArrayList;

/**
 * @author yizhang
 */
public abstract class AbstractPizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected ArrayList<String> toppings = new ArrayList<String>();

    /**
     * prepare pizza
     */
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : toppings) {
            System.out.println("  " + topping);
        }
    }

    /**
     * bake pizza
     */
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    /**
     * cut pizza
     */
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    /**
     * box pizza
     */
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
