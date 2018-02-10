package roketGamer.everythingRandom.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockObsidian;
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
	//public static final Block LIGHTMETAL_BLOCK = new blockBase("block_lightmetal", Material.IRON, 10F, 3F, SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	//public static final Block DARKMETAL_BLOCK = new blockBase("block_darkmetal", Material.IRON, 10F, 3F, SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	public static final Block DAYMETAL_BLOCK = new blockBase("block_daymetal", Material.IRON, 10F, 3F, SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	public static final Block NIGHTMETAL_BLOCK = new blockBase("block_nightmetal", Material.IRON, 10F, 3F, SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	public static final Block RANDOMITE_BLOCK_RAW = new blockBase("block_randominium_raw", Material.IRON, 100F, 4F, SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	public static final Block RANDOMITE_BLOCK_SMOOTH = new blockBase("block_randominium_smooth", Material.IRON, 100F, 4F, SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	//public static final Block ICY_COBBLESTONE_LOW = new blockBase("icycobblestone_low", Material.ROCK, 10F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	//public static final Block ICY_COBBLESTONE_MEDIUM = new blockBase("icycobblestone_medium", Material.ROCK, 10F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	//public static final Block ICY_COBBLESTONE_HIGH = new blockBase("icycobblestone_high", Material.ROCK, 10F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	//public static final Block ICY_COBBLESTONE_VERYHIGH = new blockBase("icycobblestone_veryhigh", Material.ROCK, 10F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	public static final Block SUBSTITE_BLOCK = new blockBase("block_substite", Material.IRON, 30F, 2F, SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	public static final Block GLOWING_OBSIDIAN = new blockBase("glowing_obsidian", Material.ROCK, 2000F, 50F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	public static final Block ORDINIUM_BLOCK = new blockBase("block_ordinium", Material.IRON, 10F, 3F, SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	public static final Block BALANCIUM_BLOCK = new blockBase("block_balancium", Material.IRON, 10F, 3F, SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	public static final Block VOIDEN_BLOCK = new blockBase("block_voiden", Material.IRON, 10F, 3F, SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	public static final Block NETHERIUM_BLOCK = new blockBase("block_netherium", Material.IRON, 10F, 3F, SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	public static final Block COPPER_BLOCK = new blockBase("block_copper", Material.IRON, 10F, 3F, SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	public static final Block URANIUM_BOX = new blockBase("uranium_box", Material.IRON, 2F, 2F, SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	
	//other
	public static final Block DYED_QUARTZ_BLOCK = new dyedQuartzBlock("quartz_dyed_block", Material.ROCK, 10F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	//public static final Block DYED_QUARTZ_PILLAR = new dyedQuartzPillar("quartz_dyed_pillar", Material.ROCK, 10F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	public static final Block DYED_QUARTZ_CHISELED = new dyedQuartzBlock("quartz_dyed_chiseled", Material.ROCK, 10F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	//public static final Block NETHER_REACTOR_CORE = new netherReactorCore("nether_reactor_core", Material.IRON, 10F, 2.5F, SoundType.METAL, CreativeTabs.BUILDING_BLOCKS);
	
	//ores
	//(unused) public static final Block ORES = new blockOres("ores", "overworld", Material.ROCK, 50F, 1.5F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	public static final Block RANDOMITE_ORE = new blockBase("ore_randominium", Material.ROCK, 50F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	public static final Block SUBSTITE_ORE = new blockBase("ore_substite", Material.ROCK, 10F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	public static final Block SLIMY_ORE = new blockBase("ore_slimy", Material.ROCK, 10F, 1.5F, SoundType.SLIME, CreativeTabs.BUILDING_BLOCKS);
	public static final Block NETHERIUM_ORE = new blockBase("ore_netherium", Material.ROCK, 10F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	/*public static final Block TIN_ORE = new blockBase("ore_tin", Material.ROCK, 10F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	public static final Block ALUMINUM_ORE = new blockBase("ore_aluminum", Material.ROCK, 10F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);*/
	public static final Block VOIDEN_ORE = new blockBase("ore_voiden", Material.ROCK, 10F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	public static final Block ORDINIUM_ORE = new blockBase("ore_ordinium", Material.ROCK, 10F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	public static final Block COPPER_ORE = new blockBase("ore_copper", Material.ROCK, 10F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	public static final Block URANIUM_ORE = new blockBase("ore_uranium", Material.ROCK, 10F, 2F, SoundType.STONE, CreativeTabs.BUILDING_BLOCKS);
	
	//machines
	public static final Block GRINDSTONE_HAND = new blockBase("grindstone", Material.ROCK, 10F, 2F, SoundType.STONE, CreativeTabs.DECORATIONS);
	public static final Block GRINDSTONE_POWER = new blockBase("grindstone_powered", Material.ROCK, 10F, 2F, SoundType.STONE, CreativeTabs.DECORATIONS);
	
	//tanks
	
	
	//energy storage

}