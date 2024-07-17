package net.ruwayd.bestmod.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ruwayd.bestmod.BestMod;
import net.ruwayd.bestmod.block.ModBlocks;

public class ModItems {

    // Registering new items here
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));

  /*  // Method to add items to the creative tab
    private static void addItemsToCreativeTab(FabricItemGroupEntries entries) {
        entries.add(RUBY);
       entries.add(ModBlocks.Ruby_Block);
    } */

    // Method to register an item

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(BestMod.MOD_ID, name), item);
    }

    // Method to register all mod items
    public static void registerModItems() {
  //      ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(ModItems::addItemsToCreativeTab);
    }
}
