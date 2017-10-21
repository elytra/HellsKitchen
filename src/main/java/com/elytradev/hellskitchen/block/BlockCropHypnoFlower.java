package com.elytradev.hellskitchen.block;

import com.elytradev.hellskitchen.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlockCropHypnoFlower extends BlockCrops {

    public BlockCropHypnoFlower() {
        setUnlocalizedName("cropHypnoFlower");
        setRegistryName("cropHypnoFlower");
    }

    @Override
    protected Item getSeed() {
        return ModItems.hypnoFlowerSeed;
    }

    @Override
    protected Item getCrop() {
        return ModItems.hypnoFlower;
    }

}