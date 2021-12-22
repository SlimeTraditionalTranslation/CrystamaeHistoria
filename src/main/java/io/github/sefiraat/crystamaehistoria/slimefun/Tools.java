package io.github.sefiraat.crystamaehistoria.slimefun;

import io.github.sefiraat.crystamaehistoria.CrystamaeHistoria;
import io.github.sefiraat.crystamaehistoria.SupportedPluginManager;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.DummyLiquefactionBasinCrafting;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.LiquefactionBasinCache;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.RecipeItem;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.LuminescenceScoop;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.RecallingCrystaLattice;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.RefactingLens;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.ThaumaturgicSalt;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.covers.BlockVeil;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.crafting.EphemeralCraftingTable;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.crafting.EphemeralWorkBench;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.plates.BlankPlate;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.plates.ChargedPlate;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.stave.Stave;
import io.github.sefiraat.crystamaehistoria.stories.definition.StoryRarity;
import io.github.sefiraat.crystamaehistoria.stories.definition.StoryType;
import io.github.sefiraat.crystamaehistoria.utils.theme.ThemeType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.cargo.AdvancedCargoOutputNode;
import io.github.thebusybiscuit.slimefun4.implementation.items.cargo.CargoConnectorNode;
import io.github.thebusybiscuit.slimefun4.implementation.items.cargo.CargoInputNode;
import io.github.thebusybiscuit.slimefun4.implementation.items.cargo.CargoOutputNode;
import io.github.thebusybiscuit.slimefun4.implementation.items.electric.EnergyConnector;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

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
    private static BlockVeil cargoCover;
    @Getter
    private static BlockVeil energyNetCover;

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
                ChatColor.YELLOW + "25 次剩餘" + ChatColor.GRAY + "次數"
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
                ChatColor.YELLOW + "75 次剩餘" + ChatColor.GRAY + "次數"
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
                ChatColor.YELLOW + "250 次剩餘" + ChatColor.GRAY + "次數"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            lustreScoopRecipe.getDisplayRecipe(),
            250
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

        // Liquefaction Recipes
        LiquefactionBasinCache.addCraftingRecipe(inertPlate, inertPlateRecipe);

        LiquefactionBasinCache.addCraftingRecipe(ephemeralCraftingTable, ephemeralCraftingTableRecipe);
        LiquefactionBasinCache.addCraftingRecipe(ephemeralWorkBench, ephemeralWorkBenchRecipe);

        LiquefactionBasinCache.addCraftingRecipe(luminescenceScoop, luminescenceScoopRecipe);
        LiquefactionBasinCache.addCraftingRecipe(brillianceScoop, brillianceScoopRecipe);
        LiquefactionBasinCache.addCraftingRecipe(lustreScoop, lustreScoopRecipe);


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
    }
}
