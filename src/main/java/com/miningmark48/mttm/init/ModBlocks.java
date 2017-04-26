package com.miningmark48.mttm.init;

import com.miningmark48.mttm.block.BlockMTTM;
import com.miningmark48.mttm.creativetabs.CreativeTabMTTM;
import com.miningmark48.mttm.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static Block nether_star_block;
    public static Block sapphire_block;
    public static Block ruby_block;
    public static Block black_diamond_block;
    public static Block white_diamond_block;
    public static Block ruby_ore;


    public static void init(){
        nether_star_block = new BlockMTTM().setUnlocalizedName("nether_star_block").setRegistryName("nether_star_block").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
        sapphire_block = new BlockMTTM().setUnlocalizedName("sapphire_block").setRegistryName("sapphire_block").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
        ruby_block = new BlockMTTM().setUnlocalizedName("ruby_block").setRegistryName("ruby_block").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
        black_diamond_block = new BlockMTTM().setUnlocalizedName("black_diamond_block").setRegistryName("black_diamond_block").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
        white_diamond_block = new BlockMTTM().setUnlocalizedName("white_diamond_block").setRegistryName("white_diamond_block").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
        ruby_ore = new BlockMTTM().setUnlocalizedName("ruby_ore").setRegistryName("ruby_ore").setCreativeTab(CreativeTabMTTM.MTTM_TAB);
    }

    public static void register(){
        registerBlock(nether_star_block);
        registerBlock(sapphire_block);
        registerBlock(ruby_block);
        registerBlock(black_diamond_block);
        registerBlock(white_diamond_block);
        registerBlock(ruby_ore);
    }

    public static void registerRenders(){
        registerRender(nether_star_block);
        registerRender(sapphire_block);
        registerRender(ruby_block);
        registerRender(black_diamond_block);
        registerRender(white_diamond_block);
        registerRender(ruby_ore);
    }



    private static void registerBlock(Block block){
        GameRegistry.register(block);
        ItemBlock item = new ItemBlock(block);
        item.setRegistryName(block.getRegistryName());
        GameRegistry.register(item);
    }

    public static void registerRender(Block block){
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }

}
