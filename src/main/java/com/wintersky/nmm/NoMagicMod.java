package com.wintersky.nmm;

import com.wintersky.nmm.NoEnchanting.NoBookEnchanting;
import com.wintersky.nmm.NoEnchanting.NoEnchantedBooks;
import com.wintersky.nmm.NoEnchanting.NoEnchantingTable;
import com.wintersky.nmm.NoPotions.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod(modid = NoMagicMod.MOD_ID, name = NoMagicMod.NAME, version = NoMagicMod.VERSION)
@Mod.EventBusSubscriber
public class NoMagicMod
{
    public static final String MOD_ID = "nmm";
    public static final String NAME = "No Magic Mod";
    public static final String VERSION = "0.0.1";

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        //Blocks
        ForgeRegistries.BLOCKS.register(new NoBrewingStand());
        ForgeRegistries.BLOCKS.register(new NoEnchantingTable());
        //Items
        ForgeRegistries.ITEMS.register(new NoPotion());
        ForgeRegistries.ITEMS.register(new NoPotionSplash());
        ForgeRegistries.ITEMS.register(new NoPotionLingering());
        ForgeRegistries.ITEMS.register(new NoArrows());
        ForgeRegistries.ITEMS.register(new NoEnchantedBooks());
        ForgeRegistries.ITEMS.register(new NoBookEnchanting());
        ForgeRegistries.ITEMS.register(new NoBrewingStandItem());
    }

}
