package com.miningmark48.mttm.item;



import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;


public class ItemModShovel extends ItemSpade {

    private ItemStack repairStack = null;

    public ItemModShovel(ToolMaterial material, ItemStack repairStack){
        super(material);
        this.repairStack = repairStack;
    }

    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return repair.isItemEqual(repairStack);}



}
