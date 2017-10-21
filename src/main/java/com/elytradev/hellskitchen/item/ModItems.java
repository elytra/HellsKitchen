package com.elytradev.hellskitchen.item;

import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static ItemBase salt;
    public static ItemBase deepSalt;
    public static ItemBase hypnoGrass;
    public static ItemBase hypnoFlower;
    public static ItemHypnoFlowerSeed hypnoFlowerSeed;
    public static ItemBase phermonicDust;

    public static void register(IForgeRegistry<Item> registry) {
        registry.registerAll(
                salt,
                deepSalt,
                hypnoGrass,
                hypnoFlower,
                phermonicDust,
                hypnoFlowerSeed

        );
    }

    public static void registerModels() {
        salt.registerItemModel();
        deepSalt.registerItemModel();
        hypnoGrass.registerItemModel();
        hypnoFlower.registerItemModel();
        phermonicDust.registerItemModel();
        hypnoFlowerSeed.registerItemModel();
    }
}
