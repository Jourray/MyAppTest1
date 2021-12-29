package com.example.myapptest;

import androidx.annotation.NonNull;

public class Prototype implements Cloneable{
    @NonNull
    @Override
    protected Object clone() throws CloneNotSupportedException {

        Prototype prototype= (Prototype) super.clone();
        return prototype;
    }
}
