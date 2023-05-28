
package net.mcreator.rtdd.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.rtdd.init.RtddModItems;
import net.mcreator.rtdd.init.RtddModFluids;
import net.mcreator.rtdd.init.RtddModBlocks;

public abstract class B230Fluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(RtddModFluids.B_230, RtddModFluids.FLOWING_B_230,
			FluidAttributes.builder(new ResourceLocation("rtdd:blocks/water_flow"), new ResourceLocation("rtdd:blocks/water_flow"))

	).explosionResistance(100f)

			.tickRate(7)

			.bucket(RtddModItems.B_230_BUCKET).block(() -> (LiquidBlock) RtddModBlocks.B_230.get());

	private B230Fluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends B230Fluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends B230Fluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
