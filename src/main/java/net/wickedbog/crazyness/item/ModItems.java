package net.wickedbog.crazyness.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wickedbog.crazyness.crazyness;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, crazyness.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EXPLOSIVE_APPLE = ITEMS.register("explosive_apple",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).alwaysEat().build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
