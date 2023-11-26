package com.wintersky.nmm.NoPotions;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class NoPotionLingering extends Item {
    public NoPotionLingering() {
        this.setRegistryName(new ResourceLocation("lingering_potion"));
        this.setUnlocalizedName("lingering_potion");
    }
}
