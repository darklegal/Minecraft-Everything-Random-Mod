package roketGamer.everythingRandom.util;

import net.minecraftforge.oredict.OreDictionary;
import roketGamer.everythingRandom.init.blockInit;
import roketGamer.everythingRandom.init.itemInit;

public class oreDictionaryRegistry {
	
	public static void oreDictionaryRegister() 
	{
		
	//items
	OreDictionary.registerOre("ingotNightmetal", itemInit.NIGHTMETAL_INGOT);
	OreDictionary.registerOre("ingotDaymetal", itemInit.DAYMETAL_INGOT);
	OreDictionary.registerOre("ingotRawRandomite", itemInit.RANDOMITE_INGOT_RAW);
	OreDictionary.registerOre("ingotSmoothRandomite", itemInit.RANDOMITE_INGOT_SMOOTH);
	OreDictionary.registerOre("nuggetRawRandomite", itemInit.RANDOMITE_NUGGET_RAW);
	OreDictionary.registerOre("nuggetSmoothRandomite", itemInit.RANDOMITE_NUGGET_SMOOTH);
	OreDictionary.registerOre("bitRawRandomite", itemInit.RANDOMITE_BIT_RAW);
	OreDictionary.registerOre("bitSmoothRandomite", itemInit.RANDOMITE_BIT_SMOOTH);
	OreDictionary.registerOre("ingotSubstite", itemInit.SUBSTITE_INGOT);
	OreDictionary.registerOre("ingotNetherium", itemInit.NETHERIUM_INGOT);
	OreDictionary.registerOre("ingotVoiden", itemInit.VOIDEN_INGOT);
	OreDictionary.registerOre("ingotOrdinium", itemInit.ORDINIUM_INGOT);
	OreDictionary.registerOre("ingotCopper", itemInit.COPPER_INGOT);
	OreDictionary.registerOre("gemAmber", itemInit.AMBER_GEMSTONE);
	
	//blocks
	OreDictionary.registerOre("blockNightmetal", blockInit.NIGHTMETAL_BLOCK);
	OreDictionary.registerOre("blockDaymetal", blockInit.DAYMETAL_BLOCK);
	OreDictionary.registerOre("blockRawRandomite", blockInit.RANDOMITE_BLOCK_RAW);
	OreDictionary.registerOre("blockSmoothRandomite", blockInit.RANDOMITE_BLOCK_SMOOTH);
	OreDictionary.registerOre("blockSubstite", blockInit.SUBSTITE_BLOCK);
	OreDictionary.registerOre("blockNetherium", blockInit.NETHERIUM_BLOCK);
	OreDictionary.registerOre("blockVoiden", blockInit.VOIDEN_BLOCK);
	OreDictionary.registerOre("blockOrdinium", blockInit.ORDINIUM_BLOCK);
	OreDictionary.registerOre("blockCopper", blockInit.COPPER_BLOCK);
	OreDictionary.registerOre("blockAmber", blockInit.AMBER_BLOCK);
	OreDictionary.registerOre("obsidian", blockInit.GLOWING_OBSIDIAN);
	
	//ores
	OreDictionary.registerOre("oreRandomite", blockInit.RANDOMITE_ORE);
	OreDictionary.registerOre("oreSubstite", blockInit.SUBSTITE_ORE);
	OreDictionary.registerOre("oreSlimy", blockInit.SLIMY_ORE);
	OreDictionary.registerOre("oreNetherium", blockInit.NETHERIUM_ORE);
	OreDictionary.registerOre("oreVoiden", blockInit.VOIDEN_ORE);
	OreDictionary.registerOre("oreOrdinium", blockInit.ORDINIUM_ORE);
	OreDictionary.registerOre("oreCopper", blockInit.COPPER_ORE);
	OreDictionary.registerOre("oreAmber", blockInit.AMBER_ORE);
	OreDictionary.registerOre("oreAmber", blockInit.AMBER_ORE);
	
	//astral sorcery
	OreDictionary.registerOre("ingotAstralStarmetal", itemInit.NIGHTMETAL_INGOT);
	
	//thaumcraft
	OreDictionary.registerOre("blockVoid", blockInit.VOIDEN_BLOCK);
	OreDictionary.registerOre("ingotVoid", itemInit.VOIDEN_INGOT);
	
	}
	
}
