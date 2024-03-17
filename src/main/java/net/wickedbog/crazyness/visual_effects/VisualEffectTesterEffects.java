package net.wickedbog.crazyness.visual_effects;

import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import team.lodestar.lodestone.setup.LodestoneParticleRegistry;
import team.lodestar.lodestone.systems.easing.Easing;
import team.lodestar.lodestone.systems.particle.builder.WorldParticleBuilder;
import team.lodestar.lodestone.systems.particle.data.GenericParticleData;
import team.lodestar.lodestone.systems.particle.data.color.ColorParticleData;
import team.lodestar.lodestone.systems.particle.data.spin.SpinParticleData;

import java.awt.*;

public class VisualEffectTesterEffects {
    public static void spawnTestParticle(Level level, Vec3 pos) {
        Color startingColor = new Color(211, 214, 9);
        Color endingColor = new Color(214, 101, 9);
        WorldParticleBuilder.create(LodestoneParticleRegistry.STAR_PARTICLE)
                .setScaleData(GenericParticleData.create(0.5f, 0.5f).build())
                .setTransparencyData(GenericParticleData.create(0.75f, 0.5f).build())
                .setColorData(ColorParticleData.create(startingColor, endingColor).setCoefficient(1.4f).setEasing(Easing.BACK_IN_OUT).build())
                .setSpinData(SpinParticleData.create(0.1f, 0.3f).setSpinOffset((level.getGameTime() * 0.5f) % 2.54f).setEasing(Easing.BOUNCE_IN_OUT).build())
                .setLifetime(30)
                .addMotion(0d, 0d, 0d)
                //.enableNoClip()
                .spawn(level, pos.x + 0.5, pos.y + 1, pos.z + 0.5);
    }
}
