package com.hq.structuralMode.bridgeMode.impl;

import com.hq.structuralMode.bridgeMode.DrawApi;

public class RedPen implements DrawApi {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("红色笔画：radius+"+radius+"x:"+x+"y:"+y);
    }
}
