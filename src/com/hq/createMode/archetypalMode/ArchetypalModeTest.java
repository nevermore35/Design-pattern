package com.hq.createMode.archetypalMode;

public class ArchetypalModeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArchetypalMode archetypalMode = new ArchetypalMode();
        Object clone = archetypalMode.clone();
        System.out.println(clone);
    }
}
