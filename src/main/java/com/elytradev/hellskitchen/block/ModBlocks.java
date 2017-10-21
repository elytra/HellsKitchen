package com.elytradev.hellskitchen.block;

import com.elytradev.hellskitchen.HellsKitchen;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BlockSaltOre oreSalt = new BlockSaltOre("oresalt", "oreSalt").setCreativeTab(HellsKitchen.creativeTab);
    public static BlockSaltOre oreNetherSalt = new BlockSaltOre("orenethersalt", "oreSalt").setCreativeTab(HellsKitchen.creativeTab);
    public static BlockCropHypnoFlower cropHypnoFlower = new BlockCropHypnoFlower();
    public static BlockActivatedHypnoFlower activatedHypnoFlower = new BlockActivatedHypnoFlower().setCreativeTab(HellsKitchen.creativeTab);
    public static BlockTransparent blockSalt = new BlockTransparent(Material.GLASS, "blocksalt").setCreativeTab(HellsKitchen.creativeTab);

    public static void register(IForgeRegistry<Block> registry) {
        registry.registerAll(
                oreSalt,
                oreNetherSalt,
                cropHypnoFlower,
                activatedHypnoFlower,
                blockSalt
        );
        //GameRegistry.registerTileEntity(stoneworks.getTileEntityClass(), stoneworks.getRegistryName().toString());
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        registry.registerAll(
                oreSalt.createItemBlock(),
                oreNetherSalt.createItemBlock(),
                activatedHypnoFlower.createItemBlock(),
                blockSalt.createItemBlock()
        );

    }

    public static void registerModels() {
        oreSalt.registerItemModel(Item.getItemFromBlock(oreSalt));
        oreNetherSalt.registerItemModel(Item.getItemFromBlock(oreNetherSalt));
        activatedHypnoFlower.registerItemModel(Item.getItemFromBlock(activatedHypnoFlower));
        blockSalt.registerItemModel(Item.getItemFromBlock(blockSalt));
    }
}
