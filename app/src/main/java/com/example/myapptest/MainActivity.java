package com.example.myapptest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.lang.reflect.Proxy;

public class MainActivity extends AppCompatActivity {
/*
设计模式：
创建型：5种 工厂方法模式，抽象工厂模式，单例模式，创造着模式，原型模式

结构性：7种 适配模式，装饰模式，代理模式，外观模式，接模式，组合模式，享元模式。

行为型：11种  +-+
3.2
  、。-+

  +
  +
*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BuyHouseImpl buyHouse = new BuyHouseImpl();
        BuyHouse o = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new Class[]{BuyHouse.class}, new DynamicProxyHandler(buyHouse));
        o.buyHouse();

    }

}