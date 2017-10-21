package com.elytradev.hellskitchen.block;

import com.elytradev.hellskitchen.HellsKitchen;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BlockSaltOre oreSalt;
    public static BlockSaltOre oreNetherSalt;
    public static BlockCropHypnoFlower cropHypnoFlower;
    public static BlockActivatedHypnoFlower activatedHypnoFlower;
    public static BlockTransparent blockSalt;

    public static void init() {
        oreSalt = register(new BlockSaltOre("oreSalt", "oreSalt").setCreativeTab(HellsKitchen.creativeTab));
        oreNetherSalt = register(new BlockSaltOre("oreNetherSalt", "oreSalt").setCreativeTab(HellsKitchen.creativeTab));
        cropHypnoFlower = register(new BlockCropHypnoFlower(), null);
        activatedHypnoFlower = register(new BlockActivatedHypnoFlower().setCreativeTab(HellsKitchen.creativeTab));
        blockSalt = register(new BlockTransparent(Material.GLASS, "blockSalt").setCreativeTab(HellsKitchen.creativeTab));
    }

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                oreSalt
                oreNetherSalt
                cropHypnoFlower
                activatedHypnoFlower
                blockSalt
        );
        //GameRegistry.registerTileEntity(stoneworks.getTileEntityClass(), stoneworks.getRegistryName().toString());
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                oreSalt.createItemBlock();
                oreNetherSalt.createItemBlock();
                activatedHypnoFlower.createItemBlock();
                blockSalt.createItemBlock();
        );
    }

    public static void registerModels() {
        oreSalt.registerItemModel(Item.getItemFromBlock(oreSalt));
        oreNetherSalt.registerItemModel(Item.getItemFromBlock(oreNetherSalt));
        activatedHypnoFlower.registerItemModel(Item.getItemFromBlock(activatedHypnoFlower));
        blockSalt.registerItemModel(Item.getItemFromBlock(blockSalt));
    }
}
