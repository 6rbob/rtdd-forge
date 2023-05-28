package net.mcreator.rtdd.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class CarttProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.AIR;
	}
}
