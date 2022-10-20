/*
 * This file is part of architectury.
 * Copyright (C) 2020, 2021, 2022 architectury
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package dev.architectury.test.tab;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.test.TestMod;
import dev.architectury.test.registry.TestRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class TestCreativeTabs {
    public static final CreativeModeTab TEST_TAB = CreativeTabRegistry.create(new ResourceLocation(TestMod.MOD_ID, "test_tab"),
            () -> new ItemStack(TestRegistries.TEST_ITEM.get()), (featureFlagSet, output) -> {
                output.accept(TestRegistries.TEST_ITEM.get());
                output.accept(TestRegistries.TEST_EQUIPPABLE.get());
                output.accept(TestRegistries.TEST_EDIBLE.get());
                output.accept(TestRegistries.TEST_SPAWN_EGG.get());
                output.accept(TestRegistries.TEST_SPAWN_EGG_2.get());
                output.accept(TestRegistries.TEST_FLUID_BUCKET.get());
                output.accept(TestRegistries.TEST_BLOCK_ITEM.get());
                output.accept(TestRegistries.COLLISION_BLOCK_ITEM.get());
            });
}
