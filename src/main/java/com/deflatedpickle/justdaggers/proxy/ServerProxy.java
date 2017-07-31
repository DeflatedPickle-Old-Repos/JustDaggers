package com.deflatedpickle.justdaggers.proxy;

import com.deflatedpickle.justdaggers.events.ForgeEventHandler;
import net.minecraftforge.common.MinecraftForge;

public class ServerProxy implements CommonProxy{
    @Override
    public void init() {
        MinecraftForge.EVENT_BUS.register(new ForgeEventHandler());
    }
}
