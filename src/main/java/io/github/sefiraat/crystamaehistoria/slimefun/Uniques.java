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
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;

import javax.annotation.Nonnull;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

@UtilityClass
public class Uniques {

    @Getter
    private static Trophy storyTrophy;
    @Getter
    private static Trophy spellTrophy;
    @Getter
    private static Trophy christmasTrophy;
    @Getter
    private static Trophy valentinesTrophy;
    @Getter
    private static Trophy birthdayTrophyCheesy;
    @Getter
    private static Trophy birthdayTrophyBWhite;
    @Getter
    private static Trophy birthdayTrophyDecoy;
    @Getter
    private static Trophy birthdayTrophyOddish;

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

        // Valentines Trophy
        RecipeItem valentinesTrophyRecipe = new RecipeItem(
            SlimefunItems.RAINBOW_WOOL_VALENTINE,
            StoryType.HUMAN, 250,
            StoryType.ELEMENTAL, 250,
            StoryType.HISTORICAL, 250,
            Uniques::isValentines
        );
        valentinesTrophy = new Trophy(
            ItemGroups.UNIQUES,
            ThemeType.themedSlimefunItemStack(
                "CRY_VALENTINES_TROPHY",
                new ItemStack(Material.PINK_DYE),
                ThemeType.CRAFTING,
                "情人節快樂",
                "一點點的愛可以走很長的路",
                "",
                ThemeType.CLICK_INFO.getColor() + "需求: 只能在充滿愛情的氣氛中製作"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            valentinesTrophyRecipe.getDisplayRecipe(),
            location -> {
                ParticleUtils.displayParticleEffect(
                    location.add(0, 0.2, 0),
                    Particle.HEART,
                    1,
                    3
                );
            }
        );

        // Birthday: Cheesy
        RecipeItem birthdayTrophyCheesyRecipe = new RecipeItem(
            new ItemStack(Material.CAKE),
            StoryType.HUMAN, 50,
            StoryType.ELEMENTAL, 50,
            StoryType.HISTORICAL, 50,
            Uniques::isBirthdayCheesy
        );
        birthdayTrophyCheesy = new Trophy(
            ItemGroups.UNIQUES,
            ThemeType.themedSlimefunItemStack(
                "CRY_BIRTHDAY_TROPHY_CHEESY",
                new ItemStack(Material.CAKE),
                ThemeType.CRAFTING,
                "生日快樂 Cheesy!",
                "心中的紳士",
                "",
                ThemeType.CLICK_INFO.getColor() + "需求: Cheesy的生日!"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            birthdayTrophyCheesyRecipe.getDisplayRecipe(),
            location -> {
                final Location spawnLocation = location.add(0, 0.2, 0);
                final int rand = ThreadLocalRandom.current().nextInt(19);
                if (rand == 0) {
                    spawnBirthdayFirework(spawnLocation, Color.ORANGE);
                }
                ParticleUtils.displayParticleEffect(
                    spawnLocation,
                    1,
                    3,
                    new Particle.DustOptions(Color.ORANGE, 2)
                );
            }
        );

        // Birthday: BWhite
        RecipeItem birthdayTrophyBWhiteRecipe = new RecipeItem(
            new ItemStack(Material.CAKE),
            StoryType.HUMAN, 50,
            StoryType.VOID, 50,
            StoryType.PHILOSOPHICAL, 50,
            Uniques::isBirthdayBWhite
        );
        birthdayTrophyBWhite = new Trophy(
            ItemGroups.UNIQUES,
            ThemeType.themedSlimefunItemStack(
                "CRY_BIRTHDAY_TROPHY_BWHITE",
                new ItemStack(Material.CAKE),
                ThemeType.CRAFTING,
                "生日快樂 BWhite!",
                "有史以來最大的 Tantrum 聯合製作者!",
                "",
                ThemeType.CLICK_INFO.getColor() + "需求: BWhite的生日!"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            birthdayTrophyBWhiteRecipe.getDisplayRecipe(),
            location -> {
                final Location spawnLocation = location.add(0, 0.2, 0);
                final int rand = ThreadLocalRandom.current().nextInt(19);
                if (rand == 0) {
                    spawnBirthdayFirework(spawnLocation, Color.RED);
                }
                ParticleUtils.displayParticleEffect(
                    spawnLocation,
                    1,
                    3,
                    new Particle.DustOptions(Color.RED, 2)
                );
            }
        );

        // Birthday: Decoy
        RecipeItem birthdayTrophyDecoyRecipe = new RecipeItem(
            new ItemStack(Material.CAKE),
            StoryType.HUMAN, 50,
            StoryType.CELESTIAL, 50,
            StoryType.PHILOSOPHICAL, 50,
            Uniques::isBirthdayDecoy
        );
        birthdayTrophyDecoy = new Trophy(
            ItemGroups.UNIQUES,
            ThemeType.themedSlimefunItemStack(
                "CRY_BIRTHDAY_TROPHY_DECOY",
                new ItemStack(Material.CAKE),
                ThemeType.CRAFTING,
                "生日快樂 Decoy!",
                "有史以來最大的 Tantrum 聯合製作者!",
                "",
                ThemeType.CLICK_INFO.getColor() + "需求: Decoy的生日!"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            birthdayTrophyDecoyRecipe.getDisplayRecipe(),
            location -> {
                final Location spawnLocation = location.add(0, 0.2, 0);
                final int rand = ThreadLocalRandom.current().nextInt(19);
                if (rand == 0) {
                    spawnBirthdayFirework(spawnLocation, Color.TEAL);
                }
                ParticleUtils.displayParticleEffect(
                    spawnLocation,
                    1,
                    3,
                    new Particle.DustOptions(Color.TEAL, 2)
                );
            }
        );

        // Birthday: Oddish
        RecipeItem birthdayTrophyOddishRecipe = new RecipeItem(
            new ItemStack(Material.CAKE),
            StoryType.ANIMAL, 50,
            StoryType.ELEMENTAL, 50,
            StoryType.CELESTIAL, 50,
            Uniques::isBirthdayOddish
        );
        birthdayTrophyOddish = new Trophy(
            ItemGroups.UNIQUES,
            ThemeType.themedSlimefunItemStack(
                "CRY_BIRTHDAY_TROPHY_ODDISH",
                new ItemStack(Material.CAKE),
                ThemeType.CRAFTING,
                "生日快樂 Oddish!",
                "一個等待發生的幽暗",
                "",
                ThemeType.CLICK_INFO.getColor() + "需求: Oddish的生日!"
            ),
            DummyLiquefactionBasinCrafting.TYPE,
            birthdayTrophyOddishRecipe.getDisplayRecipe(),
            location -> {
                final Location spawnLocation = location.add(0, 0.2, 0);
                final int rand = ThreadLocalRandom.current().nextInt(19);
                final Color color = Color.fromRGB(0, 87, 87);
                if (rand == 0) {
                    spawnBirthdayFirework(spawnLocation, color);
                }
                ParticleUtils.displayParticleEffect(
                    spawnLocation,
                    1,
                    3,
                    new Particle.DustOptions(color, 2)
                );
            }
        );

        spellTrophy.register(plugin);
        storyTrophy.register(plugin);
        christmasTrophy.register(plugin);
        valentinesTrophy.register(plugin);

        birthdayTrophyCheesy.register(plugin);
        birthdayTrophyBWhite.register(plugin);
        birthdayTrophyDecoy.register(plugin);
        birthdayTrophyOddish.register(plugin);

        LiquefactionBasinCache.addCraftingRecipe(spellTrophy, spellTrophyRecipe);
        LiquefactionBasinCache.addCraftingRecipe(storyTrophy, storyTrophyRecipe);
        LiquefactionBasinCache.addCraftingRecipe(christmasTrophy, christmasTrophyRecipe);
        LiquefactionBasinCache.addCraftingRecipe(valentinesTrophy, valentinesTrophyRecipe);

        LiquefactionBasinCache.addCraftingRecipe(birthdayTrophyCheesy, birthdayTrophyCheesyRecipe);
        LiquefactionBasinCache.addCraftingRecipe(birthdayTrophyBWhite, birthdayTrophyBWhiteRecipe);
        LiquefactionBasinCache.addCraftingRecipe(birthdayTrophyDecoy, birthdayTrophyDecoyRecipe);
        LiquefactionBasinCache.addCraftingRecipe(valentinesTrophy, birthdayTrophyOddishRecipe);
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

    private static boolean isBirthdayCheesy(@Nonnull Player player) {
        final LocalDate now = LocalDate.now();
        final int year = now.getYear();
        final LocalDate start = LocalDate.of(year, 3, 29);
        final LocalDate end = LocalDate.of(year, 3, 30);

        return now.isAfter(start) && now.isBefore(end);
    }

    private static boolean isBirthdayBWhite(@Nonnull Player player) {
        final LocalDate now = LocalDate.now();
        final int year = now.getYear();
        final LocalDate start = LocalDate.of(year, 9, 10);
        final LocalDate end = LocalDate.of(year, 9, 10);

        return now.isAfter(start) && now.isBefore(end);
    }

    private static boolean isBirthdayDecoy(@Nonnull Player player) {
        final LocalDate now = LocalDate.now();
        final int year = now.getYear();
        final LocalDate start = LocalDate.of(year, 12, 11);
        final LocalDate end = LocalDate.of(year, 12, 11);

        return now.isAfter(start) && now.isBefore(end);
    }

    private static boolean isBirthdayOddish(@Nonnull Player player) {
        final LocalDate now = LocalDate.now();
        final int year = now.getYear();
        final LocalDate start = LocalDate.of(year, 2, 12);
        final LocalDate end = LocalDate.of(year, 2, 12);

        return now.isAfter(start) && now.isBefore(end);
    }

    private static boolean isValentines(@Nonnull Player player) {
        final LocalDate now = LocalDate.now();
        final int year = now.getYear();
        final LocalDate start = LocalDate.of(year, 2, 6);
        final LocalDate end = LocalDate.of(year, 2, 20);

        return now.isAfter(start) && now.isBefore(end);
    }

    private static void spawnBirthdayFirework(@Nonnull Location location, @Nonnull Color color) {
        final Firework firework = (Firework) location.getWorld().spawnEntity(location, EntityType.FIREWORK);
        final FireworkMeta fireworkMeta = firework.getFireworkMeta();
        fireworkMeta.addEffect(
            FireworkEffect.builder()
                .withColor(color)
                .with(FireworkEffect.Type.STAR)
                .withFlicker()
                .withTrail()
                .build()
        );
        firework.setFireworkMeta(fireworkMeta);
    }

}
