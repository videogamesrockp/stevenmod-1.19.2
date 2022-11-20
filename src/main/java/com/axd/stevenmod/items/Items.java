package com.axd.stevenmod.items;

import com.axd.stevenmod.StevenMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Items {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StevenMod.MODID);

    public static final RegistryObject<Item> REPORT_CARD = ITEMS.register("report_card", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
}
