package io.github.sefiraat.crystamaehistoria.slimefun;

import dev.sefiraat.netheopoiesis.api.items.HarvestableSeed;
import dev.sefiraat.netheopoiesis.api.plant.Growth;
import dev.sefiraat.netheopoiesis.api.plant.GrowthStages;
import dev.sefiraat.netheopoiesis.api.plant.Placements;
import dev.sefiraat.netheopoiesis.implementation.Stacks;
import dev.sefiraat.netheopoiesis.utils.Skulls;
import dev.sefiraat.netheopoiesis.utils.Theme;
import io.github.sefiraat.crystamaehistoria.CrystamaeHistoria;
import io.github.sefiraat.crystamaehistoria.stories.definition.StoryRarity;
import io.github.sefiraat.crystamaehistoria.stories.definition.StoryType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import lombok.experimental.UtilityClass;

@UtilityClass
public class NetheoPlants {

    // Stacks
    public static final SlimefunItemStack ELEMENTAL_COMMON_SEED = Theme.themedSeed(
        "CRY_ELEMENTAL_COMMON_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.SEED,
        "常見元素水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予元素水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack MECHANICAL_COMMON_SEED = Theme.themedSeed(
        "CRY_MECHANICAL_COMMON_SEED",
        Skulls.SEED_ORANGE.getPlayerHead(),
        Theme.SEED,
        "常見機械水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予機械水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack ALCHEMICAL_COMMON_SEED = Theme.themedSeed(
        "CRY_ALCHEMICAL_COMMON_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "常見煉金水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予煉金水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack HISTORICAL_COMMON_SEED = Theme.themedSeed(
        "CRY_HISTORICAL_COMMON_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "常見歷史水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予歷史水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack HUMAN_COMMON_SEED = Theme.themedSeed(
        "CRY_HUMAN_COMMON_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.SEED,
        "常見人類水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予人類水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack ANIMAL_COMMON_SEED = Theme.themedSeed(
        "CRY_ANIMAL_COMMON_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "常見動物水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予動物水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack CELESTIAL_COMMON_SEED = Theme.themedSeed(
        "CRY_CELESTIAL_COMMON_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "常見天體水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予天體水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack VOID_COMMON_SEED = Theme.themedSeed(
        "CRY_VOID_COMMON_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "常見虛無水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予虛無水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack PHILOSOPHICAL_COMMON_SEED = Theme.themedSeed(
        "CRY_PHILOSOPHICAL_COMMON_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "常見哲學水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予哲學水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );
    
    public static final SlimefunItemStack ELEMENTAL_UNCOMMON_SEED = Theme.themedSeed(
        "CRY_ELEMENTAL_UNCOMMON_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.SEED,
        "不常見元素水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予元素水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack MECHANICAL_UNCOMMON_SEED = Theme.themedSeed(
        "CRY_MECHANICAL_UNCOMMON_SEED",
        Skulls.SEED_ORANGE.getPlayerHead(),
        Theme.SEED,
        "不常見機械水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予機械水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack ALCHEMICAL_UNCOMMON_SEED = Theme.themedSeed(
        "CRY_ALCHEMICAL_UNCOMMON_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "不常見煉金水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予煉金水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack HISTORICAL_UNCOMMON_SEED = Theme.themedSeed(
        "CRY_HISTORICAL_UNCOMMON_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "不常見歷史水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予歷史水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack HUMAN_UNCOMMON_SEED = Theme.themedSeed(
        "CRY_HUMAN_UNCOMMON_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.SEED,
        "不常見人類水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予人類水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack ANIMAL_UNCOMMON_SEED = Theme.themedSeed(
        "CRY_ANIMAL_UNCOMMON_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "不常見動物水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予動物水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack CELESTIAL_UNCOMMON_SEED = Theme.themedSeed(
        "CRY_CELESTIAL_UNCOMMON_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "不常見天體水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予天體水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack VOID_UNCOMMON_SEED = Theme.themedSeed(
        "CRY_VOID_UNCOMMON_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "不常見虛無水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予虛無水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack PHILOSOPHICAL_UNCOMMON_SEED = Theme.themedSeed(
        "CRY_PHILOSOPHICAL_UNCOMMON_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "不常見哲學水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予哲學水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );
    
    public static final SlimefunItemStack ELEMENTAL_RARE_SEED = Theme.themedSeed(
        "CRY_ELEMENTAL_RARE_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.SEED,
        "稀有元素水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予元素水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack MECHANICAL_RARE_SEED = Theme.themedSeed(
        "CRY_MECHANICAL_RARE_SEED",
        Skulls.SEED_ORANGE.getPlayerHead(),
        Theme.SEED,
        "稀有機械水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予機械水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack ALCHEMICAL_RARE_SEED = Theme.themedSeed(
        "CRY_ALCHEMICAL_RARE_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "稀有煉金水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予煉金水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack HISTORICAL_RARE_SEED = Theme.themedSeed(
        "CRY_HISTORICAL_RARE_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "稀有歷史水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予歷史水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack HUMAN_RARE_SEED = Theme.themedSeed(
        "CRY_HUMAN_RARE_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.SEED,
        "稀有人類水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予人類水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack ANIMAL_RARE_SEED = Theme.themedSeed(
        "CRY_ANIMAL_RARE_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "稀有動物水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予動物水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack CELESTIAL_RARE_SEED = Theme.themedSeed(
        "CRY_CELESTIAL_RARE_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "稀有天體水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予天體水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack VOID_RARE_SEED = Theme.themedSeed(
        "CRY_VOID_RARE_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "稀有虛無水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予虛無水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack PHILOSOPHICAL_RARE_SEED = Theme.themedSeed(
        "CRY_PHILOSOPHICAL_RARE_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "稀有哲學水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予哲學水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );
    
    public static final SlimefunItemStack ELEMENTAL_EPIC_SEED = Theme.themedSeed(
        "CRY_ELEMENTAL_EPIC_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.SEED,
        "史詩元素水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予元素水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack MECHANICAL_EPIC_SEED = Theme.themedSeed(
        "CRY_MECHANICAL_EPIC_SEED",
        Skulls.SEED_ORANGE.getPlayerHead(),
        Theme.SEED,
        "史詩機械水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予機械水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack ALCHEMICAL_EPIC_SEED = Theme.themedSeed(
        "CRY_ALCHEMICAL_EPIC_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "史詩煉金水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予煉金水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack HISTORICAL_EPIC_SEED = Theme.themedSeed(
        "CRY_HISTORICAL_EPIC_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "史詩歷史水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予歷史水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack HUMAN_EPIC_SEED = Theme.themedSeed(
        "CRY_HUMAN_EPIC_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.SEED,
        "史詩人類水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予人類水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack ANIMAL_EPIC_SEED = Theme.themedSeed(
        "CRY_ANIMAL_EPIC_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "史詩動物水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予動物水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack CELESTIAL_EPIC_SEED = Theme.themedSeed(
        "CRY_CELESTIAL_EPIC_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "史詩天體水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予天體水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack VOID_EPIC_SEED = Theme.themedSeed(
        "CRY_VOID_EPIC_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "史詩虛無水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予虛無水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack PHILOSOPHICAL_EPIC_SEED = Theme.themedSeed(
        "CRY_PHILOSOPHICAL_EPIC_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "史詩哲學水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予哲學水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );
    
    public static final SlimefunItemStack ELEMENTAL_MYTHICAL_SEED = Theme.themedSeed(
        "CRY_ELEMENTAL_MYTHICAL_SEED",
        Skulls.SEED_RED.getPlayerHead(),
        Theme.SEED,
        "神話元素水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予元素水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack MECHANICAL_MYTHICAL_SEED = Theme.themedSeed(
        "CRY_MECHANICAL_MYTHICAL_SEED",
        Skulls.SEED_ORANGE.getPlayerHead(),
        Theme.SEED,
        "神話機械水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予機械水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack ALCHEMICAL_MYTHICAL_SEED = Theme.themedSeed(
        "CRY_ALCHEMICAL_MYTHICAL_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "神話煉金水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予煉金水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack HISTORICAL_MYTHICAL_SEED = Theme.themedSeed(
        "CRY_HISTORICAL_MYTHICAL_SEED",
        Skulls.SEED_GREEN.getPlayerHead(),
        Theme.SEED,
        "神話歷史水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予歷史水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack HUMAN_MYTHICAL_SEED = Theme.themedSeed(
        "CRY_HUMAN_MYTHICAL_SEED",
        Skulls.SEED_BLUE.getPlayerHead(),
        Theme.SEED,
        "神話人類水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予人類水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack ANIMAL_MYTHICAL_SEED = Theme.themedSeed(
        "CRY_ANIMAL_MYTHICAL_SEED",
        Skulls.SEED_CYAN.getPlayerHead(),
        Theme.SEED,
        "神話動物水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予動物水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack CELESTIAL_MYTHICAL_SEED = Theme.themedSeed(
        "CRY_CELESTIAL_MYTHICAL_SEED",
        Skulls.SEED_YELLOW.getPlayerHead(),
        Theme.SEED,
        "神話天體水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予天體水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack VOID_MYTHICAL_SEED = Theme.themedSeed(
        "CRY_VOID_MYTHICAL_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "神話虛無水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予虛無水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static final SlimefunItemStack PHILOSOPHICAL_MYTHICAL_SEED = Theme.themedSeed(
        "CRY_PHILOSOPHICAL_MYTHICAL_SEED",
        Skulls.SEED_PURPLE.getPlayerHead(),
        Theme.SEED,
        "神話哲學水晶種子",
        new String[]{"這顆種子完全成熟時,", "將會在採收時", "給予哲學水晶."},
        Stacks.getCanBePlacedOnLore("地獄草地 (或是其他更好的)")
    );

    public static void setup() {

        final CrystamaeHistoria plugin = CrystamaeHistoria.getInstance();

        new HarvestableSeed(ELEMENTAL_COMMON_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.ELEMENTAL).getItem())
            .setGrowth(new Growth(GrowthStages.VINEY_RED, Placements.NETHER_GRASS_AND_UP, 5, 0.05))
            .addBreedingPair(Stacks.CRYSTALLINE_SEED.getItemId(), Stacks.CRYSTALLINE_SEED.getItemId(), 0.1, 0)
            .addFlavourProfile(5, 2, 2, 2, 2)
            .tryRegister(plugin);

        new HarvestableSeed(MECHANICAL_COMMON_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.MECHANICAL).getItem())
            .setGrowth(new Growth(GrowthStages.VINEY_ORANGE, Placements.NETHER_GRASS_AND_UP, 5, 0.05))
            .addBreedingPair(Stacks.CRYSTALLINE_SEED.getItemId(), Stacks.CRYSTALLINE_SEED.getItemId(), 0.1, 0)
            .addFlavourProfile(2, 5, 2, 2, 2)
            .tryRegister(plugin);

        new HarvestableSeed(ALCHEMICAL_COMMON_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.ALCHEMICAL).getItem())
            .setGrowth(new Growth(GrowthStages.VINEY_YELLOW, Placements.NETHER_GRASS_AND_UP, 5, 0.05))
            .addBreedingPair(Stacks.CRYSTALLINE_SEED.getItemId(), Stacks.CRYSTALLINE_SEED.getItemId(), 0.1, 0)
            .addFlavourProfile(2, 2, 5, 2, 2)
            .tryRegister(plugin);

        new HarvestableSeed(HISTORICAL_COMMON_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.HISTORICAL).getItem())
            .setGrowth(new Growth(GrowthStages.VINEY_GREEN, Placements.NETHER_GRASS_AND_UP, 5, 0.05))
            .addBreedingPair(Stacks.CRYSTALLINE_SEED.getItemId(), Stacks.CRYSTALLINE_SEED.getItemId(), 0.1, 0)
            .addFlavourProfile(2, 2, 2, 5, 2)
            .tryRegister(plugin);

        new HarvestableSeed(HUMAN_COMMON_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.HUMAN).getItem())
            .setGrowth(new Growth(GrowthStages.VINEY_BLUE, Placements.NETHER_GRASS_AND_UP, 5, 0.05))
            .addBreedingPair(Stacks.CRYSTALLINE_SEED.getItemId(), Stacks.CRYSTALLINE_SEED.getItemId(), 0.1, 0)
            .addFlavourProfile(2, 2, 2, 2, 5)
            .tryRegister(plugin);

        new HarvestableSeed(ANIMAL_COMMON_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.ANIMAL).getItem())
            .setGrowth(new Growth(GrowthStages.VINEY_CYAN, Placements.NETHER_GRASS_AND_UP, 5, 0.05))
            .addBreedingPair(Stacks.CRYSTALLINE_SEED.getItemId(), Stacks.CRYSTALLINE_SEED.getItemId(), 0.1, 0)
            .addFlavourProfile(4, 4, 3, 2, 2)
            .tryRegister(plugin);

        new HarvestableSeed(CELESTIAL_COMMON_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.CELESTIAL).getItem())
            .setGrowth(new Growth(GrowthStages.VINEY_YELLOW, Placements.NETHER_GRASS_AND_UP, 5, 0.05))
            .addBreedingPair(Stacks.CRYSTALLINE_SEED.getItemId(), Stacks.CRYSTALLINE_SEED.getItemId(), 0.1, 0)
            .addFlavourProfile(2, 4, 4, 3, 2)
            .tryRegister(plugin);

        new HarvestableSeed(VOID_COMMON_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.VOID).getItem())
            .setGrowth(new Growth(GrowthStages.VINEY_PURPLE, Placements.NETHER_GRASS_AND_UP, 5, 0.05))
            .addBreedingPair(Stacks.CRYSTALLINE_SEED.getItemId(), Stacks.CRYSTALLINE_SEED.getItemId(), 0.1, 0)
            .addFlavourProfile(2, 2, 4, 4, 3)
            .tryRegister(plugin);

        new HarvestableSeed(PHILOSOPHICAL_COMMON_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.COMMON).get(StoryType.PHILOSOPHICAL).getItem())
            .setGrowth(new Growth(GrowthStages.VINEY_PURPLE, Placements.NETHER_GRASS_AND_UP, 5, 0.05))
            .addBreedingPair(Stacks.CRYSTALLINE_SEED.getItemId(), Stacks.CRYSTALLINE_SEED.getItemId(), 0.1, 0)
            .addFlavourProfile(3, 2, 2, 4, 4)
            .tryRegister(plugin);

        new HarvestableSeed(ELEMENTAL_UNCOMMON_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.ELEMENTAL).getItem())
            .setGrowth(new Growth(GrowthStages.FUNGAL_RED, Placements.NETHER_GRASS_AND_UP, 10, 0.01))
            .addBreedingPair(ELEMENTAL_COMMON_SEED.getItemId(), ELEMENTAL_COMMON_SEED.getItemId(), 0.05, 0.01)
            .addFlavourProfile(10, 2, 2, 2, 2)
            .tryRegister(plugin);

        new HarvestableSeed(MECHANICAL_UNCOMMON_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.MECHANICAL).getItem())
            .setGrowth(new Growth(GrowthStages.FUNGAL_ORANGE, Placements.NETHER_GRASS_AND_UP, 10, 0.01))
            .addBreedingPair(MECHANICAL_COMMON_SEED.getItemId(), MECHANICAL_COMMON_SEED.getItemId(), 0.05, 0.01)
            .addFlavourProfile(2, 10, 2, 2, 2)
            .tryRegister(plugin);

        new HarvestableSeed(ALCHEMICAL_UNCOMMON_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.ALCHEMICAL).getItem())
            .setGrowth(new Growth(GrowthStages.FUNGAL_YELLOW, Placements.NETHER_GRASS_AND_UP, 10, 0.01))
            .addBreedingPair(ALCHEMICAL_COMMON_SEED.getItemId(), ALCHEMICAL_COMMON_SEED.getItemId(), 0.05, 0.01)
            .addFlavourProfile(2, 2, 10, 2, 2)
            .tryRegister(plugin);

        new HarvestableSeed(HISTORICAL_UNCOMMON_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.HISTORICAL).getItem())
            .setGrowth(new Growth(GrowthStages.FUNGAL_GREEN, Placements.NETHER_GRASS_AND_UP, 10, 0.01))
            .addBreedingPair(HISTORICAL_COMMON_SEED.getItemId(), HISTORICAL_COMMON_SEED.getItemId(), 0.05, 0.01)
            .addFlavourProfile(2, 2, 2, 10, 2)
            .tryRegister(plugin);

        new HarvestableSeed(HUMAN_UNCOMMON_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.HUMAN).getItem())
            .setGrowth(new Growth(GrowthStages.FUNGAL_BLUE, Placements.NETHER_GRASS_AND_UP, 10, 0.01))
            .addBreedingPair(HUMAN_COMMON_SEED.getItemId(), HUMAN_COMMON_SEED.getItemId(), 0.05, 0.01)
            .addFlavourProfile(2, 2, 2, 2, 10)
            .tryRegister(plugin);

        new HarvestableSeed(ANIMAL_UNCOMMON_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.ANIMAL).getItem())
            .setGrowth(new Growth(GrowthStages.FUNGAL_CYAN, Placements.NETHER_GRASS_AND_UP, 10, 0.01))
            .addBreedingPair(ANIMAL_COMMON_SEED.getItemId(), ANIMAL_COMMON_SEED.getItemId(), 0.05, 0.01)
            .addFlavourProfile(6, 6, 4, 2, 2)
            .tryRegister(plugin);

        new HarvestableSeed(CELESTIAL_UNCOMMON_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.CELESTIAL).getItem())
            .setGrowth(new Growth(GrowthStages.FUNGAL_YELLOW, Placements.NETHER_GRASS_AND_UP, 10, 0.01))
            .addBreedingPair(CELESTIAL_COMMON_SEED.getItemId(), CELESTIAL_COMMON_SEED.getItemId(), 0.05, 0.01)
            .addFlavourProfile(2, 6, 6, 4, 2)
            .tryRegister(plugin);

        new HarvestableSeed(VOID_UNCOMMON_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.VOID).getItem())
            .setGrowth(new Growth(GrowthStages.FUNGAL_PURPLE, Placements.NETHER_GRASS_AND_UP, 10, 0.01))
            .addBreedingPair(VOID_COMMON_SEED.getItemId(), VOID_COMMON_SEED.getItemId(), 0.05, 0.01)
            .addFlavourProfile(2, 2, 6, 6, 4)
            .tryRegister(plugin);

        new HarvestableSeed(PHILOSOPHICAL_UNCOMMON_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.UNCOMMON).get(StoryType.PHILOSOPHICAL).getItem())
            .setGrowth(new Growth(GrowthStages.FUNGAL_PURPLE, Placements.NETHER_GRASS_AND_UP, 10, 0.01))
            .addBreedingPair(PHILOSOPHICAL_COMMON_SEED.getItemId(), PHILOSOPHICAL_COMMON_SEED.getItemId(), 0.05, 0.01)
            .addFlavourProfile(4, 2, 2, 6, 6)
            .tryRegister(plugin);

        new HarvestableSeed(ELEMENTAL_RARE_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.ELEMENTAL).getItem())
            .setGrowth(new Growth(GrowthStages.SPIKEY_RED, Placements.NETHER_GRASS_AND_UP, 10, 0.005))
            .addBreedingPair(ELEMENTAL_UNCOMMON_SEED.getItemId(), ELEMENTAL_UNCOMMON_SEED.getItemId(), 0.025, 0.005)
            .addFlavourProfile(20, 2, 2, 2, 2)
            .tryRegister(plugin);

        new HarvestableSeed(MECHANICAL_RARE_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.MECHANICAL).getItem())
            .setGrowth(new Growth(GrowthStages.SPIKEY_ORANGE, Placements.NETHER_GRASS_AND_UP, 10, 0.005))
            .addBreedingPair(MECHANICAL_UNCOMMON_SEED.getItemId(), MECHANICAL_UNCOMMON_SEED.getItemId(), 0.025, 0.005)
            .addFlavourProfile(2, 20, 2, 2, 2)
            .tryRegister(plugin);

        new HarvestableSeed(ALCHEMICAL_RARE_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.ALCHEMICAL).getItem())
            .setGrowth(new Growth(GrowthStages.SPIKEY_YELLOW, Placements.NETHER_GRASS_AND_UP, 10, 0.005))
            .addBreedingPair(ALCHEMICAL_UNCOMMON_SEED.getItemId(), ALCHEMICAL_UNCOMMON_SEED.getItemId(), 0.025, 0.005)
            .addFlavourProfile(2, 2, 20, 2, 2)
            .tryRegister(plugin);

        new HarvestableSeed(HISTORICAL_RARE_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.HISTORICAL).getItem())
            .setGrowth(new Growth(GrowthStages.SPIKEY_GREEN, Placements.NETHER_GRASS_AND_UP, 10, 0.005))
            .addBreedingPair(HISTORICAL_UNCOMMON_SEED.getItemId(), HISTORICAL_UNCOMMON_SEED.getItemId(), 0.025, 0.005)
            .addFlavourProfile(2, 2, 2, 20, 2)
            .tryRegister(plugin);

        new HarvestableSeed(HUMAN_RARE_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.HUMAN).getItem())
            .setGrowth(new Growth(GrowthStages.SPIKEY_BLUE, Placements.NETHER_GRASS_AND_UP, 10, 0.005))
            .addBreedingPair(HUMAN_UNCOMMON_SEED.getItemId(), HUMAN_UNCOMMON_SEED.getItemId(), 0.025, 0.005)
            .addFlavourProfile(2, 2, 2, 2, 20)
            .tryRegister(plugin);

