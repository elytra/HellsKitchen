package com.elytradev.hellskitchen.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import com.elytradev.hellskitchen.HellsKitchen;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockBase extends Block implements IBlockBase {

    protected String name;

    public BlockBase(Material material, String name) {
        super(material);

        this.name = name;

        setTranslationKey(name);
        setRegistryName(name);
    }

    public void registerItemModel(Item itemBlock) {
        HellsKitchen.proxy.registerItemRenderer(itemBlock, 0, name);
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

    @Override
    public BlockBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}