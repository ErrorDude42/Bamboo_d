
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.bambood.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import io.github.errordude42.bambood.CritsBamboodMod;

public class CritsBamboodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CritsBamboodMod.MODID);
	public static final RegistryObject<CreativeModeTab> BAMBOOD = REGISTRY.register("bambood",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.crits_bambood.bambood")).icon(() -> new ItemStack(Blocks.BAMBOO)).displayItems((parameters, tabData) -> {
				tabData.accept(CritsBamboodModItems.BAMBOO_SPEAR.get());
				tabData.accept(CritsBamboodModItems.BAMBOO_SPEAR_IRON.get());
				tabData.accept(CritsBamboodModItems.BAMBOO_SPEAR_DIAMOND.get());
				tabData.accept(CritsBamboodModItems.BAMBOO_SPEAR_GOLD.get());
				tabData.accept(CritsBamboodModItems.BAMBOO_SPEAR_COPPER.get());
				tabData.accept(CritsBamboodModItems.BAMBOO_SPEAR_NETHERITE.get());
				tabData.accept(CritsBamboodModItems.BAMBOO_SPEAR_TRIANGULUM.get());
				tabData.accept(CritsBamboodModItems.BAMBOO_UPGRADE_TEMPLATE.get());
			})

					.build());
}
