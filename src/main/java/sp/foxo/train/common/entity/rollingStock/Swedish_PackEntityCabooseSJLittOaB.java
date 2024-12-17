package sp.foxo.train.common.entity.rollingStock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import train.common.Traincraft;
import train.common.api.AbstractWorkCart;

public class Swedish_PackEntityCabooseSJLittOaB extends AbstractWorkCart implements IInventory {
	public Swedish_PackEntityCabooseSJLittOaB(World world) {
		super(world);
		this.initCabooseWorkCart();
	}

	public void initCabooseWorkCart() {
		this.furnaceItemStacks = new ItemStack[3];
		this.furnaceBurnTime = 0;
		this.currentItemBurnTime = 0;
		this.furnaceCookTime = 0;
	}

	public Swedish_PackEntityCabooseSJLittOaB(World world, double d, double d1, double d2) {
		this(world);
		this.setPosition(d, d1 + (double)this.yOffset, d2);
		this.motionX = 0.0;
		this.motionY = 0.0;
		this.motionZ = 0.0;
		this.prevPosX = d;
		this.prevPosY = d1;
		this.prevPosZ = d2;
	}
	@Override
	public float[][] getRiderOffsets(){return new float[][]{{1.3f,0.25f,0f}};}

	public void updateRiderPosition() {
		if (this.riddenByEntity != null) {
			this.riddenByEntity.setPosition(this.posX, this.posY + this.getMountedYOffset() + this.riddenByEntity.getYOffset() + 0.25, this.posZ);
		}
	}

	public void setDead() {
		super.setDead();
		this.isDead = true;
	}

	public void pressKey(int i) {
		if (!this.locked || this.riddenByEntity == null || !(this.riddenByEntity instanceof EntityPlayer) || ((EntityPlayer)this.riddenByEntity).getDisplayName().toLowerCase().equals(this.trainOwner.toLowerCase())) {
			if (i == 7 && this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer) {
				((EntityPlayer)this.riddenByEntity).openGui(Traincraft.instance, 83, this.worldObj, (int)this.posX, (int)this.posY, (int)this.posZ);
			}

			if (i == 9 && this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer) {
				((EntityPlayer)this.riddenByEntity).openGui(Traincraft.instance, 84, this.worldObj, (int)this.posX, (int)this.posY, (int)this.posZ);
			}

		}
	}

	public void onUpdate() {
		super.onUpdate();
		this.updateBurning();
	}

	public String getInventoryName() {
		return "SJ Litt Oa B";
	}

	public boolean interactFirst(EntityPlayer entityplayer) {
		if (super.interactFirst(entityplayer)) {
			return false;
		} else {
			if (!this.worldObj.isRemote) {
				ItemStack itemstack = entityplayer.inventory.getCurrentItem();
				if (this.lockThisCart(itemstack, entityplayer)) {
					return true;
				}

				if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer && this.riddenByEntity != entityplayer) {
					return true;
				}

				if (!this.worldObj.isRemote) {
					entityplayer.mountEntity(this);
				}
			}

			return true;
		}
	}

	public boolean isStorageCart() {
		return false;
	}

	public boolean canBeRidden() {
		return true;
	}

	public float getOptimalDistance(EntityMinecart cart) {
		return 2.2F;
	}

	public boolean isUseableByPlayer(EntityPlayer entityplayer) {
		return !this.isDead && entityplayer.getDistanceSqToEntity(this) <= 124.0;
	}

	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}

	public void markDirty() {
	}
}