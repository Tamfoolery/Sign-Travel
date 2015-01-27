package com.giftedpineapples.signtravel.block;

import com.giftedpineapples.signtravel.creativetab.CreativeTabST;
import com.giftedpineapples.signtravel.reference.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockST extends Block {

	protected BlockST(Material material)
	{
		super(material);
		this.blockHardness = 2.0f;
		this.setCreativeTab(CreativeTabST.ST_TAB);
	}

	protected BlockST()
	{
		this(Material.wood);
	}

	@Override
	public String getUnlocalizedName()
	{
		return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}

}
