package com.java.solid.principles.O.Good;

// No modifications in our calculator functionality
// We can keep adding extension by create new operations
public class Calculator {

    public int calculateNumber(int number1 , int number2 , Operation operation){
        return  operation.perform(number1 , number2);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int res = calculator.calculateNumber(4, 6, new AddOperation());
        System.out.println(res);
    }
}