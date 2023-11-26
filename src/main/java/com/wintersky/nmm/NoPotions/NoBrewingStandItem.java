package com.wintersky.nmm.NoPotions;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class NoBrewingStandItem extends Item {
    public NoBrewingStandItem() {
        this.setRegistryName(new ResourceLocation("brewing_stand"));
        this.setUnlocalizedName("brewing_stand");
    }
}
