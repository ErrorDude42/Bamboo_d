
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.bambood.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import io.github.errordude42.bambood.CritsBamboodMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CritsBamboodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CritsBamboodMod.MODID);
	public static final RegistryObject<CreativeModeTab> BAMBOOD = REGISTRY.register("bambood",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.crits_bambood.bambood")).icon(() -> new ItemStack(Blocks.BAMBOO)).displayItems((parameters, tabData) -> {
				tabData.accept(CritsBamboodModItems.BAMBOO_SPEAR.get());
				tabData.accept(CritsBamboodModItems.BAMBOOSPEARIRON.get());
				tabData.accept(CritsBamboodModItems.BAMBOOSPEARGOLD.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {

			tabData.accept(CritsBamboodModItems.BAMBOO_SPEAR.get());
			tabData.accept(CritsBamboodModItems.BAMBOOSPEARIRON.get());
			tabData.accept(CritsBamboodModItems.BAMBOOSPEARGOLD.get());

		}
	}
}
