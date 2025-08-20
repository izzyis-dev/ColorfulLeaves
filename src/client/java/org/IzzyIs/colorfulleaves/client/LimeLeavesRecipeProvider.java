package org.IzzyIs.colorfulleaves.client;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.IzzyIs.colorfulleaves.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class LimeLeavesRecipeProvider extends FabricRecipeProvider {
    public LimeLeavesRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
                @SuppressWarnings("unused")
                RegistryWrapper.Impl<Item> itemLookup = registries.getOrThrow(RegistryKeys.ITEM);

                createShapeless(RecipeCategory.DECORATIONS, ModBlocks.LIME_LEAF_BLOCK, 1)
                        .input(Items.LIME_DYE).input(ItemTags.LEAVES)
                        .criterion(hasItem(Items.LIME_DYE), conditionsFromItem(Items.LIME_DYE))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "LimeLeavesRecipeProvider";
    }

}
