package com.hq.structuralMode.bridgeMode.impl;

import com.hq.structuralMode.bridgeMode.DrawApi;
import com.hq.structuralMode.bridgeMode.Shape;

public class Rectangle extends Shape {

    private int width;
    private int length;

    public Rectangle(int x, int y, DrawApi drawApi) {
        super(drawApi);
        this.width = x;
        this.length = y;
    }

    @Override
    public void draw() {
        drawApi.draw(0,width,length);
    }
}
