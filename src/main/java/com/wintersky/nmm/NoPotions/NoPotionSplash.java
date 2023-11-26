package com.wintersky.nmm.NoPotions;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class NoPotionSplash extends Item {

    public NoPotionSplash() {
        this.setRegistryName(new ResourceLocation("splash_potion"));
        this.setUnlocalizedName("splash_potion");
    }
}
