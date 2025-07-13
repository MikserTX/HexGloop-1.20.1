
package at.petrahex.hexgloop;

import at.petrahex.hexgloop.registers.HexGloopBlocks;
import at.petrahex.hexgloop.registers.HexGloopItems;
import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(HexGloop.MOD_ID)
public class HexGloop {
    public static final String MOD_ID = "hexgloop";
    public static final Logger LOGGER = LogUtils.getLogger();

    public HexGloop() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        HexGloopItems.register(modEventBus);
        HexGloopBlocks.register(modEventBus);
    }
}
