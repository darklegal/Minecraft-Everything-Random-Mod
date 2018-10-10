package roketGamer.everythingRandom.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import roketGamer.everythingRandom.everythingRandomMain;
import roketGamer.everythingRandom.init.blockInit;
import roketGamer.everythingRandom.init.itemInit;
import roketGamer.everythingRandom.util.interfaces.iHasModel;

public class blockCrystal extends Block implements iHasModel{
	
	public blockCrystal(String name, Material material, Float resistance, Float hardness, SoundType sound, CreativeTabs tab, MapColor mapColor) {
		
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
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
	
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getRenderLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }

}
