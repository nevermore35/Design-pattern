package com.hq.abstractFactory;

import com.hq.abstractFactory.entity.Computer;
import com.hq.abstractFactory.entity.Cpu;
import com.hq.abstractFactory.entity.HardDisk;
import com.hq.abstractFactory.entity.MainBoard;

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
