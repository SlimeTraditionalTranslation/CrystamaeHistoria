package io.github.sefiraat.crystamaehistoria.magic.spells.tier1;

import io.github.sefiraat.crystamaehistoria.magic.CastInformation;
import io.github.sefiraat.crystamaehistoria.magic.spells.core.Spell;
import io.github.sefiraat.crystamaehistoria.magic.spells.core.SpellCoreBuilder;
import io.github.sefiraat.crystamaehistoria.magic.spells.spellobjects.MagicSummon;
import io.github.sefiraat.crystamaehistoria.slimefun.items.mechanisms.liquefactionbasin.RecipeSpell;
import io.github.sefiraat.crystamaehistoria.stories.definition.StoryType;
import io.github.sefiraat.crystamaehistoria.utils.ParticleUtils;
import io.github.sefiraat.crystamaehistoria.utils.SpellUtils;
import io.github.sefiraat.crystamaehistoria.utils.mobgoals.RidableGroundGoal;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.EntityType;
import org.bukkit.potion.PotionEffectType;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class Ravage extends Spell {

    public Ravage() {
        SpellCoreBuilder spellCoreBuilder = new SpellCoreBuilder(5, true, 0, false, 25, true)
            .makeInstantSpell(this::cast)
            .makeEffectingSpell(true, false)
            .addPositiveEffect(PotionEffectType.DAMAGE_RESISTANCE, 1, 300)
            .addPositiveEffect(PotionEffectType.INCREASE_DAMAGE, 1, 300)
            .addPositiveEffect(PotionEffectType.ABSORPTION, 1, 300);
        setSpellCore(spellCoreBuilder.build());
    }

    @ParametersAreNonnullByDefault
    public void cast(CastInformation castInformation) {
        final UUID caster = castInformation.getCaster();
        final Location location = castInformation.getCastLocation();
        final Location spawnLocation = location.clone().add(
            ThreadLocalRandom.current().nextDouble(-3, 3),
            0,
            ThreadLocalRandom.current().nextDouble(-3, 3)
        );
        final MagicSummon magicSummon = SpellUtils.summonTemporaryMob(
            EntityType.RAVAGER,
            caster,
            spawnLocation,
            new RidableGroundGoal(caster),
            300,
            this::onTick
        );
        applyPositiveEffects(magicSummon.getMob(), castInformation);
    }

    @ParametersAreNonnullByDefault
    public void onTick(MagicSummon magicSummon) {
        ParticleUtils.displayParticleEffect(magicSummon.getMob(), Particle.VILLAGER_ANGRY, 1, 2);
    }

    @Nonnull
    @Override
    public RecipeSpell getRecipe() {
        return new RecipeSpell(
            1,
            StoryType.MECHANICAL,
            StoryType.ALCHEMICAL,
            StoryType.ANIMAL
        );
    }

    @Nonnull
    @Override
    public String[] getLore() {
        return new String[]{
            "招換一個馴服的劫毀獸到你身旁.",
            "這個法術效果和倍率",
            "適用於劫毀獸上,",
            "而不是施法者."
        };
    }

    @Nonnull
    @Override
    public String getId() {
        return "RAVAGE";
    }

    @Nonnull
    @Override
    public String getSpName() {
        return "蹂躪";
    }

    @Nonnull
    @Override
    public Material getMaterial() {
        return Material.RAVAGER_SPAWN_EGG;
    }

}
