package com.github.thatoneguy2664.randomadditions.item;

import com.github.thatoneguy2664.randomadditions.RandomAdditions;
import com.github.thatoneguy2664.randomadditions.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RandomAdditions.MOD_ID);

    public static final Supplier<CreativeModeTab> RANDOM_ADDITIONS_TAB = CREATIVE_MODE_TAB.register(
            "random_additions_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.GILDED_NETHERITE_BLOCK.get()))
                    .title(Component.translatable("creativetab.randomadditions.all"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.GILDED_NETHERITE_INGOT);
                        output.accept(ModBlocks.GILDED_NETHERITE_BLOCK);
                        output.accept(ModBlocks.DYED_PLANKS_BLACK);
                        output.accept(ModBlocks.DYED_PLANKS_BLUE);
                        output.accept(ModBlocks.DYED_PLANKS_BROWN);
                        output.accept(ModBlocks.DYED_PLANKS_CYAN);
                        output.accept(ModBlocks.DYED_PLANKS_GRAY);
                        output.accept(ModBlocks.DYED_PLANKS_GREEN);
                        output.accept(ModBlocks.DYED_PLANKS_LIGHTBLUE);
                        output.accept(ModBlocks.DYED_PLANKS_LIGHTGRAY);
                        output.accept(ModBlocks.DYED_PLANKS_LIME);
                        output.accept(ModBlocks.DYED_PLANKS_MAGENTA);
                        output.accept(ModBlocks.DYED_PLANKS_ORANGE);
                        output.accept(ModBlocks.DYED_PLANKS_PINK);
                        output.accept(ModBlocks.DYED_PLANKS_PURPLE);
                        output.accept(ModBlocks.DYED_PLANKS_RED);
                        output.accept(ModBlocks.DYED_PLANKS_WHITE);
                        output.accept(ModBlocks.DYED_PLANKS_YELLOW);
                        output.accept(ModBlocks.CRACKED_STONE);
                        output.accept(ModItems.TACO);
                    }).build());

    public static void register(IEventBus eventbus) {
        CREATIVE_MODE_TAB.register(eventbus);
    }
}
