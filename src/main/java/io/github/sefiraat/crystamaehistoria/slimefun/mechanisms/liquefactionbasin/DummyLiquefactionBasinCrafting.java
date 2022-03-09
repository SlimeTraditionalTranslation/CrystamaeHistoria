package io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin;

import io.github.sefiraat.crystamaehistoria.utils.Keys;
import io.github.sefiraat.crystamaehistoria.utils.theme.ThemeType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class DummyLiquefactionBasinCrafting {

    public static final SlimefunItemStack STACK = ThemeType.themedSlimefunItemStack(
        "CRY_LIQUEFACTION_BASIN_DUMMY_CRAFTING",
        new ItemStack(Material.CAULDRON),
        ThemeType.MECHANISM,
        "液化池",
        "通過將相應物品丟入",
        "在液化池中填充來",
        "形成正確的水晶."
    );
    public static final RecipeType TYPE = new RecipeType(Keys.LIQUEFACTION_DUMMY_CRAFTING, STACK);
}
