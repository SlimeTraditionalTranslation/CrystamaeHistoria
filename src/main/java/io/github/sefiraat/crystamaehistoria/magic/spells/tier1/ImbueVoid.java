package io.github.sefiraat.crystamaehistoria.magic.spells.tier1;

import io.github.sefiraat.crystamaehistoria.magic.CastInformation;
import io.github.sefiraat.crystamaehistoria.magic.spells.core.Spell;
import io.github.sefiraat.crystamaehistoria.magic.spells.core.SpellCoreBuilder;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.RecipeSpell;
import io.github.sefiraat.crystamaehistoria.stories.definition.StoryType;
import io.github.sefiraat.crystamaehistoria.utils.SpellUtils;
import io.github.sefiraat.crystamaehistoria.utils.mobgoals.BoringGoal;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.potion.PotionEffectType;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.concurrent.ThreadLocalRandom;

public class ImbueVoid extends Spell {

    public ImbueVoid() {
        SpellCoreBuilder spellCoreBuilder = new SpellCoreBuilder(240, false, 3, false, 30, true)
            .makeTickingSpell(this::onTick, 5, false, 40, false)
            .addPositiveEffect(PotionEffectType.SLOW, 99, 5)
            .addPositiveEffect(PotionEffectType.SLOW_DIGGING, 99, 5);
        setSpellCore(spellCoreBuilder.build());

    }

    @ParametersAreNonnullByDefault
    public void onTick(CastInformation castInformation) {
        final double range = getRange(castInformation);
        final Location location = castInformation.getCastLocation().clone().add(
            ThreadLocalRandom.current().nextDouble(-range, range),
            0,
            ThreadLocalRandom.current().nextDouble(-range, range)
        );
        for (int i = 0; i < castInformation.getStaveLevel(); i++) {
            SpellUtils.summonTemporaryMob(
                EntityType.ENDERMITE,
                castInformation.getCaster(),
                location,
                new BoringGoal(castInformation.getCaster()),
                5
            );
        }
        applyPositiveEffects(castInformation.getCasterAsPlayer(), castInformation);
    }

    @Nonnull
    @Override
    public RecipeSpell getRecipe() {
        return new RecipeSpell(
            1,
            StoryType.HUMAN,
            StoryType.VOID,
            StoryType.PHILOSOPHICAL
        );
    }

    @Nonnull
    @Override
    public String[] getLore() {
        return new String[]{
            "生成一群終界蟎來",
            "代表你作戰. 在此法術期間,",
            "你將不能攻擊或移動."
        };
    }

    @Nonnull
    @Override
    public String getId() {
        return "IMBUE_VOID";
    }

    @Nonnull
    @Override
    public String getSpName() {
        return "感染之無";
    }

    @Nonnull
    @Override
    public Material getMaterial() {
        return Material.ENDERMITE_SPAWN_EGG;
    }
}
