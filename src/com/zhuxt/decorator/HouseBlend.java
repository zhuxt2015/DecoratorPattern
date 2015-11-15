package com.zhuxt.decorator;

/**
 * Created by Administrator on 2015/11/15.
 */
public class HouseBlend extends Beverage {
    @Override
    public double cost() {
        return 0.89;
    }

    public HouseBlend() {
        description = "House Blend Coffee";
    }
}
