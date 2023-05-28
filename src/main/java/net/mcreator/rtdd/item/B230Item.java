
package net.mcreator.rtdd.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.rtdd.init.RtddModTabs;
import net.mcreator.rtdd.init.RtddModFluids;

public class B230Item extends BucketItem {
	public B230Item() {
		super(RtddModFluids.B_230, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(RtddModTabs.TAB_RTDD));
	}
}
