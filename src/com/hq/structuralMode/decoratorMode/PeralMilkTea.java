package com.hq.structuralMode.decoratorMode;

public class PeralMilkTea extends MilkTea{
    @Override
    public void desc() {
        System.out.println("这是珍珠奶茶");
    }

    @Override
    public double cost() {
        return 10;
    }
}
