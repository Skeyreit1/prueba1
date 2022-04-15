
package net.mcreator.proyectnew.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.proyectnew.item.Opalo1Item;
import net.mcreator.proyectnew.ProyectNewModElements;

@ProyectNewModElements.ModElement.Tag
public class ProyectitotabItemGroup extends ProyectNewModElements.ModElement {
	public ProyectitotabItemGroup(ProyectNewModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabproyectitotab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Opalo1Item.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
