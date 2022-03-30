package io.github.sefiraat.crystamaehistoria.slimefun.itemgroups;

import io.github.sefiraat.crystamaehistoria.magic.SpellType;
import io.github.sefiraat.crystamaehistoria.magic.spells.core.Spell;
import io.github.sefiraat.crystamaehistoria.magic.spells.core.SpellCore;
import io.github.sefiraat.crystamaehistoria.player.PlayerStatistics;
import io.github.sefiraat.crystamaehistoria.player.SpellRank;
import io.github.sefiraat.crystamaehistoria.slimefun.ItemGroups;
import io.github.sefiraat.crystamaehistoria.slimefun.Materials;
import io.github.sefiraat.crystamaehistoria.stories.definition.StoryType;
import io.github.sefiraat.crystamaehistoria.utils.theme.GuiElements;
import io.github.sefiraat.crystamaehistoria.utils.theme.ThemeType;
import io.github.thebusybiscuit.slimefun4.api.items.groups.FlexItemGroup;
import io.github.thebusybiscuit.slimefun4.api.player.PlayerProfile;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuide;
import io.github.thebusybiscuit.slimefun4.core.guide.SlimefunGuideMode;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.ParametersAreNonnullByDefault;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @noinspection deprecation
 */
public class SpellCollectionFlexGroup extends FlexItemGroup {

    private static final int PAGE_SIZE = 36;

    private static final int GUIDE_BACK = 1;
    private static final int GUIDE_STATS = 7;

    private static final int PAGE_PREVIOUS = 46;
    private static final int PAGE_NEXT = 52;

    private static final int[] HEADER = new int[]{
        0, 1, 2, 3, 4, 5, 6, 7, 8
    };
    private static final int[] FOOTER = new int[]{
        45, 46, 47, 48, 49, 50, 51, 52, 53
    };

    private static final int SPELL = 19;
    private static final int[] RECIPE = new int[]{
        21, 22, 23
    };
    private static final int MECHANISM = 25;
    private static final int CRYSTA_COST = 37;
    private static final int CAST_TYPE = 38;
    private static final int VALUES = 39;
    private static final int RANGE = 40;
    private static final int KNOCK_BACK = 41;
    private static final int PROJECTILE_INFO = 42;
    private static final int EFFECTS = 43;

    public SpellCollectionFlexGroup(NamespacedKey key, ItemStack item) {
        super(key, item);
    }

    @Override
    @ParametersAreNonnullByDefault
    public boolean isVisible(Player player, PlayerProfile playerProfile, SlimefunGuideMode guideMode) {
        return true;
    }

    @Override
    @ParametersAreNonnullByDefault
    public void open(Player p, PlayerProfile profile, SlimefunGuideMode mode) {
        final ChestMenu chestMenu = new ChestMenu(ThemeType.MAIN.getColor() + "法術綱要");

        for (int slot : HEADER) {
            chestMenu.addItem(slot, ChestMenuUtils.getBackground(), (player1, i1, itemStack, clickAction) -> false);
        }

        for (int slot : FOOTER) {
            chestMenu.addItem(slot, ChestMenuUtils.getBackground(), (player1, i1, itemStack, clickAction) -> false);
        }

        chestMenu.setEmptySlotsClickable(false);
        setupPage(p, profile, mode, chestMenu, 1);
        chestMenu.open(p);
    }

