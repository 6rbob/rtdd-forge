
package net.mcreator.rtdd.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.rtdd.world.inventory.Jiaoyi0Menu;
import net.mcreator.rtdd.procedures.JiaoyiaProcedure;
import net.mcreator.rtdd.procedures.Jiaoyi2Procedure;
import net.mcreator.rtdd.procedures.Jiaoyi1Procedure;
import net.mcreator.rtdd.procedures.Jiao3Procedure;
import net.mcreator.rtdd.RtddMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Jiaoyi0ButtonMessage {
	private final int buttonID, x, y, z;

	public Jiaoyi0ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public Jiaoyi0ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(Jiaoyi0ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(Jiaoyi0ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = Jiaoyi0Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			JiaoyiaProcedure.execute(entity);
		}
		if (buttonID == 1) {

			JiaoyiaProcedure.execute(entity);
		}
		if (buttonID == 2) {

			JiaoyiaProcedure.execute(entity);
		}
		if (buttonID == 3) {

			Jiaoyi1Procedure.execute(entity);
		}
		if (buttonID == 4) {

			Jiaoyi2Procedure.execute(entity);
		}
		if (buttonID == 5) {

			Jiao3Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		RtddMod.addNetworkMessage(Jiaoyi0ButtonMessage.class, Jiaoyi0ButtonMessage::buffer, Jiaoyi0ButtonMessage::new, Jiaoyi0ButtonMessage::handler);
	}
}
