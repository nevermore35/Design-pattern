package com.hq.createMode.singleton.satietyMode;

//懒汉式
public class Singleton {

    private static volatile Singleton singleton = null;

    private Singleton(){
    }

    public static Singleton getSingleton(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    return new Singleton();
                }
            }
        }
        return singleton;
    }
}
//优点：资源利用率高，第一次执行方法是单例对象才会被实例化.
//缺点：第一次加载时会稍慢，jdk1.5之之前有可能会加载会失败。
