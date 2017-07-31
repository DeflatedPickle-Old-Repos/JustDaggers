package com.deflatedpickle.justdaggers.init;

import com.deflatedpickle.justdaggers.items.ItemDagger;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static ItemDagger WOODEN_DAGGER;
    public static ItemDagger STONE_DAGGER;
    public static ItemDagger IRON_DAGGER;
    public static ItemDagger GOLD_DAGGER;
    public static ItemDagger DIAMOND_DAGGER;

    public static void init(){
        WOODEN_DAGGER = new ItemDagger(Item.ToolMaterial.WOOD, "daggerWood", "wooden_dagger");
        STONE_DAGGER = new ItemDagger(Item.ToolMaterial.WOOD, "daggerStone", "stone_dagger");
        IRON_DAGGER = new ItemDagger(Item.ToolMaterial.WOOD, "daggerIron", "iron_dagger");
        GOLD_DAGGER = new ItemDagger(Item.ToolMaterial.WOOD, "daggerGold", "gold_dagger");
        DIAMOND_DAGGER = new ItemDagger(Item.ToolMaterial.WOOD, "daggerDiamond", "diamond_dagger");
    }

    public static void register(){
        GameRegistry.register(WOODEN_DAGGER);
        GameRegistry.register(STONE_DAGGER);
        GameRegistry.register(IRON_DAGGER);
        GameRegistry.register(GOLD_DAGGER);
        GameRegistry.register(DIAMOND_DAGGER);
    }

    public static void registerRenders(){
        registerRender(WOODEN_DAGGER);
        registerRender(STONE_DAGGER);
        registerRender(IRON_DAGGER);
        registerRender(GOLD_DAGGER);
        registerRender(DIAMOND_DAGGER);
    }

    private static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
