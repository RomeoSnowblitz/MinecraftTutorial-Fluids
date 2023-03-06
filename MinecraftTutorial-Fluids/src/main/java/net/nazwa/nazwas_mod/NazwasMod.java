package net.nazwa.nazwas_mod;

import net.fabricmc.api.ModInitializer;
import net.nazwa.nazwas_mod.block.ModBlocks;
import net.nazwa.nazwas_mod.item.ModItemGroup;
import net.nazwa.nazwas_mod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NazwasMod implements ModInitializer {
	public static String MOD_ID = "nazwas_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerModItemGroup();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}