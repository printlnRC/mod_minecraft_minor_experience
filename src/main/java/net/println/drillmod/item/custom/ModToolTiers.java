package net.println.drillmod.item.custom;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.println.drillmod.item.ModItems;
import net.println.drillmod.util.ModTags;

public class ModToolTiers {
    public static final Tier STEEL = new ForgeTier(750, 7, 3f, 16,
            ModTags.Blocks.NEED_STEEL_TOOL, () -> Ingredient.of(ModItems.STEEL_INGOT.get()),
            ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL);
}
