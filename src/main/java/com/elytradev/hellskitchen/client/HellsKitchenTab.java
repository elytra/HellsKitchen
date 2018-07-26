package com.elytradev.hellskitchen.client;

import com.elytradev.hellskitchen.HellsKitchen;
import com.elytradev.hellskitchen.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

public class HellsKitchenTab extends CreativeTabs {
    public HellsKitchenTab() {
        super(HellsKitchen.modId);
        setBackgroundImageName("hellskitchen.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.SALT);
    }
}
