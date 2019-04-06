package com.itheima.decorator;

import com.itheima.cafe.Drink;

public class Sugar extends Decorator {

    public Sugar(Drink drink) {
        super(drink);
        setDescription("sugar");
        setPrice(2f);
    }
}
