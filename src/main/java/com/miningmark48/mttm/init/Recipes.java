package com.miningmark48.mttm.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {

    public static void init(){
        //Items
        GameRegistry.addShapelessRecipe(new ItemStack(Items.NETHER_STAR, 9), new ItemStack(ModBlocks.nether_star_block));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gem_black_diamond, 9), new ItemStack(ModBlocks.black_diamond_block));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gem_white_diamond, 9), new ItemStack(ModBlocks.white_diamond_block));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gem, 9), new ItemStack(ModBlocks.ruby_block));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gem_sapphire, 9), new ItemStack(ModBlocks.sapphire_block));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.nether_star_block), "xxx", "xxx", "xxx", 'x', new ItemStack(Items.NETHER_STAR));
        GameRegistry.addRecipe(new ItemStack(ModItems.gem_black_diamond), "xxx", "xyx", "xxx", 'x', new ItemStack(Items.COAL), 'y', new ItemStack(Items.DIAMOND));
        GameRegistry.addRecipe(new ItemStack(ModItems.gem_white_diamond), "xxx", "xyx", "xxx", 'x', new ItemStack(Items.QUARTZ), 'y', new ItemStack(Items.DIAMOND));
        GameRegistry.addRecipe(new ItemStack(ModItems.gem_sapphire), "xxx", "xyx", "xxx", 'x', new ItemStack(Blocks.WOOL,1,2), 'y', new ItemStack(Items.EMERALD));
        GameRegistry.addRecipe(new ItemStack(ModItems.black_diamond_pickaxe), "xxx", "aya", "aya", 'x', new ItemStack(ModItems.gem_black_diamond), 'y' , new ItemStack(Items.STICK));
        GameRegistry.addRecipe(new ItemStack(ModItems.white_diamond_pickaxe), "xxx", "aya", "aya", 'x', new ItemStack(ModItems.gem_white_diamond), 'y', new ItemStack(Items.STICK));
        GameRegistry.addRecipe(new ItemStack(ModItems.sapphire_pickaxe), "xxx", "aya", "aya", 'x', new ItemStack(ModItems.gem_sapphire), 'y', new ItemStack(Items.STICK));
        GameRegistry.addRecipe(new ItemStack(ModItems.black_diamond_axe), "xxa", "xya", "aya", 'x', new ItemStack(ModItems.gem_black_diamond), 'y', new ItemStack(Items.STICK));

        //Blocks
        GameRegistry.addRecipe(new ItemStack(ModBlocks.sapphire_block), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.gem_sapphire));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.ruby_block), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.gem));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.black_diamond_block), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.gem_black_diamond));
        GameRegistry.addRecipe(new ItemStack(ModBlocks.white_diamond_block), "xxx", "xxx", "xxx", 'x', new ItemStack(ModItems.gem_white_diamond));

        //Smelting
        GameRegistry.addSmelting(new ItemStack(ModBlocks.ruby_ore), new ItemStack(ModItems.gem, 1), 0f);
    }

}
