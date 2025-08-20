package org.IzzyIs.colorfulleaves;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) ->
                itemGroup.add(RED_LEAF_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) ->
                itemGroup.add(WHITE_LEAF_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) ->
                itemGroup.add(BLACK_LEAF_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) ->
                itemGroup.add(ORANGE_LEAF_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) ->
                itemGroup.add(MAGENTA_LEAF_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) ->
                itemGroup.add(LIGHT_BLUE_LEAF_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) ->
                itemGroup.add(YELLOW_LEAF_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) ->
                itemGroup.add(LIME_LEAF_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) ->
                itemGroup.add(PINK_LEAF_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) ->
                itemGroup.add(GRAY_LEAF_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) ->
                itemGroup.add(LIGHT_GRAY_LEAF_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) ->
                itemGroup.add(CYAN_LEAF_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) ->
                itemGroup.add(PURPLE_LEAF_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) ->
                itemGroup.add(BLUE_LEAF_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) ->
                itemGroup.add(BROWN_LEAF_BLOCK.asItem()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register((itemGroup) ->
                itemGroup.add(GREEN_LEAF_BLOCK.asItem()));
    }
    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem) {
        // Create a registry key for the block
        RegistryKey<Block> blockKey = keyOfBlock(name);
        // Create the block instance
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:moving_piston` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            // Items need to be registered with a different type of registry key, but the ID
            // can be the same.
            RegistryKey<Item> itemKey = keyOfItem(name);

            BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }
    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Colorfulleaves.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Colorfulleaves.MOD_ID, name));
    }

    // Blocks
        public static final Block RED_LEAF_BLOCK = register("red_leaves", Block::new, AbstractBlock.Settings.create().nonOpaque().burnable().sounds(BlockSoundGroup.GRASS), true);
        public static final Block WHITE_LEAF_BLOCK = register("white_leaves", Block::new, AbstractBlock.Settings.create().nonOpaque().burnable().sounds(BlockSoundGroup.GRASS), true);
        public static final Block BLACK_LEAF_BLOCK = register("black_leaves", Block::new, AbstractBlock.Settings.create().nonOpaque().burnable().sounds(BlockSoundGroup.GRASS), true);
        public static final Block ORANGE_LEAF_BLOCK = register("orange_leaves", Block::new, AbstractBlock.Settings.create().nonOpaque().burnable().sounds(BlockSoundGroup.GRASS), true);
        public static final Block MAGENTA_LEAF_BLOCK = register("magenta_leaves", Block::new, AbstractBlock.Settings.create().nonOpaque().burnable().sounds(BlockSoundGroup.GRASS), true);
        public static final Block LIGHT_BLUE_LEAF_BLOCK = register("light_blue_leaves", Block::new, AbstractBlock.Settings.create().nonOpaque().burnable().sounds(BlockSoundGroup.GRASS), true);
        public static final Block YELLOW_LEAF_BLOCK = register("yellow_leaves", Block::new, AbstractBlock.Settings.create().nonOpaque().burnable().sounds(BlockSoundGroup.GRASS), true);
        public static final Block LIME_LEAF_BLOCK = register("lime_leaves", Block::new, AbstractBlock.Settings.create().nonOpaque().burnable().sounds(BlockSoundGroup.GRASS), true);
        public static final Block PINK_LEAF_BLOCK = register("pink_leaves", Block::new, AbstractBlock.Settings.create().nonOpaque().burnable().sounds(BlockSoundGroup.GRASS), true);
        public static final Block GRAY_LEAF_BLOCK = register("gray_leaves", Block::new, AbstractBlock.Settings.create().nonOpaque().burnable().sounds(BlockSoundGroup.GRASS), true);
        public static final Block LIGHT_GRAY_LEAF_BLOCK = register("light_gray_leaves", Block::new, AbstractBlock.Settings.create().nonOpaque().burnable().sounds(BlockSoundGroup.GRASS), true);
        public static final Block CYAN_LEAF_BLOCK = register("cyan_leaves", Block::new, AbstractBlock.Settings.create().nonOpaque().burnable().sounds(BlockSoundGroup.GRASS), true);
        public static final Block PURPLE_LEAF_BLOCK = register("purple_leaves", Block::new, AbstractBlock.Settings.create().nonOpaque().burnable().sounds(BlockSoundGroup.GRASS), true);
        public static final Block BLUE_LEAF_BLOCK = register("blue_leaves", Block::new, AbstractBlock.Settings.create().nonOpaque().burnable().sounds(BlockSoundGroup.GRASS), true);
        public static final Block BROWN_LEAF_BLOCK = register("brown_leaves", Block::new, AbstractBlock.Settings.create().nonOpaque().burnable().sounds(BlockSoundGroup.GRASS), true);
        public static final Block GREEN_LEAF_BLOCK = register("green_leaves", Block::new, AbstractBlock.Settings.create().nonOpaque().burnable().sounds(BlockSoundGroup.GRASS), true);
}
