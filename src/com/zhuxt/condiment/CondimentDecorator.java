package com.zhuxt.condiment;

import com.zhuxt.decorator.Beverage;

/**
 * Created by Administrator on 2015/11/15.
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
