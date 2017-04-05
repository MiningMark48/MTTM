package com.miningmark48.mttm.proxy;


import com.miningmark48.mttm.init.ModBlocks;
import com.miningmark48.mttm.init.ModItems;

public class ClientProxy extends CommonProxy{

    @Override
    public void init(){
    }

    @Override
    public void registerRenders(){
        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }

}
