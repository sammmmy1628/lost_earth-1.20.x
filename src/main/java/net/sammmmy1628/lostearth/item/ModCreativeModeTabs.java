package net.sammmmy1628.lostearth.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sammmmy1628.lostearth.LostEarth;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LostEarth.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LOST_EARTH = CREATIVE_MODE_TABS.register("lost_earth",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GOLD_COIN.get()))
                    .title(Component.translatable("creativetab.lost_earth"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.GOLD_COIN.get());
                        output.accept(ModItems.TOTEM_OF_SPIRIT_MASK.get());
                        output.accept(ModItems.SUN_SIGIL.get());
                        output.accept(ModItems.VEIL_OF_MIST.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}