package com.wintersky.nmm.NoEnchanting;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class NoEnchantedBooks extends Item {
    public NoEnchantedBooks() {
        this.setRegistryName(new ResourceLocation("enchanted_book"));
        this.setUnlocalizedName("enchanted_book");
    }
}
