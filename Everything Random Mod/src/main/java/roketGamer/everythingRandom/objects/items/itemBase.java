package roketGamer.everythingRandom.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import roketGamer.everythingRandom.everythingRandomMain;
import roketGamer.everythingRandom.init.itemInit;
import roketGamer.everythingRandom.util.interfaces.iHasModel;

public class itemBase extends Item implements iHasModel {
	
	public itemBase(String name) {
		
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(everythingRandomMain.everythingRandomTab);
		
		itemInit.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		
		everythingRandomMain.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
