package com.company.patterns.factory.pizza.newyork;

import com.company.patterns.factory.pizza.AbstractPizza;

import javax.naming.Name;

/**
 * @author yizhang
 */
public class NewYorkStyleCheeseAbstractPizza extends AbstractPizza {
    public NewYorkStyleCheeseAbstractPizza() {
        name = "NY style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
