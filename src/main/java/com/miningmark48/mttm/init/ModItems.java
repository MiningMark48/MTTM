package com.miningmark48.mttm.init;

import com.miningmark48.mttm.creativetabs.CreativeTabMTTM;
import com.miningmark48.mttm.item.ItemMTTM;
import com.miningmark48.mttm.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item gem;

    public static void init(){
        gem = new ItemMTTM().setUnlocalizedName("gem").setRegistryName("gem").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
    }

    public static void register(){
        GameRegistry.register(gem);
    }

    public static void registerRenders(){
        registerRender(gem);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void registerRender(Item item, int meta, String name){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(Reference.MOD_ID + ":" + name, "inventory"));
    }

}
