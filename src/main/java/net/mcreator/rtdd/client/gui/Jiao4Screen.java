
package net.mcreator.rtdd.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.Minecraft;

import net.mcreator.rtdd.world.inventory.Jiao4Menu;
import net.mcreator.rtdd.network.Jiao4ButtonMessage;
import net.mcreator.rtdd.RtddMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class Jiao4Screen extends AbstractContainerScreen<Jiao4Menu> {
	private final static HashMap<String, Object> guistate = Jiao4Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_biao_ji_2;
	ImageButton imagebutton_biao_ji_21;
	ImageButton imagebutton_biao_ji_22;
	ImageButton imagebutton_biao_ji_23;
	ImageButton imagebutton_biao_ji_24;
	ImageButton imagebutton_biao_ji_25;

	public Jiao4Screen(Jiao4Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 179;
	}

	private static final ResourceLocation texture = new ResourceLocation("rtdd:textures/screens/jiao_4.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("rtdd:textures/screens/jian_tou_.png"));
		this.blit(ms, this.leftPos + 87, this.topPos + 43, 0, 0, 25, 27, 25, 27);

		RenderSystem.setShaderTexture(0, new ResourceLocation("rtdd:textures/screens/npcjiao_yi_2.png"));
		this.blit(ms, this.leftPos + -97, this.topPos + -1, 0, 0, 101, 180, 101, 180);

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
		imagebutton_biao_ji_2 = new ImageButton(this.leftPos + -43, this.topPos + 20, 19, 18, 0, 0, 18, new ResourceLocation("rtdd:textures/screens/atlas/imagebutton_biao_ji_2.png"), 19, 36, e -> {
			if (true) {
				RtddMod.PACKET_HANDLER.sendToServer(new Jiao4ButtonMessage(0, x, y, z));
				Jiao4ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_biao_ji_2", imagebutton_biao_ji_2);
		this.addRenderableWidget(imagebutton_biao_ji_2);
		imagebutton_biao_ji_21 = new ImageButton(this.leftPos + -43, this.topPos + 46, 19, 18, 0, 0, 18, new ResourceLocation("rtdd:textures/screens/atlas/imagebutton_biao_ji_21.png"), 19, 36, e -> {
			if (true) {
				RtddMod.PACKET_HANDLER.sendToServer(new Jiao4ButtonMessage(1, x, y, z));
				Jiao4ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_biao_ji_21", imagebutton_biao_ji_21);
		this.addRenderableWidget(imagebutton_biao_ji_21);
		imagebutton_biao_ji_22 = new ImageButton(this.leftPos + -43, this.topPos + 124, 19, 18, 0, 0, 18, new ResourceLocation("rtdd:textures/screens/atlas/imagebutton_biao_ji_22.png"), 19, 36, e -> {
			if (true) {
				RtddMod.PACKET_HANDLER.sendToServer(new Jiao4ButtonMessage(2, x, y, z));
				Jiao4ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_biao_ji_22", imagebutton_biao_ji_22);
		this.addRenderableWidget(imagebutton_biao_ji_22);
		imagebutton_biao_ji_23 = new ImageButton(this.leftPos + -43, this.topPos + 72, 19, 18, 0, 0, 18, new ResourceLocation("rtdd:textures/screens/atlas/imagebutton_biao_ji_23.png"), 19, 36, e -> {
			if (true) {
				RtddMod.PACKET_HANDLER.sendToServer(new Jiao4ButtonMessage(3, x, y, z));
				Jiao4ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_biao_ji_23", imagebutton_biao_ji_23);
		this.addRenderableWidget(imagebutton_biao_ji_23);
		imagebutton_biao_ji_24 = new ImageButton(this.leftPos + -43, this.topPos + 98, 19, 18, 0, 0, 18, new ResourceLocation("rtdd:textures/screens/atlas/imagebutton_biao_ji_24.png"), 19, 36, e -> {
			if (true) {
				RtddMod.PACKET_HANDLER.sendToServer(new Jiao4ButtonMessage(4, x, y, z));
				Jiao4ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_biao_ji_24", imagebutton_biao_ji_24);
		this.addRenderableWidget(imagebutton_biao_ji_24);
		imagebutton_biao_ji_25 = new ImageButton(this.leftPos + -43, this.topPos + 149, 19, 18, 0, 0, 18, new ResourceLocation("rtdd:textures/screens/atlas/imagebutton_biao_ji_25.png"), 19, 36, e -> {
			if (true) {
				RtddMod.PACKET_HANDLER.sendToServer(new Jiao4ButtonMessage(5, x, y, z));
				Jiao4ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		});
		guistate.put("button:imagebutton_biao_ji_25", imagebutton_biao_ji_25);
		this.addRenderableWidget(imagebutton_biao_ji_25);
	}
}
