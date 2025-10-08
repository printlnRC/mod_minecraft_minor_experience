package net.println.drillmod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.println.drillmod.DrillMod;

public class  ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEED_STEEL_TOOL = createTag("need_steel_tool");
        public static final TagKey<Block> INCORRECT_FOR_STEEL_TOOL = createTag("incorrect_for_steel_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(DrillMod.MOD_ID, name));
        }

    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(DrillMod.MOD_ID, name));
        }

    }
}
