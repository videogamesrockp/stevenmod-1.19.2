package com.axd.stevenmod.entities;

import com.axd.stevenmod.StevenMod;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, StevenMod.MODID);

    public static final RegistryObject<EntityType<StevenEntity>> STEVEN_HE = ENTITIES.register("steven_he",
            () -> EntityType.Builder.of(StevenEntity::new, MobCategory.CREATURE).sized(1.0f, 1.0f).build(StevenMod.MODID + ":steven_he"));
}
