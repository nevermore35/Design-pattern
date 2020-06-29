package com.hq.createMode.factory;

import com.hq.createMode.factory.eneity.Dumpling;
import com.hq.createMode.factory.eneity.Food;
import com.hq.createMode.factory.eneity.Noodle;

public class ChineseFoodFactory implements FoodFactory{
    @Override
    public Food makeFood(String name) {
        if ("noodle".equals(name)){
            return new Noodle();
        }else if ("dumpling".equals(name)){
            return new Dumpling();
        }else {
            return null;
        }
    }
}
