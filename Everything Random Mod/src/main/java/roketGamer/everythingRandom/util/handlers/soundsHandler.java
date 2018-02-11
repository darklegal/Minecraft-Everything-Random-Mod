package roketGamer.everythingRandom.util.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import roketGamer.everythingRandom.util.info;

public class soundsHandler {
	
	public static SoundEvent QUESTIONABLE_ETHICS_ADVANCEMENT;
	public static SoundEvent TAU_NOAMMO;
	public static SoundEvent TAU_FIRE;
	public static SoundEvent TAU_FIRE_OVERCHARGED;
	public static SoundEvent TAU_SPINUP;
	public static SoundEvent TAU_SPINUP_LOOP;
	public static SoundEvent TAU_OVERCHARGED_EXPLODE;
	public static SoundEvent CRATE_STEP;
	public static SoundEvent CRATE_BREAKING;
	public static SoundEvent CRATE_BREAK;
	public static SoundEvent CRATE_PLACE;
	public static SoundEvent CRATE_FALL;
	public static SoundEvent EXPLODE;
	
	public static void registerSounds() {
		
		QUESTIONABLE_ETHICS_ADVANCEMENT = registerSound("advancementsounds.questionable_ethics");
		TAU_NOAMMO = registerSound("taucannon.no_ammo");
		TAU_FIRE = registerSound("taucannon.tau_fire");
		TAU_FIRE_OVERCHARGED = registerSound("taucannon.tau_fire_overcharged");
		TAU_SPINUP = registerSound("taucannon.tau_spinup");
		TAU_SPINUP_LOOP = registerSound("taucannon.tau_spinup_loop");
		TAU_OVERCHARGED_EXPLODE = registerSound("taucannon.tau_overcharge_explode");
		CRATE_STEP = registerSound("crate.step");
		CRATE_BREAKING = registerSound("crate.hit");
		CRATE_BREAK = registerSound("crate.break");
		CRATE_PLACE = registerSound("crate.place");
		CRATE_FALL = registerSound("crate.fall");
		EXPLODE = registerSound("crate.explode");
		
	}
	
	private static SoundEvent registerSound(String name) {
		
		ResourceLocation location = new ResourceLocation(info.MODID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
		
	}

}