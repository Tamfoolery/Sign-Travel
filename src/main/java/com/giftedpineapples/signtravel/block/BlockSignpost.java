package com.giftedpineapples.signtravel.block;

import com.giftedpineapples.signtravel.reference.Names;
import com.giftedpineapples.signtravel.reference.RenderIds;
import com.giftedpineapples.signtravel.tileentity.TileEntitySignpost;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockSignpost extends BlockST implements ITileEntityProvider {

	public BlockSignpost()
	{
		super();

		this.setBlockName(Names.Blocks.SIGNPOST);
		this.setBlockTextureName(Names.Blocks.SIGNPOST);

		float pixel = 1F/16F;

		this.setBlockBounds(12 * pixel / 2, 0 * pixel / 2, 12 * pixel / 2, 1 - 12 * pixel / 2, 3 - 0 * pixel / 2 + pixel * 2, 1 - 12 * pixel / 2);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
	{
		return new TileEntitySignpost();
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	@Override
	public int getRenderType()
	{
		return RenderIds.signpost;
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

}
