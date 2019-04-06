package com.itheima.coffee;

import com.itheima.cafe.Drink;

public class Coffee extends Drink {

    public Coffee() {
        setDescription("bitter coffee");
        setPrice(1f);
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
