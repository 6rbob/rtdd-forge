
package net.mcreator.rtdd.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.rtdd.init.RtddModTabs;

public class W15Item extends Item {
	public W15Item() {
		super(new Item.Properties().tab(RtddModTabs.TAB_RTOOL).stacksTo(64).fireResistant().rarity(Rarity.RARE));
	}
}
