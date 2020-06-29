package com.hq.createMode.abstractFactory.entity;

public class Computer {

    private Cpu cpu;
    private MainBoard mainBoard;
    private HardDisk hardDisk;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public MainBoard getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Computer(Cpu cpu, MainBoard mainBoard, HardDisk hardDisk) {
        this.cpu = cpu;
        this.mainBoard = mainBoard;
        this.hardDisk = hardDisk;
    }

    @Override
    public String toString() {
        cpu.desc();
        mainBoard.desc();
        hardDisk.desc();
        return null;
    }
}
