package com.example.myapptest;

public abstract class ComputerBuilder {
    protected Comtputer comtputer;

    public ComputerBuilder(Comtputer comtputer) {
        this.comtputer = comtputer;
    }

    public void buildComputer() {
        comtputer = new Comtputer();

    }

    public Comtputer getComtputer() {
        return comtputer;

    }


    public abstract void buildMaster();

    public abstract void buildScreen();

    public abstract void buildKeyBoard();

    public abstract void buildMouse();

    public abstract void buildAudio();

}
