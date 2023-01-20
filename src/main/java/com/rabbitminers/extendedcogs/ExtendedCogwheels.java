package com.rabbitminers.extendedcogs;

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
					// TODO - CHANGE THIS INTO A COGWHEEL
					() -> new ItemStack(AllBlocks.FLYWHEEL.get()));
	@Override
	public void onInitialize() {
		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(ID, path);
	}
}
