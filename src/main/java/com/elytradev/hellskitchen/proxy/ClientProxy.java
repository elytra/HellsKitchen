package com.elytradev.hellskitchen.proxy;

import com.elytradev.hellskitchen.HellsKitchen;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {
    @Override
    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(HellsKitchen.MOD_ID + ":" + id, "inventory"));
    }
}