
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.bambood.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import io.github.errordude42.bambood.item.BambooUpgradeTemplateItem;
import io.github.errordude42.bambood.item.BambooSpearTriangulumItem;
import io.github.errordude42.bambood.item.BambooSpearNetheriteItem;
import io.github.errordude42.bambood.item.BambooSpearItem;
import io.github.errordude42.bambood.item.BambooSpearIronItem;
import io.github.errordude42.bambood.item.BambooSpearGoldItem;
import io.github.errordude42.bambood.item.BambooSpearDiamondItem;
import io.github.errordude42.bambood.item.BambooSpearCopperItem;
import io.github.errordude42.bambood.CritsBamboodMod;

public class CritsBamboodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CritsBamboodMod.MODID);
	public static final RegistryObject<Item> BAMBOO_SPEAR = REGISTRY.register("bamboo_spear", () -> new BambooSpearItem());
	public static final RegistryObject<Item> BAMBOO_SPEAR_IRON = REGISTRY.register("bamboo_spear_iron", () -> new BambooSpearIronItem());
	public static final RegistryObject<Item> BAMBOO_SPEAR_DIAMOND = REGISTRY.register("bamboo_spear_diamond", () -> new BambooSpearDiamondItem());
	public static final RegistryObject<Item> BAMBOO_SPEAR_GOLD = REGISTRY.register("bamboo_spear_gold", () -> new BambooSpearGoldItem());
	public static final RegistryObject<Item> BAMBOO_SPEAR_COPPER = REGISTRY.register("bamboo_spear_copper", () -> new BambooSpearCopperItem());
	public static final RegistryObject<Item> BAMBOO_SPEAR_NETHERITE = REGISTRY.register("bamboo_spear_netherite", () -> new BambooSpearNetheriteItem());
	public static final RegistryObject<Item> BAMBOO_SPEAR_TRIANGULUM = REGISTRY.register("bamboo_spear_triangulum", () -> new BambooSpearTriangulumItem());
	public static final RegistryObject<Item> BAMBOO_UPGRADE_TEMPLATE = REGISTRY.register("bamboo_upgrade_template", () -> new BambooUpgradeTemplateItem());
	// Start of user code block custom items
	// End of user code block custom items
}
