package com.elytradev.hellskitchen.block;

import com.elytradev.hellskitchen.HellsKitchen;
import com.elytradev.hellskitchen.tile.TileEntityVines;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockVines extends BlockTileEntity<TileEntityVines> {

    public BlockVines() {
        super(Material.PLANTS, "hell_vines");
        setCreativeTab(HellsKitchen.creativeTab);
    }

    @Override
    public Class<TileEntityVines> getTileEntityClass() {
        return TileEntityVines.class;
    }

    @Override
    public TileEntityVines createTileEntity(World world, IBlockState state) {
        return new TileEntityVines();
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
