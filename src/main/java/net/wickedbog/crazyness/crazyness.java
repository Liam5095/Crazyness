package net.wickedbog.crazyness;

import com.mojang.logging.LogUtils;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.wickedbog.crazyness.block.ModBlocks;
import net.wickedbog.crazyness.block.entity.ModBlockEntities;
import net.wickedbog.crazyness.entity.ModEntities;
import net.wickedbog.crazyness.entity.client.RhinoRenderer;
import net.wickedbog.crazyness.item.ModCreativeModeTabs;
import net.wickedbog.crazyness.item.ModItems;
import net.wickedbog.crazyness.loot.ModLootModifiers;
import net.wickedbog.crazyness.screen.GemPolishingStationMenu;
import net.wickedbog.crazyness.screen.GemPolishingStationScreen;
import net.wickedbog.crazyness.screen.ModMenuTypes;
import net.wickedbog.crazyness.sound.ModSounds;
import net.wickedbog.crazyness.villager.ModVillagers;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(crazyness.MOD_ID)
public class crazyness
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "crazyness";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public crazyness()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModLootModifiers.register(modEventBus);
        ModVillagers.register(modEventBus);

        ModSounds.register(modEventBus);
        ModEntities.register(modEventBus);

        ModBlockEntities.register(modEventBus);
        ModMenuTypes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.CATMINT.getId(), ModBlocks.POTTED_CATMINT);
        });
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.SAPPHIRE);
            event.accept(ModItems.RAW_SAPPHIRE);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.RHINO.get(), RhinoRenderer::new);

            MenuScreens.register(ModMenuTypes.GEM_POLISHING_MENU.get(), GemPolishingStationScreen::new);
        }
    }
}
