
package net.mcreator.rtdd.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.rtdd.init.RtddModTabs;

public class A7Item extends Item {
	public A7Item() {
		super(new Item.Properties().tab(RtddModTabs.TAB_RFOOD).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(9).saturationMod(0.3f)

				.meat().build()));
	}
}
