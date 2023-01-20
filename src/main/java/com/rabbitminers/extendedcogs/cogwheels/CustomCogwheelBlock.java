package com.rabbitminers.extendedcogs.cogwheels;

import com.jozufozu.flywheel.core.PartialModel;
import com.rabbitminers.extendedcogs.index.ExtendedCogwheelsTileEntities;
import com.simibubi.create.AllTileEntities;
import com.simibubi.create.content.contraptions.base.KineticTileEntity;
import com.simibubi.create.content.contraptions.relays.elementary.CogWheelBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class CustomCogwheelBlock extends CogWheelBlock implements ICustomCogWheel {
	public PartialModel model;
	protected CustomCogwheelBlock(boolean large, Properties properties, PartialModel model) {
		super(large, properties);
		this.model = model;
	}
	public static CustomCogwheelBlock small(Properties properties, PartialModel model) {
		return new CustomCogwheelBlock(false, properties, model);
	}

	public static CustomCogwheelBlock large(Properties properties, PartialModel model) {
		return new CustomCogwheelBlock(true, properties, model);
	}
	@Override
	public PartialModel getPartialModelType() {
		return this.model;
	}
	@Override
	public BlockEntityType<? extends KineticTileEntity> getTileEntityType() {
		return ExtendedCogwheelsTileEntities.BRACKETED_KINETIC.get();
	}
	@Override
	public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult ray) {
		// TODO: Allow for flywheel types to be encased
		return InteractionResult.PASS;
	}
}
