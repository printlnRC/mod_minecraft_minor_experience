package net.println.drillmod.tab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.println.drillmod.DrillMod;
import net.println.drillmod.block.ModBlocks;
import net.println.drillmod.item.ModItems;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DrillMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> STEEL_ITEMS_TAB = CREATIVE_MODE_TABS.register("steel_items_tabs",
            () -> CreativeModeTab.builder().icon( () -> new ItemStack(ModItems.STEEL_INGOT.get()))
                    .title(Component.translatable("creativetab.drillmod.steel_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.STEEL_INGOT.get());
                        output.accept(ModBlocks.STEEL_BLOCK.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
