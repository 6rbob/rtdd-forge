
package net.mcreator.rtdd.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.rtdd.init.RtddModTabs;

public class T12Item extends Item {
	public T12Item() {
		super(new Item.Properties().tab(RtddModTabs.TAB_RTOOL).stacksTo(64).rarity(Rarity.COMMON));
	}
}
