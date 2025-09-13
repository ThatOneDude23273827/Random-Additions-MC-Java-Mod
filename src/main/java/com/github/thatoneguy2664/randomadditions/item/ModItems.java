package com.github.thatoneguy2664.randomadditions.item;

import com.github.thatoneguy2664.randomadditions.RandomAdditions;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RandomAdditions.MOD_ID);

    // MATERIALS

    public static final DeferredItem<Item> GILDED_NETHERITE_INGOT = ITEMS.registerItem(
            "gilded_netherite_ingot",
            Item::new,
            new Item.Properties());

    // END MATERIALS
    // FOOD

    public static final DeferredItem<Item> TACO = ITEMS.registerItem(
            "taco",
            Item::new,
            new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(
                    RandomAdditions.MOD_ID,
                    "taco")))
            .food(ModFoodProperties.TACO)
            .component(
                    DataComponents.CONSUMABLE,
                    Consumable.builder()
                            .consumeSeconds(2f)
                            .animation(ItemUseAnimation.EAT)
                            .hasConsumeParticles(true)
                            .onConsume(new ApplyStatusEffectsConsumeEffect(
                                    new MobEffectInstance(
                                            MobEffects.REGENERATION, 60, 0), 0.9735f))
                            .build())
    );

    // END FOOD

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
