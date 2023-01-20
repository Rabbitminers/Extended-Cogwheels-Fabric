package com.rabbitminers.extendedcogs;

import com.rabbitminers.extendedcogs.index.ExtendedCogwheelsPartials;

import net.fabricmc.api.ClientModInitializer;

public class ExtendedCogwheelsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ExtendedCogwheelsPartials.init();
	}
}
