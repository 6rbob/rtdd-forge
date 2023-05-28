
package net.mcreator.rtdd.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DeadsheepItem extends Item {
	public DeadsheepItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
	}
}