        new HarvestableSeed(ANIMAL_RARE_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.ANIMAL).getItem())
            .setGrowth(new Growth(GrowthStages.SPIKEY_CYAN, Placements.NETHER_GRASS_AND_UP, 10, 0.005))
            .addBreedingPair(ANIMAL_UNCOMMON_SEED.getItemId(), ANIMAL_UNCOMMON_SEED.getItemId(), 0.025, 0.005)
            .addFlavourProfile(10, 10, 6, 2, 2)
            .tryRegister(plugin);

        new HarvestableSeed(CELESTIAL_RARE_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.CELESTIAL).getItem())
            .setGrowth(new Growth(GrowthStages.SPIKEY_YELLOW, Placements.NETHER_GRASS_AND_UP, 10, 0.005))
            .addBreedingPair(CELESTIAL_UNCOMMON_SEED.getItemId(), CELESTIAL_UNCOMMON_SEED.getItemId(), 0.025, 0.005)
            .addFlavourProfile(2, 10, 10, 6, 2)
            .tryRegister(plugin);

        new HarvestableSeed(VOID_RARE_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.VOID).getItem())
            .setGrowth(new Growth(GrowthStages.SPIKEY_PURPLE, Placements.NETHER_GRASS_AND_UP, 10, 0.005))
            .addBreedingPair(VOID_UNCOMMON_SEED.getItemId(), VOID_UNCOMMON_SEED.getItemId(), 0.025, 0.005)
            .addFlavourProfile(2, 2, 10, 10, 6)
            .tryRegister(plugin);

        new HarvestableSeed(PHILOSOPHICAL_RARE_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.RARE).get(StoryType.PHILOSOPHICAL).getItem())
            .setGrowth(new Growth(GrowthStages.SPIKEY_PURPLE, Placements.NETHER_GRASS_AND_UP, 10, 0.005))
            .addBreedingPair(PHILOSOPHICAL_UNCOMMON_SEED.getItemId(), PHILOSOPHICAL_UNCOMMON_SEED.getItemId(), 0.025, 0.005)
            .addFlavourProfile(6, 2, 2, 10, 10)
            .tryRegister(plugin);

        new HarvestableSeed(ELEMENTAL_EPIC_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.ELEMENTAL).getItem())
            .setGrowth(new Growth(GrowthStages.SPIKEY_RED, Placements.NETHER_GRASS_AND_UP, 20, 0.0025))
            .addBreedingPair(ELEMENTAL_RARE_SEED.getItemId(), ELEMENTAL_RARE_SEED.getItemId(), 0.001, 0.0025)
            .addFlavourProfile(20, 2, 2, 2, 2)
            .tryRegister(plugin);

        new HarvestableSeed(MECHANICAL_EPIC_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.MECHANICAL).getItem())
            .setGrowth(new Growth(GrowthStages.SPIKEY_ORANGE, Placements.NETHER_GRASS_AND_UP, 20, 0.0025))
            .addBreedingPair(MECHANICAL_RARE_SEED.getItemId(), MECHANICAL_RARE_SEED.getItemId(), 0.001, 0.0025)
            .addFlavourProfile(2, 20, 2, 2, 2)
            .tryRegister(plugin);

        new HarvestableSeed(ALCHEMICAL_EPIC_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.ALCHEMICAL).getItem())
            .setGrowth(new Growth(GrowthStages.SPIKEY_YELLOW, Placements.NETHER_GRASS_AND_UP, 20, 0.0025))
            .addBreedingPair(ALCHEMICAL_RARE_SEED.getItemId(), ALCHEMICAL_RARE_SEED.getItemId(), 0.001, 0.0025)
            .addFlavourProfile(2, 2, 20, 2, 2)
            .tryRegister(plugin);

        new HarvestableSeed(HISTORICAL_EPIC_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.HISTORICAL).getItem())
            .setGrowth(new Growth(GrowthStages.SPIKEY_GREEN, Placements.NETHER_GRASS_AND_UP, 20, 0.0025))
            .addBreedingPair(HISTORICAL_RARE_SEED.getItemId(), HISTORICAL_RARE_SEED.getItemId(), 0.001, 0.0025)
            .addFlavourProfile(2, 2, 2, 20, 2)
            .tryRegister(plugin);

        new HarvestableSeed(HUMAN_EPIC_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.HUMAN).getItem())
            .setGrowth(new Growth(GrowthStages.SPIKEY_BLUE, Placements.NETHER_GRASS_AND_UP, 20, 0.0025))
            .addBreedingPair(HUMAN_RARE_SEED.getItemId(), HUMAN_RARE_SEED.getItemId(), 0.001, 0.0025)
            .addFlavourProfile(2, 2, 2, 2, 20)
            .tryRegister(plugin);

        new HarvestableSeed(ANIMAL_EPIC_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.ANIMAL).getItem())
            .setGrowth(new Growth(GrowthStages.SPIKEY_CYAN, Placements.NETHER_GRASS_AND_UP, 20, 0.0025))
            .addBreedingPair(ANIMAL_RARE_SEED.getItemId(), ANIMAL_RARE_SEED.getItemId(), 0.001, 0.0025)
            .addFlavourProfile(20, 20, 6, 2, 2)
            .tryRegister(plugin);

        new HarvestableSeed(CELESTIAL_EPIC_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.CELESTIAL).getItem())
            .setGrowth(new Growth(GrowthStages.SPIKEY_YELLOW, Placements.NETHER_GRASS_AND_UP, 20, 0.0025))
            .addBreedingPair(CELESTIAL_RARE_SEED.getItemId(), CELESTIAL_RARE_SEED.getItemId(), 0.001, 0.0025)
            .addFlavourProfile(2, 20, 20, 6, 2)
            .tryRegister(plugin);

        new HarvestableSeed(VOID_EPIC_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.VOID).getItem())
            .setGrowth(new Growth(GrowthStages.SPIKEY_PURPLE, Placements.NETHER_GRASS_AND_UP, 20, 0.0025))
            .addBreedingPair(VOID_RARE_SEED.getItemId(), VOID_RARE_SEED.getItemId(), 0.001, 0.0025)
            .addFlavourProfile(2, 2, 20, 20, 6)
            .tryRegister(plugin);

        new HarvestableSeed(PHILOSOPHICAL_EPIC_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.EPIC).get(StoryType.PHILOSOPHICAL).getItem())
            .setGrowth(new Growth(GrowthStages.SPIKEY_PURPLE, Placements.NETHER_GRASS_AND_UP, 20, 0.0025))
            .addBreedingPair(PHILOSOPHICAL_RARE_SEED.getItemId(), PHILOSOPHICAL_RARE_SEED.getItemId(), 0.001, 0.0025)
            .addFlavourProfile(6, 2, 2, 20, 20)
            .tryRegister(plugin);

        new HarvestableSeed(ELEMENTAL_MYTHICAL_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.ELEMENTAL).getItem())
            .setGrowth(new Growth(GrowthStages.SPAWNING_RED, Placements.NETHER_GRASS_AND_UP, 30, 0.0025))
            .addBreedingPair(ELEMENTAL_EPIC_SEED.getItemId(), ELEMENTAL_EPIC_SEED.getItemId(), 0.001, 0.0025)
            .addFlavourProfile(30, 2, 2, 2, 2)
            .tryRegister(plugin);

        new HarvestableSeed(MECHANICAL_MYTHICAL_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.MECHANICAL).getItem())
            .setGrowth(new Growth(GrowthStages.SPAWNING_ORANGE, Placements.NETHER_GRASS_AND_UP, 30, 0.0025))
            .addBreedingPair(MECHANICAL_EPIC_SEED.getItemId(), MECHANICAL_EPIC_SEED.getItemId(), 0.001, 0.0025)
            .addFlavourProfile(2, 30, 2, 2, 2)
            .tryRegister(plugin);

        new HarvestableSeed(ALCHEMICAL_MYTHICAL_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.ALCHEMICAL).getItem())
            .setGrowth(new Growth(GrowthStages.SPAWNING_YELLOW, Placements.NETHER_GRASS_AND_UP, 30, 0.0025))
            .addBreedingPair(ALCHEMICAL_EPIC_SEED.getItemId(), ALCHEMICAL_EPIC_SEED.getItemId(), 0.001, 0.0025)
            .addFlavourProfile(2, 2, 30, 2, 2)
            .tryRegister(plugin);

        new HarvestableSeed(HISTORICAL_MYTHICAL_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.HISTORICAL).getItem())
            .setGrowth(new Growth(GrowthStages.SPAWNING_GREEN, Placements.NETHER_GRASS_AND_UP, 30, 0.0025))
            .addBreedingPair(HISTORICAL_EPIC_SEED.getItemId(), HISTORICAL_EPIC_SEED.getItemId(), 0.001, 0.0025)
            .addFlavourProfile(2, 2, 2, 30, 2)
            .tryRegister(plugin);

        new HarvestableSeed(HUMAN_MYTHICAL_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.HUMAN).getItem())
            .setGrowth(new Growth(GrowthStages.SPAWNING_BLUE, Placements.NETHER_GRASS_AND_UP, 30, 0.0025))
            .addBreedingPair(HUMAN_EPIC_SEED.getItemId(), HUMAN_EPIC_SEED.getItemId(), 0.001, 0.0025)
            .addFlavourProfile(2, 2, 2, 2, 30)
            .tryRegister(plugin);

        new HarvestableSeed(ANIMAL_MYTHICAL_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.ANIMAL).getItem())
            .setGrowth(new Growth(GrowthStages.SPAWNING_CYAN, Placements.NETHER_GRASS_AND_UP, 30, 0.0025))
            .addBreedingPair(ANIMAL_EPIC_SEED.getItemId(), ANIMAL_EPIC_SEED.getItemId(), 0.001, 0.0025)
            .addFlavourProfile(30, 30, 6, 2, 2)
            .tryRegister(plugin);

        new HarvestableSeed(CELESTIAL_MYTHICAL_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.CELESTIAL).getItem())
            .setGrowth(new Growth(GrowthStages.SPAWNING_YELLOW, Placements.NETHER_GRASS_AND_UP, 30, 0.0025))
            .addBreedingPair(CELESTIAL_EPIC_SEED.getItemId(), CELESTIAL_EPIC_SEED.getItemId(), 0.001, 0.0025)
            .addFlavourProfile(2, 30, 30, 6, 2)
            .tryRegister(plugin);

        new HarvestableSeed(VOID_MYTHICAL_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.VOID).getItem())
            .setGrowth(new Growth(GrowthStages.SPAWNING_PURPLE, Placements.NETHER_GRASS_AND_UP, 30, 0.0025))
            .addBreedingPair(VOID_EPIC_SEED.getItemId(), VOID_EPIC_SEED.getItemId(), 0.001, 0.0025)
            .addFlavourProfile(2, 2, 30, 30, 6)
            .tryRegister(plugin);

        new HarvestableSeed(PHILOSOPHICAL_MYTHICAL_SEED)
            .setHarvestingResult(Materials.CRYSTAL_MAP.get(StoryRarity.MYTHICAL).get(StoryType.PHILOSOPHICAL).getItem())
            .setGrowth(new Growth(GrowthStages.SPAWNING_PURPLE, Placements.NETHER_GRASS_AND_UP, 30, 0.0025))
            .addBreedingPair(PHILOSOPHICAL_EPIC_SEED.getItemId(), PHILOSOPHICAL_EPIC_SEED.getItemId(), 0.001, 0.0025)
            .addFlavourProfile(6, 2, 2, 30, 30)
            .tryRegister(plugin);
    }
}
