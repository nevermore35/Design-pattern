package com.hq.abstractFactory;

import com.hq.abstractFactory.entity.*;

public class InterComputerFactory implements ComputerFactory{
    @Override
    public Cpu makeCpu() {
        return new IntelCpu();
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
