package net.wickedbog.crazyness.visual_effects;

import net.minecraft.client.*;
import net.minecraft.client.player.*;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.*;
import net.minecraft.world.phys.*;
import net.minecraftforge.api.distmarker.*;
import net.minecraftforge.event.*;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.fml.common.*;
import org.checkerframework.checker.units.qual.min;
import team.lodestar.lodestone.setup.LodestoneParticleRegistry;
import team.lodestar.lodestone.systems.easing.*;
import team.lodestar.lodestone.systems.particle.builder.*;
import team.lodestar.lodestone.systems.particle.data.*;
import team.lodestar.lodestone.systems.particle.data.color.*;
import team.lodestar.lodestone.systems.particle.data.spin.*;

import java.awt.Color;
import java.util.Random;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ExampleParticleEffect {

    //@SubscribeEvent
    //public static void clientTick(TickEvent.ClientTickEvent event) {
    //    final LocalPlayer player = Minecraft.getInstance().player;
    //    if (player != null) {
    //        spawnExampleParticles(player.level(), player.position());
    //
    //    }
    //}

    public static void spawnExampleParticles(Level level, Vec3 pos) {
        Color startingColor = new Color(10, 68, 204);
        Color endingColor = new Color(10, 152, 204);
        WorldParticleBuilder.create(LodestoneParticleRegistry.WISP_PARTICLE)
                .setScaleData(GenericParticleData.create(2.5f, 2.5f).build())
                .setTransparencyData(GenericParticleData.create(0.75f, 0.5f).build())
                .setColorData(ColorParticleData.create(startingColor, endingColor).setCoefficient(1.4f).setEasing(Easing.BOUNCE_IN_OUT).build())
                .setSpinData(SpinParticleData.create(0.2f, 0.4f).setSpinOffset((level.getGameTime() * 0.2f) % 6.28f).setEasing(Easing.QUARTIC_IN).build())
                .setLifetime(40)
                .addMotion(0, 0.01f, 0)
                //.enableNoClip()
                .spawn(level, pos.x + 0.5, pos.y + 0.5, pos.z + 0.5);
    }

    public static void spawnSecondParticle(Level level, Vec3 pos) {
        Color startingColor = new Color(10, 68, 204);
        Color endingColor = new Color(10, 152, 204);
        WorldParticleBuilder.create(LodestoneParticleRegistry.SMOKE_PARTICLE)
                .setScaleData(GenericParticleData.create(2.5f, 2.5f).build())
                .setTransparencyData(GenericParticleData.create(0.75f, 0.5f).build())
                .setColorData(ColorParticleData.create(startingColor, endingColor).setCoefficient(1.4f).setEasing(Easing.BACK_IN_OUT).build())
                .setSpinData(SpinParticleData.create(0.1f, 0.3f).setSpinOffset((level.getGameTime() * 0.5f) % 2.54f).setEasing(Easing.BOUNCE_IN_OUT).build())
                .setLifetime(20)
                .addMotion(0d, 1d, 0d)
                //.enableNoClip()
                .spawn(level, pos.x + 0.5, pos.y + 1, pos.z + 0.5);
    }

    public static void spawnExplodeParticle(Level level, Vec3 pos) {
        Random random = new Random();
        double randomValue = 0.1 + (2 - 0.1) * random.nextDouble();

        Color startingColor = new Color(204, 91, 10);
        Color endingColor = new Color(69, 4, 4);
        WorldParticleBuilder.create(LodestoneParticleRegistry.TWINKLE_PARTICLE)
                .setScaleData(GenericParticleData.create(1f, 1f).build())
                .setTransparencyData(GenericParticleData.create(0.75f, 0.5f).build())
                .setColorData(ColorParticleData.create(startingColor, endingColor).setCoefficient(1.4f).setEasing(Easing.CIRC_IN).build())
                .setSpinData(SpinParticleData.create(1f, 1f).setSpinOffset((level.getGameTime() * 0.5f) % 3.14159f).setEasing(Easing.CIRC_IN).build())
                .setLifetime(40)
                .setRandomMotion(2d)
                .enableNoClip()
                .spawn(level, pos.x + 0.5, pos.y + 1, pos.z + 0.5);

    }
}