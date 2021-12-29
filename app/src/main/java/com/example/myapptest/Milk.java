package com.example.myapptest;

public class Milk extends Decorator {


    public Milk(Drink obj) {
        super(obj);
        super.setDescription("MILK");
        super.setPrice(2.0f);
    }
}
