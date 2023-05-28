
package net.mcreator.rtdd.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.rtdd.init.RtddModTabs;

public class A18Item extends Item {
	public A18Item() {
		super(new Item.Properties().tab(RtddModTabs.TAB_RFOOD).stacksTo(64).rarity(Rarity.COMMON));
	}
}
