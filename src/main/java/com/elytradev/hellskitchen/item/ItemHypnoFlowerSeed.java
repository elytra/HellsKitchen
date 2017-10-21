package com.elytradev.hellskitchen.item;

import com.elytradev.hellskitchen.HellsKitchen;
import com.elytradev.hellskitchen.block.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;


public class ItemHypnoFlowerSeed extends ItemSeeds {

    public ItemHypnoFlowerSeed() {
        super(ModBlocks.cropHypnoFlower, Blocks.FARMLAND);
        setUnlocalizedName("hypnoFlowerSeed");
        setRegistryName("hypnoFlowerSeed");
    }

    public void registerItemModel() {
        HellsKitchen.proxy.registerItemRenderer(this, 0, "hypnoFlowerSeed");
    }

    @Override
    public ItemHypnoFlowerSeed setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}