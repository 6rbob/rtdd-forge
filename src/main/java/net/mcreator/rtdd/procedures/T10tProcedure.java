package net.mcreator.rtdd.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class T10tProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z + 1)))
				.is(BlockTags.create(new ResourceLocation("forge:crops"))) == ((world.getBlockState(new BlockPos(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("forge:crops/wheat"))) == ((world.getBlockState(new BlockPos(x, y, z + 1)))
						.is(BlockTags.create(new ResourceLocation("cropcarrot"))) == (world.getBlockState(new BlockPos(x, y, z + 1))).is(BlockTags.create(new ResourceLocation("forge:crops/potato")))))) {
			{
				BlockPos _pos = new BlockPos(x, y, z + 1);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z)))
				.is(BlockTags.create(new ResourceLocation("forge:crops"))) == ((world.getBlockState(new BlockPos(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("forge:crops/wheat"))) == ((world.getBlockState(new BlockPos(x - 1, y, z)))
						.is(BlockTags.create(new ResourceLocation("cropcarrot"))) == (world.getBlockState(new BlockPos(x - 1, y, z))).is(BlockTags.create(new ResourceLocation("forge:crops/potato")))))) {
			{
				BlockPos _pos = new BlockPos(x - 1, y, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(new BlockPos(x + 1, y, z)))
				.is(BlockTags.create(new ResourceLocation("forge:crops"))) == ((world.getBlockState(new BlockPos(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("forge:crops/wheat"))) == ((world.getBlockState(new BlockPos(x + 1, y, z)))
						.is(BlockTags.create(new ResourceLocation("cropcarrot"))) == (world.getBlockState(new BlockPos(x + 1, y, z))).is(BlockTags.create(new ResourceLocation("forge:crops/potato")))))) {
			{
				BlockPos _pos = new BlockPos(x + 1, y, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z - 1)))
				.is(BlockTags.create(new ResourceLocation("forge:crops"))) == ((world.getBlockState(new BlockPos(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("forge:crops/wheat"))) == ((world.getBlockState(new BlockPos(x, y, z - 1)))
						.is(BlockTags.create(new ResourceLocation("cropcarrot"))) == (world.getBlockState(new BlockPos(x, y, z - 1))).is(BlockTags.create(new ResourceLocation("forge:crops/potato")))))) {
			{
				BlockPos _pos = new BlockPos(x, y, z - 1);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}
