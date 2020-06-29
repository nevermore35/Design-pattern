package com.hq.structuralMode.adapterMode.classAdapter;

public class ClassAdapterTest {
    public static void main(String[] args) {
        Duck duck = new CockAdapter();
        duck.quack();
        duck.fly();
    }
}
