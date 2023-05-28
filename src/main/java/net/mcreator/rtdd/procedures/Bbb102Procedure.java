package net.mcreator.rtdd.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class Bbb102Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.GRASS_BLOCK) {
			world.addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, (y + 6), z, 0, 1, 0);
		}
	}
}
