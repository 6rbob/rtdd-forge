package net.mcreator.rtdd.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class AttachmentProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBlockState(new BlockPos(x + 1, y, z)).canOcclude() == true || world.getBlockState(new BlockPos(x - 1, y, z)).canOcclude() == true || world.getBlockState(new BlockPos(x, y + 1, z)).canOcclude() == true
				|| world.getBlockState(new BlockPos(x, y, z + 1)).canOcclude() == true || world.getBlockState(new BlockPos(x, y, z - 1)).canOcclude() == true) {
			return true;
		}
		return false;
	}
}
