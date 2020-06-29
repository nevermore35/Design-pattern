package com.hq.createMode.abstractFactory;

import com.hq.createMode.abstractFactory.entity.AmdCpu;
import com.hq.createMode.abstractFactory.entity.Cpu;
import com.hq.createMode.abstractFactory.entity.HardDisk;
import com.hq.createMode.abstractFactory.entity.MainBoard;

public class AmdComputerFactory implements ComputerFactory{
    @Override
    public Cpu makeCpu() {
        return new AmdCpu();
    }

    @Override
    public MainBoard makeMainBoard() {
        return new MainBoard();
    }

    @Override
    public HardDisk makeHardDisk() {
        return new HardDisk();
    }
}
