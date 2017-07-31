package com.deflatedpickle.justdaggers.proxy;

import com.deflatedpickle.justdaggers.events.ForgeEventHandler;
import com.deflatedpickle.justdaggers.init.ModItems;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy implements CommonProxy{
    @Override
    public void init() {
        ModItems.registerRenders();
        MinecraftForge.EVENT_BUS.register(new ForgeEventHandler());
    }
}
