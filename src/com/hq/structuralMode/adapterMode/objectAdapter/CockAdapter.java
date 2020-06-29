package com.hq.structuralMode.adapterMode.objectAdapter;

public class CockAdapter implements Duck{

    Cock cock;

    public CockAdapter(Cock cock) {
        this.cock = cock;
    }

    @Override
    public void quack() {
        cock.gobble();
    }

    @Override
    public void fly() {
        cock.fly();
    }
}
