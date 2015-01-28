package com.giftedpineapples.signtravel.client.renderer.tileentity;

import com.giftedpineapples.signtravel.client.renderer.model.ModelSignpost;
import com.giftedpineapples.signtravel.reference.Textures;
import com.giftedpineapples.signtravel.tileentity.TileEntitySignpost;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;

public class TileEntityRendererSignpost extends TileEntitySpecialRenderer {

	private final ModelSignpost modelSignpost = new ModelSignpost();
	float pixel = 1F/16F;

	private ArrayList<String> locations = new ArrayList<String>() {{
		add("Blandare");
		add("Kaer Trolde");
		add("Arinbjorn");
		add("Yustianna's Grotto");
	}};
	private ArrayList<Float> angles = new ArrayList<Float>() {{
		add(0F);
		add(198F);
		add(45F);
		add(120F);
	}};

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick)
	{
		if (tileEntity instanceof TileEntitySignpost)
		{
			/**
			 * Render signpost
			 */
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

			/**
			 * Render location name sign
			 */
			GL11.glPushMatrix();

			// Scale, Translate, Rotate
			GL11.glScalef(1.0F, 1.0F, 1.0F);
			GL11.glTranslatef((float) x + 0.5F, (float) y + 0.0F, (float) z + 0.5F);
			GL11.glRotatef(0F, 0F, 1F, 0F);

			// Bind Texture
			this.bindTexture(Textures.Model.SIGNPOST);

			// Render Sign
			modelSignpost.render("SignName");

			renderString("The Skellige Isles", 4.3F, false);

			GL11.glPopMatrix();

			for (int i = 0; i < locations.size(); i++)
			{
				float pos;

				switch (i)
				{
					case 0:
						pos = 3.9F;
						break;
					case 1:
						pos = 3.425F;
						break;
					case 2:
						pos = 2.95F;
						break;
					case 3:
						pos = 2.5F;
						break;
					default:
						pos = 3.9F;
				}

				GL11.glPushMatrix();

				GL11.glScalef(1.0F, 1.0F, 1.0F);
				GL11.glTranslatef((float) x + 0.5F, (float) y + 0.0F, (float) z + 0.5F);
				GL11.glRotatef(-angles.get(i), 0F, 1F, 0F);

				this.bindTexture(Textures.Model.SIGNPOST);

				int sign = i + 1;
				modelSignpost.render("Sign" + sign);
				renderString(locations.get(i), pos, true);

				GL11.glPopMatrix();
			}
		}
	}

	private void renderString(String string, float y, boolean isDirectionSign)
	{
		FontRenderer fontRenderer = this.func_147498_b();
		float f1 = 0.6666667F;
		float f3 = 0.014666668F * f1;

		float x = (isDirectionSign) ? 0.6F : 2.6F;
		float z = (isDirectionSign) ? (pixel * 16) - pixel : 0.015F;

		// Scale, Translate, Rotate
		GL11.glTranslatef(-pixel * x, ((pixel * 16) * y) * f1, z * f1);
		GL11.glScalef(f3, -f3, f3);
		GL11.glRotatef(-90F, 0F, 1F, 0F);

		// string, x, y, color, dropShadow (nullable)
		fontRenderer.drawString(string, -fontRenderer.getStringWidth(string) / 2, 0, 0);
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F); // Reset colour because the font renderer doesn't for some reason...

		if (isDirectionSign)
		{
			GL11.glTranslatef(0F, 0F, -7.5F);
			GL11.glRotatef(180F, 0F, 1F, 0F);
			fontRenderer.drawString(string, -fontRenderer.getStringWidth(string) / 2, 0, 0);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}

}
