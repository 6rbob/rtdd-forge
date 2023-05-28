
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rtdd.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.rtdd.world.inventory.Zhulan2Menu;
import net.mcreator.rtdd.world.inventory.ZHULANMenu;
import net.mcreator.rtdd.world.inventory.YiguiMenu;
import net.mcreator.rtdd.world.inventory.Yigui6Menu;
import net.mcreator.rtdd.world.inventory.Yigui5Menu;
import net.mcreator.rtdd.world.inventory.YaoshuiMenu;
import net.mcreator.rtdd.world.inventory.ShuguiMenu;
import net.mcreator.rtdd.world.inventory.Jiaoyi0Menu;
import net.mcreator.rtdd.world.inventory.Jiao4Menu;
import net.mcreator.rtdd.world.inventory.GuoMenu;
import net.mcreator.rtdd.world.inventory.Gg1Menu;
import net.mcreator.rtdd.world.inventory.G112Menu;
import net.mcreator.rtdd.world.inventory.B48Menu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RtddModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<B48Menu> B_48 = register("b_48", (id, inv, extraData) -> new B48Menu(id, inv, extraData));
	public static final MenuType<GuoMenu> GUO = register("guo", (id, inv, extraData) -> new GuoMenu(id, inv, extraData));
	public static final MenuType<G112Menu> G_112 = register("g_112", (id, inv, extraData) -> new G112Menu(id, inv, extraData));
	public static final MenuType<Gg1Menu> GG_1 = register("gg_1", (id, inv, extraData) -> new Gg1Menu(id, inv, extraData));
	public static final MenuType<YaoshuiMenu> YAOSHUI = register("yaoshui", (id, inv, extraData) -> new YaoshuiMenu(id, inv, extraData));
	public static final MenuType<YiguiMenu> YIGUI = register("yigui", (id, inv, extraData) -> new YiguiMenu(id, inv, extraData));
	public static final MenuType<Jiaoyi0Menu> JIAOYI_0 = register("jiaoyi_0", (id, inv, extraData) -> new Jiaoyi0Menu(id, inv, extraData));
	public static final MenuType<Jiao4Menu> JIAO_4 = register("jiao_4", (id, inv, extraData) -> new Jiao4Menu(id, inv, extraData));
	public static final MenuType<Yigui5Menu> YIGUI_5 = register("yigui_5", (id, inv, extraData) -> new Yigui5Menu(id, inv, extraData));
	public static final MenuType<Yigui6Menu> YIGUI_6 = register("yigui_6", (id, inv, extraData) -> new Yigui6Menu(id, inv, extraData));
	public static final MenuType<ShuguiMenu> SHUGUI = register("shugui", (id, inv, extraData) -> new ShuguiMenu(id, inv, extraData));
	public static final MenuType<ZHULANMenu> ZHULAN = register("zhulan", (id, inv, extraData) -> new ZHULANMenu(id, inv, extraData));
	public static final MenuType<Zhulan2Menu> ZHULAN_2 = register("zhulan_2", (id, inv, extraData) -> new Zhulan2Menu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
