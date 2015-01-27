package com.giftedpineapples.signtravel.tileentity;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEntityST extends TileEntity {

	protected ForgeDirection orientation;
	protected byte state;

	public TileEntityST()
	{
		orientation = ForgeDirection.SOUTH;
		state = 0;
	}

	public ForgeDirection getOrientation()
	{
		return orientation;
	}

	public void setOrientation(ForgeDirection orientation)
	{
		this.orientation = orientation;
	}

	public void setOrientation(int orientation)
	{
		this.orientation = ForgeDirection.getOrientation(orientation);
	}

	public short getState()
	{
		return state;
	}

	public void setState(byte state)
	{
		this.state = state;
	}

	@Override
	public AxisAlignedBB getRenderBoundingBox()
	{
		return AxisAlignedBB.getBoundingBox(xCoord, yCoord, zCoord, xCoord + 1, yCoord + 1, zCoord + 1);
	}

}
