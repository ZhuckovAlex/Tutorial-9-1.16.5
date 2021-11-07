package net.project.project.item;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.project.project.Project;
import net.project.project.block.ModBlocks;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Project.MOD_ID);

    public static final RegistryObject<Item> TUTORIAL_ITEM = ITEMS.register("tutorial_item",
            () -> new Item(new Item.Properties().food(new Food.Builder().hunger(20).saturation(20).build()).group(ModItemGroup.CARROT)));
    public static final RegistryObject<Item> FIREWOOD_SAPLING = ITEMS.register("firewood_sapling",
            () -> new BlockItem(ModBlocks.FIREWOOD_SAPLING.get(), new Item.Properties()
                    .group(ModItemGroup.IRON_BLOCK)));
    public static final RegistryObject<Item> FIREWOOD_LEAVES = ITEMS.register("firewood_leaves",
            () -> new BlockItem(ModBlocks.FIREWOOD_LEAVES.get(), new Item.Properties()
                    .group(ModItemGroup.IRON_BLOCK)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
