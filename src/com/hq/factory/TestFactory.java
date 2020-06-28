package com.hq.factory;

import com.hq.eneity.Food;

public class TestFactory {
    public static void main(String[] args) {
        ChineseFoodFactory chineseFoodFactory = new ChineseFoodFactory();
        AmericanFoodFactory americanFoodFactory = new AmericanFoodFactory();
        Food dumpling = chineseFoodFactory.makeFood("dumpling");
        Food salad = americanFoodFactory.makeFood("salad");
        if (dumpling != null) dumpling.desc();
        if (salad != null) salad.desc();
    }
}
