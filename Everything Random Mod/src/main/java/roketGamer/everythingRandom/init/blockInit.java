package roketGamer.everythingRandom.init;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import roketGamer.everythingRandom.everythingRandomMain;
import roketGamer.everythingRandom.objects.blocks.blockBase;
import roketGamer.everythingRandom.objects.blocks.blockExplosiveCrate;
import roketGamer.everythingRandom.objects.blocks.blockOre;
//import roketGamer.everythingRandom.objects.blocks.machines.blockGrindstone;
import roketGamer.everythingRandom.util.everythingRandomSoundTypes;

public class blockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//arguments: 1 is the name, 2 is the material, 3 is the blast resistance, 4 is the hardness, 5 is the sound type, 6 is the creative tab
	// "SoundType." "CreativeTabs."
	
	//standard blocks
	public static final Block DAYMETAL_BLOCK = new blockBase("block_daymetal", Material.IRON, 10F, 3F, SoundType.METAL, everythingRandomMain.everythingRandomTab, MapColor.STONE);
	public static final Block NIGHTMETAL_BLOCK = new blockBase("block_nightmetal", Material.IRON, 10F, 3F, SoundType.METAL, everythingRandomMain.everythingRandomTab, MapColor.STONE);
	public static final Block RANDOMITE_BLOCK_RAW = new blockBase("block_randominium_raw", Material.IRON, 100F, 4F, SoundType.METAL, everythingRandomMain.everythingRandomTab, MapColor.STONE);
	public static final Block RANDOMITE_BLOCK_SMOOTH = new blockBase("block_randominium_smooth", Material.IRON, 100F, 4F, SoundType.METAL, everythingRandomMain.everythingRandomTab, MapColor.STONE);
	public static final Block SUBSTITE_BLOCK = new blockBase("block_substite", Material.IRON, 30F, 2F, SoundType.METAL, everythingRandomMain.everythingRandomTab, MapColor.STONE);
	public static final Block ORDINIUM_BLOCK = new blockBase("block_ordinium", Material.IRON, 10F, 3F, SoundType.METAL, everythingRandomMain.everythingRandomTab, MapColor.STONE);
	public static final Block VOIDEN_BLOCK = new blockBase("block_voiden", Material.IRON, 10F, 3F, SoundType.METAL, everythingRandomMain.everythingRandomTab, MapColor.STONE);
	public static final Block NETHERIUM_BLOCK = new blockBase("block_netherium", Material.IRON, 10F, 3F, SoundType.METAL, everythingRandomMain.everythingRandomTab, MapColor.STONE);
	public static final Block COPPER_BLOCK = new blockBase("block_copper", Material.IRON, 10F, 3F, SoundType.METAL, everythingRandomMain.everythingRandomTab, MapColor.STONE);
	//public static final Block URANIUM_BOX = new blockBase("uranium_box", Material.IRON, 2F, 2F, SoundType.METAL, everythingRandomMain.everythingRandomTab);
	public static final Block AMBER_BLOCK = new blockBase("block_amber", Material.ROCK, 2F, 2F, SoundType.STONE, everythingRandomMain.everythingRandomTab, MapColor.STONE);
	
	//other
	public static final Block GLOWING_OBSIDIAN = new blockBase("glowing_obsidian", Material.ROCK, 2000F, 50F, SoundType.STONE, everythingRandomMain.everythingRandomTab, MapColor.STONE);
	//public static final Block NETHER_REACTOR_CORE = new blockBase("nether_reactor_core", Material.IRON, 2000F, 50F, SoundType.METAL, everythingRandomMain.everythingRandomTab);
	
	//ores
	public static final Block RANDOMITE_ORE = new blockOre("ore_randominium", Material.IRON, 50F, 2F, SoundType.STONE, everythingRandomMain.everythingRandomTab, MapColor.STONE);
	public static final Block SUBSTITE_ORE = new blockOre("ore_substite", Material.IRON, 10F, 2F, SoundType.STONE, everythingRandomMain.everythingRandomTab, MapColor.STONE);
	public static final Block SLIMY_ORE = new blockOre("ore_slimy", Material.GROUND, 2F, 1.5F, SoundType.SLIME, everythingRandomMain.everythingRandomTab, MapColor.STONE);
	public static final Block NETHERIUM_ORE = new blockOre("ore_netherium", Material.IRON, 10F, 2F, SoundType.STONE, everythingRandomMain.everythingRandomTab, MapColor.STONE);
	public static final Block VOIDEN_ORE = new blockOre("ore_voiden", Material.IRON, 10F, 2F, SoundType.STONE, everythingRandomMain.everythingRandomTab, MapColor.STONE);
	public static final Block ORDINIUM_ORE = new blockOre("ore_ordinium", Material.ROCK, 10F, 2F, SoundType.STONE, everythingRandomMain.everythingRandomTab, MapColor.STONE);
	public static final Block COPPER_ORE = new blockOre("ore_copper", Material.ROCK, 10F, 2F, SoundType.STONE, everythingRandomMain.everythingRandomTab, MapColor.STONE);
	//public static final Block URANIUM_ORE = new blockBase("ore_uranium", Material.ROCK, 10F, 2F, SoundType.STONE, everythingRandomMain.everythingRandomTab);
	public static final Block DENSE_NETHERIUM_ORE = new blockOre("ore_dense_netherium", Material.IRON, 10F, 2F, SoundType.STONE, everythingRandomMain.everythingRandomTab, MapColor.STONE);
	public static final Block AMBER_ORE = new blockOre("ore_amber", Material.ROCK, 10F, 2F, SoundType.STONE, everythingRandomMain.everythingRandomTab, MapColor.STONE);
	
	//machines

	
	//tanks
	
	
	//energy storage
	
	
	//explosive blocks
	public static final Block EXPLOSVE_CRATE = new blockExplosiveCrate("explosive_crate", Material.WOOD, 0F, 1F, everythingRandomSoundTypes.CRATE, everythingRandomMain.everythingRandomTab);

}