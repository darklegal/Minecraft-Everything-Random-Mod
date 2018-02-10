package roketGamer.everythingRandom.objects.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import roketGamer.everythingRandom.main;
import roketGamer.everythingRandom.init.itemInit;
import roketGamer.everythingRandom.util.interfaces.iHasModel;

public class weaponTauCannon extends Item implements iHasModel {
	
	public weaponTauCannon(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		this.maxStackSize = 1;
		
		itemInit.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		
		main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
