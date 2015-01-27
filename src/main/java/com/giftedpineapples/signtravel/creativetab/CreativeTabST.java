package com.giftedpineapples.signtravel.creativetab;

import com.giftedpineapples.signtravel.init.ModBlocks;
import com.giftedpineapples.signtravel.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabST {

	public static final CreativeTabs ST_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
		@Override
		public Item getTabIconItem()
		{
			return Item.getItemFromBlock(ModBlocks.signpost);
		}
	};

}
