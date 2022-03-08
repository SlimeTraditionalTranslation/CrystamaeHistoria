package io.github.sefiraat.crystamaehistoria.slimefun;

import io.github.sefiraat.crystamaehistoria.CrystamaeHistoria;
import io.github.sefiraat.crystamaehistoria.SupportedPluginManager;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.DummyLiquefactionBasinCrafting;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.LiquefactionBasinCache;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.RecipeItem;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.BalmySponge;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.ConnectingCompass;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.Displacer;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.LuminescenceScoop;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.RecallingCrystaLattice;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.RefactingLens;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.SleepingBag;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.SpiritualSilken;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.ThaumaturgicSalt;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.covers.BlockVeil;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.crafting.EphemeralCraftingTable;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.crafting.EphemeralWorkBench;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.plates.BlankPlate;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.plates.ChargedPlate;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.satchel.CrystamageSatchel;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.stave.Stave;
import io.github.sefiraat.crystamaehistoria.stories.definition.StoryRarity;
import io.github.sefiraat.crystamaehistoria.stories.definition.StoryType;
import io.github.sefiraat.crystamaehistoria.utils.GeneralUtils;
import io.github.sefiraat.crystamaehistoria.utils.theme.ThemeType;
import io.github.sefiraat.networks.slimefun.NetworksSlimefunItemStacks;
import io.github.sefiraat.networks.slimefun.network.NetworkBridge;
import io.github.sefiraat.networks.slimefun.network.NetworkMonitor;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.cargo.CargoConnectorNode;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.EnergyConnector;
import io.github.thebusybiscuit.slimefun4.libraries.dough.collections.Pair;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import java.text.MessageFormat;

@UtilityClass
public class Tools {

    @Getter
    private static SlimefunItem inertPlate;
    @Getter
    private static SlimefunItem chargedPlate;
    @Getter
    private static Stave staveBasic;
    @Getter
    private static Stave staveAdvanced;
    @Getter
    private static RefactingLens refractingLens;
    @Getter
    private static ThaumaturgicSalt thaumaturgicSalts;
    @Getter
    private static RecallingCrystaLattice crystaRecallLattice;
    @Getter
    private static EphemeralCraftingTable ephemeralCraftingTable;
    @Getter
    private static EphemeralWorkBench ephemeralWorkBench;
    @Getter
    private static LuminescenceScoop luminescenceScoop;
    @Getter
    private static LuminescenceScoop brillianceScoop;
    @Getter
    private static LuminescenceScoop lustreScoop;
    @Getter
    private static ConnectingCompass connectingCompass;
    @Getter
    private static SpiritualSilken spiritualSilken;
    @Getter
    private static Displacer simpleDisplacer;
    @Getter
    private static Displacer arcaneDisplacer;
    @Getter
    private static BlockVeil cargoCover;
    @Getter
    private static BlockVeil energyNetCover;
    @Getter
    private static BlockVeil networkNodeCover;
    @Getter
    private static BalmySponge balmySponge;
    @Getter
    private static BalmySponge searingSponge;
    @Getter
    private static SleepingBag sleepingBag;
    @Getter
    private static CrystamageSatchel apprenticesSatchel;
    @Getter
    private static CrystamageSatchel crystamagesSatchel;
    @Getter
    private static CrystamageSatchel wizardsSatchel;
    @Getter
    private static CrystamageSatchel conjurersSatchel;
    @Getter
    private static CrystamageSatchel sorcerersSatchel;
    @Getter
    private static CrystamageSatchel grandmastersSatchel;

