package com.axd.stevenmod;

import com.axd.stevenmod.items.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(StevenMod.MODID)
public class StevenMod
{
    public static final String MODID = "stevenmod";

    public StevenMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        Items.ITEMS.register(bus);
    }
}
