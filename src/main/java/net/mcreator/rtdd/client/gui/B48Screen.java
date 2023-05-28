
package net.mcreator.rtdd.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.rtdd.world.inventory.B48Menu;
import net.mcreator.rtdd.procedures.N5Procedure;
import net.mcreator.rtdd.procedures.N4Procedure;
import net.mcreator.rtdd.procedures.N3Procedure;
import net.mcreator.rtdd.procedures.N2Procedure;
import net.mcreator.rtdd.procedures.N0Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class B48Screen extends AbstractContainerScreen<B48Menu> {
	private final static HashMap<String, Object> guistate = B48Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public B48Screen(B48Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 160;
	}

	private static final ResourceLocation texture = new ResourceLocation("rtdd:textures/screens/b_48.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("rtdd:textures/screens/jiu_bei_gui.png"));
		this.blit(ms, this.leftPos + -125, this.topPos + -40, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("rtdd:textures/screens/n0.png"));
		this.blit(ms, this.leftPos + 141, this.topPos + 31, 0, 0, 11, 29, 11, 29);

		RenderSystem.setShaderTexture(0, new ResourceLocation("rtdd:textures/screens/jian_tou_.png"));
		this.blit(ms, this.leftPos + 112, this.topPos + 35, 0, 0, 25, 27, 25, 27);

		if (N0Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("rtdd:textures/screens/nian1.png"));
			this.blit(ms, this.leftPos + 141, this.topPos + 31, 0, 0, 11, 29, 11, 29);
		}
		if (N2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("rtdd:textures/screens/nian2.png"));
			this.blit(ms, this.leftPos + 141, this.topPos + 31, 0, 0, 11, 29, 11, 29);
		}
		if (N3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("rtdd:textures/screens/nian3.png"));
			this.blit(ms, this.leftPos + 141, this.topPos + 31, 0, 0, 11, 29, 11, 29);
		}
		if (N4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("rtdd:textures/screens/nian4.png"));
			this.blit(ms, this.leftPos + 141, this.topPos + 31, 0, 0, 11, 29, 11, 29);
		}
		if (N5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("rtdd:textures/screens/nian5.png"));
			this.blit(ms, this.leftPos + 141, this.topPos + 31, 0, 0, 11, 29, 11, 29);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("rtdd:textures/screens/jiu_de_gui4.png"));
		this.blit(ms, this.leftPos + -124, this.topPos + 0, 0, 0, 125, 122, 125, 122);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
