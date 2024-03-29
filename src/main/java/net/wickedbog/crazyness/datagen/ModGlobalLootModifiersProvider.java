package net.wickedbog.crazyness.datagen;

import net.wickedbog.crazyness.crazyness;
import net.wickedbog.crazyness.item.ModItems;
import net.wickedbog.crazyness.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.wickedbog.crazyness.loot.AddSusSandItemModifier;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, crazyness.MOD_ID);
    }

    @Override
    protected void start() {
        add("pine_cone_from_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.PINE_CONE.get()));

        add("pine_cone_from_creeper", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/creeper")).build() ,
                LootItemRandomChanceCondition.randomChance(0.25f).build()}, ModItems.PINE_CONE.get()));

        add("sapphire_from_zombie", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/zombie")).build() ,
                LootItemRandomChanceCondition.randomChance(0.20f).build()}, ModItems.SAPPHIRE.get()));

        add("metal_detector_from_jungle_temples", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.METAL_DETECTOR.get()));

        add("metal_detector_from_sus_sand", new AddSusSandItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/desert_pyramid")).build()}, ModItems.METAL_DETECTOR.get()));

        add("corn_seed_from_skeleton", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/skeleton")).build() ,
                LootItemRandomChanceCondition.randomChance(0.20f).build()}, ModItems.CORN_SEEDS.get()));

        add("strawberry_seed_from_bee", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/bee")).build() ,
                LootItemRandomChanceCondition.randomChance(0.50f).build()}, ModItems.STRAWBERRY_SEEDS.get()));

    }
}