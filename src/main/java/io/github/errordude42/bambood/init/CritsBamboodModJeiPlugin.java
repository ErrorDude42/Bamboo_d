
package io.github.errordude42.bambood.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

import io.github.errordude42.bambood.jei_recipes.SteamerRecipesRecipeCategory;
import io.github.errordude42.bambood.jei_recipes.SteamerRecipesRecipe;

@JeiPlugin
public class CritsBamboodModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<SteamerRecipesRecipe> SteamerRecipes_Type = new mezz.jei.api.recipe.RecipeType<>(SteamerRecipesRecipeCategory.UID, SteamerRecipesRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("crits_bambood:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new SteamerRecipesRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<SteamerRecipesRecipe> SteamerRecipesRecipes = recipeManager.getAllRecipesFor(SteamerRecipesRecipe.Type.INSTANCE);
		registration.addRecipes(SteamerRecipes_Type, SteamerRecipesRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
	}
}
