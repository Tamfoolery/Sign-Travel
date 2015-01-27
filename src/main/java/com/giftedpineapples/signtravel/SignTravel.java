package com.giftedpineapples.signtravel;

import com.giftedpineapples.signtravel.handler.ConfigHandler;
import com.giftedpineapples.signtravel.init.ModBlocks;
import com.giftedpineapples.signtravel.init.ModTileEntities;
import com.giftedpineapples.signtravel.proxy.IProxy;
import com.giftedpineapples.signtravel.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class SignTravel {

	@Mod.Instance(Reference.MOD_ID)
	public static SignTravel instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		// Load handler file
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());

		// Register Items & Blocks
		ModBlocks.init();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		// Init Tile Entities
		ModTileEntities.init();

		// Init custom rendering and pre-load textures (client only)
		proxy.initRenderingAndTextures();

		// Init recipes!
//		Recipes.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		//
	}

}
