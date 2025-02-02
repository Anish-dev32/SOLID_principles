package com.java.solid.principles.I.Bad;

public class Eagle implements Bird{
    /*
    * Since Eagle implements Bird, Eagle class is forces to implement all methods of
    * Bird, which is of no use for Eagle.
    * */

    @Override
    public void eat() {
        System.out.println("Eagle eats flesh!");
    }

    @Override
    public void fly() {
        System.out.println("Eagle fly in high sky!");
    }

    @Override
    public void quack() throws Exception {
        throw new Exception("Eagle don't quack!");
    }

    @Override
    public void swim() throws Exception {
        throw new Exception("Eagle don't swim!");
    }

    public static void main(String[] args) {
        Bird bird = new Eagle();
        try {
            bird.swim();
        } catch (Exception e) {
            System.out.println("Not supported!");
        }
    }
}
