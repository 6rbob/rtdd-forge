
package net.mcreator.rtdd.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.rtdd.init.RtddModTabs;

public class A10Item extends Item {
	public A10Item() {
		super(new Item.Properties().tab(RtddModTabs.TAB_RFOOD).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f)

				.build()));
	}
}
