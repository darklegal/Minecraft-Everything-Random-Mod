package roketGamer.everythingRandom.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import roketGamer.everythingRandom.everythingRandomMain;
import roketGamer.everythingRandom.init.blockInit;
import roketGamer.everythingRandom.init.itemInit;
import roketGamer.everythingRandom.util.interfaces.iHasModel;

public class blockExplosiveCrate extends Block  implements iHasModel{
	
	public blockExplosiveCrate(String name, Material material, Float resistance, Float hardness, SoundType sound, CreativeTabs tab) {
		
		super(material);
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setHardness(hardness);
		setResistance(resistance);
		setSoundType(sound);
		
		blockInit.BLOCKS.add(this);
		itemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}
	
	@Override
	public void registerModels() {
		
		everythingRandomMain.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}

}