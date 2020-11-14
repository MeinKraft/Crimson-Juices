package crimsonfluff.crimsonjuices.items;

import crimsonfluff.crimsonjuices.CrimsonJuices;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

public class ItemChorusCookie extends Item {
    public ItemChorusCookie() {
        super(new Properties()
                .group(CrimsonJuices.TAB)
                .food(new Food.Builder()
                        .hunger(2)
                        .saturation(0.5f)
                        .build())
            );
        }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add((new TranslationTextComponent("tip." + CrimsonJuices.MOD_ID+".cookie.chorus")));

        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}