package org.IzzyIs.colorfulleaves.client;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ColorfulleavesDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(RedLeavesRecipeProvider::new);
        pack.addProvider(WhiteLeavesRecipeProvider::new);
        pack.addProvider(BlackLeavesRecipeProvider::new);
        pack.addProvider(MagentaLeavesRecipeProvider::new);
        pack.addProvider(LightBlueLeavesRecipeProvider::new);
        pack.addProvider(YellowLeavesRecipeProvider::new);
        pack.addProvider(LimeLeavesRecipeProvider::new);
        pack.addProvider(PinkLeavesRecipeProvider::new);
        pack.addProvider(GrayLeavesRecipeProvider::new);
        pack.addProvider(LightGrayLeavesRecipeProvider::new);
        pack.addProvider(CyanLeavesRecipeProvider::new);
        pack.addProvider(PurpleLeavesRecipeProvider::new);
        pack.addProvider(BlueLeavesRecipeProvider::new);
        pack.addProvider(BrownLeavesRecipeProvider::new);
        pack.addProvider(GreenLeavesRecipeProvider::new);

    }
}
