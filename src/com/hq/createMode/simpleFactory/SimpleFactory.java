package com.hq.createMode.simpleFactory;


import com.hq.createMode.simpleFactory.entity.Dumpling;
import com.hq.createMode.simpleFactory.entity.Food;
import com.hq.createMode.simpleFactory.entity.Noodle;

public class SimpleFactory {

    public static Food makeFood(String name){
      if ("noodle".equals(name)){
          return new Noodle();
      }else if ("dumpling".equals(name)){
          return new Dumpling();
      }else {
          return null;
      }
    }

    public static void main(String[] args) {
        Food noodle = makeFood("noodle");
        if (noodle != null)
            noodle.desc();
    }
}
