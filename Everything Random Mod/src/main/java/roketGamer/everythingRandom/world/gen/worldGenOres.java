package roketGamer.everythingRandom.world.gen;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeSwamp;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;
import roketGamer.everythingRandom.init.blockInit;
import roketGamer.everythingRandom.objects.blocks.blockOres;
import roketGamer.everythingRandom.util.handlers.enumHandler;

public class worldGenOres implements IWorldGenerator{
	
	private WorldGenerator ore_randominium;
	private WorldGenerator ore_substite;
	private WorldGenerator ore_slimy;
	private WorldGenerator ore_netherium;
	private WorldGenerator ore_voiden;
	private WorldGenerator ore_ordinium;

	public worldGenOres() {
		
		//1 is the block going to be generated, 2 is the vein size in blocks, 3 is the block the ore is going to generate in
		
		ore_randominium = new WorldGenMinable(blockInit.RANDOMITE_ORE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
		ore_substite = new WorldGenMinable(blockInit.SUBSTITE_ORE.getDefaultState(), 3, BlockMatcher.forBlock(Blocks.STONE));
		ore_slimy = new WorldGenMinable(blockInit.SLIMY_ORE.getDefaultState(), 10, BlockMatcher.forBlock(Blocks.STONE));
		ore_netherium = new WorldGenMinable(blockInit.NETHERIUM_ORE.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.NETHERRACK));
		ore_voiden = new WorldGenMinable(blockInit.VOIDEN_ORE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.END_STONE));
		ore_ordinium = new WorldGenMinable(blockInit.ORDINIUM_ORE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
		
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.getDimension()) {
		
		//1,2,3,4 and 5 are going to be the ususal, 5 is rarity, 6 is the lowest the ore spawns, 7 is the highest the ore spawns
		
		case -1:
			runGenerator(ore_netherium, world, random, chunkX, chunkZ, 3, 98, 128);
			break;
			
		case 0:
			runGenerator(ore_randominium, world, random, chunkX, chunkZ, 2, 10, 30);
			runGenerator(ore_ordinium, world, random, chunkX, chunkZ, 2, 10, 30);
			runGenerator(ore_substite, world, random, chunkX, chunkZ, 3, 0, 45);
			runGenerator(ore_slimy, world, random, chunkX, chunkZ, 2, 0, 20);
			break;
			
		case 1:
			runGenerator(ore_voiden, world, random, chunkX, chunkZ, 3, 0, 35);
			break;
		
		}
		
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) {
		
		if(minHeight < 0) throw new IllegalArgumentException("Ore attempted to generate below the world limits.");
		if(maxHeight > 256) throw new IllegalArgumentException("Ore attempted to generate above the world limits.");
		if(minHeight > maxHeight) throw new IllegalArgumentException("Ore minHeight was geater than maxHeight.");
		
		int heightDiff = maxHeight - minHeight + 1;
		
		for(int i = 0; i < chance; i++) {
			
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x, y, z));
			
		}
		
	}

}
