package net.sammmmy1628.lostearth.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sammmmy1628.lostearth.LostEarth;

import java.rmi.registry.Registry;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LostEarth.MOD_ID);

    public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> TOTEM_OF_SPIRIT_MASK = ITEMS.register("totem_of_spirit_mask",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> SUN_SIGIL = ITEMS.register("sun_sigil",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> VEIL_OF_MIST = ITEMS.register("veil_of_mist",
            () -> new Item(new Item.Properties().stacksTo(1)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
