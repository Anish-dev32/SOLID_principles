package com.java.solid.principles.D.Bad;

public class Calculation {
    /*
    * Problem here is Calculation class has dependency on Addition class or Subtraction class
    * to do its operation., in case if we have to scale and add other operator, we need to
    * modify existing code here as well.
    * */
    int num1;
    int num2;
    String type;

    Calculation(String type, int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
    }

    public int doOperation(){
        if(type.equals("sum")){
            Addition add = new Addition(num1, num2);
            return add.operation();
        }else if(type.equals("sub")){
            Subtraction sub = new Subtraction(num1, num2);
            return sub.operation();
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Calculation calc = new Calculation("sum",7, 9);
        System.out.println(calc.doOperation());
    }
}
