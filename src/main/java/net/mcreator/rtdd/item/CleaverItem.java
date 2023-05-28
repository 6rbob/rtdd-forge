
package net.mcreator.rtdd.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.rtdd.init.RtddModTabs;

public class CleaverItem extends Item {
	public CleaverItem() {
		super(new Item.Properties().tab(RtddModTabs.TAB_RFOOD).stacksTo(1).rarity(Rarity.COMMON));
	}
}
