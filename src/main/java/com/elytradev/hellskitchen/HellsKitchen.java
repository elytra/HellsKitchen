package com.elytradev.hellskitchen;

import com.elytradev.hellskitchen.block.ModBlocks;
import com.elytradev.hellskitchen.client.HellsKitchenTab;
import com.elytradev.hellskitchen.item.ModItems;
import com.elytradev.hellskitchen.proxy.CommonProxy;
import com.elytradev.hellskitchen.util.TeleportCommand;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

@Mod(
        modid = HellsKitchen.modId,
        name = HellsKitchen.name,
        version = HellsKitchen.version
)
public class HellsKitchen {

    public static final String modId = "hellskitchen";
    public static final String name = "Hell's Kitchen";
    public static final String version = "@VERSION@";

    public static final HellsKitchenTab creativeTab = new HellsKitchenTab();

    @SidedProxy(serverSide = "com.elytradev.hellskitchen.proxy.CommonProxy", clientSide = "com.elytradev.hellskitchen.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance(modId)
    public static HellsKitchen INSTANCE;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        HellsKitchenLog.info(name + " is loading!");

//        MinecraftForge.EVENT_BUS.register(InRedRecipes.class);
        MinecraftForge.EVENT_BUS.register(proxy);
        proxy.preInit(event);

//        NetworkRegistry.INSTANCE.registerGuiHandler(this, new IGuiHandler() {
//            public static final int OSCILLATOR = 0;
//
//            @Nullable
//            @Override
//            public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
//                switch (ID) {
//                    case OSCILLATOR:
//                        return new OscillatorContainer(
//                                player.inventory, ((IContainerInventoryHolder)world.getTileEntity(new BlockPos(x,y,z))).getContainerInventory(),
//                                (TileEntityOscillator) world.getTileEntity(new BlockPos(x,y,z)));
//                    default:
//                        return null;
//                }
//
//            }
//
//            @Nullable
//            @Override
//            @SideOnly(Side.CLIENT)
//            public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
//                switch (ID) {
//                    case OSCILLATOR:
//                        OscillatorContainer oscillatorContainer = new OscillatorContainer(
//                                player.inventory, ((IContainerInventoryHolder)world.getTileEntity(new BlockPos(x,y,z))).getContainerInventory(),
//                                (TileEntityOscillator) world.getTileEntity(new BlockPos(x,y,z)));
//                        return new ConcreteGui(oscillatorContainer);
//                    default:
//                        return null;
//                }
//
//            }
//        });
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        //MinecraftForge.EVENT_BUS.register(new SoundRegisterListener());
        //MinecraftForge.EVENT_BUS.register(LightHandler.class);
        ModItems.registerOreDict(); // register oredict
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
        event.registerServerCommand(new TeleportCommand());
    }

    @Mod.EventBusSubscriber
    public static class RegistrationHandler {
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event) {
            ModItems.register(event.getRegistry());
            ModBlocks.registerItemBlocks(event.getRegistry());
        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent event) {
            ModItems.registerModels();
            ModBlocks.registerModels();
        }

        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event) {
            ModBlocks.register(event.getRegistry());
        }
    }

}
