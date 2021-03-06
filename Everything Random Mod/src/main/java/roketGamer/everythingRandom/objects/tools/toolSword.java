package roketGamer.everythingRandom.objects.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import roketGamer.everythingRandom.everythingRandomMain;
import roketGamer.everythingRandom.init.itemInit;
import roketGamer.everythingRandom.util.interfaces.iHasModel;

public class toolSword extends ItemSword implements iHasModel {
	
	public toolSword(String name, ToolMaterial material) {
		
		super(material);
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
