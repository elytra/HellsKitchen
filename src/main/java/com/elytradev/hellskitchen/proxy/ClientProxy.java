package com.elytradev.hellskitchen.proxy;

import com.elytradev.hellskitchen.HellsKitchen;
import com.elytradev.hellskitchen.client.render.RenderVines;
import com.elytradev.hellskitchen.tile.TileEntityVines;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityVines.class, new RenderVines<>());
    }

    @SubscribeEvent
    public void onStitchTexture(TextureStitchEvent.Pre event) {
        event.getMap().registerSprite(new ResourceLocation("hellskitchen:blocks/vines/vert"));
        event.getMap().registerSprite(new ResourceLocation("hellskitchen:blocks/vines/horiz"));
    }

    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(HellsKitchen.modId + ":" + id, "inventory"));
    }
}
