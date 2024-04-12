package com.verbiox;

import com.verbiox.block.LandMine;
import com.verbiox.grenades.GrenadeEntity;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExplosivesMod implements ModInitializer {
	public static final String MOD_ID = "verbioxexplosives";
    public static final Logger LOGGER = LoggerFactory.getLogger("verbioxexplosives");

	@Override
	public void onInitialize() {
		LandMine.registerModBlocks();
		LOGGER.info("Loading landmine");
		GrenadeEntity.registerModEntities();
		LOGGER.info("Loading grenade");
		LOGGER.info("Loaded Mod successfully!");
	}
}