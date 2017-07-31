package com.deflatedpickle.justdaggers.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModCrafting {
    public static void register(){
        GameRegistry.addRecipe(new ShapedOreRecipe(ModItems.WOODEN_DAGGER, "   ", " M ", "S  ", 'M', "woodPlank", 'S', "stickWood"));
    }
}
