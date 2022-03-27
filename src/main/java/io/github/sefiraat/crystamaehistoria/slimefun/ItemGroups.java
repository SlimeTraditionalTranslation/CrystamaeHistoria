package io.github.sefiraat.crystamaehistoria.slimefun;

import io.github.sefiraat.crystamaehistoria.CrystamaeHistoria;
import io.github.sefiraat.crystamaehistoria.slimefun.itemgroups.DummyGuideOnly;
import io.github.sefiraat.crystamaehistoria.slimefun.itemgroups.DummyItemGroup;
import io.github.sefiraat.crystamaehistoria.slimefun.itemgroups.GildedCollectionFlexGroup;
import io.github.sefiraat.crystamaehistoria.slimefun.itemgroups.MainFlexGroup;
import io.github.sefiraat.crystamaehistoria.slimefun.itemgroups.SpellCollectionFlexGroup;
import io.github.sefiraat.crystamaehistoria.slimefun.itemgroups.StoryCollectionFlexGroup;
import io.github.sefiraat.crystamaehistoria.slimefun.items.artistic.MagicPaintbrush;
import io.github.sefiraat.crystamaehistoria.utils.Keys;
import io.github.sefiraat.crystamaehistoria.utils.Skulls;
import io.github.sefiraat.crystamaehistoria.utils.theme.ThemeType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.experimental.UtilityClass;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.Skull;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class ItemGroups {

    public static final DummyItemGroup DUMMY_ITEM_GROUP = new DummyItemGroup(
        Keys.newKey("dummy"),
        new CustomItemStack(
            new ItemStack(Material.FIRE_CHARGE),
            ThemeType.MAIN.getColor() + "水晶編年史模型"
        )
    );
    public static final MainFlexGroup MAIN = new MainFlexGroup(
        Keys.newKey("main"),
        new CustomItemStack(
            new ItemStack(Material.AMETHYST_CLUSTER),
            ThemeType.MAIN.getColor() + "水晶編年史"
        )
    );
    public static final DummyItemGroup MECHANISMS = new DummyItemGroup(
        Keys.newKey("mechanisms"),
        new CustomItemStack(
            new ItemStack(Material.DEEPSLATE_TILE_SLAB),
            ThemeType.MAIN.getColor() + "編年史 - 機制"
        )
    );
    public static final DummyItemGroup CRYSTALS = new DummyItemGroup(
        Keys.newKey("crystals"),
        new CustomItemStack(
            new ItemStack(Material.AMETHYST_CLUSTER),
            ThemeType.MAIN.getColor() + "編年史 - 水晶"
        )
    );
    public static final DummyItemGroup TOOLS = new DummyItemGroup(
        Keys.newKey("tools"),
        new CustomItemStack(
            new ItemStack(Material.STICK),
            ThemeType.MAIN.getColor() + "編年史 - 法杖和工具"
        )
    );
    public static final DummyItemGroup ARTISTIC = new DummyItemGroup(
        Keys.newKey("art"),
        new CustomItemStack(
            MagicPaintbrush.getTippedBrush(DyeColor.WHITE, true),
            ThemeType.MAIN.getColor() + "編年史 - 藝術性魔法"
        )
    );
    public static final DummyItemGroup GADGETS = new DummyItemGroup(
        Keys.newKey("gadgets"),
        new CustomItemStack(
            new ItemStack(Material.REDSTONE_LAMP),
            ThemeType.MAIN.getColor() + "魔法技術和工具"
        )
    );
    public static final DummyItemGroup EXALTED = new DummyItemGroup(
        Keys.newKey("exalted"),
        new CustomItemStack(
            new ItemStack(Material.BEACON),
            ThemeType.MAIN.getColor() + "尊貴物品"
        )
    );
    public static final DummyItemGroup MATERIALS = new DummyItemGroup(
        Keys.newKey("materials"),
        new CustomItemStack(
            new ItemStack(Material.GOLD_INGOT),
            ThemeType.MAIN.getColor() + "水晶 - 原料"
        )
    );
    public static final DummyItemGroup RUNES = new DummyItemGroup(
        Keys.newKey("runes"),
        new CustomItemStack(
            new ItemStack(Material.ENCHANTING_TABLE),
            ThemeType.MAIN.getColor() + "Arcane Runes"
        )
    );
    public static final DummyItemGroup UNIQUES = new DummyItemGroup(
        Keys.newKey("uniques"),
        new CustomItemStack(
            new ItemStack(Material.NETHER_STAR),
            ThemeType.MAIN.getColor() + "獨特"
        )
    );
    public static final DummyItemGroup GUIDE = new DummyItemGroup(
        Keys.newKey("guide"),
        new CustomItemStack(
            new ItemStack(Material.BOOK),
            ThemeType.MAIN.getColor() + "水晶 - 雜項指南"
        )
    );
    public static final StoryCollectionFlexGroup STORY_COLLECTION = new StoryCollectionFlexGroup(
        Keys.newKey("story_collection"),
        new CustomItemStack(
            new ItemStack(Material.KNOWLEDGE_BOOK),
            ThemeType.MAIN.getColor() + "故事收藏"
        )
    );
    public static final SpellCollectionFlexGroup SPELL_COLLECTION = new SpellCollectionFlexGroup(
        Keys.newKey("spell_collection"),
        new CustomItemStack(
            new ItemStack(Material.KNOWLEDGE_BOOK),
            ThemeType.MAIN.getColor() + "法術收藏"
        )
    );
    public static final GildedCollectionFlexGroup GILDING_COLLECTION = new GildedCollectionFlexGroup(
        Keys.newKey("gilding_collection"),
        new CustomItemStack(
            new ItemStack(Material.KNOWLEDGE_BOOK),
            ThemeType.MAIN.getColor() + "Gilding Collection"
        )
    );


    public static void setup() {
        final CrystamaeHistoria plugin = CrystamaeHistoria.getInstance();

        /*
        These items are for the misc guide which serves to inform players
        how the more abstract mechanics work where a true recipe doesn't
        suit or would be detrimental to the process.
         */

        // Chronicler
        SlimefunItem guideChronicler = new SlimefunItem(
            ItemGroups.GUIDE,
            ThemeType.themedSlimefunItemStack(
                "CRY_GUIDE_CHRONICLER",
                new ItemStack(Material.DEEPSLATE_TILE_SLAB),
                ThemeType.GUIDE,
                "記錄者面板指南",
                "記錄者面板將會拿一個方塊",
                "並 '記錄' 下屬於它的故事.",
                "故事類型將由方塊來決定,",
                "數量是隨機的, 但取決於它的等級.",
                "",
                "記錄者只能運作於",
                "方塊的匹配 等級 + 1.",
                "",
                "當方塊的獨特故事被記錄下來,",
                "並且該方塊停止浮動時,",
                "就代表已經完成記錄."
            ),
            DummyGuideOnly.TYPE,
            new ItemStack[]{}
        );

        // Realisation
        SlimefunItem guideRealisation = new SlimefunItem(
            ItemGroups.GUIDE,
            ThemeType.themedSlimefunItemStack(
                "CRY_GUIDE_REALISATION",
                new ItemStack(Material.CHISELED_DEEPSLATE),
                ThemeType.GUIDE,
                "真實祭壇指南",
                "在真實祭壇上放置",
                "一個完整記錄的方塊,",
                "它將會開始消耗方塊的故事,",
                "並將方塊變成附近地面上的水晶結構.",
                "",
                "",
                "這些水晶將會緩慢的成長,",
                "當它完全成形後, 將可以分解",
                "成水晶."
            ),
            DummyGuideOnly.TYPE,
            new ItemStack[]{}
        );

        // Liquefaction
        SlimefunItem guideLiquefaction = new SlimefunItem(
            ItemGroups.GUIDE,
            ThemeType.themedSlimefunItemStack(
                "CRY_GUIDE_LIQUEFACTION",
                new ItemStack(Material.CAULDRON),
                ThemeType.GUIDE,
                "液化池指南",
                "液化池是你可以",
                "製作酷東西的地方.",
                "",
                "你扔進去的任何水晶",
                "都會融化成液體.",
                "當你扔進不是水晶的",
                "物品時, 它將會嘗試",
                "用它製作物品.",
                "",
                "如果弄錯, 你將會失去你的水晶能量."
            ),
            DummyGuideOnly.TYPE,
            new ItemStack[]{}
        );

        // Stave Configurator
        SlimefunItem guideStave = new SlimefunItem(
            ItemGroups.GUIDE,
            ThemeType.themedSlimefunItemStack(
                "CRY_GUIDE_STAVE_CONFIGURATOR",
                new ItemStack(Material.CAULDRON),
                ThemeType.GUIDE,
                "法杖配置器",
                "將法杖放入配置器的",
                "輸入欄位. 添加充能的法術板",
                "到四個法術欄位中, 然後點擊",
                "'添加法術板'. 點擊 '移除' 來",
                "移除它們.",
                "",
                "法術可以自由地更換, 不需要任何成本."
            ),
            DummyGuideOnly.TYPE,
            new ItemStack[]{}
        );

        // Make a Spell
        SlimefunItem guideMakeSpell = new SlimefunItem(
            ItemGroups.GUIDE,
            ThemeType.themedSlimefunItemStack(
                "CRY_GUIDE_MAKE_SPELL",
                new ItemStack(Material.PAPER),
                ThemeType.GUIDE,
                "如何: 製作法術",
                "要製作法術, 首先要製作基礎的",
                "法術板. 在液化池中,",
                "填入至少三種不同",
                "類型的水晶 - 然後將",
                "板子丟入"
            ),
            DummyGuideOnly.TYPE,
            new ItemStack[]{}
        );

        // Recharge a Spell
        SlimefunItem guideChargeSpell = new SlimefunItem(
            ItemGroups.GUIDE,
            ThemeType.themedSlimefunItemStack(
                "CRY_GUIDE_CHARGE_SPELL",
                new ItemStack(Material.PAPER),
                ThemeType.GUIDE,
                "如何: 重新充能法術",
                "要重新填充法術板, 首先要",
                "用法杖配置器將法術板從法杖上",
                "取下. 然後在液化池中,",
                "製作法術配方並將它",
                "丟進去充能. 它將會在重新裝滿",
                "水晶能量在裡面."
            ),
            DummyGuideOnly.TYPE,
            new ItemStack[]{}
        );

        // Nether Draining
        SlimefunItem guideNetherDraining = new SlimefunItem(
            ItemGroups.GUIDE,
            ThemeType.themedSlimefunItemStack(
                "CRY_GUIDE_NETHER_DRAINING",
                Skulls.CRYSTAL_CLEAR.getPlayerHead(),
                ThemeType.GUIDE,
                "How To: Nether Draining",
                "When a Mythical Crystal is thrown",
                "through a Nether Portal the magic",
                "will be drained out of it leaving",
                "behind a blank crystal that is able",
                "to have different forms of magic",
                "re-inserted."
            ),
            DummyGuideOnly.TYPE,
            new ItemStack[]{}
        );

        // Prismatic Gilding
        SlimefunItem guideGilding = new SlimefunItem(
            ItemGroups.GUIDE,
            ThemeType.themedSlimefunItemStack(
                "CRY_GUIDE_GILDING",
                new ItemStack(Material.WARPED_FENCE),
                ThemeType.GUIDE,
                "How To: Gilding",
                "The Prismatic Guider takes thrown",
                "prismatic crystals and will convert",
                "the energy into wild unbound magic.",
                "You can then right click the gilder",
                "with a fully-storied block it will",
                "be gilded. Requires an amount of",
                "Prismatic Crysta equal to the block",
                "tier.",
                "Gilded Crystals must be broken manually."
            ),
            DummyGuideOnly.TYPE,
            new ItemStack[]{}
        );

        // Slimefun Registry
        ItemGroups.MAIN.register(plugin);

        guideChronicler.register(plugin);
        guideRealisation.register(plugin);
        guideLiquefaction.register(plugin);
        guideStave.register(plugin);
        guideMakeSpell.register(plugin);
        guideChargeSpell.register(plugin);
        guideNetherDraining.register(plugin);
        guideGilding.register(plugin);
    }
}
