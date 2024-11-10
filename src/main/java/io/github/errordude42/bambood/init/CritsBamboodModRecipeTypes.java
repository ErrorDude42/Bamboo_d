package io.github.errordude42.bambood.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeSerializer;

import io.github.errordude42.bambood.jei_recipes.SteamerRecipesRecipe;
import io.github.errordude42.bambood.CritsBamboodMod;

@Mod.EventBusSubscriber(modid = CritsBamboodMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CritsBamboodModRecipeTypes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, "crits_bambood");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			SERIALIZERS.register(bus);
			SERIALIZERS.register("steamer_recipes", () -> SteamerRecipesRecipe.Serializer.INSTANCE);
		});
	}
}
