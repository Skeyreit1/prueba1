
package net.mcreator.proyectnew.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.proyectnew.ProyectNewMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class InterfazaldeanosGuiWindow extends ContainerScreen<InterfazaldeanosGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = InterfazaldeanosGui.guistate;

	public InterfazaldeanosGuiWindow(InterfazaldeanosGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 200;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("proyect_new:textures/interfazaldeanos.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Interfaz de aldeano", 48, 5, -16764109);
		this.font.drawString(ms, "relaci\u00F3n:", -107, -2, -3342337);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 243, this.guiTop + -2, 61, 20, new StringTextComponent("chatear"), e -> {
			if (true) {
				ProyectNewMod.PACKET_HANDLER.sendToServer(new InterfazaldeanosGui.ButtonPressedMessage(0, x, y, z));
				InterfazaldeanosGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 243, this.guiTop + 25, 61, 20, new StringTextComponent("bromear"), e -> {
			if (true) {
				ProyectNewMod.PACKET_HANDLER.sendToServer(new InterfazaldeanosGui.ButtonPressedMessage(1, x, y, z));
				InterfazaldeanosGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 243, this.guiTop + 52, 72, 20, new StringTextComponent("coquetear"), e -> {
			if (true) {
				ProyectNewMod.PACKET_HANDLER.sendToServer(new InterfazaldeanosGui.ButtonPressedMessage(2, x, y, z));
				InterfazaldeanosGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 243, this.guiTop + 79, 67, 20, new StringTextComponent("insultar"), e -> {
			if (true) {
				ProyectNewMod.PACKET_HANDLER.sendToServer(new InterfazaldeanosGui.ButtonPressedMessage(3, x, y, z));
				InterfazaldeanosGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 243, this.guiTop + 103, 61, 20, new StringTextComponent("regalar"), e -> {
			if (true) {
				ProyectNewMod.PACKET_HANDLER.sendToServer(new InterfazaldeanosGui.ButtonPressedMessage(4, x, y, z));
				InterfazaldeanosGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 243, this.guiTop + 129, 77, 20, new StringTextComponent("declararse"), e -> {
			if (true) {
				ProyectNewMod.PACKET_HANDLER.sendToServer(new InterfazaldeanosGui.ButtonPressedMessage(5, x, y, z));
				InterfazaldeanosGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
	}
}
