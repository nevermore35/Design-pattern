package com.hq.abstractFactory;

import com.hq.abstractFactory.entity.AmdCpu;
import com.hq.abstractFactory.entity.Cpu;
import com.hq.abstractFactory.entity.HardDisk;
import com.hq.abstractFactory.entity.MainBoard;

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
