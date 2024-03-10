package net.wickedbog.crazyness.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.wickedbog.crazyness.crazyness;
import net.wickedbog.crazyness.item.custom.FuelItem;
import net.wickedbog.crazyness.item.custom.MetalDetectorItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, crazyness.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
    () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EXPLOSIVE_APPLE = ITEMS.register("explosive_apple",
            () -> new Item(new Item.Properties().food(ModFoods.EXPLOSIVE_APPLE)));

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().food(ModFoods.CHEESE)));

    public static final  RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry",
            () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));

    public static final RegistryObject<Item> SAPPHIRE_INGOT = ITEMS.register("sapphire_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PINE_CONE = ITEMS.register("pine_cone",
            () -> new FuelItem(new Item.Properties(), 300));

    public static final RegistryObject<Item> RADIOACTIVE_COAL = ITEMS.register("radioactive_coal",
            () -> new FuelItem(new Item.Properties(), 2400));

    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SPARERIB = ITEMS.register("sparerib",
            () -> new Item(new Item.Properties().food(ModFoods.SPARERIB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
