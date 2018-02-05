package roketGamer.everythingRandom.objects.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import roketGamer.everythingRandom.main;
import roketGamer.everythingRandom.init.itemInit;
import roketGamer.everythingRandom.util.iHasModel;

public class toolSword extends ItemSword implements iHasModel {
	
	public toolSword(String name, ToolMaterial material) {
		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		itemInit.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() {
		
		main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
