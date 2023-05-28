
package net.mcreator.rtdd.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.rtdd.world.inventory.Jiao4Menu;
import net.mcreator.rtdd.procedures.Jiaoyi4Procedure;
import net.mcreator.rtdd.RtddMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Jiao4ButtonMessage {
	private final int buttonID, x, y, z;

	public Jiao4ButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public Jiao4ButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(Jiao4ButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(Jiao4ButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = Jiao4Menu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			Jiaoyi4Procedure.execute(entity);
		}
		if (buttonID == 1) {

			Jiaoyi4Procedure.execute(entity);
		}
		if (buttonID == 2) {

			Jiaoyi4Procedure.execute(entity);
		}
		if (buttonID == 3) {

			Jiaoyi4Procedure.execute(entity);
		}
		if (buttonID == 4) {

			Jiaoyi4Procedure.execute(entity);
		}
		if (buttonID == 5) {

			Jiaoyi4Procedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		RtddMod.addNetworkMessage(Jiao4ButtonMessage.class, Jiao4ButtonMessage::buffer, Jiao4ButtonMessage::new, Jiao4ButtonMessage::handler);
	}
}
