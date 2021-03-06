package com.giftedpineapples.signtravel.client.gui;

import com.giftedpineapples.signtravel.handler.ConfigHandler;
import com.giftedpineapples.signtravel.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class GuiConfig extends cpw.mods.fml.client.config.GuiConfig {

	public GuiConfig(GuiScreen guiScreen)
	{
		super(guiScreen,
				new ConfigElement(ConfigHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				Reference.MOD_ID,
				false,
				false,
				GuiConfig.getAbridgedConfigPath(ConfigHandler.configuration.toString()));
	}

}
