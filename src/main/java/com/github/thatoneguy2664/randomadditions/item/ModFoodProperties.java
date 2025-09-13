package com.github.thatoneguy2664.randomadditions.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties TACO = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(11.5f)
            .alwaysEdible()
            .build();
}
