package io.github.sefiraat.crystamaehistoria.slimefun;

import io.github.sefiraat.crystamaehistoria.CrystamaeHistoria;
import io.github.sefiraat.crystamaehistoria.slimefun.materials.Crystal;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.DummyLiquefactionBasinCrafting;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.LiquefactionBasinCache;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.RecipeItem;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.realisationaltar.DummyRealisationAltar;
import io.github.sefiraat.crystamaehistoria.stories.definition.StoryRarity;
import io.github.sefiraat.crystamaehistoria.stories.definition.StoryType;
import io.github.sefiraat.crystamaehistoria.utils.Skulls;
import io.github.sefiraat.crystamaehistoria.utils.TextUtils;
import io.github.sefiraat.crystamaehistoria.utils.theme.ThemeType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.EnumMap;
import java.util.Map;

@UtilityClass
public class Materials {

    protected static final Map<StoryType, SlimefunItem> DUMMY_CRYSTAL_MAP = new EnumMap<>(StoryType.class);
    protected static final Map<StoryRarity, Map<StoryType, SlimefunItem>> CRYSTAL_MAP = new EnumMap<>(StoryRarity.class);

    @Getter
    private static SlimefunItem amalgamateDustCommon;
    @Getter
    private static SlimefunItem amalgamateIngotCommon;
    @Getter
    private static SlimefunItem amalgamateDustUncommon;
    @Getter
    private static SlimefunItem amalgamateIngotUncommon;
    @Getter
    private static SlimefunItem amalgamateDustRare;
    @Getter
    private static SlimefunItem amalgamateIngotRare;
    @Getter
    private static SlimefunItem amalgamateDustEpic;
    @Getter
    private static SlimefunItem amalgamateIngotEpic;
    @Getter
    private static SlimefunItem amalgamateDustMythical;
    @Getter
    private static SlimefunItem amalgamateIngotMythical;
    @Getter
    private static SlimefunItem amalgamateDustUnique;
    @Getter
    private static SlimefunItem amalgamateIngotUnique;
    @Getter
    private static SlimefunItem imbuedGlass;
    @Getter
    private static SlimefunItem uncannyPearl;
    @Getter
    private static SlimefunItem gildedPearl;
    @Getter
    private static SlimefunItem basicFibres;