    @ParametersAreNonnullByDefault
    private void setupPage(Player player, PlayerProfile profile, SlimefunGuideMode mode, ChestMenu menu, int page) {
        final List<SpellType> spellTypes = Arrays.asList(SpellType.getEnabledSpells());
        final int numberOfBlocks = spellTypes.size();
        final int totalPages = (int) Math.ceil(numberOfBlocks / (double) PAGE_SIZE);
        final int start = (page - 1) * PAGE_SIZE;
        final int end = Math.min(start + PAGE_SIZE, spellTypes.size());

        spellTypes.sort(Comparator.comparing(spellType -> spellType.getSpell().getId()));

        final List<SpellType> spellTypeSubList = spellTypes.subList(start, end);

        reapplyFooter(player, profile, mode, menu, page, totalPages);

        // Back
        menu.replaceExistingItem(GUIDE_BACK, ChestMenuUtils.getBackButton(player, Slimefun.getLocalization().getMessage("guide.back.guide")));
        menu.addMenuClickHandler(GUIDE_BACK, (player1, slot, itemStack, clickAction) -> {
            SlimefunGuide.openItemGroup(profile, ItemGroups.MAIN, mode, 1);
            return false;
        });

        // Stats
        menu.replaceExistingItem(GUIDE_STATS, getStatsStack(player));
        menu.addMenuClickHandler(GUIDE_STATS, (player1, slot, itemStack, clickAction) -> false);

        for (int i = 0; i < 36; i++) {
            final int slot = i + 9;

            if (i + 1 <= spellTypeSubList.size()) {
                final SpellType spellType = spellTypeSubList.get(i);
                final boolean researched = PlayerStatistics.hasUnlockedSpell(player, spellType);

                if (mode == SlimefunGuideMode.CHEAT_MODE || researched) {
                    menu.replaceExistingItem(slot, new ItemStack(spellType.getSpell().getThemedStack()));
                    menu.addMenuClickHandler(slot, (player1, i1, itemStack1, clickAction) -> {
                        displayDefinition(player1, profile, mode, menu, page, spellType);
                        return false;
                    });
                } else {
                    menu.replaceExistingItem(slot, GuiElements.getSpellNotUnlockedIcon(spellType.getSpName()));
                    menu.addMenuClickHandler(slot, (player1, i1, itemStack1, clickAction) -> false);
                }
            } else {
                menu.replaceExistingItem(slot, null);
                menu.addMenuClickHandler(slot, (player1, i1, itemStack1, clickAction) -> false);
            }
        }
    }

    @ParametersAreNonnullByDefault
    private void displayDefinition(Player p, PlayerProfile profile, SlimefunGuideMode mode, ChestMenu menu, int returnPage, SpellType spellType) {
        final Spell spell = spellType.getSpell();
        // Back Button
        menu.replaceExistingItem(GUIDE_BACK, ChestMenuUtils.getBackButton(p, Slimefun.getLocalization().getMessage("guide.back.guide")));
        menu.addMenuClickHandler(GUIDE_BACK, (player1, slot, itemStack, clickAction) -> {
            setupPage(player1, profile, mode, menu, returnPage);
            return false;
        });

        clearDisplay(menu);

        menu.replaceExistingItem(SPELL, spellType.getSpell().getThemedStack());
        menu.addMenuClickHandler(SPELL, ((player, i, itemStack, clickAction) -> false));

        for (int i = 0; i < RECIPE.length; i++) {
            int slot = RECIPE[i];
            StoryType storyType = spellType.getSpell().getRecipe().getInput(i);
            ItemStack stack = Materials.getDummyCrystalMap().get(storyType).getItem();
            menu.replaceExistingItem(slot, stack);
            menu.addMenuClickHandler(slot, ((player, slot2, itemStack, clickAction) -> false));
        }

        menu.replaceExistingItem(MECHANISM, getMechanismStack());
        menu.addMenuClickHandler(MECHANISM, ((player, i, itemStack, clickAction) -> false));

        menu.replaceExistingItem(CRYSTA_COST, getBasicStack(spell));
        menu.addMenuClickHandler(CRYSTA_COST, ((player, i, itemStack, clickAction) -> false));

        menu.replaceExistingItem(VALUES, getValuesStack(spell));
        menu.addMenuClickHandler(VALUES, ((player, i, itemStack, clickAction) -> false));

        menu.replaceExistingItem(CAST_TYPE, getCastTypeStack(spell));
        menu.addMenuClickHandler(CAST_TYPE, ((player, i, itemStack, clickAction) -> false));

        menu.replaceExistingItem(RANGE, getRangeStack(spell));
        menu.addMenuClickHandler(RANGE, ((player, i, itemStack, clickAction) -> false));

        menu.replaceExistingItem(KNOCK_BACK, getKnockBackStack(spell));
        menu.addMenuClickHandler(KNOCK_BACK, ((player, i, itemStack, clickAction) -> false));

        menu.replaceExistingItem(PROJECTILE_INFO, getProjectileStack(spell));
        menu.addMenuClickHandler(PROJECTILE_INFO, ((player, i, itemStack, clickAction) -> false));

        menu.replaceExistingItem(EFFECTS, getEffectsStack(spell));
        menu.addMenuClickHandler(EFFECTS, ((player, i, itemStack, clickAction) -> false));

    }

    @ParametersAreNonnullByDefault
    private void clearDisplay(ChestMenu menu) {
        for (int i = 0; i < 45; i++) {
            final int slot = i + 9;
            menu.replaceExistingItem(slot, null);
            menu.addMenuClickHandler(slot, (player1, i1, itemStack1, clickAction) -> false);
        }
    }

