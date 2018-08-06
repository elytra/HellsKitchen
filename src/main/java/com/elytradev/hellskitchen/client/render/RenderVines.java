package com.elytradev.hellskitchen.client.render;

import com.elytradev.hellskitchen.block.ModBlocks;
import com.elytradev.hellskitchen.tile.TileEntityVines;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.client.model.animation.FastTESR;

public class RenderVines<T extends TileEntityVines> extends FastTESR<T> {

    public static final String HORIZONTAL = "hellskitchen:blocks/vines/horiz";
    public static final String VERTICAL = "hellskitchen:blocks/vines/vert";

    public RenderVines() {

    }

    @Override
    public void renderTileEntityFast(T te, double x, double y, double z, float partialTicks, int destroyStage, float partial, BufferBuilder buffer) {
        buffer.setTranslation(x, y, z);
        for (EnumFacing face: EnumFacing.values()) {
            TextureAtlasSprite sprite = getFaceTextureVertical(te, face);
            if (sprite != null) renderFace(buffer, sprite, face, 0.02);
            sprite = getFaceTextureHorizontal(te, face);
            if (sprite != null) renderFace(buffer, sprite, face, 0.04);
        }
    }

    public void renderFace(BufferBuilder buffer, TextureAtlasSprite tex, EnumFacing facing, double fight) {

        buffer.pos(1, fight, 0).color(1f, 1f, 1f, 1f).tex(tex.getMinU(), tex.getMinV()).lightmap(240, 240).endVertex();
        buffer.pos(0, fight, 0).color(1f, 1f, 1f, 1f).tex(tex.getMaxU(), tex.getMinV()).lightmap(240, 240).endVertex();
        buffer.pos(0, fight, 1).color(1f, 1f, 1f, 1f).tex(tex.getMaxU(), tex.getMaxV()).lightmap(240, 240).endVertex();
        buffer.pos(1, fight, 1).color(1f, 1f, 1f, 1f).tex(tex.getMinU(), tex.getMaxV()).lightmap(240, 240).endVertex();
        switch(facing) {
            case DOWN:
                buffer.pos(1, fight, 0).color(1f, 1f, 1f, 1f).tex(tex.getMinU(), tex.getMinV()).lightmap(240, 240).endVertex();
                buffer.pos(0, fight, 0).color(1f, 1f, 1f, 1f).tex(tex.getMaxU(), tex.getMinV()).lightmap(240, 240).endVertex();
                buffer.pos(0, fight, 1).color(1f, 1f, 1f, 1f).tex(tex.getMaxU(), tex.getMaxV()).lightmap(240, 240).endVertex();
                buffer.pos(1, fight, 1).color(1f, 1f, 1f, 1f).tex(tex.getMinU(), tex.getMaxV()).lightmap(240, 240).endVertex();
                break;
            case UP:
                buffer.pos(0, 1-fight, 0).color(1f, 1f, 1f, 1f).tex(tex.getMinU(), tex.getMinV()).lightmap(240, 240).endVertex();
                buffer.pos(1, 1-fight, 0).color(1f, 1f, 1f, 1f).tex(tex.getMaxU(), tex.getMinV()).lightmap(240, 240).endVertex();
                buffer.pos(1, 1-fight, 1).color(1f, 1f, 1f, 1f).tex(tex.getMaxU(), tex.getMaxV()).lightmap(240, 240).endVertex();
                buffer.pos(0, 1-fight, 1).color(1f, 1f, 1f, 1f).tex(tex.getMinU(), tex.getMaxV()).lightmap(240, 240).endVertex();
                break;
            case NORTH:
                buffer.pos(0, fight, 0).color(1f, 1f, 1f, 1f).tex(tex.getMinU(), tex.getMinV()).lightmap(240, 240).endVertex();
                buffer.pos(1, fight, 0).color(1f, 1f, 1f, 1f).tex(tex.getMaxU(), tex.getMinV()).lightmap(240, 240).endVertex();
                buffer.pos(1, fight, 1).color(1f, 1f, 1f, 1f).tex(tex.getMaxU(), tex.getMaxV()).lightmap(240, 240).endVertex();
                buffer.pos(0, fight, 1).color(1f, 1f, 1f, 1f).tex(tex.getMinU(), tex.getMaxV()).lightmap(240, 240).endVertex();
                break;
            case SOUTH:
                buffer.pos(0, fight, 0).color(1f, 1f, 1f, 1f).tex(tex.getMinU(), tex.getMinV()).lightmap(240, 240).endVertex();
                buffer.pos(1, fight, 0).color(1f, 1f, 1f, 1f).tex(tex.getMaxU(), tex.getMinV()).lightmap(240, 240).endVertex();
                buffer.pos(1, fight, 1).color(1f, 1f, 1f, 1f).tex(tex.getMaxU(), tex.getMaxV()).lightmap(240, 240).endVertex();
                buffer.pos(0, fight, 1).color(1f, 1f, 1f, 1f).tex(tex.getMinU(), tex.getMaxV()).lightmap(240, 240).endVertex();
                break;
            case EAST:
                buffer.pos(0, fight, 0).color(1f, 1f, 1f, 1f).tex(tex.getMinU(), tex.getMinV()).lightmap(240, 240).endVertex();
                buffer.pos(1, fight, 0).color(1f, 1f, 1f, 1f).tex(tex.getMaxU(), tex.getMinV()).lightmap(240, 240).endVertex();
                buffer.pos(1, fight, 1).color(1f, 1f, 1f, 1f).tex(tex.getMaxU(), tex.getMaxV()).lightmap(240, 240).endVertex();
                buffer.pos(0, fight, 1).color(1f, 1f, 1f, 1f).tex(tex.getMinU(), tex.getMaxV()).lightmap(240, 240).endVertex();
                break;
            case WEST:
                buffer.pos(0, fight, 0).color(1f, 1f, 1f, 1f).tex(tex.getMinU(), tex.getMinV()).lightmap(240, 240).endVertex();
                buffer.pos(1, fight, 0).color(1f, 1f, 1f, 1f).tex(tex.getMaxU(), tex.getMinV()).lightmap(240, 240).endVertex();
                buffer.pos(1, fight, 1).color(1f, 1f, 1f, 1f).tex(tex.getMaxU(), tex.getMaxV()).lightmap(240, 240).endVertex();
                buffer.pos(0, fight, 1).color(1f, 1f, 1f, 1f).tex(tex.getMinU(), tex.getMaxV()).lightmap(240, 240).endVertex();
                break;
            default:
                break;
        }

    }

    public TextureAtlasSprite getFaceTextureHorizontal(TileEntity tile, EnumFacing face) {
        IBlockState state = tile.getWorld().getBlockState(tile.getPos());
        if (state.getBlock()!=ModBlocks.HELL_VINES) return null;
        TileEntityVines vines = (TileEntityVines)tile;
        return vines.vinesHoriz(face)? Minecraft.getMinecraft().getTextureMapBlocks().getAtlasSprite(HORIZONTAL) : null;
    }

    public TextureAtlasSprite getFaceTextureVertical(TileEntity tile, EnumFacing face) {
        IBlockState state = tile.getWorld().getBlockState(tile.getPos());
        if (state.getBlock()!=ModBlocks.HELL_VINES) return null;
        TileEntityVines vines = (TileEntityVines)tile;
        return vines.vinesVert(face)? Minecraft.getMinecraft().getTextureMapBlocks().getAtlasSprite(VERTICAL) : null;
    }
}
