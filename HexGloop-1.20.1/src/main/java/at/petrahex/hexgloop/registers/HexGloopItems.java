
package at.petrahex.hexgloop.registers;

import at.petrahex.hexgloop.HexGloop;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.*;

public class HexGloopItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HexGloop.MOD_ID);

    public static final RegistryObject<Item> GLOOP = ITEMS.register("gloop",
        () -> new Item(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> GLOOP_PEARL = ITEMS.register("gloop_pearl",
        () -> new Item(new Item.Properties().stacksTo(16).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> GLOOPY_FABRIC = ITEMS.register("gloopy_fabric",
        () -> new Item(new Item.Properties().stacksTo(32)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
