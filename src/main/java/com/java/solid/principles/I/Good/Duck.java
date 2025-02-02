package com.java.solid.principles.I.Good;

public class Duck implements EatingBird,SwimmingBird{
    @Override
    public void eat() {
        System.out.println("Duck eats");
    }

    @Override
    public void swim() {
        System.out.println("Duck swims");
    }
}
