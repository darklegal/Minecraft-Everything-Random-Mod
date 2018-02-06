package roketGamer.everythingRandom.util.handlers;

import net.minecraft.util.IStringSerializable;

public class enumHandler {
	
	public static enum enumType implements IStringSerializable {
		
		RANDOMITE(0, "randominium"),
		SUBSTITE(1, "substite");
	
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
