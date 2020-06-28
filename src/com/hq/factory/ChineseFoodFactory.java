package com.hq.factory;

import com.hq.eneity.Dumpling;
import com.hq.eneity.Food;
import com.hq.eneity.Noodle;

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
