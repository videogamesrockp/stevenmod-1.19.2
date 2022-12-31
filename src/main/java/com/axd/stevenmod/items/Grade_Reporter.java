package com.axd.stevenmod.items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.List;

public class Grade_Reporter extends Item {
    public Grade_Reporter(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (hand == InteractionHand.MAIN_HAND && !level.isClientSide()) {
            player.sendSystemMessage(Component.literal("Your grade is an F. Study harder you failure."));
            player.hurt(DamageSource.LIGHTNING_BOLT, 10f);
        }

        return super.use(level, player, hand);
    }
}