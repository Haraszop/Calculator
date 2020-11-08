package com.kodilla.kalkulator;

public class Kalkulator {
    double digit1;
    double digit2;

    public Kalkulator(double digit1, double digit2){
        this.digit1 = digit1;
        this.digit2 = digit2;

    }

    public double addition() {
        return (digit1 + digit2);
    }

    public double subtract() {
        return (digit1 - digit2);
    }

}
