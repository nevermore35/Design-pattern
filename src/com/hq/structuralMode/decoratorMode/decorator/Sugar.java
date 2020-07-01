package com.hq.structuralMode.decoratorMode.decorator;

import com.hq.structuralMode.decoratorMode.MilkTea;

public class Sugar extends ExtraCondition{
    private MilkTea milkTea;

    public Sugar(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public void desc() {
        milkTea.desc();
        System.out.println("加了糖");
    }

    @Override
    public double cost() {
        return milkTea.cost()+1;
    }
}
