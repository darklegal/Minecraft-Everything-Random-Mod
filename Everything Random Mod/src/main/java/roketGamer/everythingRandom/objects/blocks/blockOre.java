package roketGamer.everythingRandom.objects.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import roketGamer.everythingRandom.everythingRandomMain;
import roketGamer.everythingRandom.init.blockInit;
import roketGamer.everythingRandom.init.itemInit;
import roketGamer.everythingRandom.util.interfaces.iHasModel;

public class blockOre extends Block implements iHasModel{
	
	public blockOre(String name, Material material, Float resistance, Float hardness, SoundType sound, CreativeTabs tab, MapColor mapColor) {
		
		super(material, mapColor);
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

	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
		if (this == blockInit.RANDOMITE_ORE)
		{
			return itemInit.RANDOMITE_BIT_RAW;
		}
		else if (this == blockInit.AMBER_ORE)
		{
			return itemInit.AMBER_GEMSTONE;
		}
		else return Item.getItemFromBlock(this);
    }

	public int quantityDropped(Random random)
    {
		if (this == blockInit.RANDOMITE_ORE)
		{
			return 1 + random.nextInt(5);
		}
		else if (this == blockInit.AMBER_ORE)
		{
			return 1 + random.nextInt(10);
		}
		else return 1;
    }
}