    public static void setup() {

        CrystamaeHistoria plugin = CrystamaeHistoria.getInstance();

        // Dummy Crystals (for recipe & compendium displays)
        for (StoryType type : StoryType.getCachedValues()) {
            ThemeType theme = ThemeType.getByType(type);
            SlimefunItem sfItem = new Crystal(
                ItemGroups.DUMMY_ITEM_GROUP,
                ThemeType.themedSlimefunItemStack(
                    "CRY_CRYSTAL_DUMMY_" + type.toString() + "_" + type.toString(),
                    Skulls.getByType(type).getPlayerHead(),
                    ThemeType.CRYSTAL,
                    theme.getColor() + TextUtils.toTitleCase(ThemeType.getByType(type).getLoreLine() + "水晶"),
                    "物理形態的魔法水晶"
                ),
                DummyRealisationAltar.TYPE,
                new ItemStack[]{},
                StoryRarity.COMMON,
                type
            );
            sfItem.register(plugin);
            DUMMY_CRYSTAL_MAP.put(type, sfItem);
        }

        // Live Crystals
        for (StoryRarity rarity : StoryRarity.getCachedValues()) {
            Map<StoryType, SlimefunItem> storyTypeSlimefunItemMap = new EnumMap<>(StoryType.class);
            for (StoryType type : StoryType.values()) {
                ThemeType theme = ThemeType.getByRarity(rarity);
                SlimefunItem slimefunItem = new Crystal(
                    ItemGroups.CRYSTALS,
                    ThemeType.themedSlimefunItemStack(
                        "CRY_CRYSTAL_" + rarity.toString() + "_" + type.toString(),
                        Skulls.getByType(type).getPlayerHead(),
                        ThemeType.CRYSTAL,
                        theme.getColor() + TextUtils.toTitleCase(theme.getLoreLine() + "" + ThemeType.getByType(type).getLoreLine()) + "水晶",
                        "物理形態的魔法水晶",
                        "更高等級的方塊較容易",
                        "給予更稀有的水晶類型.",
                        "",
                        "提供" + Crystal.getRarityValueMap().get(rarity) + "水晶."
                    ),
                    DummyRealisationAltar.TYPE,
                    new ItemStack[]{null, null, null, null, new ItemStack(Material.AMETHYST_CLUSTER), null, null, null, null},
                    rarity,
                    type
                );
                slimefunItem.register(plugin);
                storyTypeSlimefunItemMap.put(type, slimefunItem);
                CRYSTAL_MAP.put(rarity, storyTypeSlimefunItemMap);
            }
        }

        // Amalgamate Dust Common
        amalgamateDustCommon = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_DUST_COMMON",
                new ItemStack(Material.GLOWSTONE_DUST),
                ThemeType.CRAFTING,
                "汞齊粉 (常見)",
                "一種結合所有魔法種類的粉."
            ),
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.ELEMENTAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.MECHANICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.ALCHEMICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.HISTORICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.HUMAN).getItem(),
                CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.ANIMAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.CELESTIAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.VOID).getItem(),
                CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.PHILOSOPHICAL).getItem()
            }
        );

        // Amalgamate Dust Uncommon
        amalgamateDustUncommon = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_DUST_UNCOMMON",
                new ItemStack(Material.GLOWSTONE_DUST),
                ThemeType.CRAFTING,
                "汞齊粉 (不常見)",
                "一種結合所有魔法種類的粉."
            ),
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.ELEMENTAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.MECHANICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.ALCHEMICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.HISTORICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.HUMAN).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.ANIMAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.CELESTIAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.VOID).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.PHILOSOPHICAL).getItem()
            }
        );

        // Amalgamate Dust Rare
        amalgamateDustRare = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_DUST_RARE",
                new ItemStack(Material.GLOWSTONE_DUST),
                ThemeType.CRAFTING,
                "汞齊粉 (稀有)",
                "一種結合所有魔法種類的粉."
            ),
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.ELEMENTAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.MECHANICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.ALCHEMICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.HISTORICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.HUMAN).getItem(),
                CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.ANIMAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.CELESTIAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.VOID).getItem(),
                CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.PHILOSOPHICAL).getItem()
            }
        );

        // Amalgamate Dust Epic
        amalgamateDustEpic = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_DUST_EPIC",
                new ItemStack(Material.GLOWSTONE_DUST),
                ThemeType.CRAFTING,
                "汞齊粉 (史詩)",
                "一種結合所有魔法種類的粉."
            ),
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.ELEMENTAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.MECHANICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.ALCHEMICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.HISTORICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.HUMAN).getItem(),
                CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.ANIMAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.CELESTIAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.VOID).getItem(),
                CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.PHILOSOPHICAL).getItem()
            }
        );

        // Amalgamate Dust Mythical
        amalgamateDustMythical = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_DUST_MYTHICAL",
                new ItemStack(Material.GLOWSTONE_DUST),
                ThemeType.CRAFTING,
                "汞齊粉 (神話)",
                "一種結合所有魔法種類的粉."
            ),
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.ELEMENTAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.MECHANICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.ALCHEMICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.HISTORICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.HUMAN).getItem(),
                CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.ANIMAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.CELESTIAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.VOID).getItem(),
                CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.PHILOSOPHICAL).getItem()
            }
        );

        // Amalgamate Dust Unique
        amalgamateDustUnique = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_DUST_UNIQUE",
                new ItemStack(Material.GLOWSTONE_DUST),
                ThemeType.CRAFTING,
                "汞齊粉 (獨特)",
                "一種結合所有魔法種類的粉."
            ),
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                CRYSTAL_MAP.get(StoryRarity.UNIQUE).get(StoryType.ELEMENTAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNIQUE).get(StoryType.MECHANICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNIQUE).get(StoryType.ALCHEMICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNIQUE).get(StoryType.HISTORICAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNIQUE).get(StoryType.HUMAN).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNIQUE).get(StoryType.ANIMAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNIQUE).get(StoryType.CELESTIAL).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNIQUE).get(StoryType.VOID).getItem(),
                CRYSTAL_MAP.get(StoryRarity.UNIQUE).get(StoryType.PHILOSOPHICAL).getItem()
            }
        );

        // Amalgamate Ingot Common
        amalgamateIngotCommon = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_INGOT_COMMON",
                new ItemStack(Material.GOLD_INGOT),
                ThemeType.CRAFTING,
                "汞齊錠 (常見)",
                "由純魔法製作的錠."
            ),
            RecipeType.SMELTERY,
            new ItemStack[]{
                amalgamateDustCommon.getItem()
            }
        );

        // Amalgamate Ingot Uncommon
        amalgamateIngotUncommon = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_INGOT_UNCOMMON",
                new ItemStack(Material.GOLD_INGOT),
                ThemeType.CRAFTING,
                "汞齊錠 (不常見)",
                "由純魔法製作的錠."
            ),
            RecipeType.SMELTERY,
            new ItemStack[]{
                amalgamateDustUncommon.getItem()
            }
        );

        // Amalgamate Ingot Rare
        amalgamateIngotRare = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_INGOT_RARE",
                new ItemStack(Material.GOLD_INGOT),
                ThemeType.CRAFTING,
                "汞齊錠 (稀有)",
                "由純魔法製作的錠."
            ),
            RecipeType.SMELTERY,
            new ItemStack[]{
                amalgamateDustRare.getItem()
            }
        );

        // Amalgamate Ingot Epic
        amalgamateIngotEpic = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_INGOT_EPIC",
                new ItemStack(Material.GOLD_INGOT),
                ThemeType.CRAFTING,
                "汞齊錠 (史詩)",
                "由純魔法製作的錠."
            ),
            RecipeType.SMELTERY,
            new ItemStack[]{
                amalgamateDustEpic.getItem()
            }
        );

        // Amalgamate Ingot Mythical
        amalgamateIngotMythical = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_INGOT_MYTHICAL",
                new ItemStack(Material.GOLD_INGOT),
                ThemeType.CRAFTING,
                "汞齊錠 (神話)",
                "由純魔法製作的錠."
            ),
            RecipeType.SMELTERY,
            new ItemStack[]{
                amalgamateDustMythical.getItem()
            }
        );

        // Amalgamate Ingot Unique
        amalgamateIngotUnique = new SlimefunItem(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_AMALGAMATE_INGOT_UNIQUE",
                new ItemStack(Material.GOLD_INGOT),
                ThemeType.CRAFTING,
                "汞齊錠 (獨特)",
                "由純魔法製作的錠."
            ),
            RecipeType.SMELTERY,
            new ItemStack[]{
                amalgamateDustUnique.getItem()
            }
        );

        // Imbued Glass
        RecipeItem imbuedGlassRecipe = new RecipeItem(
            new ItemStack(Material.GLASS_PANE),
            StoryType.ELEMENTAL, 10,
            StoryType.HUMAN, 10,
            StoryType.VOID, 10
        );
        imbuedGlass = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_IMBUED_GLASS",
                new ItemStack(Material.GLASS_PANE),
                ThemeType.CRAFTING,
                "浸透玻璃",
                "浸透著水晶的玻璃,",
                "具有一些奇怪的特性."
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            imbuedGlassRecipe.getDisplayRecipe()
        );

        // Uncanny Pearl
        RecipeItem uncannyPearlRecipe = new RecipeItem(
            new ItemStack(Material.ENDER_PEARL),
            StoryType.VOID, 25,
            StoryType.CELESTIAL, 25,
            StoryType.ALCHEMICAL, 25
        );
        uncannyPearl = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_UNCANNY_PEARL",
                new ItemStack(Material.ENDER_PEARL),
                ThemeType.CRAFTING,
                "不可思議的珍珠",
                "這顆珍珠的內部",
                "共振已被水晶平息."
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            uncannyPearlRecipe.getDisplayRecipe()
        );

        // Gilded Pearl
        gildedPearl = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_GILDED_PEARL",
                new ItemStack(Material.ENDER_PEARL),
                ThemeType.CRAFTING,
                "鍍金的珍珠",
                "當這顆珍珠被平息後,",
                "它將可以安全的鍍金, 並用於",
                "特定製作."
            ),
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                SlimefunItems.GILDED_IRON, SlimefunItems.GILDED_IRON, SlimefunItems.GILDED_IRON,
                SlimefunItems.GILDED_IRON, uncannyPearl.getItem(), SlimefunItems.GILDED_IRON,
                SlimefunItems.GILDED_IRON, SlimefunItems.GILDED_IRON, SlimefunItems.GILDED_IRON
            }
        );

        // Basic Fibres
        RecipeItem basicFibresRecipe = new RecipeItem(
            new ItemStack(Material.WHEAT),
            StoryType.MECHANICAL, 5,
            StoryType.HISTORICAL, 5,
            StoryType.HUMAN, 5
        );
        basicFibres = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "CRY_BASIC_FIBRES",
                new ItemStack(Material.DRIED_KELP),
                ThemeType.CRAFTING,
                "基礎纖維",
                "非常基礎的粗纖維."
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            basicFibresRecipe.getDisplayRecipe()
        );

        // Slimefun Registry
        amalgamateDustCommon.register(plugin);
        amalgamateDustUncommon.register(plugin);
        amalgamateDustRare.register(plugin);
        amalgamateDustEpic.register(plugin);
        amalgamateDustMythical.register(plugin);
        amalgamateDustUnique.register(plugin);
        amalgamateIngotCommon.register(plugin);
        amalgamateIngotUncommon.register(plugin);
        amalgamateIngotRare.register(plugin);
        amalgamateIngotEpic.register(plugin);
        amalgamateIngotMythical.register(plugin);
        amalgamateIngotUnique.register(plugin);
        imbuedGlass.register(plugin);
        uncannyPearl.register(plugin);
        gildedPearl.register(plugin);
        basicFibres.register(plugin);

        // Liquefaction Recipes
        LiquefactionBasinCache.addCraftingRecipe(imbuedGlass, imbuedGlassRecipe);
        LiquefactionBasinCache.addCraftingRecipe(uncannyPearl, uncannyPearlRecipe);
        LiquefactionBasinCache.addCraftingRecipe(basicFibres, basicFibresRecipe);
    }

    public static Map<StoryType, SlimefunItem> getDummyCrystalMap() {
        return DUMMY_CRYSTAL_MAP;
    }

    public static Map<StoryRarity, Map<StoryType, SlimefunItem>> getCrystalMap() {
        return CRYSTAL_MAP;
    }

}
