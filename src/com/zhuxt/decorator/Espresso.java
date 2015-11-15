package com.zhuxt.decorator;

import com.sun.jndi.ldap.Ber;

/**
 * Created by Administrator on 2015/11/15.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
