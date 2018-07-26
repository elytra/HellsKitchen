package com.elytradev.hellskitchen.block;

import com.elytradev.hellskitchen.HellsKitchen;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockTransparent extends BlockBase {

    protected String name;

    public BlockTransparent(Material material, String name) {
        super(material, name);
        setSoundType(SoundType.GLASS);
        this.name = name;

        setTranslationKey(name);
        setRegistryName(name);
    }

    public void registerItemModel(Item item) {
        HellsKitchen.proxy.registerItemRenderer(item, 0, name);
    }

    @Override
    public BlockTransparent setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

    public Item createItemBlock() {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }


    @SideOnly(Side.CLIENT)
    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.TRANSLUCENT;
    }
}