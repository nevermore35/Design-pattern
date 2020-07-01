package com.hq.structuralMode.decoratorMode.decorator;

import com.hq.structuralMode.decoratorMode.MilkTea;

public class ExtraCondition extends MilkTea {
    @Override
    public void desc() {
        System.out.println("这是奶茶需要额外添加的");
    }

    @Override
    public double cost() {
        return 0;
    }
}
