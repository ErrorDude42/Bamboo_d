
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.bambood.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import io.github.errordude42.bambood.item.TestItem;
import io.github.errordude42.bambood.item.BamboospearironItem;
import io.github.errordude42.bambood.CritsBamboodMod;

public class CritsBamboodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CritsBamboodMod.MODID);
	public static final RegistryObject<Item> BAMBOO_SPEAR = REGISTRY.register("bamboo_spear", () -> new TestItem());
	public static final RegistryObject<Item> BAMBOOSPEARIRON = REGISTRY.register("bamboospeariron", () -> new BamboospearironItem());
	// Start of user code block custom items
	// End of user code block custom items
}
