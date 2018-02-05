package roketGamer.everythingRandom.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import roketGamer.everythingRandom.objects.items.itemBase;
import roketGamer.everythingRandom.objects.tools.toolSword;

public class itemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//materials
	public static final ToolMaterial SHARP_IRON = EnumHelper.addToolMaterial("iron_sharp", 2, 200, 6F, 3F, 14);
	public static final ToolMaterial SHARP_GOLD = EnumHelper.addToolMaterial("gold_sharp", 0, 26, 12F, 1F, 22);
	public static final ToolMaterial SHARP_DIAMOND = EnumHelper.addToolMaterial("diamond_sharp", 3, 1249, 8F, 3.5F, 10);
	public static final ToolMaterial CREATIVE_TOOL = EnumHelper.addToolMaterial("creative", 10, 9999999, 10F, 999996F, 100);
	
	//items
	public static final Item LIGHTMETAL_INGOT = new itemBase("ingot_lightmetal");
	public static final Item DARKMETAL_INGOT = new itemBase("ingot_darkmetal");
	public static final Item DAYMETAL_INGOT = new itemBase("ingot_daymetal");
	public static final Item NIGHTMETAL_INGOT = new itemBase("ingot_nightmetal");
	public static final Item RANDOMITE_BIT_RAW = new itemBase("bit_randominium_raw");
	public static final Item RANDOMITE_BIT_SMOOTH = new itemBase("bit_randominium_smooth");
	public static final Item RANDOMITE_NUGGET_RAW = new itemBase("nugget_randominium_raw");
	public static final Item RANDOMITE_NUGGET_SMOOTH = new itemBase("nugget_randominium_smooth");
	public static final Item RANDOMITE_INGOT_RAW = new itemBase("ingot_randominium_raw");
	public static final Item RANDOMITE_INGOT_SMOOTH = new itemBase("ingot_randominium_smooth");
	public static final Item EVERYTHING_RANDOM_GUIDE = new itemBase("everything_random_guide");		
	public static final Item SHARP_IRON_BLADE = new itemBase("sharp_iron_blade");
	public static final Item SHARP_GOLD_BLADE = new itemBase("sharp_gold_blade");
	public static final Item SHARP_DIAMOND_BLADE = new itemBase("sharp_diamond_blade");
	
	//tools and weapons
	public static final Item SWORD_SHARP_IRON = new toolSword("sharp_iron_sword", SHARP_IRON);
	public static final Item SWORD_SHARP_GOLD = new toolSword("sharp_gold_sword", SHARP_GOLD);
	public static final Item SWORD_SHARP_DIAMOND = new toolSword("sharp_diamond_sword", SHARP_DIAMOND);
	public static final Item SWORD_CREATIVE = new toolSword("creative_sword", CREATIVE_TOOL);
	
	//other

}