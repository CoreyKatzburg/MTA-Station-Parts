package com.shadow614.mtapack.item;

import com.shadow614.mtapack.MtaPack;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item MTALOGO = registerItem("mtalogo",
            new Item(new FabricItemSettings().group(ModItemGroup.MTA_STATION_PARTS).maxCount(64)));

    public static final Item METROCARD = registerItem("metrocard",
            new Item(new FabricItemSettings().group(ModItemGroup.MTA_STATION_PARTS).maxCount(16)));







    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MtaPack.MOD_ID, name), item);
    }


    public static void registerModItems() {
        MtaPack.LOGGER.debug("Registering mod items for " + MtaPack.MOD_ID);
    }
}