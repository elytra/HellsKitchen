package com.elytradev.hellskitchen.world;

import com.elytradev.hellskitchen.HellsKitchen;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class ModDimensions {
    public static DimensionType type;

    public static void init() {
        registerDimensionTypes();
        registerDimensions();
    }

    private static void registerDimensionTypes() {
        type = DimensionType.register(HellsKitchen.modId, "_hell", 100, HellsKitchenWorldProvider.class, false);
    }

    private static void registerDimensions() {
        DimensionManager.registerDimension(100, type);
    }
}
