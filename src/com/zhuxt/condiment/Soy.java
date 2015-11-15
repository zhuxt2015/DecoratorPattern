package com.zhuxt.condiment;

import com.zhuxt.decorator.Beverage;

/**
 * Created by Administrator on 2015/11/15.
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
