package io.github.sefiraat.crystamaehistoria.slimefun;

import io.github.sefiraat.crystamaehistoria.CrystamaeHistoria;
import io.github.sefiraat.crystamaehistoria.player.PlayerStatistics;
import io.github.sefiraat.crystamaehistoria.player.SpellRank;
import io.github.sefiraat.crystamaehistoria.player.StoryRank;
import io.github.sefiraat.crystamaehistoria.slimefun.materials.Trophy;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.DummyLiquefactionBasinCrafting;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.LiquefactionBasinCache;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.RecipeItem;
import io.github.sefiraat.crystamaehistoria.stories.definition.StoryType;
import io.github.sefiraat.crystamaehistoria.utils.ParticleUtils;
import io.github.sefiraat.crystamaehistoria.utils.theme.ThemeType;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import java.time.LocalDate;

@UtilityClass
public class Uniques {

    @Getter
    private static Trophy storyTrophy;
    @Getter
    private static Trophy spellTrophy;
    @Getter
    private static Trophy christmasTrophy;

    public static void setup() {

        CrystamaeHistoria plugin = CrystamaeHistoria.getInstance();

        // Spell Trophy
        RecipeItem spellTrophyRecipe = new RecipeItem(
            new ItemStack(Material.PAPER),
            StoryType.ELEMENTAL, 100,
            StoryType.ALCHEMICAL, 100,
            StoryType.VOID, 100,
            Uniques::isMaxSpellRank
        );
        spellTrophy = new Trophy(
            ItemGroups.UNIQUES,
            ThemeType.themedSlimefunItemStack(
                "CRY_SPELL_TROPHY",
                new ItemStack(Material.PAPER),
                ThemeType.CRAFTING,
                "證明: 宗師級奇術師",
                "證明你是最棒的.",
                "",
                ThemeType.CLICK_INFO.getColor() + "需求: 法術頭銜 > 宗師級奇術師"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            spellTrophyRecipe.getDisplayRecipe(),
            location -> ParticleUtils.displayParticleEffect(
                location.add(0, 0.2, 0),
                0.2,
                3,
                new Particle.DustOptions(Color.ORANGE, 1)
            )
        );

        // Story Trophy
        RecipeItem storyTrophyRecipe = new RecipeItem(
            new ItemStack(Material.PAPER),
            StoryType.ELEMENTAL, 100,
            StoryType.ALCHEMICAL, 100,
            StoryType.CELESTIAL, 100,
            Uniques::isMaxStoryRank
        );
        storyTrophy = new Trophy(
            ItemGroups.UNIQUES,
            ThemeType.themedSlimefunItemStack(
                "CRY_STORY_TROPHY",
                new ItemStack(Material.PAPER),
                ThemeType.CRAFTING,
                "證明: 榮譽教授",
                "證明你是最棒的.",
                "",
                ThemeType.CLICK_INFO.getColor() + "需求: 故事頭銜 > 榮譽教授"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            storyTrophyRecipe.getDisplayRecipe(),
            location -> ParticleUtils.displayParticleEffect(
                location.add(0, 0.2, 0),
                0.2,
                3,
                new Particle.DustOptions(Color.AQUA, 1)
            )
        );

        // Christmas Trophy
        RecipeItem christmasTrophyRecipe = new RecipeItem(
            new ItemStack(Material.SPRUCE_SAPLING),
            StoryType.HUMAN, 250,
            StoryType.PHILOSOPHICAL, 250,
            StoryType.CELESTIAL, 250,
            Uniques::isChristmas
        );
        christmasTrophy = new Trophy(
            ItemGroups.UNIQUES,
            ThemeType.themedSlimefunItemStack(
                "CRY_CHRISTMAS_TROPHY",
                new ItemStack(Material.SPRUCE_SAPLING),
                ThemeType.CRAFTING,
                "聖誕快樂",
                "給你的小小禮物...",
                "但你必須為此努力!",
                "",
                ThemeType.CLICK_INFO.getColor() + "需求: 只能在節慶時製作"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            christmasTrophyRecipe.getDisplayRecipe(),
            location -> {
                ParticleUtils.displayParticleEffect(
                    location.add(0, 0.2, 0),
                    0.2,
                    3,
                    new Particle.DustOptions(Color.RED, 1)
                );
                ParticleUtils.displayParticleEffect(
                    location.add(0, 0.2, 0),
                    0.2,
                    3,
                    new Particle.DustOptions(Color.LIME, 1)
                );
            }
        );

        spellTrophy.register(plugin);
        storyTrophy.register(plugin);
        christmasTrophy.register(plugin);

        LiquefactionBasinCache.addCraftingRecipe(spellTrophy, spellTrophyRecipe);
        LiquefactionBasinCache.addCraftingRecipe(storyTrophy, storyTrophyRecipe);
        LiquefactionBasinCache.addCraftingRecipe(christmasTrophy, christmasTrophyRecipe);
    }

    private static boolean isMaxStoryRank(@Nonnull Player player) {
        return PlayerStatistics.getStoryRank(player.getUniqueId()) == StoryRank.EMERITUS_PROFESSOR;
    }

    private static boolean isMaxSpellRank(@Nonnull Player player) {
        return PlayerStatistics.getSpellRank(player.getUniqueId()) == SpellRank.GRANDMASTER_MAGI;
    }

    private static boolean isChristmas(@Nonnull Player player) {
        final LocalDate now = LocalDate.now();
        final int year = now.getYear();
        final LocalDate start = LocalDate.of(year, 12, 20);
        final LocalDate end = LocalDate.of(year + 1, 1, 5);

        return now.isAfter(start) && now.isBefore(end);
    }

}
