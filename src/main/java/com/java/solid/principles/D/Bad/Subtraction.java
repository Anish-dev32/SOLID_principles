package com.java.solid.principles.D.Bad;

import static java.lang.Math.abs;

public class Subtraction {
        int num1;
        int num2;
        Subtraction(int num1, int num2){
            this.num1 = num1;
            this.num2 = num2;
        }
        int operation(){
            return abs(num1 - num2);
        }
}
