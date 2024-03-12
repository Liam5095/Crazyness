package net.wickedbog.crazyness.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.wickedbog.crazyness.block.ModBlocks;
import net.wickedbog.crazyness.crazyness;
import net.wickedbog.crazyness.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, crazyness.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
                .add(ModBlocks.SAPPHIRE_ORE.get()).add(Blocks.IRON_ORE).add(Blocks.DEEPSLATE_IRON_ORE).add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(Blocks.RAW_IRON_BLOCK);

        this.tag(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.SAPPHIRE_ORE.get()).add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.RAW_SAPPHIRE_BLOCK.get()).add(ModBlocks.NETHER_SAPPHIRE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(ModBlocks.END_STONE_SAPPHIRE_ORE.get()).add(ModBlocks.URANIUM_ORE.get())
                .add(ModBlocks.URANIUM_BLOCK.get());

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL);
        this.tag(Tags.Blocks.NEEDS_WOOD_TOOL);
        this.tag(Tags.Blocks.NEEDS_GOLD_TOOL);

        this.tag(BlockTags.MINEABLE_WITH_AXE);
        this.tag(BlockTags.MINEABLE_WITH_HOE);
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE);
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(ModBlocks.SAPPHIRE_BLOCK.get()).add(ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_ORE.get()).add(ModBlocks.NETHER_SAPPHIRE_ORE.get())
                .add(ModBlocks.END_STONE_SAPPHIRE_ORE.get()).add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(ModBlocks.URANIUM_BLOCK.get()).add(ModBlocks.URANIUM_ORE.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL);

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.SAPPHIRE_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.SAPPHIRE_FENCE_GATE.get());

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.SAPPHIRE_WALL.get());
    }
}
