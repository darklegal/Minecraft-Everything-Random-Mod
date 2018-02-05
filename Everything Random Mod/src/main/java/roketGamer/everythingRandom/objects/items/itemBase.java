package roketGamer.everythingRandom.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import roketGamer.everythingRandom.main;
import roketGamer.everythingRandom.init.itemInit;
import roketGamer.everythingRandom.util.interfaces.iHasModel;

public class itemBase extends Item implements iHasModel {
	
	public itemBase(String name) {
		
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
