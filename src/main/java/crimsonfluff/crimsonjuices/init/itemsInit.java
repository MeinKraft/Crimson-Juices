package crimsonfluff.crimsonjuices.init;

import crimsonfluff.crimsonjuices.CrimsonJuices;
import crimsonfluff.crimsonjuices.items.*;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class itemsInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CrimsonJuices.MOD_ID);

    // Items
    // Jelly Beans
    public static final RegistryObject<Item> BEAN_GREEN = ITEMS.register("jelly_bean_green", ItemBean::new);
    public static final RegistryObject<Item> BEAN_BLUE = ITEMS.register("jelly_bean_blue", ItemBean::new);
    public static final RegistryObject<Item> BEAN_RED = ITEMS.register("jelly_bean_red", ItemBean::new);
    public static final RegistryObject<Item> BEAN_YELLOW = ITEMS.register("jelly_bean_yellow", ItemBean::new);

    // Juices
    public static final RegistryObject<Item> MELON_JUICE = ITEMS.register("juice_melon", ItemJuiceMelon::new);
    public static final RegistryObject<Item> APPLE_JUICE = ITEMS.register("juice_apple", ItemJuiceApple::new);
    public static final RegistryObject<Item> CARROT_JUICE = ITEMS.register("juice_carrot", ItemJuiceCarrot::new);
    public static final RegistryObject<Item> BEET_JUICE = ITEMS.register("juice_beet", ItemJuiceBeet::new);
    public static final RegistryObject<Item> PUMPKIN_JUICE = ITEMS.register("juice_pumpkin", ItemJuicePumpkin::new);
    public static final RegistryObject<Item> POTATO_JUICE = ITEMS.register("juice_potato", ItemJuicePotato::new);
    public static final RegistryObject<Item> CHORUS_JUICE = ITEMS.register("juice_chorus", ItemJuiceChorus::new);
    public static final RegistryObject<Item> WHEAT_JUICE = ITEMS.register("juice_wheat", ItemJuiceWheat::new);
    public static final RegistryObject<Item> SWEETBERRY_JUICE = ITEMS.register("juice_sweetberry", ItemJuiceSweetberry::new);
    public static final RegistryObject<Item> CACTUS_JUICE = ITEMS.register("juice_cactus", ItemJuiceCactus::new);

    // Cookies
    public static final RegistryObject<Item> CHORUS_COOKIE = ITEMS.register("cookie_chorus", ItemChorusCookie::new);
}
