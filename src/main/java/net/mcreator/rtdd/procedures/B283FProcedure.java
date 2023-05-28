package net.mcreator.rtdd.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class B283FProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return world.isEmptyBlock(new BlockPos(x, y + 1, z)) == true;
	}
}
