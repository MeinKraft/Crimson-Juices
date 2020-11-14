package crimsonfluff.crimsonjuices.items;

import crimsonfluff.crimsonjuices.CrimsonJuices;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.List;

public class ItemJuiceCarrot extends Item {
    public ItemJuiceCarrot() {
        super(new Properties()
                .group(CrimsonJuices.TAB)
                .food(new Food.Builder()
                        .hunger(4)
                        .saturation(1.0f)
                        .build())
            );
        }

    @Override
    public UseAction getUseAction(ItemStack par1ItemStack) { return UseAction.DRINK; }

    @Override
    public net.minecraft.util.SoundEvent getEatSound() { return net.minecraft.util.SoundEvents.ENTITY_GENERIC_DRINK; }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add((new TranslationTextComponent("tip." + CrimsonJuices.MOD_ID+".juice.carrot")));

        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}