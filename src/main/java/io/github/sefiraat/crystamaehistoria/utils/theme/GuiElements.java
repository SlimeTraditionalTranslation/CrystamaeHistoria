package io.github.sefiraat.crystamaehistoria.utils.theme;

import io.github.sefiraat.crystamaehistoria.slimefun.tools.stave.SpellSlot;
import io.github.sefiraat.crystamaehistoria.utils.Skulls;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.experimental.UtilityClass;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.inventory.ItemStack;

import java.text.MessageFormat;

@UtilityClass
public class GuiElements {

    public static final CustomItemStack MENU_BACKGROUND = new CustomItemStack(
        Material.BLACK_STAINED_GLASS_PANE,
        " "
    );

    public static final CustomItemStack MENU_BACKGROUND_INPUT = new CustomItemStack(
        Material.LIGHT_BLUE_STAINED_GLASS_PANE,
        ChatColor.BLUE + "輸入"
    );

    public static final CustomItemStack MENU_STAVE_INPUT = new CustomItemStack(
        Material.LIGHT_BLUE_STAINED_GLASS_PANE,
        ChatColor.BLUE + "法杖輸入"
    );

    public static final CustomItemStack MENU_REMOVE_PLATES = new CustomItemStack(
        Material.ORANGE_STAINED_GLASS_PANE,
        ChatColor.BLUE + "移除法術板"
    );

    public static final CustomItemStack MENU_SAVE_STAVE = new CustomItemStack(
        Material.GREEN_STAINED_GLASS_PANE,
        ChatColor.BLUE + "儲存法杖配置"
    );

    public static final CustomItemStack MENU_BACKGROUND_OUTPUT = new CustomItemStack(
        Material.ORANGE_STAINED_GLASS_PANE,
        ChatColor.RED + "輸出"
    );

    public static final CustomItemStack MENU_DIVIDER = new CustomItemStack(
        Material.LIME_STAINED_GLASS_PANE,
        " "
    );

    public static final CustomItemStack TIER_INDICATOR_1 = new CustomItemStack(
        Skulls.GUI_TIER_NUMBER_1.getPlayerHead(),
        ThemeType.CLICK_INFO.getColor() + "等級 1"
    );

    public static final CustomItemStack TIER_INDICATOR_2 = new CustomItemStack(
        Skulls.GUI_TIER_NUMBER_2.getPlayerHead(),
        ThemeType.CLICK_INFO.getColor() + "等級 2"
    );

    public static final CustomItemStack TIER_INDICATOR_3 = new CustomItemStack(
        Skulls.GUI_TIER_NUMBER_3.getPlayerHead(),
        ThemeType.CLICK_INFO.getColor() + "等級 3"
    );

    public static final CustomItemStack TIER_INDICATOR_4 = new CustomItemStack(
        Skulls.GUI_TIER_NUMBER_4.getPlayerHead(),
        ThemeType.CLICK_INFO.getColor() + "等級 4"
    );

    public static final CustomItemStack TIER_INDICATOR_5 = new CustomItemStack(
        Skulls.GUI_TIER_NUMBER_5.getPlayerHead(),
        ThemeType.CLICK_INFO.getColor() + "等級 5"
    );

    public static ItemStack getUniqueStoryIcon(Material material) {
        return ThemeType.themedItemStack(
            material,
            ThemeType.RARITY_UNIQUE,
            ThemeType.toTitleCase(material.toString()),
            "這個獨特故事已被",
            "紀錄."
        );
    }

    public static ItemStack getStoryNotUnlockedIcon(Material material) {
        return ThemeType.themedItemStack(
            Material.BARRIER,
            ThemeType.RESEARCH,
            ThemeType.toTitleCase(material.toString()),
            MessageFormat.format("{0}{1}LOCKED", ThemeType.RESEARCH.getColor(), ChatColor.BOLD),
            "這個獨特故事還沒有",
            "解鎖.",
            "故事將會在你第一次",
            "記錄所需方塊時解鎖."
        );
    }

    public static ItemStack getSpellNotUnlockedIcon(String id) {
        return ThemeType.themedItemStack(
            Material.BARRIER,
            ThemeType.RESEARCH,
            ThemeType.toTitleCase(id),
            MessageFormat.format("{0}{1}LOCKED", ThemeType.RESEARCH.getColor(), ChatColor.BOLD),
            "這個法術尚未解鎖.",
            "法術將會在你第一次",
            "在液化池中為板子填",
            "充時解鎖."
        );
    }

    public static CustomItemStack getSpellSlotPane(SpellSlot spellSlot) {
        return new CustomItemStack(
            Material.RED_STAINED_GLASS_PANE,
            ChatColor.GRAY + "法術欄位 : " + ThemeType.toTitleCase(spellSlot.name())
        );
    }

    public static CustomItemStack getDirectionalSlotPane(BlockFace blockFace, boolean active) {
        Material material = active ? Material.RED_STAINED_GLASS_PANE : Material.GREEN_STAINED_GLASS_PANE;
        return new CustomItemStack(
            material,
            ChatColor.GRAY + "設定方向: " + blockFace.name()
        );
    }
}
