package roketGamer.everythingRandom.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import roketGamer.everythingRandom.objects.blocks.blockBase;

public class blockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//arguments: 1 is the name, 2 is the material, 3 is the blast resistance, 4 is the hardness
	
	public static final Block ORE_RANDOMITE = new blockBase("ore_randominium", Material.ROCK, 50F, 3F, "axe", 3);

}
