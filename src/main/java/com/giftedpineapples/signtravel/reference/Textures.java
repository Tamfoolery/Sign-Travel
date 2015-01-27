package com.giftedpineapples.signtravel.reference;

import com.giftedpineapples.signtravel.utility.ResourceLocationHelper;
import net.minecraft.util.ResourceLocation;

public class Textures {

	public static final String RESOURCE_PREFIX = Reference.MOD_ID.toLowerCase() + ":";

	public static final class Model
	{
		private static final String MODEL_TEXTURE_LOCATION = "textures/models/";

		public static final ResourceLocation SIGNPOST = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + Names.Blocks.SIGNPOST + ".png");
	}

}
