package net.wickedbog.crazyness.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.wickedbog.crazyness.crazyness;
import net.wickedbog.crazyness.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, crazyness.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.CHEESE);
        simpleItem(ModItems.DISCODIP);
        simpleItem(ModItems.EXPLOSIVE_APPLE);
        simpleItem(ModItems.ICE_CREAM);
        simpleItem(ModItems.ICE_CREAM_CONE);
        simpleItem(ModItems.ICE_CREAM_DISCODIP);
        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.PINE_CONE);
        simpleItem(ModItems.SPARERIB);
        simpleItem(ModItems.STRAWBERRY);
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.SAPPHIRE_INGOT);
        simpleItem(ModItems.RAW_SAPPHIRE);
        simpleItem(ModItems.RADIOACTIVE_COAL);
        simpleItem(ModItems.URANIUM_INGOT);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(crazyness.MOD_ID,"item/" + item.getId().getPath()));
    }
}
