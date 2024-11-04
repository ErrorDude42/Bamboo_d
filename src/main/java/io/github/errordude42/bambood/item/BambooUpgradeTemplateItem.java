
package io.github.errordude42.bambood.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BambooUpgradeTemplateItem extends Item {
	public BambooUpgradeTemplateItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
