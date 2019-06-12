package com.itheima.cafe;

import com.itheima.coffee.Coffee;
import com.itheima.decorator.Chocolate;
import com.itheima.decorator.Decorator;
import com.itheima.decorator.Sugar;

public class Cafe {
    public static void main(String[] args) {
        Drink coffee=new Coffee();//coffee只是一个引用而已，指向真实对象
//        System.out.println(coffee.cost());
//
//        coffee = new Decorator(coffee);//装饰之后赋值给当前引用
//        System.out.println(coffee.cost());
        coffee = new Sugar(coffee);
        coffee = new Chocolate(coffee);
        System.out.println("ddd");
        System.out.println(coffee.cost());
        System.out.println(coffee.getDescription());

    }
}
