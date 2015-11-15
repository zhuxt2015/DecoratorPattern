package com.zhuxt.condiment;

import com.zhuxt.decorator.Beverage;

/**
 * Created by Administrator on 2015/11/15.
 */
public class Moca extends CondimentDecorator {
    Beverage beverage;

    public Moca(Beverage beverage) {
        this.beverage = beverage;

    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Moca";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
