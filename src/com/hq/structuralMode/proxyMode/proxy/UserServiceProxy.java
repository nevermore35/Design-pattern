package com.hq.structuralMode.proxyMode.proxy;

import com.hq.structuralMode.proxyMode.Impl.UserServiceImpl;
import com.hq.structuralMode.proxyMode.UserService;

public class UserServiceProxy implements UserService {

    private UserServiceImpl userService = new UserServiceImpl();

    @Override
    public void insert(String name) {
        //增加业务前功能
        System.out.println("插入之前");
        //业务核心
        userService.insert(name);
        //增加业务后功能
        System.out.println("插入之后");
    }
}
