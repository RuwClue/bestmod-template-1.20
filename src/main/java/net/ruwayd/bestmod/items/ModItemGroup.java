package net.ruwayd.bestmod.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup; // Make sure to import ItemGroup
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.ruwayd.bestmod.BestMod;
import net.minecraft.registry.Registry;
import net.ruwayd.bestmod.block.ModBlocks;


public class ModItemGroup {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(BestMod.MOD_ID, "ruby"), FabricItemGroup.builder()
                    .displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY))
                    .entries((displayContext, entries) -> {

                        /*Add new entry here*/
                    entries.add(ModItems.RUBY);
                    entries.add(ModBlocks.Ruby_Block);

                    }).build());


    public static void registerItemGroups() {

    }
}
