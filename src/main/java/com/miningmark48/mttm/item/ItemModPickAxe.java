package com.miningmark48.mttm.item;



import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;


public class ItemModPickAxe extends ItemPickaxe {

    private ItemStack repairStack = null;

    public ItemModPickAxe(ToolMaterial material, ItemStack repairStack) {
        super(material);
        this.repairStack = repairStack;
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return repair.isItemEqual(repairStack);
    }
}
