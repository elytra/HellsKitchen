package com.elytradev.hellskitchen.item;

import com.elytradev.hellskitchen.HellsKitchen;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems {

    public static ItemBase salt = new ItemBase("salt").setCreativeTab(HellsKitchen.creativeTab);
    public static ItemBase deepSalt = new ItemBase("deepsalt").setCreativeTab(HellsKitchen.creativeTab);
    public static ItemBase hypnoGrass = new ItemBase("hypnograss");
    public static ItemBase hypnoFlower = new ItemBase("hypnoflower").setCreativeTab(HellsKitchen.creativeTab);
    public static ItemHypnoFlowerSeed hypnoFlowerSeed = new ItemHypnoFlowerSeed().setCreativeTab(HellsKitchen.creativeTab);
    public static ItemBase phermonicDust = new ItemBase("phermonicdust").setCreativeTab(HellsKitchen.creativeTab);

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
