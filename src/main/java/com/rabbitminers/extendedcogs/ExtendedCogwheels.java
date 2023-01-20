package com.rabbitminers.extendedcogs;

import com.rabbitminers.extendedcogs.index.ExtendedCogwheelsBlocks;
import com.rabbitminers.extendedcogs.index.ExtendedCogwheelsTileEntities;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.Create;

import com.simibubi.create.foundation.data.CreateRegistrate;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.world.item.CreativeModeTab;

import net.minecraft.world.item.ItemStack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtendedCogwheels implements ModInitializer {
	public static final String ID = "extendedcogs";
	public static final String NAME = "Extended Cogwheels";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	private static final CreateRegistrate REGISTRATE = CreateRegistrate.create(ExtendedCogwheels.ID);

	public static CreativeModeTab ItemGroup = FabricItemGroupBuilder
			.build(new ResourceLocation(ExtendedCogwheels.ID, "main"),
					() -> new ItemStack(ExtendedCogwheelsBlocks.CRIMSON_COGWHEEL.get()));
	@Override
	public void onInitialize() {
		ExtendedCogwheelsBlocks.register();
		ExtendedCogwheelsTileEntities.register();
		REGISTRATE.register();
	}
	public static CreateRegistrate registrate() {
		return REGISTRATE;
	}

	public static ResourceLocation asResource(String path) {
		return new ResourceLocation(ID, path);
	}
}
