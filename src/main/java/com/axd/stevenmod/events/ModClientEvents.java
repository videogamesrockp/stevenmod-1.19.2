package com.axd.stevenmod.events;

import com.axd.stevenmod.StevenMod;
import com.axd.stevenmod.entities.ModEntities;
import com.axd.stevenmod.entities.StevenEntityModel;
import com.axd.stevenmod.entities.StevenEntityRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = StevenMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.STEVEN_HE.get(), StevenEntityRenderer::new);
    }

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(StevenEntityModel.LAYER_LOCATION, StevenEntityModel::createBodyLayer);
    }
}