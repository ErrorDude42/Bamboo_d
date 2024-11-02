
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.bambood.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import io.github.errordude42.bambood.item.BamboospeargoldItem;
import io.github.errordude42.bambood.CritsBamboodMod;

public class CritsBamboodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CritsBamboodMod.MODID);
	public static final RegistryObject<Item> BAMBOOSPEARGOLD = REGISTRY.register("bamboospeargold", () -> new BamboospeargoldItem());
	// Start of user code block custom items
	// End of user code block custom items
}
