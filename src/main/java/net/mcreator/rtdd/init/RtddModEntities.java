
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rtdd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.rtdd.entity.Npc3Entity;
import net.mcreator.rtdd.entity.Npc2Entity;
import net.mcreator.rtdd.entity.Npc1Entity;
import net.mcreator.rtdd.RtddMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RtddModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, RtddMod.MODID);
	public static final RegistryObject<EntityType<Npc2Entity>> NPC_2 = register("npc_2",
			EntityType.Builder.<Npc2Entity>of(Npc2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Npc2Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Npc1Entity>> NPC_1 = register("npc_1",
			EntityType.Builder.<Npc1Entity>of(Npc1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Npc1Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Npc3Entity>> NPC_3 = register("npc_3",
			EntityType.Builder.<Npc3Entity>of(Npc3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Npc3Entity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			Npc2Entity.init();
			Npc1Entity.init();
			Npc3Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(NPC_2.get(), Npc2Entity.createAttributes().build());
		event.put(NPC_1.get(), Npc1Entity.createAttributes().build());
		event.put(NPC_3.get(), Npc3Entity.createAttributes().build());
	}
}
