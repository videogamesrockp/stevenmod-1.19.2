package com.axd.stevenmod.events;

import com.axd.stevenmod.StevenMod;
import com.axd.stevenmod.entities.ModEntities;
import com.axd.stevenmod.entities.StevenEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = StevenMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCommonEvents {
    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.STEVEN_HE.get(), StevenEntity.getExampleAttributes().build());
    }
}
