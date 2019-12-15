package com.company.patterns.factory.store;

import com.company.patterns.factory.pizza.newyork.NewYorkStyleCheeseAbstractPizza;
import com.company.patterns.factory.pizza.AbstractPizza;
import com.company.patterns.factory.pizza.PizzaType;
import com.company.patterns.factory.pizza.newyork.NewYorkStyleClamAbstractPizza;
import com.company.patterns.factory.pizza.newyork.NewYorkStylePepperoniAbstractPizza;
import com.company.patterns.factory.pizza.newyork.NewYorkStyleVeggieAbstractPizza;

/**
 * @author yizhang
 */
public class NewYorkPizzaStore extends AbstractPizzaStore {
    @Override
    AbstractPizza createPizza(PizzaType type) {
        if (type == PizzaType.CHEESE) {
            return new NewYorkStyleCheeseAbstractPizza();
        }

        if (type == PizzaType.PEPPERONI) {
            return new NewYorkStylePepperoniAbstractPizza();
        }

        if (type == PizzaType.CLAM) {
            return new NewYorkStyleClamAbstractPizza();
        }

        if (type == PizzaType.VEGGIE) {
            return new NewYorkStyleVeggieAbstractPizza();
        }

        return null;
    }
}
