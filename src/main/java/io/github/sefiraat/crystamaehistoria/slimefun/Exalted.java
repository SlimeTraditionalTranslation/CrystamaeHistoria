package io.github.sefiraat.crystamaehistoria.slimefun;

import io.github.sefiraat.crystamaehistoria.CrystamaeHistoria;
import io.github.sefiraat.crystamaehistoria.player.PlayerStatistics;
import io.github.sefiraat.crystamaehistoria.player.SpellRank;
import io.github.sefiraat.crystamaehistoria.player.StoryRank;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.DummyLiquefactionBasinCrafting;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.LiquefactionBasinCache;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.RecipeItem;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.exhalted.ExaltedBeacon;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.exhalted.ExaltedFertilityPharo;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.exhalted.ExaltedHarvester;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.exhalted.ExaltedTime;
import io.github.sefiraat.crystamaehistoria.slimefun.tools.exhalted.ExaltedWeather;
import io.github.sefiraat.crystamaehistoria.stories.definition.StoryType;
import io.github.sefiraat.crystamaehistoria.utils.GeneralUtils;
import io.github.sefiraat.crystamaehistoria.utils.WorldUtils;
import io.github.sefiraat.crystamaehistoria.utils.theme.ThemeType;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.WeatherType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class Exalted {

    @Getter
    private static ExaltedBeacon exaltedBeacon;
    @Getter
    private static ExaltedFertilityPharo exaltedFertilityPharo;
    @Getter
    private static ExaltedHarvester exaltedHarvester;
    @Getter
    private static ExaltedTime exaltedDawn;
    @Getter
    private static ExaltedTime exaltedDusk;
    @Getter
    private static ExaltedWeather exaltedSun;
    @Getter
    private static ExaltedWeather exaltedStorm;

    public static void setup() {

        final CrystamaeHistoria plugin = CrystamaeHistoria.getInstance();

        final ItemStack amalgamateIngotMythical = Materials.getAmalgamateIngotMythical().getItem();
        final ItemStack amalgamateDustMythical = Materials.getAmalgamateDustMythical().getItem();

        // Exaltation Beacon
        RecipeItem exaltedBeaconRecipe = new RecipeItem(
            amalgamateIngotMythical,
            StoryType.ELEMENTAL, 500,
            StoryType.HUMAN, 500,
            StoryType.PHILOSOPHICAL, 500,
            Exalted::isMaxStoryRank
        );
        exaltedBeacon = new ExaltedBeacon(
            ItemGroups.EXALTED,
            ThemeType.themedSlimefunItemStack(
                "CRY_EXALTED_BEACON",
                new ItemStack(Material.BEACON),
                ThemeType.EXALTED,
                "尊貴烽火台",
                "一個強大的烽火台, 具有極大",
                "的潛能. 必須放在",
                "昇華之台上才能運作.",
                "",
                ThemeType.CLICK_INFO.getColor() + "需求: 故事頭銜 > 榮譽教授"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            exaltedBeaconRecipe.getDisplayRecipe()
        );

        // Fertility Pharo
        RecipeItem exaltedFertilityPharoRecipe = new RecipeItem(
            amalgamateIngotMythical,
            StoryType.ELEMENTAL, 500,
            StoryType.ANIMAL, 500,
            StoryType.CELESTIAL, 500,
            Exalted::isMaxStoryRank
        );
        exaltedFertilityPharo = new ExaltedFertilityPharo(
            ItemGroups.EXALTED,
            ThemeType.themedSlimefunItemStack(
                "CRY_EXALTED_FERTILITY_PHARO",
                new ItemStack(Material.DIAMOND_BLOCK),
                ThemeType.EXALTED,
                "尊貴生育法羅",
                "一種能夠繁殖 20x20 區域",
                "內動物的魔法結構.",
                "必須放在昇華之台上",
                "才能運作.",
                "",
                ThemeType.CLICK_INFO.getColor() + "需求: 故事頭銜 > 榮譽教授"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            exaltedFertilityPharoRecipe.getDisplayRecipe()
        );

        // Exalted Harvester
        RecipeItem exaltedHarvesterRecipe = new RecipeItem(
            amalgamateIngotMythical,
            StoryType.ELEMENTAL, 500,
            StoryType.HISTORICAL, 500,
            StoryType.VOID, 500,
            Exalted::isMaxSpellRank
        );
        exaltedHarvester = new ExaltedHarvester(
            ItemGroups.EXALTED,
            ThemeType.themedSlimefunItemStack(
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
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            exaltedHarvesterRecipe.getDisplayRecipe()
        );

        // Exalted Dawn
        RecipeItem exaltedDawnRecipe = new RecipeItem(
            amalgamateDustMythical,
            StoryType.ELEMENTAL, 250,
            StoryType.HISTORICAL, 250,
            StoryType.CELESTIAL, 250,
            player -> player.getWorld().isDayTime()
        );
        exaltedDawn = new ExaltedTime(
            ItemGroups.EXALTED,
            ThemeType.themedSlimefunItemStack(
                "CRY_EXALTED_DAWN",
                new ItemStack(Material.YELLOW_WOOL),
                ThemeType.EXALTED,
                "崇高的黎明",
                "一個魔法的構造,",
                "像太陽一樣的明亮著燃燒.",
                "",
                ThemeType.CLICK_INFO.getColor() + "需求: 在早上時製作"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            exaltedDawnRecipe.getDisplayRecipe(),
            6000
        );

        // Exalted Dusk
        RecipeItem exaltedDuskRecipe = new RecipeItem(
            amalgamateDustMythical,
            StoryType.ELEMENTAL, 250,
            StoryType.HISTORICAL, 250,
            StoryType.VOID, 250,
            player -> !player.getWorld().isDayTime()
        );
        exaltedDusk = new ExaltedTime(
            ItemGroups.EXALTED,
            ThemeType.themedSlimefunItemStack(
                "CRY_EXALTED_DUSK",
                new ItemStack(Material.BLACK_WOOL),
                ThemeType.EXALTED,
                "崇高的黃昏",
                "一個魔法的結構,",
                "就像是新月一樣的閃耀",
                "",
                ThemeType.CLICK_INFO.getColor() + "需求: 在晚上時製作"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            exaltedDuskRecipe.getDisplayRecipe(),
            18000
        );

        // Exalted Sun
        RecipeItem exaltedSunRecipe = new RecipeItem(
            amalgamateDustMythical,
            StoryType.ELEMENTAL, 250,
            StoryType.ALCHEMICAL, 250,
            StoryType.CELESTIAL, 250,
            player -> player.getWorld().isClearWeather()
        );
        exaltedSun = new ExaltedWeather(
            ItemGroups.EXALTED,
            ThemeType.themedSlimefunItemStack(
                "CRY_EXALTED_SUN",
                new ItemStack(Material.MAGMA_BLOCK),
                ThemeType.EXALTED,
                "崇高的太陽",
                "一個散發著太陽力量",
                "的魔法結構.",
                "",
                ThemeType.CLICK_INFO.getColor() + "需求: 在晴朗的天氣時製作"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            exaltedSunRecipe.getDisplayRecipe(),
            WeatherType.CLEAR
        );

        // Exalted Storm
        RecipeItem exaltedStormRecipe = new RecipeItem(
            amalgamateDustMythical,
            StoryType.ELEMENTAL, 250,
            StoryType.ALCHEMICAL, 250,
            StoryType.VOID, 250,
            player -> !player.getWorld().isClearWeather()
        );
        exaltedStorm = new ExaltedWeather(
            ItemGroups.EXALTED,
            ThemeType.themedSlimefunItemStack(
                "CRY_EXALTED_STORM",
                new ItemStack(Material.GRAY_WOOL),
                ThemeType.EXALTED,
                "崇高的暴風",
                "一個散發著風暴的",
                "破壞力魔法結構.",
                "",
                ThemeType.CLICK_INFO.getColor() + "需求: 在暴風雨時製作"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            exaltedStormRecipe.getDisplayRecipe(),
            WeatherType.DOWNFALL
        );

        // Slimefun Registry
        exaltedBeacon.register(plugin);
        exaltedFertilityPharo.register(plugin);
        exaltedHarvester.register(plugin);
        exaltedDawn.register(plugin);
        exaltedDusk.register(plugin);
        exaltedSun.register(plugin);
        exaltedStorm.register(plugin);

        // Liquefaction Recipes
        LiquefactionBasinCache.addCraftingRecipe(exaltedBeacon, exaltedBeaconRecipe);
        LiquefactionBasinCache.addCraftingRecipe(exaltedFertilityPharo, exaltedFertilityPharoRecipe);
        LiquefactionBasinCache.addCraftingRecipe(exaltedHarvester, exaltedHarvesterRecipe);
        LiquefactionBasinCache.addCraftingRecipe(exaltedDawn, exaltedDawnRecipe);
        LiquefactionBasinCache.addCraftingRecipe(exaltedDusk, exaltedDuskRecipe);
        LiquefactionBasinCache.addCraftingRecipe(exaltedSun, exaltedSunRecipe);
        LiquefactionBasinCache.addCraftingRecipe(exaltedStorm, exaltedStormRecipe);
    }

    private static boolean isMaxStoryRank(Player player) {
        return PlayerStatistics.getStoryRank(player.getUniqueId()) == StoryRank.EMERITUS_PROFESSOR;
    }

    private static boolean isMaxSpellRank(Player player) {
        return PlayerStatistics.getSpellRank(player.getUniqueId()) == SpellRank.GRANDMASTER_MAGI;
    }
}
