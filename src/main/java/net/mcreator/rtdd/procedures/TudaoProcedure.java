package net.mcreator.rtdd.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class TudaoProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getDouble("tagName") == 2
				&& ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) >= (entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof Player _player)
				_player.giveExperiencePoints(-(10));
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("custom").bypassArmor(), entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
			if (entity instanceof LivingEntity _entity)
				_entity.hurt(new DamageSource("custom").bypassArmor(), (float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / 2));
		}
	}
}
