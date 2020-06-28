package com.hq.simpleFactory;

import com.hq.eneity.Dumpling;
import com.hq.eneity.Food;
import com.hq.eneity.Noodle;

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
