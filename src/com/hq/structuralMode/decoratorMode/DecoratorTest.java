package com.hq.structuralMode.decoratorMode;

import com.hq.structuralMode.decoratorMode.decorator.Lemon;
import com.hq.structuralMode.decoratorMode.decorator.Sugar;

public class DecoratorTest {
    public static void main(String[] args) {
        MilkTea peralMilkTea = new PeralMilkTea();
        peralMilkTea = new Lemon(peralMilkTea);
        peralMilkTea.desc();
        System.out.println("价格是："+peralMilkTea.cost());
        MilkTea chocolateMilkTea = new ChocolateMilkTea();
        chocolateMilkTea = new Sugar(chocolateMilkTea);
        chocolateMilkTea.desc();
        System.out.println("价格是："+chocolateMilkTea.cost());
    }
}
