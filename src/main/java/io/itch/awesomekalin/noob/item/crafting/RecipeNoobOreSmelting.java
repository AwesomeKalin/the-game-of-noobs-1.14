
package io.itch.awesomekalin.noob.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import io.itch.awesomekalin.noob.item.ItemNoobDust;
import io.itch.awesomekalin.noob.block.BlockNoobOre;
import io.itch.awesomekalin.noob.ElementsNoobMod;

@ElementsNoobMod.ModElement.Tag
public class RecipeNoobOreSmelting extends ElementsNoobMod.ModElement {
	public RecipeNoobOreSmelting(ElementsNoobMod instance) {
		super(instance, 22);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockNoobOre.block, (int) (1)), new ItemStack(ItemNoobDust.block, (int) (1)), 0.21F);
	}
}
