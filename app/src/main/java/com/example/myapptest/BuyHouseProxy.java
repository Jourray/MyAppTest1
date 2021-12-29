package com.example.myapptest;

public class BuyHouseProxy implements BuyHouse{
    private BuyHouse buyHouse;

    public BuyHouseProxy(BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        buyHouse.buyHouse();

    }

    @Override
    public void noBy() {

    }
}
