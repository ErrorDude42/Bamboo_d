
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package io.github.errordude42.bambood.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import io.github.errordude42.bambood.world.inventory.SteamerGuiMenu;
import io.github.errordude42.bambood.CritsBamboodMod;

public class CritsBamboodModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, CritsBamboodMod.MODID);
	public static final RegistryObject<MenuType<SteamerGuiMenu>> STEAMER_GUI = REGISTRY.register("steamer_gui", () -> IForgeMenuType.create(SteamerGuiMenu::new));
}
