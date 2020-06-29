package com.hq.structuralMode.adapterMode.classAdapter;

public class CockAdapter extends Cock implements Duck{

    @Override
    public void quack() {
        super.gobble();
    }

    @Override
    public void fly() {
        super.fly();
    }
}
