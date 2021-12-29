package com.example.myapptest;

public abstract class Drink {
    public String description = "";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private float price = 0f;

    public abstract float cost();
}
