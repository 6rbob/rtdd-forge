
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rtdd.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.rtdd.client.model.Model渔夫7;
import net.mcreator.rtdd.client.model.Model渔夫5;
import net.mcreator.rtdd.client.model.Model渔夫4;
import net.mcreator.rtdd.client.model.Model渔夫3;
import net.mcreator.rtdd.client.model.Model渔夫2;
import net.mcreator.rtdd.client.model.Model工具衣2;
import net.mcreator.rtdd.client.model.Model工具衣0;
import net.mcreator.rtdd.client.model.Model工具衣;
import net.mcreator.rtdd.client.model.Modelcustom_model;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RtddModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Model渔夫5.LAYER_LOCATION, Model渔夫5::createBodyLayer);
		event.registerLayerDefinition(Model工具衣2.LAYER_LOCATION, Model工具衣2::createBodyLayer);
		event.registerLayerDefinition(Model渔夫4.LAYER_LOCATION, Model渔夫4::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Model工具衣.LAYER_LOCATION, Model工具衣::createBodyLayer);
		event.registerLayerDefinition(Model渔夫7.LAYER_LOCATION, Model渔夫7::createBodyLayer);
		event.registerLayerDefinition(Model工具衣0.LAYER_LOCATION, Model工具衣0::createBodyLayer);
		event.registerLayerDefinition(Model渔夫3.LAYER_LOCATION, Model渔夫3::createBodyLayer);
		event.registerLayerDefinition(Model渔夫2.LAYER_LOCATION, Model渔夫2::createBodyLayer);
	}
}
