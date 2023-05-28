
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rtdd.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RtddModTabs {
	public static CreativeModeTab TAB_RTDD;
	public static CreativeModeTab TAB_RFOOD;
	public static CreativeModeTab TAB_RBULID;
	public static CreativeModeTab TAB_RTOOL;
	public static CreativeModeTab TAB_INDOORS;

	public static void load() {
		TAB_RTDD = new CreativeModeTab("tabrtdd") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RtddModItems.THEBEER.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_RFOOD = new CreativeModeTab("tabrfood") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RtddModItems.A_23.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_RBULID = new CreativeModeTab("tabrbulid") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RtddModBlocks.D_45.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_RTOOL = new CreativeModeTab("tabrtool") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RtddModItems.T_10.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_INDOORS = new CreativeModeTab("tabindoors") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RtddModBlocks.B_195.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
