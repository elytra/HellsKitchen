package com.elytradev.hellskitchen.block;

import com.elytradev.hellskitchen.HellsKitchen;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

    public static BlockSaltOre ORE_SALT = new BlockSaltOre("salt_ore", "oreSalt").setCreativeTab(HellsKitchen.creativeTab);
    public static BlockSaltOre ORE_NETHER_SALT = new BlockSaltOre("nether_salt_ore", "oreSalt").setCreativeTab(HellsKitchen.creativeTab);
    public static BlockTransparent BLOCK_SALT = new BlockTransparent(Material.GLASS, "salt_block").setCreativeTab(HellsKitchen.creativeTab);
    public static BlockVines HELL_VINES = new BlockVines();

    public static Block[] allBlocks = {
        ORE_SALT, ORE_NETHER_SALT, BLOCK_SALT, HELL_VINES
    };

    public static void register(IForgeRegistry<Block> registry) {
        for (Block block: allBlocks) {
            registry.register(block);
        }
        GameRegistry.registerTileEntity(HELL_VINES.getTileEntityClass(), HELL_VINES.getRegistryName().toString());
    }

    public static void registerItemBlocks(IForgeRegistry<Item> registry) {
        for (Block block: allBlocks) {
            if (block instanceof IBlockBase) registry.register(((IBlockBase)block).createItemBlock());
            else registry.register(new ItemBlock(block));
        }

    }

    public static void registerModels() {
        for (Block block: allBlocks) {
            if (block instanceof IBlockBase) ((IBlockBase)block).registerItemModel(Item.getItemFromBlock(block));
        }
    }
}
