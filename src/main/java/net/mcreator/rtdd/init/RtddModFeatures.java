
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rtdd.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.rtdd.world.features.plants.A21Feature;
import net.mcreator.rtdd.world.features.plants.A17Feature;
import net.mcreator.rtdd.world.features.plants.A16Feature;
import net.mcreator.rtdd.world.features.plants.A14Feature;
import net.mcreator.rtdd.world.features.ores.W26Feature;
import net.mcreator.rtdd.world.features.ores.W25Feature;
import net.mcreator.rtdd.world.features.ores.W24Feature;
import net.mcreator.rtdd.world.features.ores.W23Feature;
import net.mcreator.rtdd.world.features.ores.B283Feature;
import net.mcreator.rtdd.world.features.ores.B282Feature;
import net.mcreator.rtdd.RtddMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class RtddModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, RtddMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> A_14 = register("a_14", A14Feature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, A14Feature.GENERATE_BIOMES, A14Feature::placedFeature));
	public static final RegistryObject<Feature<?>> A_16 = register("a_16", A16Feature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, A16Feature.GENERATE_BIOMES, A16Feature::placedFeature));
	public static final RegistryObject<Feature<?>> A_17 = register("a_17", A17Feature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, A17Feature.GENERATE_BIOMES, A17Feature::placedFeature));
	public static final RegistryObject<Feature<?>> A_21 = register("a_21", A21Feature::feature, new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, A21Feature.GENERATE_BIOMES, A21Feature::placedFeature));
	public static final RegistryObject<Feature<?>> W_23 = register("w_23", W23Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, W23Feature.GENERATE_BIOMES, W23Feature::placedFeature));
	public static final RegistryObject<Feature<?>> W_25 = register("w_25", W25Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, W25Feature.GENERATE_BIOMES, W25Feature::placedFeature));
	public static final RegistryObject<Feature<?>> W_26 = register("w_26", W26Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, W26Feature.GENERATE_BIOMES, W26Feature::placedFeature));
	public static final RegistryObject<Feature<?>> W_24 = register("w_24", W24Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, W24Feature.GENERATE_BIOMES, W24Feature::placedFeature));
	public static final RegistryObject<Feature<?>> B_282 = register("b_282", B282Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, B282Feature.GENERATE_BIOMES, B282Feature::placedFeature));
	public static final RegistryObject<Feature<?>> B_283 = register("b_283", B283Feature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, B283Feature.GENERATE_BIOMES, B283Feature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes, Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
