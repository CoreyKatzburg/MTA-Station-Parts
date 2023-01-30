package com.shadow614.mtapack;

import com.shadow614.mtapack.block.ModBlocks;
import com.shadow614.mtapack.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MtaPack implements ModInitializer {
	public static final String MOD_ID = "mtapack";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
		ModItems.registerModItems();

	}
}