package net.wickedbog.crazyness.event;

import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.wickedbog.crazyness.crazyness;
import net.wickedbog.crazyness.entity.client.ModModelLayers;
import net.wickedbog.crazyness.entity.client.RhinoModel;

@Mod.EventBusSubscriber(modid = crazyness.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.RHINO_LAYER, RhinoModel::createBodyLayer);
    }

}
