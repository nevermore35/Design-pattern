package com.hq.structuralMode.bridgeMode.impl;

import com.hq.structuralMode.bridgeMode.DrawApi;
import com.hq.structuralMode.bridgeMode.Shape;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius ,DrawApi drawApi) {
        super(drawApi);
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.draw(radius,0,0);
    }
}
