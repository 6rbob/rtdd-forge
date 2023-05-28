
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rtdd.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.rtdd.client.gui.Zhulan2Screen;
import net.mcreator.rtdd.client.gui.ZHULANScreen;
import net.mcreator.rtdd.client.gui.YiguiScreen;
import net.mcreator.rtdd.client.gui.Yigui6Screen;
import net.mcreator.rtdd.client.gui.Yigui5Screen;
import net.mcreator.rtdd.client.gui.YaoshuiScreen;
import net.mcreator.rtdd.client.gui.ShuguiScreen;
import net.mcreator.rtdd.client.gui.Jiaoyi0Screen;
import net.mcreator.rtdd.client.gui.Jiao4Screen;
import net.mcreator.rtdd.client.gui.GuoScreen;
import net.mcreator.rtdd.client.gui.Gg1Screen;
import net.mcreator.rtdd.client.gui.G112Screen;
import net.mcreator.rtdd.client.gui.B48Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RtddModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(RtddModMenus.B_48, B48Screen::new);
			MenuScreens.register(RtddModMenus.GUO, GuoScreen::new);
			MenuScreens.register(RtddModMenus.G_112, G112Screen::new);
			MenuScreens.register(RtddModMenus.GG_1, Gg1Screen::new);
			MenuScreens.register(RtddModMenus.YAOSHUI, YaoshuiScreen::new);
			MenuScreens.register(RtddModMenus.YIGUI, YiguiScreen::new);
			MenuScreens.register(RtddModMenus.JIAOYI_0, Jiaoyi0Screen::new);
			MenuScreens.register(RtddModMenus.JIAO_4, Jiao4Screen::new);
			MenuScreens.register(RtddModMenus.YIGUI_5, Yigui5Screen::new);
			MenuScreens.register(RtddModMenus.YIGUI_6, Yigui6Screen::new);
			MenuScreens.register(RtddModMenus.SHUGUI, ShuguiScreen::new);
			MenuScreens.register(RtddModMenus.ZHULAN, ZHULANScreen::new);
			MenuScreens.register(RtddModMenus.ZHULAN_2, Zhulan2Screen::new);
		});
	}
}
