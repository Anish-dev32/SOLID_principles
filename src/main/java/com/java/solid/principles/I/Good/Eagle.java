package com.java.solid.principles.I.Good;

public class Eagle implements EatingBird, FlyingBird{

    @Override
    public void eat() {
        System.out.println("Eagle eat flesh");
    }

    @Override
    public void fly() {
        System.out.println("Eagle do fly");
    }
}
