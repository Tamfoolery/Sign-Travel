package com.giftedpineapples.signtravel.init;

import com.giftedpineapples.signtravel.block.BlockSignpost;
import com.giftedpineapples.signtravel.reference.Names;
import com.giftedpineapples.signtravel.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

	public static final BlockSignpost signpost = new BlockSignpost();

	public static void init()
	{
		GameRegistry.registerBlock(signpost, Names.Blocks.SIGNPOST);
	}

}
