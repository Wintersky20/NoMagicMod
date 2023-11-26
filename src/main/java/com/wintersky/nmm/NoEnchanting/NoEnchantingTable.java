package com.wintersky.nmm.NoEnchanting;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;

public class NoEnchantingTable extends Block {
    public NoEnchantingTable() {
        super(Material.IRON, MapColor.IRON);
        this.setRegistryName(new ResourceLocation("enchanting_table"));
        this.setHardness(3.0F);
        this.setResistance(8.0F);
        this.setSoundType(SoundType.METAL);
        this.setUnlocalizedName("enchanting_table");
    }
}
