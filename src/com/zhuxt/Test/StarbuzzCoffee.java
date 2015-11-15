package com.zhuxt.Test;

import com.zhuxt.condiment.Moca;
import com.zhuxt.condiment.Soy;
import com.zhuxt.condiment.Whip;
import com.zhuxt.decorator.Beverage;
import com.zhuxt.decorator.Espresso;

/**
 * Created by Administrator on 2015/11/15.
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        beverage = new Moca(beverage);
        beverage = new Soy(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
    }
}
