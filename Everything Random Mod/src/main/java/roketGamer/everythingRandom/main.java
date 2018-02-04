package roketGamer.everythingRandom;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import roketGamer.everythingRandom.proxy.commonProxy;
import roketGamer.everythingRandom.util.info;

@Mod(modid = info.MODID, name = info.NAME, version = info.VERSION)
public class main {
	
	@Instance
	public static main instance;
	
	@SidedProxy(clientSide = info.CLIENT, serverSide = info.COMMON)
	public static commonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
		
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
		
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
		
		
	}
	

}
