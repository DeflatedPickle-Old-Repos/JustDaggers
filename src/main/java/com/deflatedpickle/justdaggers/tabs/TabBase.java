package com.deflatedpickle.justbitethedust.tabs;

import com.deflatedpickle.justbitethedust.Reference;
import com.deflatedpickle.justbitethedust.init.ModCreativeTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabBase extends CreativeTabs {
    private String label;

    public TabBase(String label) {
        super("tab_"+ Reference.MOD_ID + "_" + label);
        this.label = label;
    }

/*    @Override
    public boolean hasSearchBar(){
        return true;
    }*/

    @Override
    public ItemStack getTabIconItem(){
        return ModCreativeTabs.randomItem(this.label);
    }
}
