package com.elytradev.hellskitchen.proxy;

import com.elytradev.hellskitchen.world.ModDimensions;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        ModDimensions.init();
    }

    public void registerItemRenderer(Item item, int meta, String id) {
    }

}
