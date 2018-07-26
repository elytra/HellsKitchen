package com.elytradev.hellskitchen.client;

import com.elytradev.hellskitchen.HellsKitchen;
import com.elytradev.hellskitchen.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

public class ModTab extends CreativeTabs {
    public ModTab() {
        super(HellsKitchen.MOD_ID);
        setBackgroundImageName("hellskitchen.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.SALT);
    }
}
