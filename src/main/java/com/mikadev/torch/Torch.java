package com.mikadev.torch;

import net.fabricmc.api.ClientModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Torch implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("torch");

	@Override
	public void onInitializeClient() {
		LOGGER.info("Torch is initializing!");
	}
}