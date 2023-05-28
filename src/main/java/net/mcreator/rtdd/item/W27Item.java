
package net.mcreator.rtdd.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.rtdd.init.RtddModTabs;

public class W27Item extends Item {
	public W27Item() {
		super(new Item.Properties().tab(RtddModTabs.TAB_RTOOL).stacksTo(64).rarity(Rarity.COMMON));
	}
}
