package io.github.sefiraat.crystamaehistoria.slimefun.itemgroups;

import io.github.sefiraat.crystamaehistoria.utils.Keys;
import io.github.sefiraat.crystamaehistoria.utils.theme.ThemeType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class DummyGuideOnly {

    public static final SlimefunItemStack STACK = ThemeType.themedSlimefunItemStack(
        "CRY_GUIDE_DUMMY",
        new ItemStack(Material.BOOK),
        ThemeType.MECHANISM,
        "指南",
        "這只是個指南.",
        "與其他附加比, 水晶編年史",
        "中的一些製作方式非常不同,",
        "所以這只是為了澄清這點."
    );
    public static final RecipeType TYPE = new RecipeType(Keys.GUIDE_ONLY, STACK);
}
