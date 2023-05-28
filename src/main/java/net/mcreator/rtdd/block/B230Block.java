
package net.mcreator.rtdd.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.rtdd.init.RtddModFluids;

public class B230Block extends LiquidBlock {
	public B230Block() {
		super(() -> (FlowingFluid) RtddModFluids.B_230.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}
}
