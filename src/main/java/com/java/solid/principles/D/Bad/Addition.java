package com.java.solid.principles.D.Bad;

public class Addition {
    int num1;
    int num2;
    Addition(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    int operation(){
        return num1 + num2;
    }
}
