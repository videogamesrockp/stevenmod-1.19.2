package com.axd.stevenmod.items;

import com.axd.stevenmod.ModArmorMaterial;
import com.axd.stevenmod.StevenMod;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StevenMod.MODID);

    public static final RegistryObject<Grade_Reporter> GRADE_REPORTER = ITEMS.register("grade_reporter",
            () -> new Grade_Reporter(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> REPORT_CARD = ITEMS.register("report_card", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));

    public static final RegistryObject<ArmorItem> REPORT_CARD_HELMET = ITEMS.register("report_card_helmet",
            () -> new ArmorItem(ArmorTiers.REPORT_CARD, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> REPORT_CARD_CHESTPLATE = ITEMS.register("report_card_chestplate",
            () -> new ArmorItem(ArmorTiers.REPORT_CARD, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> REPORT_CARD_LEGGINGS = ITEMS.register("report_card_leggings",
            () -> new ArmorItem(ArmorTiers.REPORT_CARD, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> REPORT_CARD_BOOTS = ITEMS.register("report_card_boots",
            () -> new ArmorItem(ArmorTiers.REPORT_CARD, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));


    public static class ArmorTiers {
        public static final ArmorMaterial REPORT_CARD = new ModArmorMaterial(
                "report_card",
                750,
                new int[] { 20, 30, 40, 10 },
                300,
                SoundEvents.ARMOR_EQUIP_DIAMOND,
                0.0f,
                0.0f,
                () -> Ingredient.of(ModItems.REPORT_CARD.get()));
    }

}
