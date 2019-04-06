package com.itheima.decorator;

import com.itheima.cafe.Drink;

public class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink) {//不提供无参构造，使得创建装饰者对象必须传递Drink类型对象
        this.drink = drink;
    }

    @Override
    public float cost() {
        return getPrice()+drink.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"+"+super.getPrice()+"+"+drink.getDescription()+"+"+drink.getPrice();
    }
}
