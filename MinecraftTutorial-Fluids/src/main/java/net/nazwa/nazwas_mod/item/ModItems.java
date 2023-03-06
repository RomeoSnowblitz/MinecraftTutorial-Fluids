package net.nazwa.nazwas_mod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.nazwa.nazwas_mod.NazwasMod;
import net.nazwa.nazwas_mod.fluid.ModFluids;

public class ModItems {

    public static final Item TAR_FLUID = registerItem("tar_fluid", new BucketItem(ModFluids.TAR_FLUID_STILL,
            new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(NazwasMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup(){
        addToItemGroup(ModItemGroup.MOD_ITEMS, TAR_FLUID);
    }

    public static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems(){
        NazwasMod.LOGGER.info("Registering Items for " + NazwasMod.MOD_ID);
        addItemsToItemGroup();
    }

}
