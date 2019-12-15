package com.company.patterns.factory.pizza.newyork;

import com.company.patterns.factory.pizza.AbstractPizza;

/**
 * @author yizhang
 */
public class NewYorkStylePepperoniAbstractPizza extends AbstractPizza {
    public NewYorkStylePepperoniAbstractPizza() {
        name = "NY style Sauce and Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Master Sauce";
        toppings.add("Cheese");
        toppings.add("Onion");
    }
}
