package io.itch.awesomekalin.noob.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.world.GameType;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import io.itch.awesomekalin.noob.item.CreativeGauntletItem;
import io.itch.awesomekalin.noob.NoobModVariables;
import io.itch.awesomekalin.noob.NoobModElements;

@NoobModElements.ModElement.Tag
public class CreativeGauntletRightClickedProcedure extends NoobModElements.ModElement {
	public CreativeGauntletRightClickedProcedure(NoobModElements instance) {
		super(instance, 52);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure CreativeGauntletRightClicked!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure CreativeGauntletRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).setGameType(GameType.CREATIVE);
		NoobModVariables.WorldVariables.get(world).CreativeTimer = (double) ((world.getWorld().getDayTime()) + 600);
		NoobModVariables.WorldVariables.get(world).syncData(world);
		NoobModVariables.WorldVariables.get(world).ActivatedGauntlet = (boolean) (true);
		NoobModVariables.WorldVariables.get(world).syncData(world);
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(CreativeGauntletItem.block, (int) (1));
			((PlayerEntity) entity).inventory.clearMatchingItems(p -> _stktoremove.getItem() == p.getItem(), (int) 1);
		}
	}
}
