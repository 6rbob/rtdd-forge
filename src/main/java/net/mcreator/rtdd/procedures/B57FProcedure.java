package net.mcreator.rtdd.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class B57FProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR) || !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR);
	}
}
