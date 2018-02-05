package roketGamer.everythingRandom.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import roketGamer.everythingRandom.main;
import roketGamer.everythingRandom.init.blockInit;
import roketGamer.everythingRandom.init.itemInit;
import roketGamer.everythingRandom.objects.blocks.items.itemBlockVariant;
import roketGamer.everythingRandom.util.handlers.enumHandler;
import roketGamer.everythingRandom.util.interfaces.iHasModel;
import roketGamer.everythingRandom.util.interfaces.iMetaName;

public class blockOres extends Block implements iHasModel, iMetaName{
	
	public static final PropertyEnum<enumHandler.enumType> VARIANT = PropertyEnum.<enumHandler.enumType>create("variant", enumHandler.enumType.class);
	
	private String name, dimension;
	
	public blockOres(String name, String dimension, Material material, Float resistance, Float hardness, SoundType sound, CreativeTabs tab) {
		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setHardness(hardness);
		setResistance(resistance);
		setSoundType(sound);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, enumHandler.enumType.RANDOMITE));
		
		this.name = name;
		this.dimension = dimension;
		
		blockInit.BLOCKS.add(this);
		itemInit.ITEMS.add(new itemBlockVariant(this).setRegistryName(this.getRegistryName()));
		
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		
		return ((enumHandler.enumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		
		return ((enumHandler.enumType)state.getValue(VARIANT)).getMeta();
		
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		
		return this.getDefaultState().withProperty(VARIANT, enumHandler.enumType.byMetadata(meta));
		
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
		
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
		
		for(enumHandler.enumType variant : enumHandler.enumType.values()) {
			
			items.add(new ItemStack(this, 1, variant.getMeta()));
			
		}
		
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		
		return new BlockStateContainer(this, new IProperty[] {VARIANT});
		
	}
	
	@Override
	public String getSpecialName(ItemStack stack) {
		
		return enumHandler.enumType.values()[stack.getItemDamage()].getName();
		
	}
	
	@Override
	public void registerModels() {
		
		for(int i = 0; i < enumHandler.enumType.values().length; i++) {
			
			main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "ore_" + enumHandler.enumType.values()[i].getName(), "inventory");
			
		}
		
	}

}
