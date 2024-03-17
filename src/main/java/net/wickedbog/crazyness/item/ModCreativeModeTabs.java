package net.wickedbog.crazyness.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.wickedbog.crazyness.block.ModBlocks;
import net.wickedbog.crazyness.crazyness;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, crazyness.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CRAZYNESS_TAB = CREATIVE_MODE_TABS.register("crazyness_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.CHEESE.get()))
                    .title(Component.translatable("creativetab.crazyness_tab"))
                    .withSearchBar()
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                        pOutput.accept(ModItems.EXPLOSIVE_APPLE.get());
                        pOutput.accept(ModItems.CHEESE.get());
                        pOutput.accept(ModItems.SAPPHIRE_INGOT.get());
                        pOutput.accept(ModItems.STRAWBERRY.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModItems.PINE_CONE.get());
                        pOutput.accept(ModItems.URANIUM_INGOT.get());
                        pOutput.accept(ModItems.RADIOACTIVE_COAL.get());
                        pOutput.accept(ModItems.SPARERIB.get());
                        pOutput.accept(ModItems.ICE_CREAM_CONE.get());
                        pOutput.accept(ModItems.ICE_CREAM_DISCODIP.get());
                        pOutput.accept(ModItems.DISCODIP.get());
                        pOutput.accept(ModItems.ICE_CREAM.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.URANIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.URANIUM_ORE.get());

                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());
                        pOutput.accept(ModBlocks.REVAMPER.get());
                        pOutput.accept(ModBlocks.SHRIEKALYST.get());

                        pOutput.accept(ModItems.SAPPHIRE_HOE.get());
                        pOutput.accept(ModItems.SAPPHIRE_SWORD.get());
                        pOutput.accept(ModItems.SAPPHIRE_PICKAXE.get());
                        pOutput.accept(ModItems.SAPPHIRE_AXE.get());
                        pOutput.accept(ModItems.SAPPHIRE_SHOVEL.get());

                        pOutput.accept(ModBlocks.CATMINT.get());

                        pOutput.accept(ModItems.BAR_BRAWL_MUSIC_DISC.get());

                        pOutput.accept(ModItems.RHINO_SPAWN_EGG.get());

                        pOutput.accept(ModBlocks.GEM_POLISHING_STATION.get());

                        pOutput.accept(ModItems.SAPPHIRE_HELMET.get());
                        pOutput.accept(ModItems.SAPPHIRE_CHESTPLATE.get());
                        pOutput.accept(ModItems.SAPPHIRE_LEGGINGS.get());
                        pOutput.accept(ModItems.SAPPHIRE_BOOTS.get());

                        pOutput.accept(ModItems.STRAWBERRY_SEEDS.get());
                        pOutput.accept(ModItems.CORN_SEEDS.get());
                        pOutput.accept(ModItems.CORN.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_STAIRS.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_SLAB.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_WALL.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_DOOR.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_TRAPDOOR.get());

                        pOutput.accept(ModItems.SAPPHIRE_STAFF.get());

                        pOutput.accept(ModBlocks.PINE_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_PINE_LOG.get());
                        pOutput.accept(ModBlocks.PINE_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_PINE_WOOD.get());

                        pOutput.accept(ModBlocks.PINE_PLANKS.get());
                        pOutput.accept(ModBlocks.PINE_LEAVES.get());

                        pOutput.accept(ModBlocks.VISUAL_EFFECT_TESTER.get());

                        pOutput.accept(Blocks.TNT);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
