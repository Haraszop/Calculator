package com.kodilla.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class Calculator {

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator(34.22, 38.54);

        System.out.println(kalkulator.addition());
        System.out.println(kalkulator.subtract());

    }

}
