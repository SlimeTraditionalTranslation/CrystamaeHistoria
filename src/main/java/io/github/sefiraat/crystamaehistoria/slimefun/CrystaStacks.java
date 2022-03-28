package io.github.sefiraat.crystamaehistoria.slimefun;

import io.github.sefiraat.crystamaehistoria.slimefun.items.artistic.MagicPaintbrush;
import io.github.sefiraat.crystamaehistoria.utils.GeneralUtils;
import io.github.sefiraat.crystamaehistoria.utils.Skulls;
import io.github.sefiraat.crystamaehistoria.utils.theme.ThemeType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.text.MessageFormat;

@UtilityClass
public class CrystaStacks {

    // Materials
    public static final SlimefunItemStack CRYSTAL_BLANK;
    public static final SlimefunItemStack CRYSTAL_POLYCHROMATIC;
    public static final SlimefunItemStack CRYSTAL_KALEIDOSCOPIC;
    public static final SlimefunItemStack CRYSTAL_MOTLEY;
    public static final SlimefunItemStack CRYSTAL_PRISMATIC;
    public static final SlimefunItemStack AMALGAMATE_DUST_COMMON;
    public static final SlimefunItemStack AMALGAMATE_DUST_UNCOMMON;
    public static final SlimefunItemStack AMALGAMATE_DUST_RARE;
    public static final SlimefunItemStack AMALGAMATE_DUST_EPIC;
    public static final SlimefunItemStack AMALGAMATE_DUST_MYTHICAL;
    public static final SlimefunItemStack AMALGAMATE_DUST_UNIQUE;
    public static final SlimefunItemStack AMALGAMATE_INGOT_COMMON;
    public static final SlimefunItemStack AMALGAMATE_INGOT_UNCOMMON;
    public static final SlimefunItemStack AMALGAMATE_INGOT_RARE;
    public static final SlimefunItemStack AMALGAMATE_INGOT_EPIC;
    public static final SlimefunItemStack AMALGAMATE_INGOT_MYTHICAL;
    public static final SlimefunItemStack AMALGAMATE_INGOT_UNIQUE;
    public static final SlimefunItemStack ARCANE_SIGIL;
    public static final SlimefunItemStack IMBUED_GLASS;
    public static final SlimefunItemStack UNCANNY_PEARL;
    public static final SlimefunItemStack GILDED_PEARL;
    public static final SlimefunItemStack BASIC_FIBRES;
    public static final SlimefunItemStack POWDERED_ESSENCE;
    public static final SlimefunItemStack MAGICAL_MILK;

    // Runes
    public static final SlimefunItemStack RUNE_BEAST;
    public static final SlimefunItemStack RUNE_BEGINNING;
    public static final SlimefunItemStack RUNE_MOON;
    public static final SlimefunItemStack RUNE_GATE;
    public static final SlimefunItemStack RUNE_TRUE_EARTH;
    public static final SlimefunItemStack RUNE_CHANGE;
    public static final SlimefunItemStack RUNE_NIGHT;
    public static final SlimefunItemStack RUNE_BLACK;
    public static final SlimefunItemStack RUNE_TRUE_HOLY;
    public static final SlimefunItemStack RUNE_DRAGON;
    public static final SlimefunItemStack RUNE_TRUE_WATER;
    public static final SlimefunItemStack RUNE_SOVEREIGN;
    public static final SlimefunItemStack RUNE_SUN;
    public static final SlimefunItemStack RUNE_DAWN;
    public static final SlimefunItemStack RUNE_TWILIGHT;
    public static final SlimefunItemStack RUNE_TRUE_FIRE;
    public static final SlimefunItemStack RUNE_CIRCLE;
    public static final SlimefunItemStack RUNE_BLINKING;
    public static final SlimefunItemStack RUNE_SOUL;
    public static final SlimefunItemStack RUNE_PUNISHMENT;
    public static final SlimefunItemStack RUNE_TRUE_LIGHTNING;
    public static final SlimefunItemStack RUNE_EIGHTFOLD;
    public static final SlimefunItemStack RUNE_CHARM;
    public static final SlimefunItemStack RUNE_TRUE_WIND;
    public static final SlimefunItemStack RUNE_BLACK_SWORD;
    public static final SlimefunItemStack RUNE_BRIGHT_SHIELD;


    // Artistic
    public static final SlimefunItemStack PAINT_BRUSH_BLACK_100;
    public static final SlimefunItemStack PAINT_BRUSH_BLUE_100;
    public static final SlimefunItemStack PAINT_BRUSH_BROWN_100;
    public static final SlimefunItemStack PAINT_BRUSH_CYAN_100;
    public static final SlimefunItemStack PAINT_BRUSH_GRAY_100;
    public static final SlimefunItemStack PAINT_BRUSH_GREEN_100;
    public static final SlimefunItemStack PAINT_BRUSH_LIGHT_BLUE_100;
    public static final SlimefunItemStack PAINT_BRUSH_LIGHT_GRAY_100;
    public static final SlimefunItemStack PAINT_BRUSH_LIME_100;
    public static final SlimefunItemStack PAINT_BRUSH_MAGENTA_100;
    public static final SlimefunItemStack PAINT_BRUSH_ORANGE_100;
    public static final SlimefunItemStack PAINT_BRUSH_PINK_100;
    public static final SlimefunItemStack PAINT_BRUSH_PURPLE_100;
    public static final SlimefunItemStack PAINT_BRUSH_RED_100;
    public static final SlimefunItemStack PAINT_BRUSH_WHITE_100;
    public static final SlimefunItemStack PAINT_BRUSH_YELLOW_100;
    public static final SlimefunItemStack PAINT_BRUSH_BLACK_1000;
    public static final SlimefunItemStack PAINT_BRUSH_BLUE_1000;
    public static final SlimefunItemStack PAINT_BRUSH_BROWN_1000;
    public static final SlimefunItemStack PAINT_BRUSH_CYAN_1000;
    public static final SlimefunItemStack PAINT_BRUSH_GRAY_1000;
    public static final SlimefunItemStack PAINT_BRUSH_GREEN_1000;
    public static final SlimefunItemStack PAINT_BRUSH_LIGHT_BLUE_1000;
    public static final SlimefunItemStack PAINT_BRUSH_LIGHT_GRAY_1000;
    public static final SlimefunItemStack PAINT_BRUSH_LIME_1000;
    public static final SlimefunItemStack PAINT_BRUSH_MAGENTA_1000;
    public static final SlimefunItemStack PAINT_BRUSH_ORANGE_1000;
    public static final SlimefunItemStack PAINT_BRUSH_PINK_1000;
    public static final SlimefunItemStack PAINT_BRUSH_PURPLE_1000;
    public static final SlimefunItemStack PAINT_BRUSH_RED_1000;
    public static final SlimefunItemStack PAINT_BRUSH_WHITE_1000;
    public static final SlimefunItemStack PAINT_BRUSH_YELLOW_1000;
    public static final SlimefunItemStack PAINT_BRUSH_INFINITE;
    public static final SlimefunItemStack MYSTICAL_PIGMENTATO;
    public static final SlimefunItemStack MYSTICAL_TINTANNO;
    public static final SlimefunItemStack BODY_STAND;
    public static final SlimefunItemStack MIND_STAND;
    public static final SlimefunItemStack SOUL_STAND;
    public static final SlimefunItemStack MYSTICAL_ATTITUDINIZER;
    public static final SlimefunItemStack IMBUED_STAND;
    public static final SlimefunItemStack POSE_CHANGER;
    public static final SlimefunItemStack POSE_CLONER;

    // Exalted
    public static final SlimefunItemStack EXALTED_BEACON;
    public static final SlimefunItemStack EXALTED_BAELFIRE;
    public static final SlimefunItemStack EXALTED_FERTILITY_PHARO;
    public static final SlimefunItemStack EXALTED_FERTILITY_TOTEM;
    public static final SlimefunItemStack EXALTED_HARVESTER;
    public static final SlimefunItemStack EXALTED_AGRONOMIST;
    public static final SlimefunItemStack EXALTED_DAWN;
    public static final SlimefunItemStack EXALTED_DUSK;
    public static final SlimefunItemStack EXALTED_SUN;
    public static final SlimefunItemStack EXALTED_STORM;
    public static final SlimefunItemStack EXALTED_SEA_BREEZE;

    // Gadgets
    public static final SlimefunItemStack ABSTRACTION_LAMP;
    public static final SlimefunItemStack DISPERSION_LAMP;
    public static final SlimefunItemStack EXODUS_LAMP;
    public static final SlimefunItemStack INVERSION_VACUUM;
    public static final SlimefunItemStack ANTIPODAL_VACUUM;
    public static final SlimefunItemStack COUNTERPOLE_VACUUM;
    public static final SlimefunItemStack CURSED_EARTH;
    public static final SlimefunItemStack DREADFUL_DIRT;
    public static final SlimefunItemStack SOULFILLED_SOIL;
    public static final SlimefunItemStack SEARING_PLATE;
    public static final SlimefunItemStack DOOMED_PLATE;
    public static final SlimefunItemStack EVISCERATING_PLATE;
    public static final SlimefunItemStack SHREDDING_PLATE;
    public static final SlimefunItemStack TRAP_PLATE;
    public static final SlimefunItemStack EXP_COLLECTOR_BASIC;
    public static final SlimefunItemStack EXP_COLLECTOR_INFUSED;
    public static final SlimefunItemStack EXP_COLLECTOR_ARCANE;
    public static final SlimefunItemStack ENDER_INHIBITOR_BASIC;
    public static final SlimefunItemStack ENDER_INHIBITOR_ADVANCED;
    public static final SlimefunItemStack MOB_CANDLE_DIM;
    public static final SlimefunItemStack MOB_CANDLE_BRIGHT;
    public static final SlimefunItemStack MOB_CANDLE_SCINTILLATING;
    public static final SlimefunItemStack MOB_CANDLE_CORUSCATING;
    public static final SlimefunItemStack MYSTERIOUS_POTTED_PLANT;
    public static final SlimefunItemStack MYSTERIOUS_PLANT;
    public static final SlimefunItemStack MYSTERIOUS_GLASS;
    public static final SlimefunItemStack MYSTERIOUS_WOOL;
    public static final SlimefunItemStack MYSTERIOUS_TERRACOTTA;
    public static final SlimefunItemStack MYSTERIOUS_GLAZED_TERRACOTTA;
    public static final SlimefunItemStack MYSTERIOUS_CONCRETE;
    public static final SlimefunItemStack GREEN_HOUSE_GLASS;
    public static final SlimefunItemStack GREEN_HOUSE_GLASS_FOCUSED;
    public static final SlimefunItemStack GREEN_HOUSE_GLASS_MAGNIFYING;
    public static final SlimefunItemStack TROPHY_STAND;
    public static final SlimefunItemStack EXALTATION_STAND;
    public static final SlimefunItemStack WAYSTONE;
    public static final SlimefunItemStack ANGEL_BLOCK;
    public static final SlimefunItemStack PHILOSOPHERS_SPRAY;
    public static final SlimefunItemStack GLASS_OF_MILK;
    public static final SlimefunItemStack FRAGMENTED_VOID;
    public static final SlimefunItemStack SHATTERED_VOID;

