package com.company.patterns.factory.store;

import com.company.patterns.factory.pizza.AbstractPizza;
import com.company.patterns.factory.pizza.PizzaType;

/**
 * @author yizhang
 */
public abstract class AbstractPizzaStore {
    public AbstractPizza orderPizza(PizzaType type) {
        AbstractPizza pizza;

        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * create a pizza
     * @param type pizza type
     * @return pizza
     */
    abstract AbstractPizza createPizza(PizzaType type);
}
