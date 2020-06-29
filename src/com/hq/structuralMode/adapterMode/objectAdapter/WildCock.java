package com.hq.structuralMode.adapterMode.objectAdapter;

public class WildCock implements Cock{
    @Override
    public void gobble() {
        System.out.println("鸡叫");
    }

    @Override
    public void fly() {
        System.out.println("鸡飞");
    }
}
