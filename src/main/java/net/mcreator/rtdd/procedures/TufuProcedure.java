package net.mcreator.rtdd.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.Mth;

import java.util.Random;

public class TufuProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		itemstack.getOrCreateTag().putDouble("tagName", (Mth.nextInt(new Random(), 1, 4)));
		if (itemstack.getOrCreateTag().getDouble("tagName") == 1) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player _player)
				_player.giveExperiencePoints(-(10));
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("custom").bypassArmor(), 20);
		}
		if (itemstack.getOrCreateTag().getDouble("tagName") != 1) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("custom").bypassArmor(), 1);
		}
	}
}
