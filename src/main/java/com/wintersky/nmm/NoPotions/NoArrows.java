package com.wintersky.nmm.NoPotions;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class NoArrows extends Item {
    public NoArrows() {
        this.setRegistryName(new ResourceLocation("tipped_arrow"));
        this.setUnlocalizedName("tipped_arrow");
    }
}
