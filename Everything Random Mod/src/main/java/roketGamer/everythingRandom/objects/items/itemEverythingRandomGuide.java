package roketGamer.everythingRandom.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import roketGamer.everythingRandom.everythingRandomMain;
import roketGamer.everythingRandom.init.itemInit;
import roketGamer.everythingRandom.util.interfaces.iHasModel;

public class itemEverythingRandomGuide extends Item implements iHasModel {
	
	public itemEverythingRandomGuide(String name) {
		
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(everythingRandomMain.everythingRandomTab);
		setMaxStackSize(1);
		
		itemInit.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		
		everythingRandomMain.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
