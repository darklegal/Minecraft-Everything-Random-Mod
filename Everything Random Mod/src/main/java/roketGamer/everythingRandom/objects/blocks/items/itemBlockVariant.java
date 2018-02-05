package roketGamer.everythingRandom.objects.blocks.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import roketGamer.everythingRandom.util.interfaces.iMetaName;

public class itemBlockVariant extends ItemBlock{

	public itemBlockVariant(Block block) {
		super(block);
		setHasSubtypes(true);
		setMaxDamage(0);
		
	}
	
	@Override
	public int getMetadata(int damage) {
		
		return damage;
		
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) {
		
		return super.getUnlocalizedName() + "_" + ((iMetaName)this.block).getSpecialName(stack);
	}

}
