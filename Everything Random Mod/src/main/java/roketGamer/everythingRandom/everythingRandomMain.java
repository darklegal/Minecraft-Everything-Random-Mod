package roketGamer.everythingRandom;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;
import roketGamer.everythingRandom.init.itemInit;
import roketGamer.everythingRandom.tabs.everythingRandomTab;
import roketGamer.everythingRandom.proxy.commonProxy;
import roketGamer.everythingRandom.util.info;
import roketGamer.everythingRandom.util.oreDictionaryRegistry;
import roketGamer.everythingRandom.util.handlers.registryHandler;
import roketGamer.everythingRandom.util.handlers.soundsHandler;

@Mod(modid = info.MODID, name = info.NAME, version = info.VERSION)
public class everythingRandomMain {
	
	public static final CreativeTabs everythingRandomTab = new everythingRandomTab("everythingrandommaintab");
	
	@Instance
	public static everythingRandomMain instance;
	
	@SidedProxy(clientSide = info.CLIENT, serverSide = info.COMMON)
	public static commonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
		registryHandler.otherRegistries();
		oreDictionaryRegistry.oreDictionaryRegister();
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
		registryHandler.initRegistries();
		soundsHandler.registerSounds();
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
		
		
	}
	

}
