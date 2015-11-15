package com.zhuxt.decorator;

/**
 * Created by Administrator on 2015/11/15.
 */
public abstract class Beverage {
    String description = "unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
