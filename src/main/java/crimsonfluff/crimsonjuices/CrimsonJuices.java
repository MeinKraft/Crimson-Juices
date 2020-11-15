package crimsonfluff.crimsonjuices;

import crimsonfluff.crimsonjuices.init.itemsInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("crimsonjuices")
public class CrimsonJuices
{
    public static final String MOD_ID = "crimsonjuices";
    //public static final Logger LOGGER = LogManager.getLogger("crimsonjuices");
    final IEventBus MOD_EVENTBUS = FMLJavaModLoadingContext.get().getModEventBus();

    public CrimsonJuices() {
        MOD_EVENTBUS.addListener(this::setup);
        MOD_EVENTBUS.addListener(this::doClientStuff);

        itemsInit.ITEMS.register(MOD_EVENTBUS);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLClientSetupEvent event) {}
    private void doClientStuff(final FMLClientSetupEvent event) {}

    public static final ItemGroup TAB = new ItemGroup("crimsonjuices") {
        @OnlyIn(Dist.CLIENT)
        @Override
        public ItemStack createIcon() { return new ItemStack(Items.MELON_SLICE); }
    };
}