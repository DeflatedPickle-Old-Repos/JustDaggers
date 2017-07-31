package com.deflatedpickle.justdaggers.proxy;

import com.deflatedpickle.justdaggers.init.ModItems;

public class ClientProxy implements CommonProxy{
    @Override
    public void init() {
        ModItems.registerRenders();
    }
}
