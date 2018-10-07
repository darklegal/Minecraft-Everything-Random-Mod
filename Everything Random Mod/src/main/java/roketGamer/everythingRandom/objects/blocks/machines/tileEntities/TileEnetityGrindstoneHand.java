/*package roketGamer.everythingRandom.objects.blocks.machines.tileEntities;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileEnetityGrindstoneHand extends TileEntity implements IInventory, ITickable{

	private NonNullList<ItemStack> inventory = NonNullList.<ItemStack>withSize(4, ItemStack.EMPTY);
	private String inventortyName;
	
	//fuel
	private int fuelTime;
	private int fuelProgress;
	
	//process
	private int processTime;
	private int totalProcessTime;
	
	public String getName()
	{
		return this.hasCustomName() ? this.inventortyName : "containter.grindstone_hand";
	}
	
	public boolean hasCustomName()
	{
		return this.inventortyName !=null && !this.inventortyName.isEmpty();
	}
	
	public void setCustomName (String inventoryName)
	{
		this.inventortyName = inventoryName;
	}
	
	public ITextComponent getDisplayName()
	{
		return this.hasCustomName() ? new TextComponentString(this.getName()) : new TextComponentTranslation(this.getName());
	}
	
	public int getSizeInventory()
	{
		return this.inventory.size();
	}
	
	public boolean isEmpty()
	{
		for(ItemStack stack : this.inventory)
		{
			if(!stack.isEmpty()) return false;
		}
		return true;
	}
	
	public ItemStack getStackInSlot(int index)
	{
		return (ItemStack)this.inventory.get(index);
	}
	
	public ItemStack decrStackSize(int index, int count)
	{
		return ItemStackHelper.getAndSplit(this.inventory, index, count);
	}
	
	public ItemStack removeStackFromSlot(int index)
	{
		return ItemStackHelper.getAndRemove(this.inventory, index);
	}
	
	public void setInventorySlotContents(int index, ItemStack stack)
	{
		ItemStack itemstack = (ItemStack)this.inventory.get(index);
		boolean flag = !stack.isEmpty() && stack.isItemEqual(itemstack) && ItemStack.areItemStackTagsEqual(stack, itemstack);
		this.inventory.set(index, stack);
		
		if(stack.getCount() > this.getInventoryStackLimit())
		{
			stack.setCount(this.getInventoryStackLimit());
		}
		
		if(index == 0 && index + 1 == 1 && !flag)
		{
			ItemStack stack1 = (ItemStack)this.inventory.get(index + 1);
			this.totalProcessTime = this.getProcessTime(stack, stack1);
			this.processTime = 0;
			this.markDirty();
		}
	}
	
	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
		this.inventory = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);
		ItemStackHelper.loadAllItems(compound, this.inventory);
		this.fuelTime = compound.getInteger("FuelTime");
		this.processTime = compound.getInteger("ProcessTime");
		this.totalProcessTime = compound.getInteger("ProcessTimeTotal");
		this.fuelProgress = getFuelUsage((ItemStack)this.inventory.get(2));
		
		if(compound.hasKey("InventoryName", 8)) this.setCustomName(compound.getString("InventoryName"));
	}
	
	public NBTTagCompound writeToNBT(NBTTagCompound compound)
	{
		super.writeToNBT(compound);
		compound.setInteger("FuelTime", (short)this.fuelTime);
		compound.setInteger("ProcessTime", (short)this.processTime);
		compound.setInteger("ProcessTimeTotal", (short)this.totalProcessTime);
		ItemStackHelper.saveAllItems(compound, this.inventory);
		
		if(this.hasCustomName()) compound.setString("InventoryName", this.inventortyName);
		return compound;
	}
	
	public int getInventoryStackLimit()
	{
		return 64;
	}
	
	public boolean isActive()
	{
		return this.processTime > 0;
	}
	
	@SideOnly(Side.CLIENT)
	public static boolean isActive(IInventory inventory)
	{
		return inventory.getField(0) > 0;
	}
	
	public int getProcessTime(ItemStack input1, ItemStack input2)
	{
		return 50;
	}
	
	public void update()
	{
		boolean flag = this.isActive();
		boolean flag1 = false;
		
		if(this.isActive()) --this.processTime;
		
		if(!this.world.isRemote)
		{
			ItemStack stack = (ItemStack)this.inventory.get(2);
			
			if(this.isActive() || !stack.isEmpty() && !((((ItemStack)this.inventory.get(0)).isEmpty()) || ((ItemStack)this.inventory.get(1)).isEmpty()))
			{
				if(!this.isActive() && this.canGrind())
				{
					this.processTime = get
				}
			}
		}
	}
	
}*/