package com.shadow614.mtapack.block;

import com.shadow614.mtapack.MtaPack;
import com.shadow614.mtapack.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block MTALOGO_BLOCK = registerBlock("mtalogo_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3.5f).resistance(6.0f)), ModItemGroup.MTA_STATION_PARTS);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(MtaPack.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(MtaPack.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab).maxCount(64)));
    }

    public static void registerModBlocks() {
        MtaPack.LOGGER.debug("Registering ModBlocks for " + MtaPack.MOD_ID);
    }
}