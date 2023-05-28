package net.mcreator.rtdd.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import java.util.Random;

public class T11tiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:logs")))) {
			{
				BlockPos _pos = new BlockPos(x, y + 1, z);
				Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
			{
				ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				if (_ist.hurt(1, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 2, z))).is(BlockTags.create(new ResourceLocation("minecraft:logs")))) {
				{
					BlockPos _pos = new BlockPos(x, y + 2, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
				{
					ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
					if (_ist.hurt(1, new Random(), null)) {
						_ist.shrink(1);
						_ist.setDamageValue(0);
					}
				}
				if ((world.getBlockState(new BlockPos(x, y + 3, z))).is(BlockTags.create(new ResourceLocation("minecraft:logs")))) {
					{
						BlockPos _pos = new BlockPos(x, y + 3, z);
						Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
						world.destroyBlock(_pos, false);
					}
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 4, z))).is(BlockTags.create(new ResourceLocation("minecraft:logs")))) {
						{
							BlockPos _pos = new BlockPos(x, y + 4, z);
							Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
						{
							ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
							if (_ist.hurt(1, new Random(), null)) {
								_ist.shrink(1);
								_ist.setDamageValue(0);
							}
						}
						if ((world.getBlockState(new BlockPos(x, y + 5, z))).is(BlockTags.create(new ResourceLocation("minecraft:logs")))) {
							{
								BlockPos _pos = new BlockPos(x, y + 5, z);
								Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
								world.destroyBlock(_pos, false);
							}
							{
								ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
								if (_ist.hurt(1, new Random(), null)) {
									_ist.shrink(1);
									_ist.setDamageValue(0);
								}
							}
							if ((world.getBlockState(new BlockPos(x, y + 6, z))).is(BlockTags.create(new ResourceLocation("minecraft:logs")))) {
								{
									BlockPos _pos = new BlockPos(x, y + 6, z);
									Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
									world.destroyBlock(_pos, false);
								}
								{
									ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
									if (_ist.hurt(1, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamageValue(0);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