    @ParametersAreNonnullByDefault
    private void reapplyFooter(Player p, PlayerProfile profile, SlimefunGuideMode mode, ChestMenu menu, int page, int totalPages) {
        for (int slot : FOOTER) {
            menu.replaceExistingItem(slot, ChestMenuUtils.getBackground());
            menu.addMenuClickHandler(slot, ((player, i, itemStack, clickAction) -> false));
        }

        menu.replaceExistingItem(PAGE_PREVIOUS, ChestMenuUtils.getPreviousButton(p, page, totalPages));
        menu.addMenuClickHandler(PAGE_PREVIOUS, (player1, slot, itemStack, clickAction) -> {
            final int previousPage = page - 1;
            if (previousPage >= 1) {
                setupPage(player1, profile, mode, menu, previousPage);
            }
            return false;
        });

        menu.replaceExistingItem(PAGE_NEXT, ChestMenuUtils.getNextButton(p, page, totalPages));
        menu.addMenuClickHandler(PAGE_NEXT, (player1, slot, itemStack, clickAction) -> {
            final int nextPage = page + 1;
            if (nextPage <= totalPages) {
                setupPage(player1, profile, mode, menu, nextPage);
            }
            return false;
        });
    }

    private ItemStack getMechanismStack() {
        final List<String> lore = Arrays.stream(
                new String[]{
                    "法術是通過在液化池",
                    "中組合液態水晶而",
                    "產生的.",
                    "最高 3 種液體量",
                    "所決定製作的法術.",
                    "",
                    "準備好製作你的法術時,",
                    "進一個法術板."
                }
            ).map(s -> ThemeType.PASSIVE.getColor() + s)
            .collect(Collectors.toList());

        return new CustomItemStack(
            Material.CAULDRON,
            ThemeType.MAIN.getColor() + "液化池",
            lore
        );
    }

    @ParametersAreNonnullByDefault
    private ItemStack getBasicStack(Spell spell) {
        final SpellCore spellCore = spell.getSpellCore();
        final ChatColor color = ThemeType.CLICK_INFO.getColor();
        final ChatColor passive = ThemeType.PASSIVE.getColor();

        final String crysta = MessageFormat.format("{0}每次施法所消耗的水晶能量: {1}{2}", color, passive, spellCore.getCrystaCost());
        final String crystaMulti = MessageFormat.format("{0}水晶能量成本 {1} 與法杖等級", color, spellCore.isDamageMultiplied() ? "增加" : "沒有增加");
        final String cooldown = MessageFormat.format("{0}冷卻 (秒) 在使用時: {1}{2}", color, passive, spell.getSpellCore().getCooldownSeconds());
        final String cooldownDivided = MessageFormat.format("{0}冷卻 {1} 與法杖等級", color, spellCore.isDamageMultiplied() ? "沒有降低" : "降低");


        return new CustomItemStack(
            Material.GLOW_BERRIES,
            ThemeType.MAIN.getColor() + "基礎詳細",
            crysta,
            crystaMulti,
            cooldown,
            cooldownDivided
        );
    }

    @ParametersAreNonnullByDefault
    private ItemStack getValuesStack(Spell spell) {
        final SpellCore spellCore = spell.getSpellCore();
        final ChatColor color = ThemeType.CLICK_INFO.getColor();
        final ChatColor passive = ThemeType.PASSIVE.getColor();
        final List<String> lore = new ArrayList<>();

        final String damageMessage = MessageFormat.format("{0}傷害: {1}{2}", color, passive, spellCore.getDamageAmount());
        final String damageMulti = MessageFormat.format("{0}傷害 {1} 與法杖等級", color, spellCore.isDamageMultiplied() ? "增加" : "沒有增加");

        final String healMessage = MessageFormat.format("{0}治療量: {1}{2}", color, passive, spellCore.getDamageAmount());
        final String healMulti = MessageFormat.format("{0}治療量 {1} 與法杖等級", color, spellCore.isDamageMultiplied() ? "增加" : "沒有增加");

        if (spellCore.isDamagingSpell()) {
            lore.add(damageMessage);
            lore.add(damageMulti);
        } else {
            lore.add(passive + "這個法術不會造成傷害.");
        }

        if (spellCore.isHealingSpell()) {
            lore.add(healMessage);
            lore.add(healMulti);
        } else {
            lore.add(passive + "這個法術不會治療.");
        }

        return new CustomItemStack(
            Material.MAP,
            ThemeType.MAIN.getColor() + "法術值",
            lore
        );
    }

