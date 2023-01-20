package com.rabbitminers.extendedcogs.tileentities;

import com.simibubi.create.content.contraptions.relays.elementary.BracketedKineticTileEntity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CustomCogwheelKineticTileEntity extends BracketedKineticTileEntity {
	public CustomCogwheelKineticTileEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
		super(type, pos, state);
	}
}
