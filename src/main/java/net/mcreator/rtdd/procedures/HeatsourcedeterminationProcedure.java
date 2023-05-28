package net.mcreator.rtdd.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class HeatsourcedeterminationProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.CAMPFIRE || (world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.CAMPFIRE
				|| (world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.SOUL_CAMPFIRE || (world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.SOUL_CAMPFIRE)
				&& (((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock().getStateDefinition().getProperty("lit") instanceof BooleanProperty _getbp9 && (world.getBlockState(new BlockPos(x, y - 1, z))).getValue(_getbp9)) == true
						|| ((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock().getStateDefinition().getProperty("lit") instanceof BooleanProperty _getbp11 && (world.getBlockState(new BlockPos(x, y - 2, z))).getValue(_getbp11)) == true)) {
			return true;
		}
		return false;
	}
}
