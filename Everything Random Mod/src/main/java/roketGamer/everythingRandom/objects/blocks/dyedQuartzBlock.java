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
import net.minecraft.util.IStringSerializable;
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

public class dyedQuartzBlock extends Block implements iMetaName, iHasModel{
	
	public static final PropertyEnum<enumHandler.enumType> COLOR = PropertyEnum.<enumHandler.enumType>create("color", enumHandler.enumType.class);
	
	private String name;
	
	public dyedQuartzBlock(String name, Material material, Float resistance, Float hardness, SoundType sound, CreativeTabs tab) {
		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setHardness(hardness);
		setResistance(resistance);
		setSoundType(sound);
		this.setDefaultState(this.blockState.getBaseState().withProperty(COLOR, enumHandler.enumType.WHITE));
		
		this.name = name;
		
		blockInit.BLOCKS.add(this);
		itemInit.ITEMS.add(new itemBlockVariant(this).setRegistryName(this.getRegistryName()));
		
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		
		return((enumHandler.enumType)state.getValue(COLOR)).getMeta();
		
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
		
		for(enumHandler.enumType dyedquartzblock$enumtype : enumHandler.enumType.values()) {
			
			items.add(new ItemStack(this, 1, dyedquartzblock$enumtype.getMeta()));
			
		}
		
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		
		return this.getDefaultState().withProperty(COLOR, enumHandler.enumType.byMetadata(meta));
		
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		
		return ((enumHandler.enumType)state.getValue(COLOR)).getMeta();
		
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		
		return new ItemStack(Item.getItemFromBlock(this), 1, (int)(getMetaFromState(world.getBlockState(pos))));
		
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		
		return new BlockStateContainer(this, new IProperty[] {COLOR});
		
	}
	
	@Override
	public String getSpecialName(ItemStack stack) {
		
		return enumHandler.enumType.values()[stack.getItemDamage()].getName();
		
	}
	
	@Override
	public void registerModels() {
		
		for(int i = 0; i < enumHandler.enumType.values().length; i++) {
			
			main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, enumHandler.enumType.values()[i].getName() + "_dyed_quartz_block", "inventory");
			
		}
		
	}
	
	/*public static enum enumType implements IStringSerializable{
		
		WHITE(0, "white"),
		ORANGE(1, "orange"),
		MAGENTA(2, "magenta"),
		LIGHTBLUE(3, "light_blue"),
		YELLOW(4, "yellow"),
		LIME(5, "lime"),
		PINK(6, "pink"),
		GREY(7, "grey"),
		LIGHTGREY(8, "silver"),
		CYAN(9, "cyan"),
		PURPLE(10, "purple"),
		BLUE(11, "blue"),
		BROWN(12, "brown"),
		GREEN(13, "green"),
		RED(14, "red"),
		BLACK(15, "black");
		
		private static final enumHandler.enumType[] META_LOOKUP = new enumHandler.enumType[values().length];
		private final int meta;
		private final String name, unlocalizedName;
		
		private enumType(int meta, String name) {
			
			this(meta, name, name);
			
		}
		
		private enumType(int meta, String name, String unlocalizedName) {
			
			this.meta = meta;
			this.name = name;
			this.unlocalizedName = unlocalizedName;
			
		}


		@Override
		public String getName() {
			
			return this.name;
			
		}
		
		public int getMeta() {
			return this.meta;
		}
		
		public String getUnlocalizedName() {
			return this.unlocalizedName;
		}
		
		@Override
		public String toString() {
			
			return this.name;
		}
		
		public static enumHandler.enumType byMetadata(int meta){
			
			return META_LOOKUP[meta];
			
		}
		
		static {
			
			for(enumHandler.enumType dyedquartzblock$enumtype : values()) {
				
				META_LOOKUP[dyedquartzblock$enumtype.getMeta()] = dyedquartzblock$enumtype;
				
			}
			
		}
	
	}*/

}
