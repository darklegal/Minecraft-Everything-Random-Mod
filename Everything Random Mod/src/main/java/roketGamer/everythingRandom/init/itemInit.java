package roketGamer.everythingRandom.init;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import roketGamer.everythingRandom.objects.items.itemBase;
import roketGamer.everythingRandom.objects.items.itemEverythingRandomGuide;
import roketGamer.everythingRandom.objects.tools.toolSword;
import roketGamer.everythingRandom.objects.tools.weaponTauCannon;

public class itemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//materials
	public static final ToolMaterial SHARP_IRON = EnumHelper.addToolMaterial("iron_sharp", 2, 200, 6F, 3F, 14);
	public static final ToolMaterial SHARP_GOLD = EnumHelper.addToolMaterial("gold_sharp", 0, 26, 12F, 1F, 22);
	public static final ToolMaterial SHARP_DIAMOND = EnumHelper.addToolMaterial("diamond_sharp", 3, 1249, 8F, 3.5F, 10);
	public static final ToolMaterial CREATIVE_TOOL = EnumHelper.addToolMaterial("creative", 10, 9999999, 10F, 999996F, 100);
	
	//guide
	public static final Item EVERYTHING_RANDOM_GUIDE = new itemEverythingRandomGuide("everything_random_guide");
	
	//items
	public static final Item RANDOMITE_BIT_RAW = new itemBase("bit_randominium_raw");
	public static final Item RANDOMITE_BIT_SMOOTH = new itemBase("bit_randominium_smooth");
	public static final Item RANDOMITE_NUGGET_RAW = new itemBase("nugget_randominium_raw");
	public static final Item RANDOMITE_NUGGET_SMOOTH = new itemBase("nugget_randominium_smooth");
	public static final Item RANDOMITE_INGOT_RAW = new itemBase("ingot_randominium_raw");
	public static final Item RANDOMITE_INGOT_SMOOTH = new itemBase("ingot_randominium_smooth");
	public static final Item DAYMETAL_INGOT = new itemBase("ingot_daymetal");
	public static final Item NIGHTMETAL_INGOT = new itemBase("ingot_nightmetal");		
	public static final Item SHARP_IRON_BLADE = new itemBase("sharp_iron_blade");
	public static final Item SHARP_GOLD_BLADE = new itemBase("sharp_gold_blade");
	public static final Item SHARP_DIAMOND_BLADE = new itemBase("sharp_diamond_blade");
	public static final Item SUBSTITE_INGOT = new itemBase("ingot_substite");
	public static final Item NETHERIUM_INGOT = new itemBase("ingot_netherium");
	public static final Item VOIDEN_INGOT = new itemBase("ingot_voiden");
	public static final Item ORDINIUM_INGOT = new itemBase("ingot_ordinium");
	//public static final Item URANIUM_235 = new itemBase("uranium_235");
	public static final Item COPPER_INGOT = new itemBase("ingot_copper");
	public static final Item AMBER_GEMSTONE = new itemBase("gemstone_amber");
	
	//tools and weapons
	public static final Item SWORD_SHARP_IRON = new toolSword("sharp_iron_sword", SHARP_IRON);
	public static final Item SWORD_SHARP_GOLD = new toolSword("sharp_gold_sword", SHARP_GOLD);
	public static final Item SWORD_SHARP_DIAMOND = new toolSword("sharp_diamond_sword", SHARP_DIAMOND);
	public static final Item SWORD_CREATIVE = new toolSword("creative_sword", CREATIVE_TOOL);
	public static final Item TAU_CANNON = new weaponTauCannon("tau_cannon");
	
	//grindstone wheels
	//public static final Item GRINDSTONE_WHEEL_STONE = new itemBase("stone_grind_wheel");
	//public static final Item GRINDSTONE_WHEEL_IRON = new itemBase("iron_grind_wheel");
	//public static final Item GRINDSTONE_WHEEL_GOLD = new itemBase("gold_grind_wheel");
	//public static final Item GRINDSTONE_WHEEL_DIAMOND = new itemBase("diamond_grind_wheel");
	//public static final Item GRINDSTONE_WHEEL_EMERALD = new itemBase("emerald_grind_wheel");
	//public static final Item GRINDSTONE_WHEEL_QUARTZ = new itemBase("quartz_grind_wheel");
	//public static final Item GRINDSTONE_WHEEL_RANDOMITE = new itemBase("randominium_grind_wheel");
	//public static final Item GRINDSTONE_WHEEL_NETHERIUM = new itemBase("netherium_grind_wheel");
	
	//other

}