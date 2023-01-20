package com.rabbitminers.extendedcogs.index;

import com.jozufozu.flywheel.core.PartialModel;
import com.rabbitminers.extendedcogs.ExtendedCogwheels;
import com.rabbitminers.extendedcogs.cogwheels.CustomCogwheelBlock;
import com.rabbitminers.extendedcogs.cogwheels.CustomCogwheelItem;
import com.rabbitminers.extendedcogs.tileentities.CustomCogwheelKineticTileEntity;
import com.rabbitminers.extendedcogs.tileentities.CustomCogwheelKineticTileInstance;
import com.rabbitminers.extendedcogs.tileentities.CustomCogwheelKineticTileRenderer;
import com.simibubi.create.content.contraptions.relays.elementary.BracketedKineticBlockModel;
import com.simibubi.create.foundation.block.BlockStressDefaults;
import com.simibubi.create.foundation.data.BlockStateGen;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntityEntry;
import com.tterrag.registrate.util.entry.BlockEntry;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MaterialColor;

public class ExtendedCogwheelsBlocks {
	private static final CreateRegistrate REGISTRATE = ExtendedCogwheels.registrate()
			.creativeModeTab(() -> ExtendedCogwheels.ItemGroup
	);

	public static BlockEntry<CustomCogwheelBlock> largeCogWheelFactory(String name, PartialModel model) {
		return REGISTRATE.block("large_" + name + "_cogwheel", p -> CustomCogwheelBlock.large(p, model))
				.initialProperties(SharedProperties::stone)
				.properties(p -> p.sound(SoundType.WOOD))
				.properties(p -> p.color(MaterialColor.DIRT))
				.transform(BlockStressDefaults.setNoImpact())
				.blockstate(BlockStateGen.axisBlockProvider(false))
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
				.item(CustomCogwheelItem::new)
				.build()
				.register();
	}
	public static BlockEntry<CustomCogwheelBlock> cogWheelFactory(String name, PartialModel model) {
		return REGISTRATE.block(name + "_cogwheel", p -> CustomCogwheelBlock.small(p, model))
				.initialProperties(SharedProperties::stone)
				.properties(p -> p.sound(SoundType.WOOD))
				.properties(p -> p.color(MaterialColor.DIRT))
				.transform(BlockStressDefaults.setNoImpact())
				.blockstate(BlockStateGen.axisBlockProvider(false))
				.onRegister(CreateRegistrate.blockModel(() -> BracketedKineticBlockModel::new))
				.item(CustomCogwheelItem::new)
				.build()
				.register();
	}

	public static final BlockEntry<CustomCogwheelBlock> BIRCH_COGWHEEL = cogWheelFactory("birch", ExtendedCogwheelsPartials.BIRCH_COGWHEEL);
	public static final BlockEntry<CustomCogwheelBlock> LARGE_BIRCH_COGWHEEL = largeCogWheelFactory("birch", ExtendedCogwheelsPartials.LARGE_BIRCH_COGWHEEL);


	public static final BlockEntry<CustomCogwheelBlock> OAK_COGWHEEL = cogWheelFactory("oak", ExtendedCogwheelsPartials.OAK_COGWHEEL);
	public static final BlockEntry<CustomCogwheelBlock> LARGE_OAK_COGWHEEL = largeCogWheelFactory("oak", ExtendedCogwheelsPartials.LARGE_OAK_COGWHEEL);


	public static final BlockEntry<CustomCogwheelBlock> DARK_OAK_COGWHEEL = cogWheelFactory("dark_oak", ExtendedCogwheelsPartials.DARK_OAK_COGWHEEL);
	public static final BlockEntry<CustomCogwheelBlock> LARGE_DARK_OAK_COGWHEEL = largeCogWheelFactory("dark_oak", ExtendedCogwheelsPartials.LARGE_DARK_OAK_COGWHEEL);

	public static final BlockEntry<CustomCogwheelBlock> ACACIA_COGWHEEL = cogWheelFactory("acacia", ExtendedCogwheelsPartials.ACACIA_COGWHEEL);
	public static final BlockEntry<CustomCogwheelBlock> LARGE_ACACIA_COGWHEEL = largeCogWheelFactory("acacia", ExtendedCogwheelsPartials.LARGE_ACACIA_COGWHEEL);


	public static final BlockEntry<CustomCogwheelBlock> JUNGLE_COGWHEEL = cogWheelFactory("jungle", ExtendedCogwheelsPartials.JUNGLE_COGWHEEL);
	public static final BlockEntry<CustomCogwheelBlock> LARGE_JUNGLE_COGWHEEL = largeCogWheelFactory("jungle", ExtendedCogwheelsPartials.LARGE_JUNGLE_COGWHEEL);


	public static final BlockEntry<CustomCogwheelBlock> WARPED_COGWHEEL = cogWheelFactory("warped", ExtendedCogwheelsPartials.WARPED_COGWHEEL);
	public static final BlockEntry<CustomCogwheelBlock> LARGE_WARPED_COGWHEEL = largeCogWheelFactory("warped", ExtendedCogwheelsPartials.LARGE_WARPED_COGWHEEL);

	public static final BlockEntry<CustomCogwheelBlock> CRIMSON_COGWHEEL = cogWheelFactory("crimson", ExtendedCogwheelsPartials.CRIMSON_COGWHEEL);
	public static final BlockEntry<CustomCogwheelBlock> LARGE_CRIMSON_COGWHEEL = largeCogWheelFactory("crimson", ExtendedCogwheelsPartials.LARGE_CRIMSON_COGWHEEL);

	public static final BlockEntry<CustomCogwheelBlock> COPPER_COGWHEEL = cogWheelFactory("copper", ExtendedCogwheelsPartials.COPPER_COGWHEEL);
	public static final BlockEntry<CustomCogwheelBlock> LARGE_COPPER_COGWHEEL = largeCogWheelFactory("copper", ExtendedCogwheelsPartials.LARGE_COPPER_COGWHEEL);

	public static final BlockEntry<CustomCogwheelBlock> STEEL_COGWHEEL = cogWheelFactory("steel", ExtendedCogwheelsPartials.STEEL_COGWHEEL);
	public static final BlockEntry<CustomCogwheelBlock> LARGE_STEEL_COGWHEEL = largeCogWheelFactory("steel", ExtendedCogwheelsPartials.LARGE_STEEL_COGWHEEL);

	public static final BlockEntry<CustomCogwheelBlock> IRON_COGWHEEL = cogWheelFactory("iron", ExtendedCogwheelsPartials.IRON_COGWHEEL);
	public static final BlockEntry<CustomCogwheelBlock> LARGE_IRON_COGWHEEL = largeCogWheelFactory("iron", ExtendedCogwheelsPartials.LARGE_IRON_COGWHEEL);

	public static void register() {}
}
