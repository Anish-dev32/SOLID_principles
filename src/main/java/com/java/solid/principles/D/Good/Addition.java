package com.java.solid.principles.D.Good;

public class Addition implements Calculation{

    @Override
    public int doOperation(int num1, int num2) {
        return num1+num2;
    }
}
