
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rtdd.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.rtdd.client.renderer.Npc3Renderer;
import net.mcreator.rtdd.client.renderer.Npc2Renderer;
import net.mcreator.rtdd.client.renderer.Npc1Renderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RtddModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RtddModEntities.NPC_2.get(), Npc2Renderer::new);
		event.registerEntityRenderer(RtddModEntities.NPC_1.get(), Npc1Renderer::new);
		event.registerEntityRenderer(RtddModEntities.NPC_3.get(), Npc3Renderer::new);
	}
}
