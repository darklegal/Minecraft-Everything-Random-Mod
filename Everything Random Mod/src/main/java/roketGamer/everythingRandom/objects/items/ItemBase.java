package roketGamer.everythingRandom.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import roketGamer.everythingRandom.main;
import roketGamer.everythingRandom.init.itemInit;

public class ItemBase extends Item implements InHasModel {
	
	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		itemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		
		main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
