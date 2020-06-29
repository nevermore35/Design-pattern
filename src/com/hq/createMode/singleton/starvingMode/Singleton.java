package com.hq.createMode.singleton.starvingMode;

//饿汉模式
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton(){
    }

    private static Singleton getSingleton(){
        return singleton;
    }
}
//缺点：不需要的时候就加载了，造成资源浪费。
