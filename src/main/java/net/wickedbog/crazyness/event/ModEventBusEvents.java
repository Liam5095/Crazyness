package net.wickedbog.crazyness.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.wickedbog.crazyness.crazyness;
import net.wickedbog.crazyness.entity.ModEntities;
import net.wickedbog.crazyness.entity.custom.RhinoEntity;

@Mod.EventBusSubscriber(modid = crazyness.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.RHINO.get(), RhinoEntity.createAttributes().build());
    }
}
