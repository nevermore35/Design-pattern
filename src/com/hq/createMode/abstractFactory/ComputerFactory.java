package com.hq.createMode.abstractFactory;

import com.hq.createMode.abstractFactory.entity.Cpu;
import com.hq.createMode.abstractFactory.entity.HardDisk;
import com.hq.createMode.abstractFactory.entity.MainBoard;

public interface ComputerFactory {

    Cpu makeCpu();

    MainBoard makeMainBoard();

    HardDisk makeHardDisk();
}
