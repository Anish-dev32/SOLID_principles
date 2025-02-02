package com.java.solid.principles.D.Good;

public class Main {
    /*
    * Now if you need to add any operator, just extend Calculation and use it by
    * creating calculator.*/
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new Addition(), 4,7);
    }
}
