package com.rabbitminers.extendedcogs.index;

import com.rabbitminers.extendedcogs.ExtendedCogwheels;
import com.rabbitminers.extendedcogs.tileentities.CustomCogwheelKineticTileEntity;
import com.rabbitminers.extendedcogs.tileentities.CustomCogwheelKineticTileInstance;
import com.rabbitminers.extendedcogs.tileentities.CustomCogwheelKineticTileRenderer;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

public class ExtendedCogwheelsTileEntities {
	private static final CreateRegistrate REGISTRATE = ExtendedCogwheels.registrate();
	public static final BlockEntityEntry<CustomCogwheelKineticTileEntity> BRACKETED_KINETIC = REGISTRATE
			.tileEntity("customcogwheeltileentity", CustomCogwheelKineticTileEntity::new)
			.instance(() -> CustomCogwheelKineticTileInstance::new, false)
			.validBlocks(ExtendedCogwheelsBlocks.BIRCH_COGWHEEL, ExtendedCogwheelsBlocks.LARGE_BIRCH_COGWHEEL, ExtendedCogwheelsBlocks.OAK_COGWHEEL, ExtendedCogwheelsBlocks.LARGE_OAK_COGWHEEL, ExtendedCogwheelsBlocks.DARK_OAK_COGWHEEL, ExtendedCogwheelsBlocks.LARGE_DARK_OAK_COGWHEEL, ExtendedCogwheelsBlocks.ACACIA_COGWHEEL, ExtendedCogwheelsBlocks.LARGE_ACACIA_COGWHEEL, ExtendedCogwheelsBlocks.JUNGLE_COGWHEEL, ExtendedCogwheelsBlocks.LARGE_JUNGLE_COGWHEEL, ExtendedCogwheelsBlocks.WARPED_COGWHEEL, ExtendedCogwheelsBlocks.LARGE_WARPED_COGWHEEL, ExtendedCogwheelsBlocks.CRIMSON_COGWHEEL, ExtendedCogwheelsBlocks.LARGE_CRIMSON_COGWHEEL, ExtendedCogwheelsBlocks.LARGE_STEEL_COGWHEEL, ExtendedCogwheelsBlocks.STEEL_COGWHEEL, ExtendedCogwheelsBlocks.COPPER_COGWHEEL, ExtendedCogwheelsBlocks.LARGE_COPPER_COGWHEEL, ExtendedCogwheelsBlocks.IRON_COGWHEEL, ExtendedCogwheelsBlocks.LARGE_IRON_COGWHEEL)
			.renderer(() -> CustomCogwheelKineticTileRenderer::new)
			.register();

	public static void 	register() {}
}
