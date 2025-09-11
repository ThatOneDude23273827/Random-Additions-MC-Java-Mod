package com.github.thatoneguy2664.randomadditions.item;

import com.github.thatoneguy2664.randomadditions.RandomAdditions;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RandomAdditions.MOD_ID);

    public static final DeferredItem<Item> GILDED_NETHERITE_INGOT = ITEMS.registerItem(
            "gilded_netherite_ingot",
            Item::new,
            new Item.Properties());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
