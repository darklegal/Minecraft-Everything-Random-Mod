package roketGamer.everythingRandom.util;

import net.minecraft.block.SoundType;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundEvent;
import roketGamer.everythingRandom.util.handlers.soundsHandler;

public class soundTypes {
	
	public static final SoundType CRATE = new SoundType(1.0F, 1.0F, soundsHandler.CRATE_BREAK, soundsHandler.CRATE_STEP, soundsHandler.CRATE_PLACE, soundsHandler.CRATE_BREAKING, soundsHandler.CRATE_FALL);
	
}
