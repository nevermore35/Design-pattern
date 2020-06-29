package com.hq.createMode.singleton.nestedMode;

//嵌套模式
public class Singleton {

    private Singleton(){
    }

    private static class Holder{
        private static Singleton singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return Holder.singleton;
    }
}
