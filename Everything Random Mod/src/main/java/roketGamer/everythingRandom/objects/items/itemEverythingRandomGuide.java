package roketGamer.everythingRandom.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
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
