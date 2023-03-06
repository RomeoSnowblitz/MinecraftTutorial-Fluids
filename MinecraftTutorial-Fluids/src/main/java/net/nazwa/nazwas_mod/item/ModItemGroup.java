package net.nazwa.nazwas_mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nazwa.nazwas_mod.NazwasMod;

public class ModItemGroup {

    public static ItemGroup MOD_ITEMS;
    public static ItemGroup MOD_BLOCKS;

    public static void registerModItemGroup() {
        MOD_ITEMS = FabricItemGroup.builder(new Identifier(NazwasMod.MOD_ID, "items"))
                .displayName(Text.literal("Mod Items"))
                .icon(() -> new ItemStack(Items.BLUE_ORCHID)).build();

        MOD_BLOCKS = FabricItemGroup.builder(new Identifier(NazwasMod.MOD_ID, "blocks"))
                .displayName(Text.literal("Mod Blocks"))
                .icon(() -> new ItemStack(Blocks.PRISMARINE)).build();
    }

}
