package net.mcreator.rtdd.procedures;

import net.minecraft.world.item.Items;

public class N6Procedure {
	public static boolean execute() {
		if (Items.WHEAT == Items.WATER_BUCKET) {
			return true;
		}
		return false;
	}
}
