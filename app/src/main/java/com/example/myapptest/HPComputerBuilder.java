package com.example.myapptest;

public class HPComputerBuilder extends ComputerBuilder {


    public HPComputerBuilder(Comtputer comtputer) {
        super(comtputer);
    }

    @Override
    public void buildMaster() {
        comtputer.setMaster("1");
    }

    @Override
    public void buildScreen() {
        comtputer.setScreen("2");
    }

    @Override
    public void buildKeyBoard() {
        comtputer.setKeyboard("3");
    }

    @Override
    public void buildMouse() {
        comtputer.setMouse("4");
    }

    @Override
    public void buildAudio() {
        comtputer.setAudio("5");
    }
}
