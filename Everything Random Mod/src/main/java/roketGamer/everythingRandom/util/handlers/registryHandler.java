package roketGamer.everythingRandom.util.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import roketGamer.everythingRandom.init.blockInit;
import roketGamer.everythingRandom.init.itemInit;
import roketGamer.everythingRandom.util.interfaces.iHasModel;
import roketGamer.everythingRandom.world.gen.worldGenOres;

@EventBusSubscriber
public class registryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		
		event.getRegistry().registerAll(itemInit.ITEMS.toArray(new Item[0]));
		
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		
		event.getRegistry().registerAll(blockInit.BLOCKS.toArray(new Block[0]));
		
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		
		for(Item item : itemInit.ITEMS) {
			
			if(item instanceof iHasModel) {
				
				((iHasModel)item).registerModels();
				
			}
			
		}
		
		for(Block block : blockInit.BLOCKS) {
			
			if(block instanceof iHasModel) {
				
				((iHasModel)block).registerModels();
				
			}
			
		}
		
	}
	
	public static void otherRegistries() {
		
		GameRegistry.registerWorldGenerator(new worldGenOres(), 0);
		
	}

}
