package com.miningmark48.mttm.init;

import com.miningmark48.mttm.creativetabs.CreativeTabMTTM;
import com.miningmark48.mttm.item.ItemMTTM;
import com.miningmark48.mttm.item.ItemModAxe;
import com.miningmark48.mttm.item.ItemModPickAxe;
import com.miningmark48.mttm.item.ItemModShovel;
import com.miningmark48.mttm.reference.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item.ToolMaterial matToolBlackDiamond = EnumHelper.addToolMaterial("BlackDiamondTools", 4, 2000, 5, 1, 40);
    public static Item.ToolMaterial matToolWhiteDiamond = EnumHelper.addToolMaterial("WhiteDiamondTools", 3, 1850, 4, 1, 31);
    public static Item.ToolMaterial matToolSapphire = EnumHelper.addToolMaterial("SapphireTools", 2, 1500, 3, 1, 24);



    public static Item gem;
    public static Item gem_sapphire;
    public static Item gem_black_diamond;
    public static Item gem_white_diamond;
    public static Item black_diamond_pickaxe;
    public static Item white_diamond_pickaxe;
    public static Item sapphire_pickaxe;
    public static Item black_diamond_axe;
    public static Item white_diamond_axe;
    public static Item sapphire_axe;
    public static Item black_diamond_shovel;
    public static Item ruby_stick;


    public static void init(){
        gem = new ItemMTTM().setUnlocalizedName("gem").setRegistryName("gem").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
        gem_sapphire = new ItemMTTM().setUnlocalizedName("gem_sapphire").setRegistryName("gem_sapphire").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
        gem_black_diamond = new ItemMTTM().setUnlocalizedName("gem_black_diamond").setRegistryName("gem_black_diamond").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
        gem_white_diamond = new ItemMTTM().setUnlocalizedName("gem_white_diamond").setRegistryName("gem_white_diamond").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
        black_diamond_pickaxe = new ItemModPickAxe(matToolBlackDiamond, new ItemStack(ModItems.gem_black_diamond)).setUnlocalizedName("black_diamond_pickaxe").setRegistryName("black_diamond_pickaxe").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
        white_diamond_pickaxe = new ItemModPickAxe(matToolWhiteDiamond, new ItemStack(ModItems.gem_white_diamond)).setUnlocalizedName("white_diamond_pickaxe").setRegistryName("white_diamond_pickaxe").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
        sapphire_pickaxe = new ItemModPickAxe(matToolSapphire, new ItemStack(ModItems.gem_sapphire)).setUnlocalizedName("sapphire_pickaxe").setRegistryName("sapphire_pickaxe").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
        black_diamond_axe = new ItemModAxe(Item.ToolMaterial.DIAMOND, new ItemStack(ModItems.gem_black_diamond)).setUnlocalizedName("black_diamond_axe").setRegistryName("black_diamond_axe").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
        white_diamond_axe = new ItemModAxe(Item.ToolMaterial.DIAMOND, new ItemStack(ModItems.gem_white_diamond)).setUnlocalizedName("white_diamond_axe").setRegistryName("white_diamond_axe").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
        sapphire_axe = new ItemModAxe(Item.ToolMaterial.IRON, new ItemStack(ModItems.gem_sapphire)).setUnlocalizedName("sapphire_axe").setRegistryName("sapphire_axe").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
        black_diamond_shovel = new ItemModShovel(matToolBlackDiamond, new ItemStack(ModItems.gem_black_diamond)).setUnlocalizedName("black_diamond_shovel").setRegistryName("black_diamond_shovel").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
        ruby_stick = new ItemMTTM().setUnlocalizedName("ruby_stick").setRegistryName("ruby_stick").setCreativeTab(CreativeTabMTTM.MTTM_TAB);


    }

    public static void register() {
        GameRegistry.register(gem);
        GameRegistry.register(gem_sapphire);
        GameRegistry.register(gem_black_diamond);
        GameRegistry.register(gem_white_diamond);
        GameRegistry.register(black_diamond_pickaxe);
        GameRegistry.register(white_diamond_pickaxe);
        GameRegistry.register(sapphire_pickaxe);
        GameRegistry.register(black_diamond_axe);
        GameRegistry.register(white_diamond_axe);
        GameRegistry.register(sapphire_axe);
        GameRegistry.register(black_diamond_shovel);
        GameRegistry.register(ruby_stick);
    }


    public static void registerRenders(){
        registerRender(gem);
        registerRender(gem_sapphire);
        registerRender(gem_black_diamond);
        registerRender(gem_white_diamond);
        registerRender(black_diamond_pickaxe);
        registerRender(white_diamond_pickaxe);
        registerRender(sapphire_pickaxe);
        registerRender(black_diamond_axe);
        registerRender(white_diamond_axe);
        registerRender(sapphire_axe);
        registerRender(black_diamond_shovel);
        registerRender(ruby_stick);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void registerRender(Item item, int meta, String name){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, meta, new ModelResourceLocation(Reference.MOD_ID + ":" + name, "inventory"));
    }

}
