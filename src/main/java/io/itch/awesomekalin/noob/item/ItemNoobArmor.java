
package io.itch.awesomekalin.noob.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import io.itch.awesomekalin.noob.creativetab.TabNoobTab;
import io.itch.awesomekalin.noob.ElementsNoobMod;

@ElementsNoobMod.ModElement.Tag
public class ItemNoobArmor extends ElementsNoobMod.ModElement {
	@GameRegistry.ObjectHolder("noob:noob_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("noob:noob_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("noob:noob_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("noob:noob_armorboots")
	public static final Item boots = null;
	public ItemNoobArmor(ElementsNoobMod instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("NOOB_ARMOR", "noob:noob", 5, new int[]{1, 2, 2, 1}, 3,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("noob_armorhelmet")
				.setRegistryName("noob_armorhelmet").setCreativeTab(TabNoobTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("noob_armorbody")
				.setRegistryName("noob_armorbody").setCreativeTab(TabNoobTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("noob_armorlegs")
				.setRegistryName("noob_armorlegs").setCreativeTab(TabNoobTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("noob_armorboots")
				.setRegistryName("noob_armorboots").setCreativeTab(TabNoobTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("noob:noob_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("noob:noob_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("noob:noob_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("noob:noob_armorboots", "inventory"));
	}
}
