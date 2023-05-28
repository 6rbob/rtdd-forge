package net.mcreator.rtdd.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.rtdd.init.RtddModBlocks;

public class N7Procedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == RtddModBlocks.B_90.get() || (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == RtddModBlocks.BB_103.get()) {
			return true;
		}
		return false;
	}
}