    // Mechanisms
    public static final SlimefunItemStack CHRONICLER_PANEL_1;
    public static final SlimefunItemStack CHRONICLER_PANEL_2;
    public static final SlimefunItemStack CHRONICLER_PANEL_3;
    public static final SlimefunItemStack CHRONICLER_PANEL_4;
    public static final SlimefunItemStack CHRONICLER_PANEL_5;
    public static final SlimefunItemStack REALISATION_ALTAR_1;
    public static final SlimefunItemStack REALISATION_ALTAR_2;
    public static final SlimefunItemStack REALISATION_ALTAR_3;
    public static final SlimefunItemStack REALISATION_ALTAR_4;
    public static final SlimefunItemStack REALISATION_ALTAR_5;
    public static final SlimefunItemStack LIQUEFACTION_BASIN_1;
    public static final SlimefunItemStack LIQUEFACTION_BASIN_2;
    public static final SlimefunItemStack LIQUEFACTION_BASIN_3;
    public static final SlimefunItemStack LIQUEFACTION_BASIN_4;
    public static final SlimefunItemStack LIQUEFACTION_BASIN_5;
    public static final SlimefunItemStack STAVE_CONFIGURATOR;
    public static final SlimefunItemStack PRISMATIC_GILDER;

    // Tools
    public static final SlimefunItemStack INERT_PLATE;
    public static final SlimefunItemStack CHARGED_PLATE;
    public static final SlimefunItemStack STAVE_BASIC;
    public static final SlimefunItemStack STAVE_ADVANCED;
    public static final SlimefunItemStack STAVE_ARCANE;
    public static final SlimefunItemStack REFRACTING_LENS;
    public static final SlimefunItemStack THAUMATURGIC_SALTS;
    public static final SlimefunItemStack CRYSTA_RECALL_LATTICE;
    public static final SlimefunItemStack EPHEMERAL_CRAFT_TABLE;
    public static final SlimefunItemStack EPHEMERAL_WORKBENCH;
    public static final SlimefunItemStack LUMINESCENCE_SCOOP;
    public static final SlimefunItemStack BRILLIANCE_SCOOP;
    public static final SlimefunItemStack LUSTRE_SCOOP;
    public static final SlimefunItemStack RADIANCE_SCOOP;
    public static final SlimefunItemStack CONNECTING_COMPASS;
    public static final SlimefunItemStack SPIRITUAL_SILKEN;
    public static final SlimefunItemStack INCORPOREAL_SILKEN;
    public static final SlimefunItemStack SIMPLE_DISPLACER;
    public static final SlimefunItemStack ARCANE_DISPLACER;
    public static final SlimefunItemStack SPONGE_BALMY;
    public static final SlimefunItemStack SPONGE_SEARING;
    public static final SlimefunItemStack SPONGE_SUPER_MASSIVE;
    public static final SlimefunItemStack SLEEPING_BAG;
    public static final SlimefunItemStack DISPLACED_VOID;
    public static final SlimefunItemStack SATCHEL_1;
    public static final SlimefunItemStack SATCHEL_2;
    public static final SlimefunItemStack SATCHEL_3;
    public static final SlimefunItemStack SATCHEL_4;
    public static final SlimefunItemStack SATCHEL_5;
    public static final SlimefunItemStack SATCHEL_6;
    public static final SlimefunItemStack CARGO_COVER;
    public static final SlimefunItemStack ENERGY_NET_COVER;
    public static final SlimefunItemStack NETWORKS_COVER;

    // Uniques
    public static final SlimefunItemStack STORY_TROPHY;
    public static final SlimefunItemStack SPELL_TROPHY;
    public static final SlimefunItemStack GILDING_TROPHY;
    public static final SlimefunItemStack CHRISTMAS_TROPHY;
    public static final SlimefunItemStack VALENTINES_TROPHY;
    public static final SlimefunItemStack BIRTHDAY_TROPHY_CHEESY;
    public static final SlimefunItemStack BIRTHDAY_TROPHY_BWHITE;
    public static final SlimefunItemStack BIRTHDAY_TROPHY_DECOY;
    public static final SlimefunItemStack BIRTHDAY_TROPHY_ODDISH;

    // Recipe Types
    public static final ItemStack RECIPE_TYPE_LIQUEFACTION_CRAFTING;
    public static final ItemStack RECIPE_TYPE_LIQUEFACTION_SPELL;
    public static final ItemStack RECIPE_TYPE_NETHER_DRAINING;
    public static final ItemStack RECIPE_TYPE_REALISATION_ALTAR_NORMAL;
    public static final ItemStack RECIPE_TYPE_REALISATION_ALTAR_SIGIL;

    static {

        // Materials

        CRYSTAL_BLANK = ThemeType.themedSlimefunItemStack(
            "CRY_CRYSTAL_BLANK",
            Skulls.CRYSTAL_CLEAR.getPlayerHead(),
            ThemeType.CRAFTING,
            "Blank Crystal",
            "A Crystal with all of it's Crysta drained."
        );

        CRYSTAL_POLYCHROMATIC = ThemeType.themedSlimefunItemStack(
            "CRY_CRYSTAL_POLYCHROMATIC",
            Skulls.CRYSTAL_POLYCHROME.getPlayerHead(),
            ThemeType.CRAFTING,
            "Polychromatic Crystal",
            "A Crystal shell with multiple crysta",
            "types infused within."
        );

        CRYSTAL_KALEIDOSCOPIC = ThemeType.themedSlimefunItemStack(
            "CRY_CRYSTAL_KALEIDOSCOPIC",
            Skulls.CRYSTAL_KALEIDOSCOPIC.getPlayerHead(),
            ThemeType.CRAFTING,
            "Kaleidoscopic Crystal",
            "A Crystal shell with multiple crysta",
            "types infused within."
        );

        CRYSTAL_MOTLEY = ThemeType.themedSlimefunItemStack(
            "CRY_CRYSTAL_MOTLEY",
            Skulls.CRYSTAL_MOTLEY.getPlayerHead(),
            ThemeType.CRAFTING,
            "Motley Crystal",
            "A Crystal shell with multiple crysta",
            "types infused within."
        );

        CRYSTAL_PRISMATIC = ThemeType.themedSlimefunItemStack(
            "CRY_CRYSTAL_PRISMATIC",
            Skulls.CRYSTAL_PRISMATIC.getPlayerHead(),
            ThemeType.CRAFTING,
            "Prismatic Crystal",
            "This crystal has so much magic it's",
            "near to bursting."
        );

        AMALGAMATE_DUST_COMMON = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_DUST_COMMON",
            new ItemStack(Material.GLOWSTONE_DUST),
            ThemeType.CRAFTING,
            "汞齊粉 (常見)",
            "一種結合所有魔法種類的粉."
        );

