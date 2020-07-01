package com.hq.structuralMode.decoratorMode;

public class ChocolateMilkTea extends MilkTea{
    @Override
    public void desc() {
        System.out.println("这是巧克力奶茶");
    }

    @Override
    public double cost() {
        return 12;
    }
}
