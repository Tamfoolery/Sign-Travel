package com.giftedpineapples.signtravel.proxy;

import com.giftedpineapples.signtravel.client.renderer.item.ItemRendererSignpost;
import com.giftedpineapples.signtravel.client.renderer.tileentity.TileEntityRendererSignpost;
import com.giftedpineapples.signtravel.init.ModBlocks;
import com.giftedpineapples.signtravel.reference.RenderIds;
import com.giftedpineapples.signtravel.tileentity.TileEntitySignpost;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

	@Override
	public void initRenderingAndTextures()
	{
		RenderIds.signpost = RenderingRegistry.getNextAvailableRenderId();

		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.signpost), new ItemRendererSignpost());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySignpost.class, new TileEntityRendererSignpost());
	}

}
