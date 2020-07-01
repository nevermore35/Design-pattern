package com.hq.structuralMode.bridgeMode.impl;

import com.hq.structuralMode.bridgeMode.DrawApi;

public class GreenPen implements DrawApi {
    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("绿色笔画：radius+"+radius+"x:"+x+"y:"+y);
    }
}
