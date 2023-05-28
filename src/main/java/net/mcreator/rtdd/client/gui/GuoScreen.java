
package net.mcreator.rtdd.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.rtdd.world.inventory.GuoMenu;
import net.mcreator.rtdd.network.GuoButtonMessage;
import net.mcreator.rtdd.RtddMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class GuoScreen extends AbstractContainerScreen<GuoMenu> {
	private final static HashMap<String, Object> guistate = GuoMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_biao_ji_2;

	public GuoScreen(GuoMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("rtdd:textures/screens/guo.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("rtdd:textures/screens/tguo1.png"));
		this.blit(ms, this.leftPos + 134, this.topPos + 31, 0, 0, 25, 27, 25, 27);

		RenderSystem.setShaderTexture(0, new ResourceLocation("rtdd:textures/screens/6531de0e8948bdc9b188331d2de5cc3.png"));
		this.blit(ms, this.leftPos + -125, this.topPos + 0, 0, 0, 127, 136, 127, 136);

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
		imagebutton_biao_ji_2 = new ImageButton(this.leftPos + 104, this.topPos + 38, 19, 18, 0, 0, 18, new ResourceLocation("rtdd:textures/screens/atlas/imagebutton_biao_ji_2.png"), 19, 36, e -> {
			if (true) {
				RtddMod.PACKET_HANDLER.sendToServer(new GuoButtonMessage(0, x, y, z));
				GuoButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_biao_ji_2", imagebutton_biao_ji_2);
		this.addRenderableWidget(imagebutton_biao_ji_2);
	}
}
