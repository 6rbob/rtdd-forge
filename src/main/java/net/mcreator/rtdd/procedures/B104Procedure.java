package net.mcreator.rtdd.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

public class B104Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (HeatsourcedeterminationProcedure.execute(world, x, y, z)) {
			world.addParticle(ParticleTypes.CAMPFIRE_SIGNAL_SMOKE, x, y, z, 0, 1, 0);
		}
	}
}
