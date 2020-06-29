package com.hq.createMode.factory;

import com.hq.createMode.factory.eneity.Bread;
import com.hq.createMode.factory.eneity.Food;
import com.hq.createMode.factory.eneity.Salad;

public class AmericanFoodFactory implements FoodFactory{
    @Override
    public Food makeFood(String name) {
        if ("bread".equals(name)){
            return new Bread();
        }else if ("salad".equals(name)){
            return new Salad();
        }else {
            return null;
        }
    }
}
