package com.github.thatoneguy2664.randomadditions.block;

import com.github.thatoneguy2664.randomadditions.RandomAdditions;
import com.github.thatoneguy2664.randomadditions.item.ModItems;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(RandomAdditions.MOD_ID);

    public static final DeferredBlock<Block> GILDED_NETHERITE_BLOCK = registerBlock(
            "gilded_netherite_block",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK));

    public static final DeferredBlock<Block> DYED_PLANKS_BLACK = registerBlock(
            "dyed_planks_black",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.WOOD));

    public static final DeferredBlock<Block> DYED_PLANKS_BLUE = registerBlock(
            "dyed_planks_blue",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.WOOD));

    public static final DeferredBlock<Block> DYED_PLANKS_BROWN = registerBlock(
            "dyed_planks_brown",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.WOOD));

    public static final DeferredBlock<Block> DYED_PLANKS_CYAN = registerBlock(
            "dyed_planks_cyan",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.WOOD));

    public static final DeferredBlock<Block> DYED_PLANKS_GRAY = registerBlock(
            "dyed_planks_gray",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.WOOD));

    public static final DeferredBlock<Block> DYED_PLANKS_GREEN = registerBlock(
            "dyed_planks_green",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.WOOD));

    public static final DeferredBlock<Block> DYED_PLANKS_LIGHTBLUE = registerBlock(
            "dyed_planks_lightblue",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.WOOD));

    public static final DeferredBlock<Block> DYED_PLANKS_LIGHTGRAY = registerBlock(
            "dyed_planks_lightgray",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.WOOD));

    public static final DeferredBlock<Block> DYED_PLANKS_LIME = registerBlock(
            "dyed_planks_lime",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.WOOD));

    public static final DeferredBlock<Block> DYED_PLANKS_MAGENTA = registerBlock(
            "dyed_planks_magenta",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.WOOD));

    public static final DeferredBlock<Block> DYED_PLANKS_ORANGE = registerBlock(
            "dyed_planks_orange",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.WOOD));

    public static final DeferredBlock<Block> DYED_PLANKS_PINK = registerBlock(
            "dyed_planks_pink",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.WOOD));

    public static final DeferredBlock<Block> DYED_PLANKS_PURPLE = registerBlock(
            "dyed_planks_purple",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.WOOD));

    public static final DeferredBlock<Block> DYED_PLANKS_RED = registerBlock(
            "dyed_planks_red",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.WOOD));

    public static final DeferredBlock<Block> DYED_PLANKS_WHITE = registerBlock(
            "dyed_planks_white",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.WOOD));

    public static final DeferredBlock<Block> DYED_PLANKS_YELLOW = registerBlock(
            "dyed_planks_yellow",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.WOOD));

    public static final DeferredBlock<Block> CRACKED_STONE = registerBlock(
            "cracked_stone",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE));


    private static <B extends Block> DeferredBlock<B> registerBlock(String name, Function<BlockBehaviour.Properties, ? extends B> blockFactory, BlockBehaviour.Properties blockProperties) {
        DeferredBlock<B> block = BLOCKS.registerBlock(name, blockFactory, blockProperties);
        registerBlockItem(name, block);
        return block;
    }

    private static <B extends Block> void registerBlockItem(String name, DeferredBlock<B> block) {
        ModItems.ITEMS.registerSimpleBlockItem(name, block);
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}