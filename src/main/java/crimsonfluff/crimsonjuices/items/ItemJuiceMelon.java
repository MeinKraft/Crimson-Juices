package crimsonfluff.crimsonjuices.items;

import crimsonfluff.crimsonjuices.CrimsonJuices;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.items.ItemHandlerHelper;

import java.util.List;

public class ItemJuiceMelon extends Item {
    public ItemJuiceMelon() {
        super(new Properties()
                .group(CrimsonJuices.TAB)
                .food(new Food.Builder()
                        .hunger(8)
                        .saturation(0.5f)
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
        tooltip.add(new TranslationTextComponent("tip." + CrimsonJuices.MOD_ID + ".juice.melon").mergeStyle(TextFormatting.YELLOW));

        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        if (entityLiving instanceof PlayerEntity) ItemHandlerHelper.giveItemToPlayer((PlayerEntity) entityLiving, new ItemStack(Items.GLASS_BOTTLE));

        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }
}