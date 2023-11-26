package com.wintersky.nmm.NoEnchanting;

import net.minecraft.enchantment.Enchantment;

public class NoEnchantments extends Enchantment {
    public NoEnchantments() {
        super(null, null, null);
    }

    public boolean isAllowedOnBooks()
    {
        return false;
    }
}
