package com.giftedpineapples.signtravel.client.renderer.model;

import com.giftedpineapples.signtravel.reference.Models;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraftforge.client.model.AdvancedModelLoader;

@SideOnly(Side.CLIENT)
public class ModelSignpost extends ModelST {

	public ModelSignpost()
	{
		modelCustom = AdvancedModelLoader.loadModel(Models.SIGNPOST);
	}

}
