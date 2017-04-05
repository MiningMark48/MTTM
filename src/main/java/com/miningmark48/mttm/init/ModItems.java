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
    public static Item gem_sapphire;
    public static Item gem_black_diamond;
    public static Item gem_white_diamond;

    public static void init(){
        gem = new ItemMTTM().setUnlocalizedName("gem").setRegistryName("gem").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
        gem_sapphire = new ItemMTTM().setUnlocalizedName("gem_sapphire").setRegistryName("gem_sapphire").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
        gem_black_diamond = new ItemMTTM().setUnlocalizedName("gem_black_diamond").setRegistryName("gem_black_diamond").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
        gem_white_diamond = new ItemMTTM().setUnlocalizedName("gem_white_diamond").setRegistryName("gem_white_diamond").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
    }

    public static void register(){
        GameRegistry.register(gem);
        GameRegistry.register(gem_sapphire);
        GameRegistry.register(gem_black_diamond);
        GameRegistry.register(gem_white_diamond);
    }

    public static void registerRenders(){
        registerRender(gem);
        registerRender(gem_sapphire);
        registerRender(gem_black_diamond);
        registerRender(gem_white_diamond);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void registerRender(Item item, int meta, String name){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(Reference.MOD_ID + ":" + name, "inventory"));
    }

}
