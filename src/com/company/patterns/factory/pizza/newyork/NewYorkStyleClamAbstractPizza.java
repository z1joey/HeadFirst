package com.company.patterns.factory.pizza.newyork;

import com.company.patterns.factory.pizza.AbstractPizza;

/**
 * @author yizhang
 */
public class NewYorkStyleClamAbstractPizza extends AbstractPizza {
    public NewYorkStyleClamAbstractPizza() {
        name = "NY style Sauce and Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Mayo Sauce";
        toppings.add("Cheese");
    }
}
