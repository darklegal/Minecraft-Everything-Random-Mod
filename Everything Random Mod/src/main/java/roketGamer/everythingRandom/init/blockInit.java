package roketGamer.everythingRandom.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import roketGamer.everythingRandom.objects.blocks.blockBase;
import roketGamer.everythingRandom.objects.blocks.blockOres;
import roketGamer.everythingRandom.objects.blocks.dyedQuartzBlock;

public class blockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//arguments: 1 is the name, 2 is the material, 3 is the blast resistance, 4 is the hardness, 5 is the sound type, 6 is the creative tab
	// "SoundType." "CreativeTabs."
	
	//standard blocks
	public static final Block LIGHTMETAL_BLOCK = new blockBase("block_lightmetal", Material.IRON, 30F, 5F, SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	public static final Block DARKMETAL_BLOCK = new blockBase("block_darkmetal", Material.IRON, 30F, 5F, SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	public static final Block DAYMETAL_BLOCK = new blockBase("block_daymetal", Material.IRON, 30F, 5F, SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	public static final Block NIGHTMETAL_BLOCK = new blockBase("block_nightmetal", Material.IRON, 30F, 5F, SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	public static final Block RANDOMITE_BLOCK_RAW = new blockBase("block_randominium_raw", Material.IRON, 100F, 3F, SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	public static final Block RANDOMITE_BLOCK_SMOOTH = new blockBase("block_randominium_smooth", Material.IRON, 100F, 3F, SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	public static final Block ICY_COBBLESTONE_LOW = new blockBase("block_icycobblestone_low", Material.ROCK, 30F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	public static final Block ICY_COBBLESTONE_MEDIUM = new blockBase("block_icycobblestone_medium", Material.ROCK, 30F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	public static final Block ICY_COBBLESTONE_HIGH = new blockBase("block_icycobblestone_high", Material.ROCK, 30F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	public static final Block ICY_COBBLESTONE_VERYHIGH = new blockBase("block_icycobblestone_veryhigh", Material.ROCK, 30F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	public static final Block SUBSTITE_BLOCK = new blockBase("block_substite", Material.IRON, 30F, 2F, SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	
	//other
	public static final Block DYED_QUARTZ_BLOCK = new dyedQuartzBlock("block_quartzdyed_block", Material.ROCK, 30F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	//public static final Block DYED_QUARTZ_PILLAR = new dyedQuartzPillar("block_quartzdyed_pillar", Material.ROCK, 30F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	public static final Block DYED_QUARTZ_CHISELED = new dyedQuartzBlock("block_quartzdyed_chiseled", Material.ROCK, 30F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	
	//ores
	//(unused) public static final Block ORES = new blockOres("ores", "overworld", Material.ROCK, 50F, 1.5F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	public static final Block RANDOMITE_ORE = new blockBase("ore_randominium", Material.ROCK, 30F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	public static final Block SUBSTITE_ORE = new blockBase("ore_substite", Material.ROCK, 30F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	
	//machines
	public static final Block GRINDSTONE_HAND = new blockBase("grindstone", Material.ROCK, 30F, 2F, SoundType.STONE, CreativeTabs.DECORATIONS);
	public static final Block GRINDSTONE_POWER = new blockBase("grindstone_powered", Material.ROCK, 30F, 2F, SoundType.STONE, CreativeTabs.DECORATIONS);
	
	//tanks
	
	
	//energy storage

}