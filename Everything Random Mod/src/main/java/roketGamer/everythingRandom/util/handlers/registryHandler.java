package roketGamer.everythingRandom.util.handlers;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import roketGamer.everythingRandom.init.itemInit;
import roketGamer.everythingRandom.objects.items.InHasModel;

@EventBusSubscriber
public class registryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		
		event.getRegistry().registerAll(itemInit.ITEMS.toArray(new Item[0]));
		
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		
		for(Item item : itemInit.ITEMS) {
			
			if(item instanceof InHasModel) {
				
				((InHasModel)item).registerModels();
				
			}
			
		}
		
	}

}
