package com.zhuxt.condiment;

import com.zhuxt.decorator.Beverage;

/**
 * Created by Administrator on 2015/11/15.
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.88 + beverage.cost();
    }
}
