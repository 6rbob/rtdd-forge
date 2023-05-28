
package net.mcreator.rtdd.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MugItem extends Item {
	public MugItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
	}
}
