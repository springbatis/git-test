package com.itheima.decorator;

import com.itheima.cafe.Drink;

public class Chocolate extends Decorator {
    public Chocolate(Drink drink) {
        super(drink);
        setDescription("chocolate");
        setPrice(3f);
    }
}
