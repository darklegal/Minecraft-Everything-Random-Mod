package roketGamer.everythingRandom.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import roketGamer.everythingRandom.init.blockInit;

public class everythingRandomTab extends CreativeTabs{

	public everythingRandomTab(String label) {
		
		super("everythingrandommaintab");
		this.setBackgroundImageName("ermaintab_bg.png");
		
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(Item.getItemFromBlock(blockInit.RANDOMITE_ORE));
	}
	
	
}
