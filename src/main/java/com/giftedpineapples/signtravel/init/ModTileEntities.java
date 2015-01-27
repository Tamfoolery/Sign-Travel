package com.giftedpineapples.signtravel.init;

import com.giftedpineapples.signtravel.reference.Names;
import com.giftedpineapples.signtravel.tileentity.TileEntitySignpost;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModTileEntities {

	public static void init()
	{
		GameRegistry.registerTileEntity(TileEntitySignpost.class, Names.Blocks.SIGNPOST);
	}

}
