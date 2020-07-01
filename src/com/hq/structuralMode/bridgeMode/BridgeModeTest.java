package com.hq.structuralMode.bridgeMode;

import com.hq.structuralMode.bridgeMode.impl.Circle;
import com.hq.structuralMode.bridgeMode.impl.GreenPen;
import com.hq.structuralMode.bridgeMode.impl.Rectangle;
import com.hq.structuralMode.bridgeMode.impl.RedPen;

public class BridgeModeTest {
    public static void main(String[] args) {
        RedPen redPen = new RedPen();
        Circle circle = new Circle(5, redPen);
        circle.draw();
        GreenPen greenPen = new GreenPen();
        Rectangle rectangle = new Rectangle(6, 4, greenPen);
        rectangle.draw();
    }
}
