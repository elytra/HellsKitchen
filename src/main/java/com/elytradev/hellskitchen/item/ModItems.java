package com.elytradev.hellskitchen.item;

import com.elytradev.hellskitchen.HellsKitchen;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static ItemBase salt = new ItemBase("salt");
    public static ItemBase deepSalt = new ItemBase("deepSalt");
    public static ItemBase hypnoGrass = new ItemBase("hypnoGrass");
    public static ItemBase hypnoFlower = new ItemBase("hypnoFlower");
    public static ItemHypnoFlowerSeed hypnoFlowerSeed = new ItemHypnoFlowerSeed().setCreativeTab(HellsKitchen.creativeTab);
    public static ItemBase phermonicDust = new ItemBase("phermonicDust");

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
