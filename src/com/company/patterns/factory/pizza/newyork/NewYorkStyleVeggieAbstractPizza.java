package com.company.patterns.factory.pizza.newyork;

import com.company.patterns.factory.pizza.AbstractPizza;

/**
 * @author yizhang
 */
public class NewYorkStyleVeggieAbstractPizza extends AbstractPizza {
    public NewYorkStyleVeggieAbstractPizza() {
        name = "NY style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Veggie Sauce";
        toppings.add("Cheese");
        toppings.add("Tomato");
        toppings.add("Onion");
    }
}
