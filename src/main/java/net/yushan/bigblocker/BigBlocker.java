package net.yushan.bigblocker;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.yushan.bigblocker.handlers.HarvestHandler;

@Mod(modid = BigBlocker.MODID, version = BigBlocker.VERSION)
public class BigBlocker
{
    public static final String MODID = "bigblocker";
    public static final String VERSION = "0.1";

    @SidedProxy(clientSide="net.yushan.bigblocker.ClientProxy", serverSide="net.yushan.bigblocker.ServerProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);

        GameRegistry.addShapelessRecipe(new ItemStack(Items.DIAMOND), new Object[]{Blocks.DIRT});
        MinecraftForge.EVENT_BUS.register(new HarvestHandler());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}
