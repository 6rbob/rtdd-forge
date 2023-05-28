
package net.mcreator.rtdd.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.rtdd.init.RtddModTabs;

public class B203Item extends Item {
	public B203Item() {
		super(new Item.Properties().tab(RtddModTabs.TAB_RTDD).stacksTo(64).rarity(Rarity.COMMON));
	}
}
