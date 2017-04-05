package com.miningmark48.mttm.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {

    public static void init(){
        //Items
        GameRegistry.addShapelessRecipe(new ItemStack(Items.NETHER_STAR, 9), new ItemStack(ModBlocks.nether_star_block));

        //Blocks
        GameRegistry.addRecipe(new ItemStack(ModBlocks.nether_star_block), "xxx", "xxx", "xxx", 'x', new ItemStack(Items.NETHER_STAR));
    }

}
