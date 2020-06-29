package com.hq.createMode.abstractFactory;

import com.hq.createMode.abstractFactory.entity.Computer;
import com.hq.createMode.abstractFactory.entity.Cpu;
import com.hq.createMode.abstractFactory.entity.HardDisk;
import com.hq.createMode.abstractFactory.entity.MainBoard;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AmdComputerFactory amdComputerFactory = new AmdComputerFactory();
        Cpu cpu = amdComputerFactory.makeCpu();
        HardDisk hardDisk = amdComputerFactory.makeHardDisk();
        MainBoard mainBoard = amdComputerFactory.makeMainBoard();
        Computer computer = new Computer(cpu, mainBoard, hardDisk);
        computer.toString();
    }
}
