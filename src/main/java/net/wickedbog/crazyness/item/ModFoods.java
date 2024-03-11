package net.wickedbog.crazyness.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 1), 0.1f).build();

    public static final FoodProperties CHEESE = new FoodProperties.Builder().nutrition(3)
            .saturationMod(0.3f).effect(() -> new MobEffectInstance(MobEffects.JUMP, 200, 1), 0.1f).build();

    public static final FoodProperties EXPLOSIVE_APPLE = new FoodProperties.Builder().nutrition(1).fast()
            .saturationMod(0.1f).effect(() -> new MobEffectInstance(MobEffects.POISON, 100,1), 0.1F).build();

    public static final FoodProperties SPARERIB = new FoodProperties.Builder().nutrition(10)
            .saturationMod(0.5f).meat().build();

    public static final FoodProperties ICE_CREAM_DISCODIP = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.1F).alwaysEat().build();

    public static final FoodProperties ICE_CREAM_CONE = new FoodProperties.Builder().nutrition(1)
            .saturationMod(0.05F).alwaysEat().build();
}
