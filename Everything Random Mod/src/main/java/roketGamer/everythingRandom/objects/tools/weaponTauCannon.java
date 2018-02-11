package roketGamer.everythingRandom.objects.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import roketGamer.everythingRandom.main;
import roketGamer.everythingRandom.init.itemInit;
import roketGamer.everythingRandom.util.handlers.soundsHandler;
import roketGamer.everythingRandom.util.interfaces.iHasModel;

public class weaponTauCannon extends Item implements iHasModel {
	
	public weaponTauCannon(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		this.maxStackSize = 1;
		
		itemInit.ITEMS.add(this);
		
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		
		worldIn.playSound((EntityPlayer)null, playerIn.posX, playerIn.posY, playerIn.posZ, soundsHandler.TAU_FIRE, SoundCategory.NEUTRAL, 1F, 1F);
		return null;
		
	}

	@Override
	public void registerModels() {
		
		main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
