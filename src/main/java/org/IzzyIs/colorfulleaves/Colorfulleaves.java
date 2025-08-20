package org.IzzyIs.colorfulleaves;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class Colorfulleaves implements ModInitializer {
    public static final String MOD_ID = "colorfulleaves";

    @Override
    public void onInitialize() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_LEAF_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_LEAF_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_LEAF_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_LEAF_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGENTA_LEAF_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_BLUE_LEAF_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_LEAF_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_LEAF_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_LEAF_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_LEAF_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_GRAY_LEAF_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYAN_LEAF_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_LEAF_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_LEAF_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BROWN_LEAF_BLOCK, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_LEAF_BLOCK, 30, 60);
        ModBlocks.initialize();
    }
}
