package com.verbiox;

import com.verbiox.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExplosivesMod implements ModInitializer {
	public static final String MOD_ID = "verbioxexplosives";
    public static final Logger LOGGER = LoggerFactory.getLogger("verbioxexplosives");

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}