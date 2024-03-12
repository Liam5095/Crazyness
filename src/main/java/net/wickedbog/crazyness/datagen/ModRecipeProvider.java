package net.wickedbog.crazyness.datagen;

import net.minecraft.advancements.Criterion;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.wickedbog.crazyness.block.ModBlocks;
import net.wickedbog.crazyness.crazyness;
import net.wickedbog.crazyness.item.ModItems;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModItems.RAW_SAPPHIRE.get(),
            ModBlocks.SAPPHIRE_ORE.get(), ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(),
            ModBlocks.END_STONE_SAPPHIRE_ORE.get(), ModBlocks.NETHER_SAPPHIRE_ORE.get());

    private static final List<ItemLike> SAPPHIRE_BLOCK_SMELTABLES = List.of(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

    private  static final List<ItemLike> URANIUM_SMELTABLES = List.of(ModBlocks.URANIUM_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        //Smelting

        oreSmelting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25F, 100, "sapphire");
        oreSmelting(pWriter, SAPPHIRE_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get(), 0.5F, 300, "sapphire");
        oreSmelting(pWriter, URANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.URANIUM_INGOT.get(), 0.5F, 300, "uranium");

        //Blasting

        oreBlasting(pWriter, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25F, 200, "sapphire");
        oreBlasting(pWriter, SAPPHIRE_BLOCK_SMELTABLES, RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get(), 0.5F, 200, "sapphire");
        oreBlasting(pWriter, URANIUM_SMELTABLES, RecipeCategory.MISC, ModItems.URANIUM_INGOT.get(), 0.5F, 300, "uranium");

        //Shaped

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.METAL_DETECTOR.get())
                .pattern("  /")
                .pattern(" / ")
                .pattern("cc ")
                .define('c', ModItems.SAPPHIRE_INGOT.get())
                .define('/', Items.STICK)
                .unlockedBy(getHasName(ModItems.SAPPHIRE_INGOT.get()), has(ModItems.SAPPHIRE_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.RAW_SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.RAW_SAPPHIRE.get()), has(ModItems.RAW_SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SOUND_BLOCK.get())
                .pattern("#N#")
                .pattern("DBD")
                .pattern("C#C")
                .define('#', Items.EMERALD)
                .define('N', Blocks.NOTE_BLOCK)
                .define('D', Items.DIAMOND)
                .define('B', Items.NETHER_STAR)
                .define('C', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.URANIUM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.URANIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.URANIUM_INGOT.get()), has(ModItems.URANIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RADIOACTIVE_COAL.get())
                .pattern(" # ")
                .pattern("bCb")
                .pattern(" # ")
                .define('#', Items.CHARCOAL)
                .define('b', ModItems.URANIUM_INGOT.get())
                .define('C', Items.COAL)
                .unlockedBy(getHasName(ModItems.URANIUM_INGOT.get()), has(ModItems.URANIUM_INGOT.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_SLAB.get(), 9)
                .pattern("   ")
                .pattern("sss")
                .pattern("   ")
                .define('s', ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_WALL.get(), 9)
                .pattern("szs")
                .pattern("szs")
                .pattern("   ")
                .define('s', ModBlocks.SAPPHIRE_BLOCK.get())
                .define('z', Blocks.STONE)
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_FENCE_GATE.get(), 3)
                .pattern("szs")
                .pattern("szs")
                .pattern("   ")
                .define('s', Items.STICK)
                .define('z', ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_FENCE.get(), 5)
                .pattern("szs")
                .pattern("szs")
                .pattern("   ")
                .define('z', Items.STICK)
                .define('s', ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_DOOR.get(), 3)
                .pattern("ss ")
                .pattern("ss ")
                .pattern("ss ")
                .define('s', ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_PRESSURE_PLATE.get(), 1)
                .pattern("ss ")
                .pattern("   ")
                .pattern("   ")
                .define('s', ModBlocks.SAPPHIRE_SLAB.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        //Shapeless

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 9)
                .requires(ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_SAPPHIRE.get(), 9)
                .requires(ModBlocks.RAW_SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_SAPPHIRE_BLOCK.get()), has(ModBlocks.RAW_SAPPHIRE_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.URANIUM_INGOT.get(), 9)
                .requires(ModBlocks.URANIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.URANIUM_BLOCK.get()), has(ModBlocks.URANIUM_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.EXPLOSIVE_APPLE.get())
                .requires(Items.TNT)
                .requires(Items.APPLE)
                .unlockedBy(getHasName(Items.TNT), has(Items.TNT))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE_INGOT.get())
                .requires(ModItems.SAPPHIRE.get())
                .requires(Items.IRON_INGOT)
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BUTTON.get())
                .requires(ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(pWriter);

    }

    protected static void oneToOneConversionRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pResult, ItemLike pIngredient, @javax.annotation.Nullable String pGroup) {
        oneToOneConversionRecipe(pFinishedRecipeConsumer, pResult, pIngredient, pGroup, 1);
    }

    protected static void oneToOneConversionRecipe(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pResult, ItemLike pIngredient, @javax.annotation.Nullable String pGroup, int pResultCount) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pResult, pResultCount).requires(pIngredient).group(pGroup).
                unlockedBy(getHasName(pIngredient), has(pIngredient)).save(pFinishedRecipeConsumer, getConversionRecipeName(pResult, pIngredient));
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE,
                pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        Iterator var9 = pIngredients.iterator();

        while(var9.hasNext()) {
            ItemLike itemlike = (ItemLike)var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, crazyness.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }

    }
}
