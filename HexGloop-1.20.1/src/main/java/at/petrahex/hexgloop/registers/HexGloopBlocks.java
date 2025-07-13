
package at.petrahex.hexgloop.registers;

import at.petrahex.hexgloop.HexGloop;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.item.BlockItem;
import net.minecraftforge.registries.*;

public class HexGloopBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, HexGloop.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HexGloop.MOD_ID);

    public static final RegistryObject<Block> GLOOPY_BLOCK = BLOCKS.register("gloopy_block",
        () -> new Block(Block.Properties.of(Material.CLAY).strength(1.0f)));

    public static final RegistryObject<Item> GLOOPY_BLOCK_ITEM = ITEMS.register("gloopy_block",
        () -> new BlockItem(GLOOPY_BLOCK.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