    @ParametersAreNonnullByDefault
    private ItemStack getCastTypeStack(Spell spell) {
        final SpellCore spellCore = spell.getSpellCore();
        final ChatColor color = ThemeType.CLICK_INFO.getColor();
        final ChatColor passive = ThemeType.PASSIVE.getColor();
        final ChatColor notice = ThemeType.NOTICE.getColor();
        final List<String> lore = new ArrayList<>();

        final int ticks = spellCore.getNumberOfTicks();

        final String instantCast = MessageFormat.format("{0}立即: {1}施法時立即開火", color, passive);
        final String damagingSpell = MessageFormat.format("{0}傷害: {1}會造成傷害 和/或 減益", color, passive);
        final String healingSpell = MessageFormat.format("{0}治療: {1}會治癒 和/或 增益", color, passive);
        final String effectingSpell = MessageFormat.format("{0}效果: {1}會施加藥水效果", color, passive);
        final String tickingSpell1 = MessageFormat.format("{0}Ticking: {1}該法術效果將會", color, passive);
        final String tickingSpell2 = MessageFormat.format("{0}火 ({1}{2}{3}) 次", passive, notice, ticks, passive);
        final String tickingSpell3 = MessageFormat.format("{0}刻數字 {1} 與法杖等級", passive, spellCore.isDamageMultiplied() ? "增加" : "沒有增加");

        final String projectileSpell1 = MessageFormat.format("{0}投射物: {1}這個法術發射投射物", color, passive);
        final String projectileSpell2 = MessageFormat.format("{0}當被擊中時, 可能會引起", passive);
        final String projectileSpell3 = MessageFormat.format("{0}進一步的影響", passive);

        if (spellCore.isInstantCast()) {
            lore.add(instantCast);
        }
        if (spellCore.isDamagingSpell()) {
            lore.add(damagingSpell);
        }
        if (spellCore.isHealingSpell()) {
            lore.add(healingSpell);
        }
        if (spellCore.isEffectingSpell()) {
            lore.add(effectingSpell);
        }
        if (spellCore.isTickingSpell()) {
            lore.add(tickingSpell1);
            lore.add(tickingSpell2);
            lore.add(tickingSpell3);
        }
        if (spellCore.isProjectileSpell()) {
            lore.add(projectileSpell1);
            lore.add(projectileSpell2);
            lore.add(projectileSpell3);
        }
        return new CustomItemStack(
            Material.NAME_TAG,
            ThemeType.MAIN.getColor() + "施法類型",
            lore
        );
    }

    @ParametersAreNonnullByDefault
    private ItemStack getRangeStack(Spell spell) {
        final ChatColor color = ThemeType.CLICK_INFO.getColor();
        final ChatColor passive = ThemeType.PASSIVE.getColor();
        final List<String> lore = new ArrayList<>();

        final String message = MessageFormat.format("{0}距離: {1}{2}", color, passive, spell.getSpellCore().getRange());
        final String multiMessage = MessageFormat.format("{0}距離 {1} 與法杖等級", passive, spell.getSpellCore().isRangeMultiplied() ? "增加" : "沒有增加");
        final String noRange = passive + "不受範圍影響";

        if (spell.getSpellCore().getKnockbackAmount() > 0) {
            lore.add(message);
            lore.add(multiMessage);
        } else {
            lore.add(noRange);
        }

        return new CustomItemStack(
            Material.TARGET,
            ThemeType.MAIN.getColor() + "範圍",
            lore
        );
    }

    @ParametersAreNonnullByDefault
    private ItemStack getKnockBackStack(Spell spell) {
        final ChatColor color = ThemeType.CLICK_INFO.getColor();
        final ChatColor passive = ThemeType.PASSIVE.getColor();
        final List<String> lore = new ArrayList<>();

        final String message = MessageFormat.format("{0}擊退: {1}{2}", color, passive, spell.getSpellCore().getKnockbackAmount());
        final String multiMessage = MessageFormat.format("{0}數量 {1} 與法杖等級", passive, spell.getSpellCore().isKnockbackMultiplied() ? "增加" : "沒有增加");
        final String noKnockback = passive + "沒有直接擊退";

        if (spell.getSpellCore().getKnockbackAmount() > 0) {
            lore.add(message);
            lore.add(multiMessage);
        } else {
            lore.add(noKnockback);
        }

        return new CustomItemStack(
            Material.SLIME_BLOCK,
            ThemeType.MAIN.getColor() + "擊退",
            lore
        );
    }

