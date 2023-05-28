
package net.mcreator.rtdd.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.rtdd.world.inventory.Gg1Menu;
import net.mcreator.rtdd.network.Gg1ButtonMessage;
import net.mcreator.rtdd.RtddMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Gg1Screen extends AbstractContainerScreen<Gg1Menu> {
	private final static HashMap<String, Object> guistate = Gg1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_jian;

	public Gg1Screen(Gg1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("rtdd:textures/screens/gg_1.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("rtdd:textures/screens/.png"));
		this.blit(ms, this.leftPos + 31, this.topPos + 43, 0, 0, 25, 27, 25, 27);

		RenderSystem.setShaderTexture(0, new ResourceLocation("rtdd:textures/screens/yi_wu_gui.png"));
		this.blit(ms, this.leftPos + 12, this.topPos + 17, 0, 0, 18, 18, 18, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("rtdd:textures/screens/.png"));
		this.blit(ms, this.leftPos + 74, this.topPos + 43, 0, 0, 25, 27, 25, 27);

		RenderSystem.setShaderTexture(0, new ResourceLocation("rtdd:textures/screens/jian_tou_.png"));
		this.blit(ms, this.leftPos + 122, this.topPos + 46, 0, 0, 25, 27, 25, 27);

		RenderSystem.setShaderTexture(0, new ResourceLocation("rtdd:textures/screens/peifang.png"));
		this.blit(ms, this.leftPos + -122, this.topPos + 0, 0, 0, 176, 166, 176, 166);

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
		imagebutton_jian = new ImageButton(this.leftPos + 39, this.topPos + 15, 14, 22, 0, 0, 22, new ResourceLocation("rtdd:textures/screens/atlas/imagebutton_jian.png"), 14, 44, e -> {
			if (true) {
				RtddMod.PACKET_HANDLER.sendToServer(new Gg1ButtonMessage(0, x, y, z));
				Gg1ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_jian", imagebutton_jian);
		this.addRenderableWidget(imagebutton_jian);
	}
}
