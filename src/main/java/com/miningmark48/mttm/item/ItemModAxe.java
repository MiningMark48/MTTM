package com.miningmark48.mttm.item;



import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;


public class ItemModAxe extends ItemAxe {

    private ItemStack repairStack = null;

    public ItemModAxe(ToolMaterial material, ItemStack repairStack) {
        super(material);
        this.repairStack = repairStack;
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return repair.isItemEqual(repairStack);
    }
}