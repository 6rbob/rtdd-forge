
package net.mcreator.rtdd.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.rtdd.init.RtddModTabs;

public class W16Item extends Item {
	public W16Item() {
		super(new Item.Properties().tab(RtddModTabs.TAB_RTOOL).stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}
}
