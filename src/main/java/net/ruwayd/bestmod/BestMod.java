package net.ruwayd.bestmod;

import net.fabricmc.api.ModInitializer;
import net.ruwayd.bestmod.block.ModBlocks;
import net.ruwayd.bestmod.items.ModItemGroup;
import net.ruwayd.bestmod.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BestMod implements ModInitializer {
	public static final String MOD_ID = "bestmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
