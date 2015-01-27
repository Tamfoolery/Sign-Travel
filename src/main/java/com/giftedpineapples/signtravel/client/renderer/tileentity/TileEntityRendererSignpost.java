package com.giftedpineapples.signtravel.client.renderer.tileentity;

import com.giftedpineapples.signtravel.client.renderer.model.ModelSignpost;
import com.giftedpineapples.signtravel.reference.Textures;
import com.giftedpineapples.signtravel.tileentity.TileEntitySignpost;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class TileEntityRendererSignpost extends TileEntitySpecialRenderer {

	private final ModelSignpost modelSignpost = new ModelSignpost();

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick)
	{
		if (tileEntity instanceof TileEntitySignpost)
		{
			GL11.glPushMatrix();

			// Scale, Translate, Rotate
			GL11.glScalef(1.0F, 1.0F, 1.0F);
			GL11.glTranslatef((float) x + 0.5F, (float) y + 0.0F, (float) z + 0.5F);
			GL11.glRotatef(0F, 0F, 1F, 0F);

			// Bind Texture
			this.bindTexture(Textures.Model.SIGNPOST);

			// Render Post
			modelSignpost.render("Post");

			GL11.glPopMatrix();
		}
	}

}
