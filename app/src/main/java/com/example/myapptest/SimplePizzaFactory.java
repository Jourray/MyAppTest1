package com.example.myapptest;
//简单工厂模式：
//定义了一个创建对象的类，由这个类来封装实例化对象的行为。
public class SimplePizzaFactory {
    public Pizza CreatePizza(String ordertype){
        Pizza pizza=null;
        if (ordertype.equals("chesse")){
            pizza=new ChessePizza();
        }else if (ordertype.equals("pepper")){
            pizza=new PepperPizza();
        }else if (ordertype.equals("greak")){
            pizza=new GradkPizza();
        }
        return pizza;
    }

}
