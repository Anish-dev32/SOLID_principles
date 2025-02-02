package com.java.solid.principles.D.Good;

public class Calculator {
    Calculator(Calculation calc, int a, int b){
        System.out.println(calc.doOperation(a, b));
    }
}
