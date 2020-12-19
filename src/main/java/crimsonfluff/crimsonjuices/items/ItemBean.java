package crimsonfluff.crimsonjuices.items;

import crimsonfluff.crimsonjuices.CrimsonJuices;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

public class ItemBean extends Item {

    public ItemBean() {
        super(new Properties()
                .group(CrimsonJuices.TAB)
                .food(new Food.Builder()
                        .hunger(2)
                        .saturation(1)
                        .fastToEat()
                        .setAlwaysEdible()
                        .build())
            );
        }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TranslationTextComponent("tip." + CrimsonJuices.MOD_ID + ".bean").mergeStyle(TextFormatting.YELLOW));

        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public int getUseDuration(ItemStack stack) { return 5; }
}