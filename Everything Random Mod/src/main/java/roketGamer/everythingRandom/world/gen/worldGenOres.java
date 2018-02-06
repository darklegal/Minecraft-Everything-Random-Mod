package roketGamer.everythingRandom.world.gen;

import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import roketGamer.everythingRandom.init.blockInit;
import roketGamer.everythingRandom.objects.blocks.blockOres;
import roketGamer.everythingRandom.util.handlers.enumHandler;

public class worldGenOres implements IWorldGenerator{
	
	private WorldGenerator ore_randominium;
	private WorldGenerator ore_substite;

	public worldGenOres() {
		
		ore_randominium = new WorldGenMinable((IBlockState) blockInit.RANDOMITE_ORE, 5, BlockMatcher.forBlock(Blocks.STONE));
		ore_substite = new WorldGenMinable((IBlockState) blockInit.SUBSTITE_ORE, 3, BlockMatcher.forBlock(Blocks.STONE));
		
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.getDimension()) {
		
		case -1:
			break;
			
		case 0:
			runGenerator(ore_randominium, world, random, chunkX, chunkZ, 2, 10, 30);
			runGenerator(ore_substite, world, random, chunkX, chunkZ, 3, 0, 45);
			break;
			
		case 1:
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
