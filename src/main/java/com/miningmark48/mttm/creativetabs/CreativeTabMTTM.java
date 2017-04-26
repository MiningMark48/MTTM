package com.miningmark48.mttm.creativetabs;

import com.miningmark48.mttm.init.ModItems;
import com.miningmark48.mttm.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMTTM {

    public static final CreativeTabs MTTM_TAB = new CreativeTabs(Reference.MOD_ID) {

        @Override
        public Item getTabIconItem() {
            return ModItems.gem;
        }

    };

}
