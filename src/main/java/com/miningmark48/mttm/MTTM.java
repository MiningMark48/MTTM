package com.miningmark48.mttm;

import com.miningmark48.mttm.init.ModBlocks;
import com.miningmark48.mttm.init.ModItems;
import com.miningmark48.mttm.init.Recipes;
import com.miningmark48.mttm.proxy.CommonProxy;
import com.miningmark48.mttm.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = Reference.MOD_ID,
        name = Reference.MOD_NAME,
        version = Reference.VERSION
)
public class MTTM {

    @Mod.Instance(Reference.MOD_ID)
    public static MTTM instance;

    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
        ModItems.register();
        ModBlocks.init();
        ModBlocks.register();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.registerRenders();
        proxy.init();
        Recipes.init();
    }
}
