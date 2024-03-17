package net.wickedbog.crazyness.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.wickedbog.crazyness.block.entity.GemPolishingStationBlockEntity;
import net.wickedbog.crazyness.block.entity.ModBlockEntities;
import net.wickedbog.crazyness.block.entity.renderer.GemPolishingStationBlockEntityRenderer;
import net.wickedbog.crazyness.crazyness;
import net.wickedbog.crazyness.entity.client.ModModelLayers;
import net.wickedbog.crazyness.entity.client.RhinoModel;

@Mod.EventBusSubscriber(modid = crazyness.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.RHINO_LAYER, RhinoModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.GEM_POLISHING_BE.get(), GemPolishingStationBlockEntityRenderer::new);
    }
}
