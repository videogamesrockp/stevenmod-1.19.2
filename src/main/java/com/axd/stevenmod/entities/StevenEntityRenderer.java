package com.axd.stevenmod.entities;

import com.axd.stevenmod.StevenMod;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class StevenEntityRenderer extends MobRenderer<StevenEntity, StevenEntityModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(StevenMod.MODID, "textures/entities/steven_he.png");

    public StevenEntityRenderer (EntityRendererProvider.Context ctx) {
        super(ctx, new StevenEntityModel(ctx.bakeLayer(StevenEntityModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(StevenEntity entity) {
        return TEXTURE;
    }
}
