package com.company.patterns.object.behavior.quack;

/**
 * @author yizhang
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
