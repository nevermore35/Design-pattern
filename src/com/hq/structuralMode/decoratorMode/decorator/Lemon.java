package com.hq.structuralMode.decoratorMode.decorator;

import com.hq.structuralMode.decoratorMode.MilkTea;

public class Lemon extends ExtraCondition{

    private MilkTea milkTea;

    public Lemon(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public void desc() {
        milkTea.desc();
        System.out.println("加了一份柠檬");
    }

    @Override
    public double cost() {
        return milkTea.cost()+2;
    }
}
