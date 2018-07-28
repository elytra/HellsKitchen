package com.elytradev.hellskitchen.world;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.gen.IChunkGenerator;

public class HellsKitchenWorldProvider extends WorldProvider {

    @Override
    public DimensionType getDimensionType() {
        return ModDimensions.type;
    }

    @Override
    public String getSaveFolder() {
        return "HELLS_KITCHEN";
    }

    @Override
    public IChunkGenerator createChunkGenerator() {
        return new HellsKitchenChunkGenerator(world);
    }
}
