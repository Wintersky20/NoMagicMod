package com.wintersky.nmm.NoEnchanting;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBook;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class NoBookEnchanting extends ItemBook {

    public NoBookEnchanting() {
        this.setRegistryName(new ResourceLocation("book"));
        this.setUnlocalizedName("book");
        this.setCreativeTab(CreativeTabs.MISC);
    }
    public boolean isEnchantable(ItemStack stack)
    {
        return false;
    }

    public int getItemEnchantability()
    {
        return 0;
    }
}
