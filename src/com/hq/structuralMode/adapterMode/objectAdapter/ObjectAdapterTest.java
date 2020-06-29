package com.hq.structuralMode.adapterMode.objectAdapter;

public class ObjectAdapterTest {
    public static void main(String[] args) {
        WildCock wildCock = new WildCock();
        Duck duck = new CockAdapter(wildCock);
        duck.quack();//鸡叫
        duck.fly();//鸡飞
    }
}
