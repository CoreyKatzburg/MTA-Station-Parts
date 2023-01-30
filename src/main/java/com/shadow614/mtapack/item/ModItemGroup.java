package com.shadow614.mtapack.item;

import com.shadow614.mtapack.MtaPack;
import com.shadow614.mtapack.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MTA_STATION_PARTS = FabricItemGroupBuilder.build(new Identifier(MtaPack.MOD_ID, "mta_station_parts"), () -> new ItemStack(ModBlocks.MTALOGO_BLOCK));

    public static final ItemGroup TEST_GROUP = FabricItemGroupBuilder.build(new Identifier(MtaPack.MOD_ID, "test_group"), () -> new ItemStack(ModItems.METROCARD));
}