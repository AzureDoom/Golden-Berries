package mod.azure.goldenberry;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("goldenberry")
public class GoldenBerryMod {
	public static final String MODID = "goldenberry";

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			event.getRegistry()
					.registerAll(new Item(new Item.Properties().group(ItemGroup.FOOD)
							.food(new Food.Builder().setAlwaysEdible().saturation(1.2F).hunger(6).build()))
									.setRegistryName(new ResourceLocation(GoldenBerryMod.MODID, ("golden_berries"))));
		}
	}
}