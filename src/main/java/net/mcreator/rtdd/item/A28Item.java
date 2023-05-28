
package net.mcreator.rtdd.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.rtdd.init.RtddModTabs;

public class A28Item extends Item {
	public A28Item() {
		super(new Item.Properties().tab(RtddModTabs.TAB_RFOOD).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.DRINK;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 15;
	}
}
