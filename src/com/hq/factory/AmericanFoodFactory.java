package com.hq.factory;

import com.hq.eneity.Bread;
import com.hq.eneity.Food;
import com.hq.eneity.Salad;

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