        AMALGAMATE_DUST_UNCOMMON = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_DUST_UNCOMMON",
            new ItemStack(Material.GLOWSTONE_DUST),
            ThemeType.CRAFTING,
            "汞齊粉 (不常見)",
            "一種結合所有魔法種類的粉."
        );

        AMALGAMATE_DUST_RARE = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_DUST_RARE",
            new ItemStack(Material.GLOWSTONE_DUST),
            ThemeType.CRAFTING,
            "汞齊粉 (稀有)",
            "一種結合所有魔法種類的粉."
        );

        AMALGAMATE_DUST_EPIC = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_DUST_EPIC",
            new ItemStack(Material.GLOWSTONE_DUST),
            ThemeType.CRAFTING,
            "汞齊粉 (史詩)",
            "一種結合所有魔法種類的粉."
        );

        AMALGAMATE_DUST_MYTHICAL = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_DUST_MYTHICAL",
            new ItemStack(Material.GLOWSTONE_DUST),
            ThemeType.CRAFTING,
            "汞齊粉 (神話)",
            "一種結合所有魔法種類的粉."
        );

        AMALGAMATE_DUST_UNIQUE = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_DUST_UNIQUE",
            new ItemStack(Material.GLOWSTONE_DUST),
            ThemeType.CRAFTING,
            "汞齊粉 (獨特)",
            "一種結合所有魔法種類的粉."
        );

        AMALGAMATE_INGOT_COMMON = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_INGOT_COMMON",
            new ItemStack(Material.GOLD_INGOT),
            ThemeType.CRAFTING,
            "汞齊錠 (常見)",
            "由純魔法製作的錠."
        );

        AMALGAMATE_INGOT_UNCOMMON = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_INGOT_UNCOMMON",
            new ItemStack(Material.GOLD_INGOT),
            ThemeType.CRAFTING,
            "汞齊錠 (不常見)",
            "由純魔法製作的錠."
        );

        AMALGAMATE_INGOT_RARE = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_INGOT_RARE",
            new ItemStack(Material.GOLD_INGOT),
            ThemeType.CRAFTING,
            "汞齊錠 (稀有)",
            "由純魔法製作的錠."
        );

        AMALGAMATE_INGOT_EPIC = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_INGOT_EPIC",
            new ItemStack(Material.GOLD_INGOT),
            ThemeType.CRAFTING,
            "汞齊錠 (史詩)",
            "由純魔法製作的錠."
        );

        AMALGAMATE_INGOT_MYTHICAL = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_INGOT_MYTHICAL",
            new ItemStack(Material.GOLD_INGOT),
            ThemeType.CRAFTING,
            "汞齊錠 (神話)",
            "由純魔法製作的錠."
        );

        AMALGAMATE_INGOT_UNIQUE = ThemeType.themedSlimefunItemStack(
            "CRY_AMALGAMATE_INGOT_UNIQUE",
            new ItemStack(Material.GOLD_INGOT),
            ThemeType.CRAFTING,
            "汞齊錠 (獨特)",
            "由純魔法製作的錠."
        );

        ARCANE_SIGIL = ThemeType.themedSlimefunItemStack(
            "CRY_ARCANE_SIGIL",
            new ItemStack(Material.GLOW_LICHEN),
            ThemeType.CRAFTING,
            "Arcane Sigil",
            "An ancient mark left in the world",
            "by previous Crysta users."
        );

        IMBUED_GLASS = ThemeType.themedSlimefunItemStack(
            "CRY_IMBUED_GLASS",
            new ItemStack(Material.GLASS_PANE),
            ThemeType.CRAFTING,
            "浸透玻璃",
            "浸透著水晶能量的玻璃,",
            "具有一些奇怪的特性."
        );

        UNCANNY_PEARL = ThemeType.themedSlimefunItemStack(
            "CRY_UNCANNY_PEARL",
            new ItemStack(Material.ENDER_PEARL),
            ThemeType.CRAFTING,
            "不可思議的珍珠",
            "這顆珍珠的內部共振",
            "已被水晶能量平息."
        );

        GILDED_PEARL = ThemeType.themedSlimefunItemStack(
            "CRY_GILDED_PEARL",
            new ItemStack(Material.ENDER_PEARL),
            ThemeType.CRAFTING,
            "鍍金的珍珠",
            "當這顆珍珠被平息後,",
            "它將可以安全的鍍金, 並用於",
            "特定製作."
        );

        BASIC_FIBRES = ThemeType.themedSlimefunItemStack(
            "CRY_BASIC_FIBRES",
            new ItemStack(Material.DRIED_KELP),
            ThemeType.CRAFTING,
            "基礎纖維",
            "非常基礎的粗纖維."
        );

        POWDERED_ESSENCE = ThemeType.themedSlimefunItemStack(
            "CRY_POWDERED_ESSENCE",
            new ItemStack(Material.WHITE_DYE),
            ThemeType.CRAFTING,
            "能量精華",
            "一種精緻的製作材料.",
            "可作為骨粉使用.",
            "",
            ChatColor.YELLOW + "剩餘次數" + ChatColor.GRAY + " 250次"
        );

        MAGICAL_MILK = ThemeType.themedSlimefunItemStack(
            "CRY_MAGICAL_MILK_POWDER",
            new ItemStack(Material.SUGAR),
            ThemeType.CRAFTING,
            "魔法牛奶",
            "這個牛奶有些特點..."
        );

        // Runes

        RUNE_BEAST = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_BEAST",
            Skulls.RUNE_A.getPlayerHead(),
            ThemeType.RUNE,
            "Beast Rune",
            "Unbridled passion and drive. The howl",
            "of the wolf echos from within."
        );

        RUNE_BEGINNING = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_BEGINNING",
            Skulls.RUNE_B.getPlayerHead(),
            ThemeType.RUNE,
            "Rune of Beginning",
            "Chaos formed into order. The swirling",
            "vortex of the unknown made still."
        );

        RUNE_MOON = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_MOON",
            Skulls.RUNE_C.getPlayerHead(),
            ThemeType.RUNE,
            "Moon Rune",
            "The clash of both compassion and",
            "sheer destruction rage within."
        );

        RUNE_GATE = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_GATE",
            Skulls.RUNE_D.getPlayerHead(),
            ThemeType.RUNE,
            "Gate Rune",
            "Threads connecting worlds all pass",
            "through the magic within these runes."
        );

        RUNE_TRUE_EARTH = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_TRUE_EARTH",
            Skulls.RUNE_E.getPlayerHead(),
            ThemeType.RUNE,
            "True Earth Rune",
            "The single point of power for",
            "all earth magic."
        );

        RUNE_CHANGE = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_CHANGE",
            Skulls.RUNE_F.getPlayerHead(),
            ThemeType.RUNE,
            "Rune of Change",
            "All unknowns and futures of the universe",
            "are kept in harmony within."
        );

        RUNE_NIGHT = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_NIGHT",
            Skulls.RUNE_G.getPlayerHead(),
            ThemeType.RUNE,
            "Night Rune",
            "The magic running through this rune",
            "is the same that allows the undead to rise."
        );

        RUNE_BLACK = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_BLACK",
            Skulls.RUNE_H.getPlayerHead(),
            ThemeType.RUNE,
            "Black Rune",
            "The power to control minds and wills",
            "held within."
        );

        RUNE_TRUE_HOLY = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_TRUE_HOLY",
            Skulls.RUNE_I.getPlayerHead(),
            ThemeType.RUNE,
            "True Holy Rune",
            "All inner light stems from this",
            "magical source."
        );

        RUNE_DRAGON = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_DRAGON",
            Skulls.RUNE_J.getPlayerHead(),
            ThemeType.RUNE,
            "Dragon Rune",
            "The existence of dragons both created",
            "and was caused by this magic. A paradox that",
            "will never be unwound."
        );

        RUNE_TRUE_WATER = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_TRUE_WATER",
            Skulls.RUNE_K.getPlayerHead(),
            ThemeType.RUNE,
            "True Water Rune",
            "The beginning of all flowing freely."
        );

        RUNE_SOVEREIGN = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_SOVEREIGN",
            Skulls.RUNE_L.getPlayerHead(),
            ThemeType.RUNE,
            "Sovereign Rune",
            "Order through rule, protection from",
            "one, protection for all."
        );

        RUNE_SUN = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_SUN",
            Skulls.RUNE_M.getPlayerHead(),
            ThemeType.RUNE,
            "Sun Rune",
            "Bringer of prosperity and life but",
            "at a toll for all."
        );

        RUNE_DAWN = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_DAWN",
            Skulls.RUNE_N.getPlayerHead(),
            ThemeType.RUNE,
            "Dawn Rune",
            "The bringer of new, of regeneration",
            "and renewal."
        );

        RUNE_TWILIGHT = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_TWILIGHT",
            Skulls.RUNE_O.getPlayerHead(),
            ThemeType.RUNE,
            "Twilight Rune",
            "The removal of old, the bringer of",
            "rest and recuperation."
        );

        RUNE_TRUE_FIRE = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_TRUE_FIRE",
            Skulls.RUNE_P.getPlayerHead(),
            ThemeType.RUNE,
            "True Fire Rune",
            "An inferno without limits held",
            "back by nothing but it's own tempest."
        );

        RUNE_CIRCLE = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_CIRCLE",
            Skulls.RUNE_Q.getPlayerHead(),
            ThemeType.RUNE,
            "Circle Rune",
            "Brings both order and routine keeping",
            "other forms of magic in check.",
            "Circle Rune magic is weakened in",
            "the Minecraft world for some reason..."
        );

        RUNE_BLINKING = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_BLINKING",
            Skulls.RUNE_R.getPlayerHead(),
            ThemeType.RUNE,
            "Blinking Rune",
            "This rune contains space and in turn",
            "itself and is used to traverse",
            "large distances in moments."
        );

        RUNE_SOUL = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_SOUL",
            Skulls.RUNE_S.getPlayerHead(),
            ThemeType.RUNE,
            "Souleater Rune",
            "The rune of life and death. Both",
            "kept in balance and check."
        );

        RUNE_PUNISHMENT = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_PUNISHMENT",
            Skulls.RUNE_T.getPlayerHead(),
            ThemeType.RUNE,
            "Rune of Punishment",
            "This rune imposes order by crushing",
            "dissidence and wrong-doing, culling",
            "magic gone-astray."
        );

        RUNE_TRUE_LIGHTNING = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_TRUE_LIGHTNING",
            Skulls.RUNE_U.getPlayerHead(),
            ThemeType.RUNE,
            "True Lightning Rune",
            "The tempest from above contained",
            "within a sealing magic."
        );

        RUNE_EIGHTFOLD = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_EIGHTFOLD",
            Skulls.RUNE_V.getPlayerHead(),
            ThemeType.RUNE,
            "Eightfold Rune",
            "The rule of reality and form.",
            "Magics from this rune have the power to",
            "create and form new matter."
        );

        RUNE_CHARM = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_CHARM",
            Skulls.RUNE_W.getPlayerHead(),
            ThemeType.RUNE,
            "Charm Rune",
            "Passion, drive and love. These power",
            "and are powered by the magic within."
        );

        RUNE_TRUE_WIND = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_TRUE_WIND",
            Skulls.RUNE_X.getPlayerHead(),
            ThemeType.RUNE,
            "True Wind Rune",
            "The never ending zephyr is contained",
            "within."
        );

        RUNE_BLACK_SWORD = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_BLACK_SWORD",
            Skulls.RUNE_Y.getPlayerHead(),
            ThemeType.RUNE,
            "Black Sword Rune",
            "The magic of power, domination and drive."
        );

        RUNE_BRIGHT_SHIELD = ThemeType.themedSlimefunItemStack(
            "CRY_RUNE_BRIGHT_SHIELD",
            Skulls.RUNE_Y.getPlayerHead(),
            ThemeType.RUNE,
            "Bright Shield Rune",
            "The magic of power, protection and security."
        );

        // Artistic

        PAINT_BRUSH_BLACK_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_BLACK_100",
            MagicPaintbrush.getTippedBrush(DyeColor.BLACK),
            ThemeType.TOOL,
            "魔法畫筆 (黑)",
            "將可染色方塊塗成黑色.",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_BLUE_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_BLUE_100",
            MagicPaintbrush.getTippedBrush(DyeColor.BLUE),
            ThemeType.TOOL,
            "魔法畫筆 (藍)",
            "將可染色方塊塗成藍色.",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_BROWN_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_BROWN_100",
            MagicPaintbrush.getTippedBrush(DyeColor.BROWN),
            ThemeType.TOOL,
            "魔法畫筆 (棕色)",
            "將可染色方塊塗成棕色.",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_CYAN_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_CYAN_100",
            MagicPaintbrush.getTippedBrush(DyeColor.CYAN),
            ThemeType.TOOL,
            "魔法畫筆 (青)",
            "將可染色方塊塗成青色.",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_GRAY_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_GRAY_100",
            MagicPaintbrush.getTippedBrush(DyeColor.GRAY),
            ThemeType.TOOL,
            "魔法畫筆 (灰)",
            "將可染色方塊塗成灰色.",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_GREEN_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_GREEN_100",
            MagicPaintbrush.getTippedBrush(DyeColor.GREEN),
            ThemeType.TOOL,
            "魔法畫筆 (綠)",
            "將可染色方塊塗成綠色.",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_LIGHT_BLUE_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_LIGHT_BLUE_100",
            MagicPaintbrush.getTippedBrush(DyeColor.LIGHT_BLUE),
            ThemeType.TOOL,
            "魔法畫筆 (淺藍)",
            "將可染色方塊塗成淺藍色.",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_LIGHT_GRAY_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_LIGHT_GRAY_100",
            MagicPaintbrush.getTippedBrush(DyeColor.LIGHT_GRAY),
            ThemeType.TOOL,
            "魔法畫筆 (淺灰)",
            "將可染色方塊塗成淺灰色.",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_LIME_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_LIME_100",
            MagicPaintbrush.getTippedBrush(DyeColor.LIME),
            ThemeType.TOOL,
            "魔法畫筆 (淺綠)",
            "將可染色方塊塗成淺綠色.",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_MAGENTA_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_MAGENTA_100",
            MagicPaintbrush.getTippedBrush(DyeColor.MAGENTA),
            ThemeType.TOOL,
            "魔法畫筆 (洋紅)",
            "將可染色方塊塗成洋紅色.",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_ORANGE_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_ORANGE_100",
            MagicPaintbrush.getTippedBrush(DyeColor.ORANGE),
            ThemeType.TOOL,
            "魔法畫筆 (橙)",
            "將可染色方塊塗成橙色.",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_PINK_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_PINK_100",
            MagicPaintbrush.getTippedBrush(DyeColor.PINK),
            ThemeType.TOOL,
            "魔法畫筆 (粉)",
            "將可染色方塊塗成粉色.",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_PURPLE_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_PURPLE_100",
            MagicPaintbrush.getTippedBrush(DyeColor.PURPLE),
            ThemeType.TOOL,
            "魔法畫筆 (紫)",
            "將可染色方塊塗成紫色.",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_RED_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_RED_100",
            MagicPaintbrush.getTippedBrush(DyeColor.RED),
            ThemeType.TOOL,
            "魔法畫筆 (紅)",
            "將可染色方塊塗成紅色.",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_WHITE_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_WHITE_100",
            MagicPaintbrush.getTippedBrush(DyeColor.WHITE),
            ThemeType.TOOL,
            "魔法畫筆 (白)",
            "將可染色方塊塗成白色.",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_YELLOW_100 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_YELLOW_100",
            MagicPaintbrush.getTippedBrush(DyeColor.YELLOW),
            ThemeType.TOOL,
            "魔法畫筆 (黃)",
            "將可染色方塊塗成黃色.",
            "",
            LoreBuilder.usesLeft(100)
        );

        PAINT_BRUSH_BLACK_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_BLACK_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.BLACK),
            ThemeType.TOOL,
            "魔法畫筆 (黑)",
            "將可染色方塊塗成黑色.",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_BLUE_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_BLUE_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.BLUE),
            ThemeType.TOOL,
            "魔法畫筆 (藍)",
            "將可染色方塊塗成藍色.",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_BROWN_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_BROWN_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.BROWN),
            ThemeType.TOOL,
            "魔法畫筆 (棕色)",
            "將可染色方塊塗成棕色.",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_CYAN_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_CYAN_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.CYAN),
            ThemeType.TOOL,
            "魔法畫筆 (青)",
            "將可染色方塊塗成青色.",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_GRAY_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_GRAY_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.GRAY),
            ThemeType.TOOL,
            "魔法畫筆 (灰)",
            "將可染色方塊塗成灰色.",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_GREEN_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_GREEN_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.GREEN),
            ThemeType.TOOL,
            "魔法畫筆 (綠)",
            "將可染色方塊塗成綠色.",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_LIGHT_BLUE_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_LIGHT_BLUE_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.LIGHT_BLUE),
            ThemeType.TOOL,
            "魔法畫筆 (淺藍)",
            "將可染色方塊塗成淺藍色.",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_LIGHT_GRAY_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_LIGHT_GRAY_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.LIGHT_GRAY),
            ThemeType.TOOL,
            "魔法畫筆 (淺灰)",
            "將可染色方塊塗成淺灰色.",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_LIME_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_LIME_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.LIME),
            ThemeType.TOOL,
            "魔法畫筆 (淺綠)",
            "將可染色方塊塗成淺綠色.",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_MAGENTA_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_MAGENTA_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.MAGENTA),
            ThemeType.TOOL,
            "魔法畫筆 (洋紅)",
            "將可染色方塊塗成洋紅色.",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_ORANGE_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_ORANGE_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.ORANGE),
            ThemeType.TOOL,
            "魔法畫筆 (橙)",
            "將可染色方塊塗成橙色.",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_PINK_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_PINK_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.PINK),
            ThemeType.TOOL,
            "魔法畫筆 (粉)",
            "將可染色方塊塗成粉色.",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_PURPLE_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_PURPLE_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.PURPLE),
            ThemeType.TOOL,
            "魔法畫筆 (紫)",
            "將可染色方塊塗成紫色.",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_RED_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_RED_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.RED),
            ThemeType.TOOL,
            "魔法畫筆 (紅)",
            "將可染色方塊塗成紅色.",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_WHITE_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_WHITE_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.WHITE),
            ThemeType.TOOL,
            "魔法畫筆 (白)",
            "將可染色方塊塗成白色.",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_YELLOW_1000 = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_YELLOW_1000",
            MagicPaintbrush.getTippedBrush(DyeColor.YELLOW),
            ThemeType.TOOL,
            "魔法畫筆 (黃)",
            "將可染色方塊塗成黃色.",
            "",
            LoreBuilder.usesLeft(1000)
        );

        PAINT_BRUSH_INFINITE = ThemeType.themedSlimefunItemStack(
            "CRY_BRUSH_INFINITE",
            MagicPaintbrush.getTippedBrush(DyeColor.WHITE, true),
            ThemeType.TOOL,
            "神話畫筆",
            "繪製色彩在方塊和實體上.",
            "可以塗上所有顏色並不會用完.",
            "",
            MessageFormat.format("{0}蹲下右鍵: {1}變更顏色", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor())
        );

        MYSTICAL_PIGMENTATO = ThemeType.themedSlimefunItemStack(
            "CRY_MYSTICAL_PIGMENTATO",
            new ItemStack(Material.PRISMARINE),
            ThemeType.CRAFTING,
            "神秘色素",
            "濃縮的色彩精華"
        );

        MYSTICAL_TINTANNO = ThemeType.themedSlimefunItemStack(
            "CRY_MYSTICAL_TINTANNO",
            new ItemStack(Material.DARK_PRISMARINE),
            ThemeType.CRAFTING,
            "神秘廷塔諾",
            "濃縮的色彩精華"
        );

        BODY_STAND = ThemeType.themedSlimefunItemStack(
            "CRY_BODY_STAND",
            new ItemStack(Material.ARMOR_STAND),
            ThemeType.CRAFTING,
            "盔甲座的身體",
            "這個架子似乎有哪裡不對勁."
        );

        MIND_STAND = ThemeType.themedSlimefunItemStack(
            "CRY_MIND_STAND",
            new ItemStack(Material.ARMOR_STAND),
            ThemeType.CRAFTING,
            "盔甲座的精神",
            "這個架子似乎有哪裡不對勁."
        );

        SOUL_STAND = ThemeType.themedSlimefunItemStack(
            "CRY_SOUL_STAND",
            new ItemStack(Material.ARMOR_STAND),
            ThemeType.CRAFTING,
            "盔甲座的靈魂",
            "這個架子似乎有哪裡不對勁."
        );

        MYSTICAL_ATTITUDINIZER = ThemeType.themedSlimefunItemStack(
            "CRY_MYSTICAL_ATTITUDINIZER",
            new ItemStack(Material.BELL),
            ThemeType.CRAFTING,
            "神秘的態度",
            "姿勢的濃縮精華"
        );

        IMBUED_STAND = ThemeType.themedSlimefunItemStack(
            "CRY_IMBUED_STAND",
            new ItemStack(Material.ARMOR_STAND),
            ThemeType.TOOL,
            "注魔的盔甲座",
            "這個盔甲座可以通過",
            "姿勢變換器隱形或變",
            "小盔甲座."
        );

        POSE_CHANGER = ThemeType.themedSlimefunItemStack(
            "CRY_POSE_CHANGER",
            new ItemStack(Material.BAMBOO),
            ThemeType.TOOL,
            "姿勢變換器",
            "這個物品它可以",
            "操縱盔甲座的姿勢.",
            "可以與原版盔甲座使用,",
            "並能對注魔的盔甲座",
            "做額外的事情.",
            "",
            MessageFormat.format("{0}左鍵點擊: {1}更改選定的身體部位", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor()),
            MessageFormat.format("{0}Shift + 左鍵點擊: {1}改變選定更改的方式", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor()),
            MessageFormat.format("{0}右鍵點擊: {1}應用更改 (正向)", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor()),
            MessageFormat.format("{0}Shift + 右鍵點擊: {1}應用更改 (反向)", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor()),
            "",
            MessageFormat.format("{0}姿勢設置為: {1}HEAD", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor()),
            MessageFormat.format("{0}更改設置為: {1}RESET", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor())
        );

        POSE_CLONER = ThemeType.themedSlimefunItemStack(
            "CRY_POSE_CLONER",
            new ItemStack(Material.SEA_PICKLE),
            ThemeType.TOOL,
            "姿勢複製器",
            "這個物品可以複製",
            "注魔的盔甲座的狀態,",
            "並與另一個匹配.",
            "",
            MessageFormat.format("{0}右鍵點擊: {1}複製姿勢", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor()),
            MessageFormat.format("{0}Shift + 右鍵點擊: {1}應用複製內容", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor())
        );

        EXALTED_BEACON = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTED_BEACON",
            new ItemStack(Material.BEACON),
            ThemeType.EXALTED,
            "尊貴烽火台",
            "一個強大的烽火台, 具有極大",
            "的潛能. 必須放在",
            "昇華之台上才能運作.",
            "",
            ThemeType.CLICK_INFO + "力量: " + ThemeType.PASSIVE + "2",
            "",
            ThemeType.CLICK_INFO.getColor() + "需求: 故事頭銜 > 榮譽教授"
        );

        EXALTED_BAELFIRE = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTED_BAELFIRE",
            new ItemStack(Material.SOUL_CAMPFIRE),
            ThemeType.EXALTED,
            "Exalted Baelfire",
            "A powerful beacon with incredible",
            "potential. Must be placed on a",
            "Exaltation Stand to operate.",
            "",
            ThemeType.CLICK_INFO + "Power: " + ThemeType.PASSIVE + "3",
            "",
            ThemeType.CLICK_INFO.getColor() + "Requires: Story Rank > Emeritus Professor"
        );

        EXALTED_FERTILITY_PHARO = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTED_FERTILITY_PHARO",
            new ItemStack(Material.DIAMOND_BLOCK),
            ThemeType.EXALTED,
            "尊貴生育法羅",
            "一種能夠繁殖 10x10 區域",
            "內動物的魔法結構.",
            "必須放在昇華之台上",
            "才能運作.",
            "",
            ThemeType.CLICK_INFO.getColor() + "需求: 故事頭銜 > 榮譽教授"
        );

        EXALTED_FERTILITY_TOTEM = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTED_FERTILITY_TOTEM",
            new ItemStack(Material.EMERALD_BLOCK),
            ThemeType.EXALTED,
            "Exalted Fertility Totem",
            "A magical construct able to",
            "breed nearby animals in a 20x20 area.",
            "Must be placed on an Exaltation",
            "Stand to operate.",
            "",
            ThemeType.CLICK_INFO.getColor() + "Requires: Story Rank > Emeritus Professor"
        );

        EXALTED_HARVESTER = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTED_HARVESTER",
            new ItemStack(Material.HAY_BLOCK),
            ThemeType.EXALTED,
           "尊貴收穫祭",
            "一種能夠收割 9x9 區域",
            "內所有農作物的魔法結構.",
            "必須放在昇華之台上",
            "才能運作.",
            "",
            ThemeType.CLICK_INFO.getColor() + "需求: 法術頭銜 > 宗師級奇術師"
        );

        EXALTED_AGRONOMIST = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTED_AGRONOMIST",
            new ItemStack(Material.DRIED_KELP_BLOCK),
            ThemeType.EXALTED,
            "Exalted Agronomist",
            "A magical construct able to",
            "harvest all crops in a 19x19 area.",
            "Must be placed on an Exaltation",
            "Stand to operate.",
            "",
            ThemeType.CLICK_INFO.getColor() + "Requires: Spell Rank > Grandmaster Magus"
        );

        EXALTED_DAWN = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTED_DAWN",
            new ItemStack(Material.YELLOW_WOOL),
            ThemeType.EXALTED,
            "崇高的黎明",
            "一個魔法的構造,",
            "像太陽一樣的明亮著燃燒.",
            "",
            ThemeType.CLICK_INFO.getColor() + "需求: 在早上時製作"
        );

        EXALTED_DUSK = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTED_DUSK",
            new ItemStack(Material.BLACK_WOOL),
            ThemeType.EXALTED,
            "崇高的黃昏",
            "一個魔法的結構,",
            "就像是新月一樣的閃耀",
            "",
            ThemeType.CLICK_INFO.getColor() + "需求: 在晚上時製作"
        );

        EXALTED_SUN = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTED_SUN",
            new ItemStack(Material.MAGMA_BLOCK),
            ThemeType.EXALTED,
            "崇高的太陽",
            "一個散發著太陽力量",
            "的魔法結構.",
            "",
            ThemeType.CLICK_INFO.getColor() + "需求: 在晴朗的天氣時製作"
        );

        EXALTED_STORM = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTED_STORM",
            new ItemStack(Material.GRAY_WOOL),
            ThemeType.EXALTED,
            "崇高的暴風",
            "一個散發著風暴的",
            "破壞力魔法結構.",
            "",
            ThemeType.CLICK_INFO.getColor() + "需求: 在暴風雨時製作"
        );

        EXALTED_SEA_BREEZE = ThemeType.themedSlimefunItemStack(
            "CRY_SEA_BREEZE",
            new ItemStack(Material.TUBE_CORAL_BLOCK),
            ThemeType.EXALTED,
            "崇高的海風",
            "一種神奇的構造, 可以將",
            "海風帶到附近的方塊,",
            "使其風化和氧化.",
            "",
            ThemeType.CLICK_INFO.getColor() + "需求: 在海灘上製作"
        );

        // Gadgets

        ABSTRACTION_LAMP = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_LAMP_1",
            new ItemStack(Material.LANTERN),
            ThemeType.GADGET,
            "抽象之燈",
            "抽象之燈會將附近",
            "所有怪物推走.",
            "",
            ThemeType.CLICK_INFO.getColor() + "距離: " + ThemeType.PASSIVE.getColor() + "5 格方塊",
            ThemeType.CLICK_INFO.getColor() + "力量: " + ThemeType.PASSIVE.getColor() + "3 水晶之力™"
        );

        DISPERSION_LAMP = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_LAMP_2",
            new ItemStack(Material.SOUL_LANTERN),
            ThemeType.GADGET,
            "色散之燈",
            "色散之燈會將附近",
            "所有怪物推走.",
            "",
            ThemeType.CLICK_INFO.getColor() + "距離: " + ThemeType.PASSIVE.getColor() + "7 格方塊",
            ThemeType.CLICK_INFO.getColor() + "力量: " + ThemeType.PASSIVE.getColor() + "5 水晶之力™"
        );

        EXODUS_LAMP = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_LAMP_3",
            GeneralUtils.getPreEnchantedItemStack(Material.SOUL_LANTERN),
            ThemeType.GADGET,
            "Exodus Lamp",
            "The exodus lamp will push all",
            "nearby mobs away from it.",
            "",
            ThemeType.CLICK_INFO.getColor() + "距離: " + ThemeType.PASSIVE.getColor() + "10 格方塊",
            ThemeType.CLICK_INFO.getColor() + "力量: " + ThemeType.PASSIVE.getColor() + "10 水晶之力™"
        );

        INVERSION_VACUUM = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_FAN_1",
            new ItemStack(Material.REDSTONE_LAMP),
            ThemeType.GADGET,
            "倒轉空間",
            "創造一個魔法感應空間,",
            "並將實體從該機制中",
            "推開.",
            "",
            ThemeType.CLICK_INFO.getColor() + "推動距離: " + ThemeType.PASSIVE.getColor() + "5 格方塊"
        );

        ANTIPODAL_VACUUM = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_FAN_2",
            new ItemStack(Material.NOTE_BLOCK),
            ThemeType.GADGET,
            "相對空間",
            "創造一個魔法感應空間,",
            "並將實體從該機制中",
            "推開.",
            "",
            ThemeType.CLICK_INFO.getColor() + "推動距離: " + ThemeType.PASSIVE.getColor() + "10 格方塊"
        );

        COUNTERPOLE_VACUUM = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_FAN_3",
            new ItemStack(Material.DEEPSLATE_BRICKS),
            ThemeType.GADGET,
            "Counterpole Vacuum",
            "Creates a magically induced vacuum",
            "that pulls entities away from the",
            "mechanism.",
            "",
            ThemeType.CLICK_INFO.getColor() + "推動距離: " + ThemeType.PASSIVE.getColor() + "15 格方塊"
        );

        CURSED_EARTH = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_DIRT_1",
            new ItemStack(Material.BROWN_WOOL),
            ThemeType.GADGET,
            "詛咒之土",
            "黑暗魔法從這塊泥土中滲出,",
            "給人一種非常不祥的感覺!",
            "",
            ThemeType.CLICK_INFO.getColor() + "刻速率: " + ThemeType.PASSIVE.getColor() + "20",
            ThemeType.CLICK_INFO.getColor() + "光源等級: " + ThemeType.PASSIVE.getColor() + "7",
            ThemeType.CLICK_INFO.getColor() + "生成等級: " + ThemeType.PASSIVE.getColor() + "基礎"
        );

        DREADFUL_DIRT = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_DIRT_2",
            new ItemStack(Material.BLACK_WOOL),
            ThemeType.GADGET,
            "恐懼之土",
            "黑暗魔法從這塊泥土中滲出,",
            "給人一種非常不祥的感覺!",
            "",
            ThemeType.CLICK_INFO.getColor() + "刻速率: " + ThemeType.PASSIVE.getColor() + "10",
            ThemeType.CLICK_INFO.getColor() + "光源等級: " + ThemeType.PASSIVE.getColor() + "15",
            ThemeType.CLICK_INFO.getColor() + "生成等級: " + ThemeType.PASSIVE.getColor() + "進階"
        );

        SOULFILLED_SOIL = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_DIRT_3",
            new ItemStack(Material.LIME_WOOL),
            ThemeType.GADGET,
            "Soulfilled Soil",
            "Dark magics have been purified clean.",
            "",
            ThemeType.CLICK_INFO.getColor() + "刻速率: " + ThemeType.PASSIVE.getColor() + "10",
            ThemeType.CLICK_INFO.getColor() + "光源等級: " + ThemeType.PASSIVE.getColor() + "15",
            ThemeType.CLICK_INFO.getColor() + "生成等級: " + ThemeType.PASSIVE.getColor() + "友好"
        );

        SEARING_PLATE = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_PLATE_1",
            new ItemStack(Material.CRIMSON_PRESSURE_PLATE),
            ThemeType.GADGET,
            "灼熱之板",
            "一塊異常灼熱的魔法板.",
            "任何站在這個板子上的生物將會被",
            "灼傷.",
            "",
            ThemeType.CLICK_INFO.getColor() + "傷害: " + ThemeType.PASSIVE.getColor() + "1",
            ThemeType.CLICK_INFO.getColor() + "玩家掉落物: " + ThemeType.PASSIVE.getColor() + "否"
        );

        DOOMED_PLATE = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_PLATE_2",
            new ItemStack(Material.WARPED_PRESSURE_PLATE),
            ThemeType.GADGET,
            "毀滅之板",
            "一塊異常灼熱的魔法板.",
            "任何站在這個板子上的生物將會被",
            "灼傷.",
            "",
            ThemeType.CLICK_INFO.getColor() + "傷害: " + ThemeType.PASSIVE.getColor() + "1",
            ThemeType.CLICK_INFO.getColor() + "玩家掉落物: " + ThemeType.PASSIVE.getColor() + "是"
        );

        EVISCERATING_PLATE = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_PLATE_3",
            new ItemStack(Material.POLISHED_BLACKSTONE_PRESSURE_PLATE),
            ThemeType.GADGET,
            "殘虐之板",
            "一塊異常灼熱的魔法板.",
            "任何站在這個板子上的生物將會被",
            "灼傷.",
            "",
            ThemeType.CLICK_INFO.getColor() + "傷害: " + ThemeType.PASSIVE.getColor() + "2",
            ThemeType.CLICK_INFO.getColor() + "玩家掉落物: " + ThemeType.PASSIVE.getColor() + "是"
        );

        SHREDDING_PLATE = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_PLATE_4",
            new ItemStack(Material.LIGHT_WEIGHTED_PRESSURE_PLATE),
            ThemeType.GADGET,
            "Shredding Plate",
            "A plate that is just too powerful.",
            "Anything standing on this plate gets",
            "damaged.",
            "",
            ThemeType.CLICK_INFO.getColor() + "傷害: " + ThemeType.PASSIVE.getColor() + "3",
            ThemeType.CLICK_INFO.getColor() + "玩家掉落物: " + ThemeType.PASSIVE.getColor() + "是"
        );

        TRAP_PLATE = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_PLATE_TRAP",
            new ItemStack(Material.DARK_OAK_PRESSURE_PLATE),
            ThemeType.GADGET,
            "陷阱壓力板",
            "這個壓力板不在",
            "造成傷害,但現在會",
            "添加藥水效果. 手持藥水",
            "右鍵點擊來指定."
        );

        EXP_COLLECTOR_BASIC = ThemeType.themedSlimefunItemStack(
            "CRY_EXP_COLLECTOR_1",
            new ItemStack(Material.LIGHTNING_ROD),
            ThemeType.GADGET,
            "基礎經驗收集器",
            "注入魔法的經驗收集器,",
            "現在可以在沒有沒有學識之瓶",
            "與電力提供下運作.",
            "",
            ThemeType.CLICK_INFO.getColor() + "距離: " + ThemeType.PASSIVE.getColor() + "4",
            ThemeType.CLICK_INFO.getColor() + "容量: " + ThemeType.PASSIVE.getColor() + "2500"
        );

        EXP_COLLECTOR_INFUSED = ThemeType.themedSlimefunItemStack(
            "CRY_EXP_COLLECTOR_2",
            new ItemStack(Material.LIGHTNING_ROD),
            ThemeType.GADGET,
            "注入經驗收集器",
            "進一步注入使",
            "收集器更加強大.",
            "",
            ThemeType.CLICK_INFO.getColor() + "距離: " + ThemeType.PASSIVE.getColor() + "8",
            ThemeType.CLICK_INFO.getColor() + "容量: " + ThemeType.PASSIVE.getColor() + "10000"
        );

        EXP_COLLECTOR_ARCANE = ThemeType.themedSlimefunItemStack(
            "CRY_EXP_COLLECTOR_3",
            new ItemStack(Material.LIGHTNING_ROD),
            ThemeType.GADGET,
            "Arcane Exp Collector",
            "Magic sigils allow for even",
            "more storage.",
            "",
            ThemeType.CLICK_INFO.getColor() + "距離: " + ThemeType.PASSIVE.getColor() + "8",
            ThemeType.CLICK_INFO.getColor() + "容量: " + ThemeType.PASSIVE.getColor() + "999999"
        );

        ENDER_INHIBITOR_BASIC = ThemeType.themedSlimefunItemStack(
            "CRY_ENDER_INHIBITOR_1",
            new ItemStack(Material.REDSTONE_TORCH),
            ThemeType.GADGET,
            "基礎終界抑制器",
            "通過使用終界使者的諧振",
            "來對抗它, 我們可以在短時間的",
            "旋律中阻止它的傳送.",
            "如果仍在範圍內, 將會延長持續時間.",
            "",
            ThemeType.CLICK_INFO.getColor() + "距離: " + ThemeType.PASSIVE.getColor() + "4",
            ThemeType.CLICK_INFO.getColor() + "持續時間: " + ThemeType.PASSIVE.getColor() + "2 秒"
        );

        ENDER_INHIBITOR_ADVANCED = ThemeType.themedSlimefunItemStack(
            "CRY_ENDER_INHIBITOR_2",
            new ItemStack(Material.SOUL_TORCH),
            ThemeType.GADGET,
            "進階終界抑制器",
            "通過使用終界使者的諧振",
            "來對抗它, 我們可以在短時間的",
            "旋律中阻止它的傳送.",
            "如果仍在範圍內, 將會延長持續時間.",
            "",
            ThemeType.CLICK_INFO.getColor() + "距離: " + ThemeType.PASSIVE.getColor() + "8",
            ThemeType.CLICK_INFO.getColor() + "持續時間: " + ThemeType.PASSIVE.getColor() + "2 秒"
        );

        MOB_CANDLE_DIM = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_CANDLE_1",
            new ItemStack(Material.BLACK_CANDLE),
            ThemeType.GADGET,
            "黯淡的菲拉什蠟燭",
            "這根蠟燭會阻止怪物",
            "在它周圍半徑生成怪物.",
            "不會永遠的持續下去.",
            "",
            ThemeType.CLICK_INFO.getColor() + "距離: " + ThemeType.PASSIVE.getColor() + "16",
            ThemeType.CLICK_INFO.getColor() + "持續時間: " + ThemeType.PASSIVE.getColor() + "2 小時 (現實時間)"
        );

        MOB_CANDLE_BRIGHT = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_CANDLE_2",
            new ItemStack(Material.BROWN_CANDLE),
            ThemeType.GADGET,
            "明亮的菲拉什蠟燭",
            "這根蠟燭會阻止怪物",
            "在它周圍半徑生成怪物.",
            "不會永遠的持續下去.",
            "",
            ThemeType.CLICK_INFO.getColor() + "距離: " + ThemeType.PASSIVE.getColor() + "32",
            ThemeType.CLICK_INFO.getColor() + "持續時間: " + ThemeType.PASSIVE.getColor() + "24 小時 (現實時間)"
        );

        MOB_CANDLE_SCINTILLATING = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_CANDLE_3",
            new ItemStack(Material.WHITE_CANDLE),
            ThemeType.GADGET,
            "閃爍的菲拉什蠟燭",
            "這根蠟燭會阻止怪物",
            "在它周圍半徑生成怪物.",
            "不會永遠的持續下去.",
            "",
            ThemeType.CLICK_INFO.getColor() + "距離: " + ThemeType.PASSIVE.getColor() + "64",
            ThemeType.CLICK_INFO.getColor() + "持續時間: " + ThemeType.PASSIVE.getColor() + "48 小時 (現實時間)"
        );

        MOB_CANDLE_CORUSCATING = ThemeType.themedSlimefunItemStack(
            "CRY_MOB_CANDLE_4",
            new ItemStack(Material.MAGENTA_CANDLE),
            ThemeType.GADGET,
            "Coruscating Verache Candle",
            "This candle stops mobs spawning",
            "in a radius around it.",
            "Doesn't last forever.",
            "",
            ThemeType.CLICK_INFO.getColor() + "距離: " + ThemeType.PASSIVE.getColor() + "64",
            ThemeType.CLICK_INFO.getColor() + "持續時間: " + ThemeType.PASSIVE.getColor() + "2 周 (現實時間)"
        );

        MYSTERIOUS_POTTED_PLANT = ThemeType.themedSlimefunItemStack(
            "CRY_MYSTERIOUS_POTTED_PLANT",
            new ItemStack(Material.FLOWER_POT),
            ThemeType.GADGET,
            "神秘盆栽",
            "只需要一點點魔法",
            "就能讓美妙的事情發生..."
        );

        MYSTERIOUS_PLANT = ThemeType.themedSlimefunItemStack(
            "CRY_MYSTERIOUS_PLANT",
            new ItemStack(Material.OXEYE_DAISY),
            ThemeType.GADGET,
            "神秘植物",
            "把它從那個盆栽內移除來工作."
        );

        MYSTERIOUS_GLASS = ThemeType.themedSlimefunItemStack(
            "CRY_MYSTERIOUS_GLASS",
            new ItemStack(Material.ORANGE_STAINED_GLASS),
            ThemeType.GADGET,
            "神秘玻璃",
            "就像是彩虹玻璃,",
            "但更加隨機."
        );

        MYSTERIOUS_WOOL = ThemeType.themedSlimefunItemStack(
            "CRY_MYSTERIOUS_WOOL",
            new ItemStack(Material.ORANGE_WOOL),
            ThemeType.GADGET,
            "神秘羊毛",
            "就像是彩虹羊毛,",
            "但更加隨機."
        );

        MYSTERIOUS_TERRACOTTA = ThemeType.themedSlimefunItemStack(
            "CRY_MYSTERIOUS_TERRACOTTA",
            new ItemStack(Material.ORANGE_TERRACOTTA),
            ThemeType.GADGET,
            "神秘陶土",
            "就像是彩虹陶土,",
            "但更加隨機."
        );

        MYSTERIOUS_GLAZED_TERRACOTTA = ThemeType.themedSlimefunItemStack(
            "CRY_MYSTERIOUS_GLAZED_TERRACOTTA",
            new ItemStack(Material.ORANGE_GLAZED_TERRACOTTA),
            ThemeType.GADGET,
            "神秘釉陶",
            "就像是彩虹釉陶,",
            "但更加隨機."
        );

        MYSTERIOUS_CONCRETE = ThemeType.themedSlimefunItemStack(
            "CRY_MYSTERIOUS_CONCRETE",
            new ItemStack(Material.ORANGE_CONCRETE),
            ThemeType.GADGET,
            "神秘混凝土",
            "就像是彩虹混凝土,",
            "但更加隨機."
        );

        GREEN_HOUSE_GLASS = ThemeType.themedSlimefunItemStack(
            "CRY_CROP_GLASS_1",
            new ItemStack(Material.GLASS),
            ThemeType.GADGET,
            "溫室玻璃",
            "在這種玻璃下的農作物會生長得更快.",
            "僅在白天與有光的世界運作.",
            "",
            ThemeType.CLICK_INFO.getColor() + "效率: " + ThemeType.PASSIVE.getColor() + "5"
        );

        GREEN_HOUSE_GLASS_FOCUSED = ThemeType.themedSlimefunItemStack(
            "CRY_CROP_GLASS_2",
            new ItemStack(Material.YELLOW_STAINED_GLASS),
            ThemeType.GADGET,
            "聚焦的溫室玻璃",
            "在這種玻璃下的農作物會生長得更快.",
            "僅在白天與有光的世界運作.",
            "",
            ThemeType.CLICK_INFO.getColor() + "效率: " + ThemeType.PASSIVE.getColor() + "10"
        );

        GREEN_HOUSE_GLASS_MAGNIFYING = ThemeType.themedSlimefunItemStack(
            "CRY_CROP_GLASS_3",
            new ItemStack(Material.TINTED_GLASS),
            ThemeType.GADGET,
            "Magnifying Greenhouse Glass",
            "Crops under this glass will grow faster.",
            "Works during the day in light worlds only.",
            "",
            ThemeType.CLICK_INFO.getColor() + "效率: " + ThemeType.PASSIVE.getColor() + "20"
        );

        TROPHY_STAND = ThemeType.themedSlimefunItemStack(
            "CRY_TROPHY_DISPLAY_1",
            new ItemStack(Material.POLISHED_BLACKSTONE_BRICK_WALL),
            ThemeType.GADGET,
            "獎盃展示",
            "用來放置你的獎盃",
            "以向世界炫耀.",
            "",
            "目前允許的獎盃包括:",
            ThemeType.CLICK_INFO.getColor() + "一個你有 歷史見證者 頭銜的方塊"
        );

        EXALTATION_STAND = ThemeType.themedSlimefunItemStack(
            "CRY_EXALTATION_STAND",
            new ItemStack(Material.PRISMARINE_WALL),
            ThemeType.GADGET,
            "昇華之台",
            "用於放置 '尊貴' 物品.",
            "這些物品需要特殊條件",
            "並在附近賦予強大的效果."
        );

        WAYSTONE = ThemeType.themedSlimefunItemStack(
            "CRY_WAYSTONE",
            new ItemStack(Material.END_STONE_BRICK_WALL),
            ThemeType.GADGET,
            "岔出的路石",
            "可以做為標記",
            "來回傳."
        );

        ANGEL_BLOCK = ThemeType.themedSlimefunItemStack(
            "CRY_ANGEL_BLOCK",
            new ItemStack(Material.GLASS),
            ThemeType.GADGET,
            "天使方塊",
            "可以放置在任何地方, 甚至",
            "在空氣中."
        );

        PHILOSOPHERS_SPRAY = ThemeType.themedSlimefunItemStack(
            "CRY_PHILOSOPHERS_SPRAY",
            new ItemStack(Material.DISPENSER),
            ThemeType.GADGET,
            "賢者的噴霧",
            "當紅石觸發時,",
            "將會 '替換' 這個方塊上方的方塊."
        );

        GLASS_OF_MILK = ThemeType.themedSlimefunItemStack(
            "CRY_GLASS_OF_MILK",
            Skulls.ITEM_MILK.getPlayerHead(),
            ThemeType.GADGET,
            "一杯牛奶",
            "當放置時, 右鍵點擊",
            "以移除所有身上效果.",
            "",
            ThemeType.WARNING.getColor() + "損壞時無法被修復."
        );

        FRAGMENTED_VOID = ThemeType.themedSlimefunItemStack(
            "CRY_FRAGMENTED_VOID",
            new ItemStack(Material.BLACK_CONCRETE),
            ThemeType.GADGET,
            "碎片的虛空",
            "宇宙中的一個可攜帶的洞.",
            "會將附近的任何物品拉入其中.",
            "",
            ThemeType.WARNING.getColor() + "距離: " + ThemeType.PASSIVE.getColor() + "5"
        );

        SHATTERED_VOID = ThemeType.themedSlimefunItemStack(
            "CRY_SHATTERED_VOID",
            new ItemStack(Material.BLACK_CONCRETE),
            ThemeType.GADGET,
            "殘缺的虛空",
            "宇宙中的一個可攜帶的洞.",
            "會將附近的任何物品拉入其中.",
            "",
            ThemeType.WARNING.getColor() + "距離: " + ThemeType.PASSIVE.getColor() + "7"
        );

        CHRONICLER_PANEL_1 = ThemeType.themedSlimefunItemStack(
            "CRY_CHRONICLER_PANEL_1",
            new ItemStack(Material.COBBLED_DEEPSLATE_SLAB),
            ThemeType.MECHANISM,
            "記錄者面板 (等級 1)",
            "紀錄者面板將隨著",
            "時間繪製出屬於該",
            "方塊的故事.",
            "",
            "可以記錄 等級1-2的方塊."
        );

        CHRONICLER_PANEL_2 = ThemeType.themedSlimefunItemStack(
            "CRY_CHRONICLER_PANEL_2",
            new ItemStack(Material.DEEPSLATE_TILE_SLAB),
            ThemeType.MECHANISM,
            "記錄者面板 (等級 2)",
            "紀錄者面板將隨著",
            "時間繪製出屬於該",
            "方塊的故事.",
            "",
            "可以記錄 等級1-3的方塊."
        );

        CHRONICLER_PANEL_3 = ThemeType.themedSlimefunItemStack(
            "CRY_CHRONICLER_PANEL_3",
            new ItemStack(Material.NETHER_BRICK_SLAB),
            ThemeType.MECHANISM,
            "記錄者面板 (等級 3)",
            "紀錄者面板將隨著",
            "時間繪製出屬於該",
            "方塊的故事.",
            "",
            "可以記錄 等級1-4的方塊."
        );

        CHRONICLER_PANEL_4 = ThemeType.themedSlimefunItemStack(
            "CRY_CHRONICLER_PANEL_4",
            new ItemStack(Material.DARK_PRISMARINE_SLAB),
            ThemeType.MECHANISM,
            "記錄者面板 (等級 4)",
            "紀錄者面板將隨著",
            "時間繪製出屬於該",
            "方塊的故事.",
            "",
            "可以記錄 等級1-5的方塊."
        );

        CHRONICLER_PANEL_5 = ThemeType.themedSlimefunItemStack(
            "CRY_CHRONICLER_PANEL_5",
            new ItemStack(Material.SMOOTH_QUARTZ_SLAB),
            ThemeType.MECHANISM,
            "Chronicler Panel (Tier 5)",
            "The chronicler panel will draw out",
            "the stories contained within a given",
            "block over time.",
            "",
            "Can chronicle stories for T1-T5 blocks.",
            "Automatically picks up items thrown on",
            "top of it and pushes storied items below."
        );

        REALISATION_ALTAR_1 = ThemeType.themedSlimefunItemStack(
            "CRY_REALISATION_ALTAR_1",
            new ItemStack(Material.CHISELED_DEEPSLATE),
            ThemeType.MECHANISM,
            "真實祭壇 (等級 1)",
            "真實祭壇使用有故事",
            "的方塊並將他們的故事",
            "轉化成物理形式.",
            "",
            "可以真實化 等級1-2."
        );

        REALISATION_ALTAR_2 = ThemeType.themedSlimefunItemStack(
            "CRY_REALISATION_ALTAR_2",
            new ItemStack(Material.CHISELED_NETHER_BRICKS),
            ThemeType.MECHANISM,
            "真實祭壇 (等級 2)",
            "真實祭壇使用有故事",
            "的方塊並將他們的故事",
            "轉化成物理形式.",
            "",
            "可以真實化 等級1-3."
        );

        REALISATION_ALTAR_3 = ThemeType.themedSlimefunItemStack(
            "CRY_REALISATION_ALTAR_3",
            new ItemStack(Material.CHISELED_RED_SANDSTONE),
            ThemeType.MECHANISM,
            "真實祭壇 (等級 3)",
            "真實祭壇使用有故事",
            "的方塊並將他們的故事",
            "轉化成物理形式.",
            "",
            "可以真實化 等級1-4."
        );

        REALISATION_ALTAR_4 = ThemeType.themedSlimefunItemStack(
            "CRY_REALISATION_ALTAR_4",
            new ItemStack(Material.CHISELED_POLISHED_BLACKSTONE),
            ThemeType.MECHANISM,
            "真實祭壇 (等級 4)",
            "真實祭壇使用有故事",
            "的方塊並將他們的故事",
            "轉化成物理形式.",
            "",
            "可以真實化 等級1-5."
        );

        REALISATION_ALTAR_5 = ThemeType.themedSlimefunItemStack(
            "CRY_REALISATION_ALTAR_5",
            new ItemStack(Material.CHISELED_STONE_BRICKS),
            ThemeType.MECHANISM,
            "Realisation Altar (Tier 5)",
            "The realisation altar takes storied",
            "blocks and converts their stories into",
            "a physical form.",
            "",
            "Can realise T1 - T5.",
            "Automatically picks up items thrown on",
            "top of it."
        );

        LIQUEFACTION_BASIN_1 = ThemeType.themedSlimefunItemStack(
            "CRY_LIQUEFACTION_BASIN_1",
            new ItemStack(Material.CAULDRON),
            ThemeType.MECHANISM,
            "液化池 (等級 1)",
            "液化池可以吸收水晶並",
            "將它們轉化成液態水晶",
            "形式. 用於製作魔法.",
            "危險: 不要在填充時破壞這個!",
            "",
            "可以容納 500 個液態水晶能量."
        );

        LIQUEFACTION_BASIN_2 = ThemeType.themedSlimefunItemStack(
            "CRY_LIQUEFACTION_BASIN_2",
            new ItemStack(Material.CAULDRON),
            ThemeType.MECHANISM,
            "液化池 (等級 2)",
            "液化池可以吸收水晶並",
            "將它們轉化成液態水晶",
            "形式. 用於製作魔法.",
            "危險: 不要在填充時破壞這個!",
            "",
            "可以容納 1250 個液態水晶能量."
        );

        LIQUEFACTION_BASIN_3 = ThemeType.themedSlimefunItemStack(
            "CRY_LIQUEFACTION_BASIN_3",
            new ItemStack(Material.CAULDRON),
            ThemeType.MECHANISM,
            "液化池 (等級 3)",
            "液化池可以吸收水晶並",
            "將它們轉化成液態水晶",
            "形式. 用於製作魔法.",
            "危險: 不要在填充時破壞這個!",
            "",
            "可以容納 2500 個液態水晶能量."
        );

        LIQUEFACTION_BASIN_4 = ThemeType.themedSlimefunItemStack(
            "CRY_LIQUEFACTION_BASIN_4",
            new ItemStack(Material.CAULDRON),
            ThemeType.MECHANISM,
            "液化池 (等級 4)",
            "液化池可以吸收水晶並",
            "將它們轉化成液態水晶",
            "形式. 用於製作魔法.",
            "危險: 不要在填充時破壞這個!",
            "",
            "可以容納 5000 個液態水晶能量."
        );

        LIQUEFACTION_BASIN_5 = ThemeType.themedSlimefunItemStack(
            "CRY_LIQUEFACTION_BASIN_5",
            new ItemStack(Material.CAULDRON),
            ThemeType.MECHANISM,
            "Liquefaction Basin (Tier 5)",
            "The liquefaction basin can take",
            "Crystals and convert them into their liquid",
            "Crystamae form. Used for magical crafting.",
            "Danger: Do not break while filled!",
            "",
            "Holds up to 10000 Liquefied Crysta."
        );

        STAVE_CONFIGURATOR = ThemeType.themedSlimefunItemStack(
            "CRY_STAVE_CONFIGURATOR",
            new ItemStack(Material.CUT_COPPER),
            ThemeType.MECHANISM,
            "法杖配置器",
            "法杖配置器可以讓你",
            "將法術板添加至你的",
            "法杖中."
        );

        PRISMATIC_GILDER = ThemeType.themedSlimefunItemStack(
            "CRY_PRISMATIC_GILDER",
            new ItemStack(Material.WARPED_FENCE),
            ThemeType.MECHANISM,
            "Prismatic Gilder",
            "Converts Prismatic Crysta into a",
            "Thin film that can overlay other",
            "magical items."
        );

        // Tools

        INERT_PLATE = ThemeType.themedSlimefunItemStack(
            "CRY_SPELL_PLATE_1",
            new ItemStack(Material.PAPER),
            ThemeType.TOOL,
            "基礎法術板",
            "儲存著魔法潛能的",
            "空白板."
        );

        CHARGED_PLATE = ThemeType.themedSlimefunItemStack(
            "CRY_CHARGED_PLATE_1",
            new ItemStack(Material.PAPER),
            ThemeType.TOOL,
            "充能的基礎法術板",
            "儲存著魔法潛能的",
            "充能魔法板."
        );

        STAVE_BASIC = ThemeType.themedSlimefunItemStack(
            "CRY_STAVE_1",
            new ItemStack(Material.STICK),
            ThemeType.STAVE,
            "基礎法杖",
            "一根具有能力容納",
            "魔法充能板的法杖."
        );

        STAVE_ADVANCED = ThemeType.themedSlimefunItemStack(
            "CRY_STAVE_2",
            new ItemStack(Material.STICK),
            ThemeType.STAVE,
            "進階法杖",
            "一根具有能力容納",
            "魔法充能板的法杖."
        );

        STAVE_ARCANE = ThemeType.themedSlimefunItemStack(
            "CRY_STAVE_3",
            GeneralUtils.getPreEnchantedItemStack(Material.STICK),
            ThemeType.STAVE,
            "奧術法杖",
            "一根具有能力容納",
            "魔法充能板的法杖."
        );

        REFRACTING_LENS = ThemeType.themedSlimefunItemStack(
            "CRY_REFRACTING_LENS",
            new ItemStack(Material.SPYGLASS),
            ThemeType.TOOL,
            "折射鏡片",
            "這個魔法鏡片的特殊玻璃,",
            "可以將水晶的光線分別出",
            "各自的元素.",
            "",
            "右鍵在可運作的水晶方塊上",
            "來獲取詳細資訊.",
            "",
            ThemeType.CLICK_INFO.getColor() + "運作於:",
            ChatColor.DARK_BLUE + "液化池",
            ChatColor.DARK_BLUE + "經驗收集器"
        );

        THAUMATURGIC_SALTS = ThemeType.themedSlimefunItemStack(
            "CRY_THAUMATURGIC_SALT",
            new ItemStack(Material.REDSTONE),
            ThemeType.TOOL,
            "奇術鹽",
            "一種特殊調合的鹽配方,",
            "可以從液化池中吸收掉",
            "不想要的水晶液體.",
            "",
            "右鍵點擊液化池",
            "來將其清空."
        );

        CRYSTA_RECALL_LATTICE = ThemeType.themedSlimefunItemStack(
            "CRY_RECALL_LATTICE",
            new ItemStack(Material.NETHER_STAR),
            ThemeType.TOOL,
            "水晶回傳晶體",
            "右鍵點擊來回傳到綁定的",
            "岔出的路石.",
            "",
            "蹲下右鍵在岔出的路石",
            "來綁定"
        );

        EPHEMERAL_CRAFT_TABLE = ThemeType.themedSlimefunItemStack(
            "CRY_EPHEMERAL_CRAFT_TABLE",
            new ItemStack(Material.CRAFTING_TABLE),
            ThemeType.TOOL,
            "臨時工作台",
            "右鍵點擊可以",
            "在任何地方製作.",
            "僅限原版"
        );

        EPHEMERAL_WORKBENCH = ThemeType.themedSlimefunItemStack(
            "CRY_EPHEMERAL_WORKBENCH",
            new ItemStack(Material.CRAFTING_TABLE),
            ThemeType.TOOL,
            "臨時製作台",
            "右鍵點擊可以",
            "在任何地方製作.",
            "原版 + 進階合成台."
        );

        LUMINESCENCE_SCOOP = ThemeType.themedSlimefunItemStack(
            "CRY_LUMINESCENCE_SCOOP",
            new ItemStack(Material.LANTERN),
            ThemeType.TOOL,
            "冷光勺",
            "右鍵點擊放置",
            "魔法光源.",
            "Shift右鍵點擊來舀回.",
            "",
            ChatColor.YELLOW + "剩餘次數" + ChatColor.GRAY + " 25次"
        );

        BRILLIANCE_SCOOP = ThemeType.themedSlimefunItemStack(
            "CRY_BRILLIANCE_SCOOP",
            new ItemStack(Material.LANTERN),
            ThemeType.TOOL,
            "光輝勺",
            "右鍵點擊放置",
            "魔法光源.",
            "Shift右鍵點擊來舀回.",
            "",
            ChatColor.YELLOW + "剩餘次數" + ChatColor.GRAY + " 75次"
        );

        LUSTRE_SCOOP = ThemeType.themedSlimefunItemStack(
            "CRY_LUSTRE_SCOOP",
            new ItemStack(Material.SOUL_LANTERN),
            ThemeType.TOOL,
            "光彩勺",
            "右鍵點擊放置",
            "魔法光源.",
            "Shift右鍵點擊來舀回.",
            "",
            ChatColor.YELLOW + "剩餘次數" + ChatColor.GRAY + " 250次"
        );

        RADIANCE_SCOOP = ThemeType.themedSlimefunItemStack(
            "CRY_RADIANCE_SCOOP",
            GeneralUtils.getPreEnchantedItemStack(Material.SOUL_LANTERN),
            ThemeType.TOOL,
            "Radiance Scoop",
            "Right click to place a magical",
            "light source.",
            "Shift Right click to scoop back.",
            "Left click to change the light level.",
            "",
            ChatColor.YELLOW + "剩餘次數" + ChatColor.GRAY + " 500次"
        );

        CONNECTING_COMPASS = ThemeType.themedSlimefunItemStack(
            "CRY_CONNECTING_COMPASS",
            new ItemStack(Material.COMPASS),
            ThemeType.TOOL,
            "空間指向指南針",
            "允許你保存一個位置,",
            "以便在以後也可以找到",
            "該儲存位置.",
            "",
            MessageFormat.format("{0}右鍵點擊: {1}顯示儲存的位置", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor()),
            MessageFormat.format("{0}Shift + 右鍵點擊: {1}儲存位置", ThemeType.CLICK_INFO.getColor(), ThemeType.PASSIVE.getColor())
        );

        SPIRITUAL_SILKEN = ThemeType.themedSlimefunItemStack(
            "CRY_SPIRITUAL_SILKEN",
            new ItemStack(Material.BONE),
            ThemeType.TOOL,
            "精神絲綢",
            "這個鎬充滿著精神能量,",
            "使它能夠保持某些",
            "物品的完整性.",
            ChatColor.RED + "只對通常不會掉落",
            ChatColor.RED + "自己的方塊起作用,",
            ChatColor.RED + "無論是否需要絲綢.",
            "",
            ChatColor.YELLOW + "剩餘次數" + ChatColor.GRAY + " 50次"
        );

        INCORPOREAL_SILKEN = ThemeType.themedSlimefunItemStack(
            "CRY_INCORPOREAL_SILKEN",
            new ItemStack(Material.BONE),
            ThemeType.TOOL,
            "Incorporeal Silken",
            "This pick has been imbued with",
            "spiritual energies that allow it",
            "to keep certain items whole.",
            ChatColor.RED + "Only works on blocks that do",
            ChatColor.RED + "not normally drop themselves",
            ChatColor.RED + "both with and without silk.",
            "",
            ChatColor.YELLOW + "剩餘次數" + ChatColor.GRAY + " 1000次"
        );

        SIMPLE_DISPLACER = ThemeType.themedSlimefunItemStack(
            "CRY_SIMPLE_DISPLACER",
            new ItemStack(Material.TORCH),
            ThemeType.TOOL,
            "簡單置換器",
            "置換者可以將一些東西",
            "從這個世界移出, 並用來自",
            "另一個維度的",
            "東西取代它.",
            ChatColor.YELLOW + "剩餘次數" + ChatColor.GRAY + " 50次"
        );

        ARCANE_DISPLACER = ThemeType.themedSlimefunItemStack(
            "CRY_ARCANE_DISPLACER",
            new ItemStack(Material.REDSTONE_TORCH),
            ThemeType.TOOL,
            "奧術置換者",
            "置換者可以將一些東西",
            "從這個世界移出, 並用來自",
            "另一個維度的",
            "東西取代它.",
            ChatColor.YELLOW + "剩餘次數" + ChatColor.GRAY + " 500次"
        );

        SPONGE_BALMY = ThemeType.themedSlimefunItemStack(
            "CRY_SPONGE_BALMY",
            new ItemStack(Material.DEAD_FIRE_CORAL_BLOCK),
            ThemeType.TOOL,
            "溫和的海綿",
            "這種被灌注的海綿能",
            "夠吸取岩漿而不是水.",
            "使用後在水邊清洗.",
            "",
            ThemeType.CLICK_INFO.getColor() + "範圍: " + ThemeType.PASSIVE.getColor() + "4 格方塊"
        );

        SPONGE_SEARING = ThemeType.themedSlimefunItemStack(
            "CRY_SPONGE_SEARING",
            GeneralUtils.getPreEnchantedItemStack(Material.DEAD_FIRE_CORAL_BLOCK),
            ThemeType.TOOL,
            "灼熱的海綿",
            "這種被灌注的海綿能",
            "夠吸取岩漿而不是水.",
            "使用後在水邊清洗.",
            "",
            ThemeType.CLICK_INFO.getColor() + "範圍: " + ThemeType.PASSIVE.getColor() + "7 格方塊"
        );

        SPONGE_SUPER_MASSIVE = ThemeType.themedSlimefunItemStack(
            "CRY_SPONGE_SUPER_MASSIVE",
            GeneralUtils.getPreEnchantedItemStack(Material.DEAD_FIRE_CORAL_BLOCK),
            ThemeType.TOOL,
            "Super Massive Sponge",
            "This imbued sponge is capable",
            "of absorbing lava instead of water.",
            "Place near water to clean after use.",
            "",
            ThemeType.CLICK_INFO.getColor() + "範圍: " + ThemeType.PASSIVE.getColor() + "10 格方塊"
        );

        SLEEPING_BAG = ThemeType.themedSlimefunItemStack(
            "CRY_SLEEPING_BAG",
            new ItemStack(Material.LIGHT_BLUE_BANNER),
            ThemeType.TOOL,
            "符文睡袋",
            "這個睡袋散發出微弱的",
            "保護魔法, 可以在野外",
            "中保護你.",
            "不要用於設定你的重生點."
        );

        DISPLACED_VOID = ThemeType.themedSlimefunItemStack(
            "CRY_DISPLACED_VOID",
            new ItemStack(Material.COCOA_BEANS),
            ThemeType.TOOL,
            "Displaced Void",
            "A Shattered Void displaced into a",
            "pocket sized and portable form.",
            "",
            ThemeType.CLICK_INFO.getColor() + "Hold Shift to pick up nearby Items"
        );

        SATCHEL_1 = ThemeType.themedSlimefunItemStack(
            "CRY_SATCHEL_1",
            new ItemStack(Material.WHITE_CONCRETE),
            ThemeType.TOOL,
            "學徒背包",
            "這個簡易背包可以",
            "為你撿取與儲存水晶.",
            "",
            ThemeType.WARNING.getColor() + "稀有性: " + ThemeType.PASSIVE.getColor() + "僅限獨特"
        );

        SATCHEL_2 = ThemeType.themedSlimefunItemStack(
            "CRY_SATCHEL_2",
            new ItemStack(Material.GRAY_CONCRETE),
            ThemeType.TOOL,
            "水晶魔法師的挎包",
            "這個簡易的挎包可以",
            "為你撿取與儲存水晶.",
            "",
            ThemeType.WARNING.getColor() + "稀有性: " + ThemeType.PASSIVE.getColor() + "獨特 -> 常見"
        );

        SATCHEL_3 = ThemeType.themedSlimefunItemStack(
            "CRY_SATCHEL_3",
            new ItemStack(Material.LIME_CONCRETE),
            ThemeType.TOOL,
            "巫師的挎包",
            "這個簡易的挎包可以",
            "為你撿取與儲存水晶.",
            "",
            ThemeType.WARNING.getColor() + "稀有性: " + ThemeType.PASSIVE.getColor() + "獨特 -> 不常見"
        );

        SATCHEL_4 = ThemeType.themedSlimefunItemStack(
            "CRY_SATCHEL_4",
            new ItemStack(Material.YELLOW_CONCRETE),
            ThemeType.TOOL,
            "咒術士的挎包",
            "這個簡易的挎包可以",
            "為你撿取與儲存水晶.",
            "",
            ThemeType.WARNING.getColor() + "稀有性: " + ThemeType.PASSIVE.getColor() + "獨特 -> 稀有"
        );

        SATCHEL_5 = ThemeType.themedSlimefunItemStack(
            "CRY_SATCHEL_5",
            new ItemStack(Material.PURPLE_CONCRETE),
            ThemeType.TOOL,
            "術士的挎包",
            "這個簡易的挎包可以",
            "為你撿取與儲存水晶.",
            "",
            ThemeType.WARNING.getColor() + "稀有性: " + ThemeType.PASSIVE.getColor() + "獨特 -> 史詩"
        );

        SATCHEL_6 = ThemeType.themedSlimefunItemStack(
            "CRY_SATCHEL_6",
            new ItemStack(Material.RED_CONCRETE),
            ThemeType.TOOL,
            "宗師級奇術師的挎包",
            "這個簡易的挎包可以",
            "為你撿取與儲存水晶.",
            "",
            ThemeType.WARNING.getColor() + "稀有性: " + ThemeType.PASSIVE.getColor() + "獨特 -> 神話"
        );

        CARGO_COVER = ThemeType.themedSlimefunItemStack(
            "CRY_CARGO_COVER",
            new ItemStack(Material.PAPER),
            ThemeType.TOOL,
            "方塊面紗 - 物流",
            "右鍵點擊在物流節點上",
            "放置一個魔法面紗.",
            "面紗將會模仿你",
            "副手所放的方塊.",
            "一次性使用."
        );

        ENERGY_NET_COVER = ThemeType.themedSlimefunItemStack(
            "CRY_ENERGY_NET_COVER",
            new ItemStack(Material.PAPER),
            ThemeType.TOOL,
            "方塊面紗 - 能源網路",
            "右鍵點擊在能源節點上",
            "放置一個魔法面紗.",
            "面紗將會模仿你",
            "副手所放的方塊.",
            "一次性使用."
        );

        NETWORKS_COVER = ThemeType.themedSlimefunItemStack(
            "CRY_NETWORK_COVER",
            new ItemStack(Material.PAPER),
            ThemeType.TOOL,
            "方塊面紗 - 網路",
            "右鍵點擊在網路節點上",
            "放置一個魔法面紗.",
            "面紗將會模仿你",
            "副手所放的方塊.",
            "一次性使用."
        );

        SPELL_TROPHY = ThemeType.themedSlimefunItemStack(
            "CRY_SPELL_TROPHY",
            new ItemStack(Material.PAPER),
            ThemeType.CRAFTING,
            "證明: 宗師級奇術師",
            "證明你是最棒的.",
            "",
            ThemeType.CLICK_INFO.getColor() + "需求: 法術頭銜 > 宗師級奇術師"
        );

        STORY_TROPHY = ThemeType.themedSlimefunItemStack(
            "CRY_STORY_TROPHY",
            new ItemStack(Material.PAPER),
            ThemeType.CRAFTING,
            "證明: 榮譽教授",
            "證明你是最棒的.",
            "",
            ThemeType.CLICK_INFO.getColor() + "需求: 故事頭銜 > 榮譽教授"
        );

        GILDING_TROPHY = ThemeType.themedSlimefunItemStack(
            "CRY_GILDING_TROPHY",
            new ItemStack(Material.PAPER),
            ThemeType.CRAFTING,
            "Proofs: Gilding Owner",
            "Proof that you are simply the best.",
            "",
            ThemeType.CLICK_INFO.getColor() + "Requires: Gilding Rank > Owner"
        );

        CHRISTMAS_TROPHY = ThemeType.themedSlimefunItemStack(
            "CRY_CHRISTMAS_TROPHY",
            new ItemStack(Material.SPRUCE_SAPLING),
            ThemeType.CRAFTING,
            "聖誕快樂",
            "給你的小小禮物...",
            "但你必須為此努力!",
            "",
            ThemeType.CLICK_INFO.getColor() + "需求: 只能在節慶時製作"
        );

        VALENTINES_TROPHY = ThemeType.themedSlimefunItemStack(
            "CRY_VALENTINES_TROPHY",
            new ItemStack(Material.PINK_DYE),
            ThemeType.CRAFTING,
            "情人節快樂",
            "一點點的愛可以走很長的路",
            "",
            ThemeType.CLICK_INFO.getColor() + "需求: 只能在充滿愛情的氣氛中製作"
        );

        BIRTHDAY_TROPHY_CHEESY = ThemeType.themedSlimefunItemStack(
            "CRY_BIRTHDAY_TROPHY_CHEESY",
            new ItemStack(Material.CAKE),
            ThemeType.CRAFTING,
            "生日快樂 Cheesy!",
            "心中的紳士",
            "",
            ThemeType.CLICK_INFO.getColor() + "需求: Cheesy的生日!"
        );

        BIRTHDAY_TROPHY_BWHITE = ThemeType.themedSlimefunItemStack(
            "CRY_BIRTHDAY_TROPHY_BWHITE",
            new ItemStack(Material.CAKE),
            ThemeType.CRAFTING,
            "生日快樂 BWhite!",
            "有史以來最大的 Tantrum 聯合製作者!",
            "",
            ThemeType.CLICK_INFO.getColor() + "需求: BWhite的生日!"
        );

        BIRTHDAY_TROPHY_DECOY = ThemeType.themedSlimefunItemStack(
            "CRY_BIRTHDAY_TROPHY_DECOY",
            new ItemStack(Material.CAKE),
            ThemeType.CRAFTING,
            "生日快樂 Decoy!",
            "有史以來最大的 Tantrum 聯合製作者!",
            "",
            ThemeType.CLICK_INFO.getColor() + "需求: Decoy的生日!"
        );

        BIRTHDAY_TROPHY_ODDISH = ThemeType.themedSlimefunItemStack(
            "CRY_BIRTHDAY_TROPHY_ODDISH",
            new ItemStack(Material.CAKE),
            ThemeType.CRAFTING,
            "生日快樂 Oddish!",
            "一個等待發生的幽暗",
            "",
            ThemeType.CLICK_INFO.getColor() + "需求: Oddish的生日!"
        );

        // Recipe Types

        RECIPE_TYPE_LIQUEFACTION_CRAFTING = ThemeType.themedItemStack(
            Material.CAULDRON,
            ThemeType.MECHANISM,
            "液化池",
            "通過將相應物品丟入",
            "在液化池中填充來",
            "形成正確的水晶."
        );

        RECIPE_TYPE_LIQUEFACTION_SPELL = ThemeType.themedItemStack(
            Material.CAULDRON,
            ThemeType.MECHANISM,
            "液化池",
            "通過將相應物品丟入",
            "在液化池中填充來",
            "形成正確的水晶."
        );

        RECIPE_TYPE_NETHER_DRAINING = ThemeType.themedItemStack(
            Material.OBSIDIAN,
            ThemeType.RESEARCH,
            "Nether Draining",
            "Crysta has a hard time transferring",
            "to the Nether. If it is in it's Crystal",
            "form, all the magic will be drained.",
            "Throw a Mythical Crystal into a nether",
            "portal to drain it.",
            "Any Mythical Crystal will work."
        );

        RECIPE_TYPE_REALISATION_ALTAR_NORMAL = ThemeType.themedItemStack(
            Material.CHISELED_DEEPSLATE,
            ThemeType.MECHANISM,
            "真實祭壇",
            "給予祭壇有著故事的",
            "方塊將會產生水晶.",
            "在真實祭壇周圍產生出的",
            "水晶完全成長時即可開採."
        );

        RECIPE_TYPE_REALISATION_ALTAR_SIGIL = ThemeType.themedItemStack(
            Material.CHISELED_DEEPSLATE,
            ThemeType.MECHANISM,
            "Realisation Altar",
            "Arcane Sigils have a small chance to be",
            "produced when realising Gilded Items."
        );
    }
}