    public static void setup() {
        final CrystamaeHistoria plugin = CrystamaeHistoria.getInstance();

        final ItemStack elementalUniqueCrystal = Materials.CRYSTAL_MAP.get(StoryRarity.UNIQUE).get(StoryType.ELEMENTAL).getItem();
        final ItemStack commonIngot = Materials.getAmalgamateIngotCommon().getItem();
        final ItemStack commonDust = Materials.getAmalgamateDustCommon().getItem();
        final ItemStack epicIngot = Materials.getAmalgamateIngotEpic().getItem();

        // Inert Plate
        RecipeItem inertPlateRecipe = new RecipeItem(
            SlimefunItems.REINFORCED_PLATE.clone(),
            StoryType.ELEMENTAL, 10,
            StoryType.HUMAN, 10,
            StoryType.PHILOSOPHICAL, 10
        );
        inertPlate = new BlankPlate(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
                "CRY_SPELL_PLATE_1",
                new ItemStack(Material.PAPER),
                ThemeType.TOOL,
                "基礎法術板",
                "儲存著魔法潛能的",
                "空白板."
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            inertPlateRecipe.getDisplayRecipe(),
            1
        );


        // Charged Plate
        chargedPlate = new ChargedPlate(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
                "CRY_CHARGED_PLATE_1",
                new ItemStack(Material.PAPER),
                ThemeType.TOOL,
                "充能的基礎法術板",
                "儲存著魔法潛能的",
                "充能魔法板."
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            new ItemStack[]{null, null, null, null, new ItemStack(Material.AMETHYST_CLUSTER), null, null, null, null},
            1
        );

        // Basic Stave
        staveBasic = new Stave(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
                "CRY_STAVE_1",
                new ItemStack(Material.STICK),
                ThemeType.STAVE,
                "基礎法杖",
                "一根具有能力容納",
                "魔法充能板的法杖."
            ),
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                null, null, elementalUniqueCrystal,
                null, new ItemStack(Material.STICK), null,
                new ItemStack(Material.STICK), null, null
            },
            1
        );

        // Advanced Stave
        staveAdvanced = new Stave(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
                "CRY_STAVE_2",
                new ItemStack(Material.STICK),
                ThemeType.STAVE,
                "進階法杖",
                "一根具有能力容納",
                "魔法充能板的法杖."
            ),
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                commonIngot, commonIngot, commonIngot,
                commonIngot, staveBasic.getItem().clone(), commonIngot,
                commonIngot, commonIngot, commonIngot
            },
            2
        );

        // Refracting Lens
        refractingLens = new RefactingLens(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
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
            ),
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                null, Materials.getImbuedGlass().getItem(), null,
                null, new ItemStack(Material.SPYGLASS), null,
                null, commonIngot, null
            }
        );

        // Thaumaturgic Salt
        thaumaturgicSalts = new ThaumaturgicSalt(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
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
            ),
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                commonDust, commonDust, commonDust,
                commonDust, SlimefunItems.SALT, commonDust,
                commonDust, commonDust, commonDust
            }
        );

        // Recall Lattice
        crystaRecallLattice = new RecallingCrystaLattice(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
                "CRY_RECALL_LATTICE",
                new ItemStack(Material.NETHER_STAR),
                ThemeType.TOOL,
                "水晶回傳晶體",
                "右鍵點擊來回傳到綁定的",
                "岔出的路石.",
                "",
                "蹲下右鍵在岔出的路石",
                "來綁定"
            ),
            RecipeType.MAGIC_WORKBENCH,
            new ItemStack[]{
                new ItemStack(Material.AMETHYST_SHARD), epicIngot, new ItemStack(Material.AMETHYST_SHARD),
                epicIngot, new ItemStack(Material.NETHER_STAR), epicIngot,
                new ItemStack(Material.AMETHYST_SHARD), epicIngot, new ItemStack(Material.AMETHYST_SHARD)
            }
        );

        // Ephemeral Crafting Table
        RecipeItem ephemeralCraftingTableRecipe = new RecipeItem(
            new ItemStack(Material.CRAFTING_TABLE),
            StoryType.HUMAN, 50,
            StoryType.HISTORICAL, 25,
            StoryType.PHILOSOPHICAL, 50
        );
        ephemeralCraftingTable = new EphemeralCraftingTable(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
                "CRY_EPHEMERAL_CRAFT_TABLE",
                new ItemStack(Material.CRAFTING_TABLE),
                ThemeType.TOOL,
                "臨時工作台",
                "右鍵點擊可以",
                "在任何地方製作.",
                "僅限原版"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            ephemeralCraftingTableRecipe.getDisplayRecipe()
        );

        // Ephemeral Workbench
        RecipeItem ephemeralWorkBenchRecipe = new RecipeItem(
            ephemeralCraftingTable.getItem(),
            StoryType.HUMAN, 250,
            StoryType.HISTORICAL, 100,
            StoryType.PHILOSOPHICAL, 250
        );
        ephemeralWorkBench = new EphemeralWorkBench(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
                "CRY_EPHEMERAL_WORKBENCH",
                new ItemStack(Material.CRAFTING_TABLE),
                ThemeType.TOOL,
                "臨時製作台",
                "右鍵點擊可以",
                "在任何地方製作.",
                "原版 + 進階合成台."
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            ephemeralWorkBenchRecipe.getDisplayRecipe()
        );

        // Luminesence Scoop
        RecipeItem luminescenceScoopRecipe = new RecipeItem(
            new ItemStack(Material.LANTERN),
            StoryType.CELESTIAL, 70,
            StoryType.ALCHEMICAL, 20,
            StoryType.HUMAN, 15
        );
        luminescenceScoop = new LuminescenceScoop(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
                "CRY_LUMINESCENCE_SCOOP",
                new ItemStack(Material.LANTERN),
                ThemeType.TOOL,
                "冷光勺",
                "右鍵點擊放置",
                "魔法光源.",
                "Shift右鍵點擊來舀回.",
                "",
                ChatColor.YELLOW + "剩餘次數" + ChatColor.GRAY + " 25次"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            luminescenceScoopRecipe.getDisplayRecipe(),
            25
        );

        // Brilliance Scoop
        RecipeItem brillianceScoopRecipe = new RecipeItem(
            luminescenceScoop.getItem(),
            StoryType.CELESTIAL, 140,
            StoryType.ALCHEMICAL, 40,
            StoryType.HUMAN, 30
        );
        brillianceScoop = new LuminescenceScoop(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
                "CRY_BRILLIANCE_SCOOP",
                new ItemStack(Material.LANTERN),
                ThemeType.TOOL,
                "光輝勺",
                "右鍵點擊放置",
                "魔法光源.",
                "Shift右鍵點擊來舀回.",
                "",
                ChatColor.YELLOW + "剩餘次數" + ChatColor.GRAY + " 75次"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            brillianceScoopRecipe.getDisplayRecipe(),
            75
        );

        // Lustre Scoop
        RecipeItem lustreScoopRecipe = new RecipeItem(
            brillianceScoop.getItem(),
            StoryType.CELESTIAL, 280,
            StoryType.ALCHEMICAL, 80,
            StoryType.HUMAN, 60
        );
        lustreScoop = new LuminescenceScoop(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
                "CRY_LUSTRE_SCOOP",
                new ItemStack(Material.SOUL_LANTERN),
                ThemeType.TOOL,
                "光彩勺",
                "右鍵點擊放置",
                "魔法光源.",
                "Shift右鍵點擊來舀回.",
                "",
                ChatColor.YELLOW + "剩餘次數" + ChatColor.GRAY + " 250次"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            lustreScoopRecipe.getDisplayRecipe(),
            250
        );

        // Connecting Compass
        RecipeItem connectingCompassRecipe = new RecipeItem(
            new ItemStack(Material.COMPASS),
            StoryType.MECHANICAL, 5,
            StoryType.HISTORICAL, 10,
            StoryType.HUMAN, 5
        );
        connectingCompass = new ConnectingCompass(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
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
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            connectingCompassRecipe.getDisplayRecipe()
        );

        // Spiritual Silken
        RecipeItem spiritualSilkenRecipe = new RecipeItem(
            new ItemStack(Material.BONE),
            StoryType.MECHANICAL, 250,
            StoryType.HUMAN, 250,
            StoryType.CELESTIAL, 250
        );
        spiritualSilken = new SpiritualSilken(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
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
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            spiritualSilkenRecipe.getDisplayRecipe(),
            50
        );

        // Simple Displacer
        RecipeItem simpleDisplacerRecipe = new RecipeItem(
            Materials.getPowderedEssence().getItem(),
            StoryType.ALCHEMICAL, 120,
            StoryType.ANIMAL, 70,
            StoryType.HUMAN, 60
        );
        simpleDisplacer = new Displacer(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
                "CRY_SIMPLE_DISPLACER",
                new ItemStack(Material.TORCH),
                ThemeType.TOOL,
                "簡單置換器",
                "置換者可以將一些東西",
                "從這個世界移出, 並用來自",
                "另一個維度的",
                "東西取代它.",
                ChatColor.YELLOW + "剩餘次數" + ChatColor.GRAY + " 50次"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            simpleDisplacerRecipe.getDisplayRecipe(),
            50
        );

        // Arcane Displacer
        RecipeItem arcaneDisplacerRecipe = new RecipeItem(
            simpleDisplacer.getItem(),
            StoryType.ALCHEMICAL, 240,
            StoryType.ANIMAL, 140,
            StoryType.HUMAN, 120
        );
        arcaneDisplacer = new Displacer(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
                "CRY_ARCANE_DISPLACER",
                new ItemStack(Material.REDSTONE_TORCH),
                ThemeType.TOOL,
                "奧術置換者",
                "置換者可以將一些東西",
                "從這個世界移出, 並用來自",
                "另一個維度的",
                "東西取代它.",
                ChatColor.YELLOW + "剩餘次數" + ChatColor.GRAY + " 500次"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            arcaneDisplacerRecipe.getDisplayRecipe(),
            500
        );

        // Balmy Sponge
        RecipeItem balmySpongeRecipe = new RecipeItem(
            new ItemStack(Material.SPONGE),
            StoryType.ELEMENTAL, 45,
            StoryType.ALCHEMICAL, 30,
            StoryType.VOID, 25
        );
        balmySponge = new BalmySponge(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
                "CRY_SPONGE_BALMY",
                new ItemStack(Material.DEAD_FIRE_CORAL_BLOCK),
                ThemeType.TOOL,
                "溫和的海綿",
                "這種被灌注的海綿能",
                "夠吸取岩漿而不是水.",
                "使用後在水邊清洗.",
                "",
                ThemeType.CLICK_INFO.getColor() + "範圍: " + ThemeType.PASSIVE.getColor() + "4 格方塊"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            balmySpongeRecipe.getDisplayRecipe(),
            4
        );

        // Searing Sponge
        RecipeItem searingSpongeRecipe = new RecipeItem(
            balmySponge.getItem(),
            StoryType.ELEMENTAL, 90,
            StoryType.ALCHEMICAL, 60,
            StoryType.VOID, 50
        );
        searingSponge = new BalmySponge(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
                "CRY_SPONGE_SEARING",
                GeneralUtils.getPreEnchantedItemStack(Material.DEAD_FIRE_CORAL_BLOCK, true, new Pair<>(Enchantment.LURE, 1)),
                ThemeType.TOOL,
                "灼熱的海綿",
                "這種被灌注的海綿能",
                "夠吸取岩漿而不是水.",
                "使用後在水邊清洗.",
                "",
                ThemeType.CLICK_INFO.getColor() + "範圍: " + ThemeType.PASSIVE.getColor() + "7 格方塊"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            searingSpongeRecipe.getDisplayRecipe(),
            7
        );

        // Sleeping Bag
        RecipeItem sleepingBagRecipe = new RecipeItem(
            balmySponge.getItem(),
            StoryType.MECHANICAL, 75,
            StoryType.HISTORICAL, 100,
            StoryType.HUMAN, 100
        );
        sleepingBag = new SleepingBag(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
                "CRY_SLEEPING_BAG",
                new ItemStack(Material.LIGHT_BLUE_BANNER),
                ThemeType.TOOL,
                "符文睡袋",
                "這個睡袋散發出微弱的",
                "保護魔法, 可以在野外",
                "中保護你.",
                "不要用於設定你的重生點."
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            sleepingBagRecipe.getDisplayRecipe()
        );

        // Apprentices Satchel
        RecipeItem apprenticesSatchelRecipe = new RecipeItem(
            new ItemStack(Material.TRAPPED_CHEST),
            StoryType.ELEMENTAL, 25,
            StoryType.HUMAN, 25,
            StoryType.PHILOSOPHICAL, 25
        );
        apprenticesSatchel = new CrystamageSatchel(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
                "CRY_SATCHEL_1",
                new ItemStack(Material.WHITE_CONCRETE),
                ThemeType.TOOL,
                "學徒背包",
                "這個簡易背包可以",
                "為你撿取與儲存水晶.",
                "",
                ThemeType.WARNING.getColor() + "稀有性: " + ThemeType.PASSIVE.getColor() + "僅限獨特"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            apprenticesSatchelRecipe.getDisplayRecipe(),
            1
        );

        // Crystamages Satchel
        RecipeItem crystamagesSatchelRecipe = new RecipeItem(
            apprenticesSatchel.getItem(),
            StoryType.ALCHEMICAL, 35,
            StoryType.ANIMAL, 35,
            StoryType.VOID, 35
        );
        crystamagesSatchel = new CrystamageSatchel(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
                "CRY_SATCHEL_2",
                new ItemStack(Material.GRAY_CONCRETE),
                ThemeType.TOOL,
                "水晶魔法師的挎包",
                "這個簡易的挎包可以",
                "為你撿取與儲存水晶.",
                "",
                ThemeType.WARNING.getColor() + "稀有性: " + ThemeType.PASSIVE.getColor() + "獨特 -> 常見"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            crystamagesSatchelRecipe.getDisplayRecipe(),
            2
        );

        // Wizards Satchel
        RecipeItem wizardsSatchelRecipe = new RecipeItem(
            crystamagesSatchel.getItem(),
            StoryType.MECHANICAL, 45,
            StoryType.HISTORICAL, 45,
            StoryType.CELESTIAL, 45
        );
        wizardsSatchel = new CrystamageSatchel(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
                "CRY_SATCHEL_3",
                new ItemStack(Material.LIME_CONCRETE),
                ThemeType.TOOL,
                "巫師的挎包",
                "這個簡易的挎包可以",
                "為你撿取與儲存水晶.",
                "",
                ThemeType.WARNING.getColor() + "稀有性: " + ThemeType.PASSIVE.getColor() + "獨特 -> 不常見"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            wizardsSatchelRecipe.getDisplayRecipe(),
            3
        );

        // Conjurers Satchel
        RecipeItem conjurersSatchelRecipe = new RecipeItem(
            wizardsSatchel.getItem(),
            StoryType.ELEMENTAL, 55,
            StoryType.HUMAN, 55,
            StoryType.PHILOSOPHICAL, 55
        );
        conjurersSatchel = new CrystamageSatchel(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
                "CRY_SATCHEL_4",
                new ItemStack(Material.YELLOW_CONCRETE),
                ThemeType.TOOL,
                "咒術士的挎包",
                "這個簡易的挎包可以",
                "為你撿取與儲存水晶.",
                "",
                ThemeType.WARNING.getColor() + "稀有性: " + ThemeType.PASSIVE.getColor() + "獨特 -> 稀有"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            conjurersSatchelRecipe.getDisplayRecipe(),
            4
        );

        // Sorcerers Satchel
        RecipeItem sorcerersSatchelRecipe = new RecipeItem(
            conjurersSatchel.getItem(),
            StoryType.ALCHEMICAL, 65,
            StoryType.ANIMAL, 65,
            StoryType.VOID, 65
        );
        sorcerersSatchel = new CrystamageSatchel(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
                "CRY_SATCHEL_5",
                new ItemStack(Material.PURPLE_CONCRETE),
                ThemeType.TOOL,
                "術士的挎包",
                "這個簡易的挎包可以",
                "為你撿取與儲存水晶.",
                "",
                ThemeType.WARNING.getColor() + "稀有性: " + ThemeType.PASSIVE.getColor() + "獨特 -> 史詩"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            sorcerersSatchelRecipe.getDisplayRecipe(),
            5
        );

        // Grandmasters Satchel
        RecipeItem grandmastersSatchelRecipe = new RecipeItem(
            sorcerersSatchel.getItem(),
            StoryType.MECHANICAL, 75,
            StoryType.HISTORICAL, 75,
            StoryType.CELESTIAL, 75
        );
        grandmastersSatchel = new CrystamageSatchel(
            ItemGroups.TOOLS,
            ThemeType.themedSlimefunItemStack(
                "CRY_SATCHEL_6",
                new ItemStack(Material.RED_CONCRETE),
                ThemeType.TOOL,
                "宗師級奇術師的挎包",
                "這個簡易的挎包可以",
                "為你撿取與儲存水晶.",
                "",
                ThemeType.WARNING.getColor() + "稀有性: " + ThemeType.PASSIVE.getColor() + "獨特 -> 神話"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            grandmastersSatchelRecipe.getDisplayRecipe(),
            6
        );

        // Slimefun Registry
        chargedPlate.register(CrystamaeHistoria.getInstance());
        inertPlate.register(CrystamaeHistoria.getInstance());
        staveBasic.register(plugin);
        staveAdvanced.register(plugin);
        refractingLens.register(plugin);
        thaumaturgicSalts.register(plugin);
        crystaRecallLattice.register(plugin);
        ephemeralCraftingTable.register(plugin);
        ephemeralWorkBench.register(plugin);
        luminescenceScoop.register(plugin);
        brillianceScoop.register(plugin);
        lustreScoop.register(plugin);
        connectingCompass.register(plugin);
        spiritualSilken.register(plugin);
        simpleDisplacer.register(plugin);
        arcaneDisplacer.register(plugin);
        balmySponge.register(plugin);
        searingSponge.register(plugin);
        sleepingBag.register(plugin);
        apprenticesSatchel.register(plugin);
        crystamagesSatchel.register(plugin);
        wizardsSatchel.register(plugin);
        conjurersSatchel.register(plugin);
        sorcerersSatchel.register(plugin);
        grandmastersSatchel.register(plugin);

        // Liquefaction Recipes
        LiquefactionBasinCache.addCraftingRecipe(inertPlate, inertPlateRecipe);

        LiquefactionBasinCache.addCraftingRecipe(ephemeralCraftingTable, ephemeralCraftingTableRecipe);
        LiquefactionBasinCache.addCraftingRecipe(ephemeralWorkBench, ephemeralWorkBenchRecipe);

        LiquefactionBasinCache.addCraftingRecipe(luminescenceScoop, luminescenceScoopRecipe);
        LiquefactionBasinCache.addCraftingRecipe(brillianceScoop, brillianceScoopRecipe);
        LiquefactionBasinCache.addCraftingRecipe(lustreScoop, lustreScoopRecipe);

        LiquefactionBasinCache.addCraftingRecipe(connectingCompass, connectingCompassRecipe);

        LiquefactionBasinCache.addCraftingRecipe(spiritualSilken, spiritualSilkenRecipe);

        LiquefactionBasinCache.addCraftingRecipe(simpleDisplacer, simpleDisplacerRecipe);
        LiquefactionBasinCache.addCraftingRecipe(arcaneDisplacer, arcaneDisplacerRecipe);

        LiquefactionBasinCache.addCraftingRecipe(balmySponge, balmySpongeRecipe);
        LiquefactionBasinCache.addCraftingRecipe(searingSponge, searingSpongeRecipe);

        LiquefactionBasinCache.addCraftingRecipe(sleepingBag, sleepingBagRecipe);

        LiquefactionBasinCache.addCraftingRecipe(apprenticesSatchel, apprenticesSatchelRecipe);
        LiquefactionBasinCache.addCraftingRecipe(crystamagesSatchel, crystamagesSatchelRecipe);
        LiquefactionBasinCache.addCraftingRecipe(wizardsSatchel, wizardsSatchelRecipe);
        LiquefactionBasinCache.addCraftingRecipe(conjurersSatchel, conjurersSatchelRecipe);
        LiquefactionBasinCache.addCraftingRecipe(sorcerersSatchel, sorcerersSatchelRecipe);
        LiquefactionBasinCache.addCraftingRecipe(grandmastersSatchel, grandmastersSatchelRecipe);

        /*
        Covers 'hide' items from HL - until the tile entity check
        is swapped out to extend to all SlimefunItems we don't want
        to allow the items to exist here.
         */
        if (!SupportedPluginManager.isHeadLimiter()) {
            // Cargo Cover
            SlimefunItemStack cargoCoverStack = ThemeType.themedSlimefunItemStack(
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
            RecipeItem cargoCoverRecipe = new RecipeItem(
                SlimefunItems.CARGO_INPUT_NODE,
                StoryType.MECHANICAL, 10,
                StoryType.HUMAN, 10,
                StoryType.VOID, 10
            );
            cargoCover = new BlockVeil(
                ItemGroups.TOOLS,
                cargoCoverStack,
                DummyLiquefactionBasinCrafting.TYPE,
                cargoCoverRecipe.getDisplayRecipe(),
                cargoCoverStack.asQuantity(8),
                CargoConnectorNode.class
            );

            // Energy Net Cover
            SlimefunItemStack energyNetCoverStack = ThemeType.themedSlimefunItemStack(
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
            RecipeItem energyNetCoverRecipe = new RecipeItem(
                SlimefunItems.ENERGY_CONNECTOR,
                StoryType.MECHANICAL, 10,
                StoryType.HUMAN, 10,
                StoryType.VOID, 10
            );
            energyNetCover = new BlockVeil(
                ItemGroups.TOOLS,
                energyNetCoverStack,
                DummyLiquefactionBasinCrafting.TYPE,
                energyNetCoverRecipe.getDisplayRecipe(),
                energyNetCoverStack.asQuantity(8),
                EnergyConnector.class
            );


            cargoCover.register(plugin);
            energyNetCover.register(plugin);

            LiquefactionBasinCache.addCraftingRecipe(cargoCover, cargoCoverRecipe);
            LiquefactionBasinCache.addCraftingRecipe(energyNetCover, energyNetCoverRecipe);
        }

        if (SupportedPluginManager.isNetworks()) {

            // Networks Cover
            SlimefunItemStack networksCoverStack = ThemeType.themedSlimefunItemStack(
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
            RecipeItem networksCoverRecipe = new RecipeItem(
                NetworksSlimefunItemStacks.NETWORK_BRIDGE,
                StoryType.MECHANICAL, 10,
                StoryType.HUMAN, 10,
                StoryType.VOID, 10
            );
            networkNodeCover = new BlockVeil(
                ItemGroups.TOOLS,
                networksCoverStack,
                DummyLiquefactionBasinCrafting.TYPE,
                networksCoverRecipe.getDisplayRecipe(),
                networksCoverStack.asQuantity(8),
                NetworkBridge.class,
                NetworkMonitor.class
            );

            networkNodeCover.register(plugin);

            LiquefactionBasinCache.addCraftingRecipe(networkNodeCover, networksCoverRecipe);
        }
    }
}