    @ParametersAreNonnullByDefault
    private ItemStack getProjectileStack(Spell spell) {
        final SpellCore spellCore = spell.getSpellCore();
        final ChatColor color = ThemeType.CLICK_INFO.getColor();
        final ChatColor passive = ThemeType.PASSIVE.getColor();

        final String aoeMessage = MessageFormat.format("{0}範圍投射物: {1}{2}", color, passive, spellCore.getProjectileAoeRange());
        final String aoeMultiMessage = MessageFormat.format("{0}範圍性 {1} 與法杖等級", passive, spellCore.isProjectileAoeMultiplied() ? "增加" : "沒有增加");
        final String knockbackMessage = MessageFormat.format("{0}投射物擊退: {1}{2}", color, passive, spellCore.getKnockbackAmount());
        final String knockbackMultiMessage = MessageFormat.format("{0}擊退 {1} 與法杖等級", passive, spellCore.isKnockbackMultiplied() ? "增加" : "沒有增加");

        final List<String> lore = new ArrayList<>();

        if (spellCore.isProjectileSpell()) {
            lore.add(aoeMessage);
            lore.add(aoeMultiMessage);
            lore.add("");
            lore.add(knockbackMessage);
            lore.add(knockbackMultiMessage);
        } else {
            lore.add(passive + "不是投射物法術");
        }

        return new CustomItemStack(
            Material.FIRE_CHARGE,
            ThemeType.MAIN.getColor() + "投射物資訊",
            lore
        );
    }

    @ParametersAreNonnullByDefault
    private ItemStack getEffectsStack(Spell spell) {
        final SpellCore spellCore = spell.getSpellCore();
        final ChatColor color = ThemeType.CLICK_INFO.getColor();
        final ChatColor passive = ThemeType.PASSIVE.getColor();
        final List<String> lore = new ArrayList<>();

        if (spellCore.isEffectingSpell()) {
            final String effectAmplification = MessageFormat.format(
                "{0}效果力量 {1} 與法杖等級",
                passive,
                spellCore.isAmplificationMultiplied() ? "增加" : "沒有增加"
            );
            final String effectDuration = MessageFormat.format(
                "{0}效果力量 {1} 與法杖等級",
                passive,
                spellCore.isEffectDurationMultiplied() ? "增加" : "沒有增加"
            );

            if (spellCore.getNegativeEffectPairMap().size() > 0) {
                lore.add(color + "負面效果:");
                spellCore.getNegativeEffectPairMap().forEach(
                    (type, pair) -> {
                        final String negativeEffectMessage = MessageFormat.format(
                            "{0}{1}: {2}力量 ({3}) - 持續時間 ({4})",
                            color,
                            ThemeType.toTitleCase(type.getName()),
                            passive,
                            pair.getFirstValue(),
                            pair.getSecondValue()
                        );
                        lore.add(negativeEffectMessage);
                    }
                );
            }

            if (spellCore.getPositiveEffectPairMap().size() > 0) {
                lore.add(color + "正面效果:");
                spellCore.getPositiveEffectPairMap().forEach(
                    (type, pair) -> {
                        final String positiveEffectMessage = MessageFormat.format(
                            "{0}{1}: {2}力量 ({3}) - 持續時間 ({4})",
                            color,
                            ThemeType.toTitleCase(type.getName()),
                            passive,
                            pair.getFirstValue(),
                            pair.getSecondValue()
                        );
                        lore.add(positiveEffectMessage);
                    }
                );
            }

            lore.add("");
            lore.add(effectAmplification);
            lore.add(effectDuration);
        } else {
            lore.add(passive + "法術沒有任何效果");
        }

        return new CustomItemStack(
            Material.BREWING_STAND,
            ThemeType.MAIN.getColor() + "效果",
            lore
        );
    }

    @ParametersAreNonnullByDefault
    private ItemStack getStatsStack(Player player) {
        final ChatColor color = ThemeType.CLICK_INFO.getColor();
        final ChatColor passive = ThemeType.PASSIVE.getColor();
        final List<String> lore = new ArrayList<>();
        final SpellRank spellRank = PlayerStatistics.getSpellRank(player.getUniqueId());

        lore.add(MessageFormat.format("{0}法術解鎖: {1}{2}", color, passive, PlayerStatistics.getSpellsUnlocked(player.getUniqueId())));
        lore.add(MessageFormat.format("{0}頭銜: {1}{2}", color, spellRank.getTheme().getColor(), spellRank.getTheme().getLoreLine()));

        return new CustomItemStack(
            Material.TARGET,
            ThemeType.MAIN.getColor() + "法術統計",
            lore
        );
    }
}
