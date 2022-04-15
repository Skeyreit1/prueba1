
package net.mcreator.proyectnew.gui.overlay;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber
public class CorazonesOverlay {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void eventHandler(RenderGameOverlayEvent.Post event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
			int w = event.getWindow().getScaledWidth();
			int h = event.getWindow().getScaledHeight();
			int posX = w / 2;
			int posY = h / 2;
			World _world = null;
			double _x = 0;
			double _y = 0;
			double _z = 0;
			PlayerEntity entity = Minecraft.getInstance().player;
			if (entity != null) {
				_world = entity.world;
				_x = entity.getPosX();
				_y = entity.getPosY();
				_z = entity.getPosZ();
			}
			World world = _world;
			double x = _x;
			double y = _y;
			double z = _z;
			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
					GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
			RenderSystem.disableAlphaTest();
			if (true) {
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("proyect_new:textures/madera.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -191, posY + -89, 0, 0, 8, 8, 8, 8);

				Minecraft.getInstance().fontRenderer.drawString(event.getMatrixStack(), "REPUTACION", posX + -191, posY + -102, -16751002);
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("proyect_new:textures/madera.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -180, posY + -89, 0, 0, 8, 8, 8, 8);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("proyect_new:textures/madera.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -170, posY + -89, 0, 0, 8, 8, 8, 8);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("proyect_new:textures/madera.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -159, posY + -89, 0, 0, 8, 8, 8, 8);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("proyect_new:textures/madera.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -148, posY + -89, 0, 0, 8, 8, 8, 8);

			}
			RenderSystem.depthMask(true);
			RenderSystem.enableDepthTest();
			RenderSystem.enableAlphaTest();
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}
}
