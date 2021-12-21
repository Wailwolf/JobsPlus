package me.daqem.jobsplus.data;

import me.daqem.jobsplus.JobsPlus;
import me.daqem.jobsplus.init.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Objects;

public class ItemModels extends ItemModelProvider {

    public ItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, JobsPlus.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        handheld(ModItems.SMALL_BACKPACK.get());
        handheld(ModItems.MEDIUM_BACKPACK.get());
        handheld(ModItems.LARGE_BACKPACK.get());
        handheld(ModItems.HUGE_BACKPACK.get());
        handheld(ModItems.ENDER_BACKPACK.get());
        handheld(ModItems.EXP_JAR.get());
        handheld(ModItems.MINERS_HAMMER_LEVEL_1.get());
        handheld(ModItems.MINERS_HAMMER_LEVEL_2.get());
        handheld(ModItems.MINERS_HAMMER_LEVEL_3.get());
        handheld(ModItems.MINERS_HAMMER_LEVEL_4.get());
        handheld(ModItems.DIGGERS_EXCAVATOR_LEVEL_1.get());
        handheld(ModItems.DIGGERS_EXCAVATOR_LEVEL_2.get());
        handheld(ModItems.DIGGERS_EXCAVATOR_LEVEL_3.get());
        handheld(ModItems.DIGGERS_EXCAVATOR_LEVEL_4.get());
        handheld(ModItems.LUMBERJACK_AXE_LEVEL_1.get());
        handheld(ModItems.LUMBERJACK_AXE_LEVEL_2.get());
        handheld(ModItems.LUMBERJACK_AXE_LEVEL_3.get());
        handheld(ModItems.LUMBERJACK_AXE_LEVEL_4.get());

        generated(ModItems.OBSIDIAN_HELMET.get());
        generated(ModItems.OBSIDIAN_CHESTPLATE.get());
        generated(ModItems.OBSIDIAN_LEGGINGS.get());
        generated(ModItems.OBSIDIAN_BOOTS.get());
        generated(ModItems.REINFORCED_IRON_HELMET.get());
        generated(ModItems.REINFORCED_IRON_CHESTPLATE.get());
        generated(ModItems.REINFORCED_IRON_LEGGINGS.get());
        generated(ModItems.REINFORCED_IRON_BOOTS.get());
        generated(ModItems.REINFORCED_DIAMOND_HELMET.get());
        generated(ModItems.REINFORCED_DIAMOND_CHESTPLATE.get());
        generated(ModItems.REINFORCED_DIAMOND_LEGGINGS.get());
        generated(ModItems.REINFORCED_DIAMOND_BOOTS.get());
        generated(ModItems.REINFORCED_NETHERITE_HELMET.get());
        generated(ModItems.REINFORCED_NETHERITE_CHESTPLATE.get());
        generated(ModItems.REINFORCED_NETHERITE_LEGGINGS.get());
        generated(ModItems.REINFORCED_NETHERITE_BOOTS.get());
    }

    private void handheld(Item item) {
        String name = Objects.requireNonNull(item.getRegistryName()).getPath();
        singleTexture(name, mcLoc("item/handheld"), "layer0", modLoc("item/" + name));

    }

    private void generated(Item item) {
        String name = Objects.requireNonNull(item.getRegistryName()).getPath();
        singleTexture(name, ResourceLocation.tryParse("item/generated"), "layer0", modLoc("item/" + name));

    }
}
