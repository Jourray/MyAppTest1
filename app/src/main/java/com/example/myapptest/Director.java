package com.example.myapptest;

public class Director {
    private ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Comtputer getComputer() {
        return computerBuilder.getComtputer();
    }

    public void constructComputer() {
        computerBuilder.buildComputer();
        computerBuilder.buildMaster();
        computerBuilder.buildScreen();
        computerBuilder.buildAudio();
        computerBuilder.buildKeyBoard();
        computerBuilder.buildMouse();
    }
}
