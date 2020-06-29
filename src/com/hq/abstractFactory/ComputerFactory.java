package com.hq.abstractFactory;

import com.hq.abstractFactory.entity.Cpu;
import com.hq.abstractFactory.entity.HardDisk;
import com.hq.abstractFactory.entity.MainBoard;

public interface ComputerFactory {

    Cpu makeCpu();

    MainBoard makeMainBoard();

    HardDisk makeHardDisk();
}
