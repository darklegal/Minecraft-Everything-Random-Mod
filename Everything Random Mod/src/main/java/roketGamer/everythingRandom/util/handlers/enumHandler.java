package roketGamer.everythingRandom.util.handlers;

import net.minecraft.util.IStringSerializable;

public class enumHandler {
	
	public static enum enumType implements IStringSerializable {
		
		WHITE(0, "white"),
		ORANGE(1, "orange"),
		MAGENTA(2, "magenta"),
		LIGHTBLUE(3, "light_blue"),
		YELLOW(4, "yellow"),
		LIME(5, "lime"),
		PINK(6, "pink"),
		GREY(7, "grey"),
		LIGHTGREY(8, "silver"),
		CYAN(9, "cyan"),
		PURPLE(10, "purple"),
		BLUE(11, "blue"),
		BROWN(12, "brown"),
		GREEN(13, "green"),
		RED(14, "red"),
		BLACK(15, "black");
	
		private static final enumType[] META_LOOKUP = new enumType[values().length];
		private final int meta;
		private final String name, unlocalizedName;
		
		private enumType(int meta, String name) {
			
			this(meta, name, name);
			
		}
		
		private enumType(int meta, String name, String unlocalizedName) {
			
			this.meta = meta;
			this.name = name;
			this.unlocalizedName = unlocalizedName;
			
		}
		
		@Override
		public String getName() {
			
			return this.name;
			
		}
		
		public int getMeta() {
			
			return this.meta;
			
		}
		
		public String getUnlocalizedName() {
			
			return this.unlocalizedName;
			
		}
		
		@Override
		public String toString() {
			
			return this.name;
			
		}
		
		public static enumType byMetadata(int meta) {
			
			return META_LOOKUP[meta];
			
		}
		
		static {
			
			for(enumType enumtype : values ()) {
				
				META_LOOKUP[enumtype.getMeta()] = enumtype;
				
			}
			
		}
		
	}

}
