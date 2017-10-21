package com.elytradev.hellskitchen.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.elytradev.hellskitchen.HellsKitchen;
import com.elytradev.hellskitchen.item.ModItems;

public class ModTab extends CreativeTabs {
    public ModTab() {
        super(HellsKitchen.MOD_ID);
        setBackgroundImageName("hellskitchen.png");
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.salt;
    }
}
