
package io.github.errordude42.bambood.jei_recipes;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

import io.github.errordude42.bambood.init.CritsBamboodModJeiPlugin;

public class SteamerRecipesRecipeCategory implements IRecipeCategory<SteamerRecipesRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("crits_bambood", "steamer_recipes");
	public final static ResourceLocation TEXTURE = new ResourceLocation("crits_bambood", "textures/screens/bamboo_steamer_gui.png");
	private final IDrawable background;
	private final IDrawable icon;

	public SteamerRecipesRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 0, 0);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(Blocks.FURNACE.asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<SteamerRecipesRecipe> getRecipeType() {
		return CritsBamboodModJeiPlugin.SteamerRecipes_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Steamer Recipes");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, SteamerRecipesRecipe recipe, IFocusGroup focuses) {
	}
}
