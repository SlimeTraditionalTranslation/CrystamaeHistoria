package io.github.sefiraat.crystamaehistoria.magic.spells.tier1;

import io.github.sefiraat.crystamaehistoria.CrystamaeHistoria;
import io.github.sefiraat.crystamaehistoria.magic.CastInformation;
import io.github.sefiraat.crystamaehistoria.magic.spells.core.Spell;
import io.github.sefiraat.crystamaehistoria.magic.spells.core.SpellCoreBuilder;
import io.github.sefiraat.crystamaehistoria.runnables.spells.TunnelBoreRunnable;
import io.github.sefiraat.crystamaehistoria.slimefun.mechanisms.liquefactionbasin.RecipeSpell;
import io.github.sefiraat.crystamaehistoria.stories.definition.StoryType;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Endermite;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.util.Vector;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.UUID;

/**
 * Removed due to issues. Will be replaced with a raycast version of the same spell.
 * Given the powerful nature of the spell, I want this to await tier 2 spells first.
 */
public class TunnelBore extends Spell {

    public TunnelBore() {
        SpellCoreBuilder spellCoreBuilder = new SpellCoreBuilder(50, true, 1, true, 30, true)
            .makeInstantSpell(this::cast);
        setSpellCore(spellCoreBuilder.build());
    }

    @ParametersAreNonnullByDefault
    public void cast(CastInformation castInformation) {
        final UUID caster = castInformation.getCaster();
        final Location location = castInformation.getCastLocation();
        final Vector direction = location.getDirection().clone();
        final int range = (int) getRange(castInformation);
        direction.setY(0);
        final Location spawnLocation = location.clone().add(0, range, 0);
        final Endermite bore = (Endermite) spawnLocation.getWorld().spawnEntity(spawnLocation,
            EntityType.ENDERMITE,
            CreatureSpawnEvent.SpawnReason.COMMAND,
            entity -> {
                Endermite mite = (Endermite) entity;
                mite.setGravity(false);
                mite.setInvulnerable(true);
                mite.setInvisible(true);
                mite.setVelocity(location.getDirection().multiply(2));
            });
        TunnelBoreRunnable runnable = new TunnelBoreRunnable(bore, range, caster, range * 20);
        runnable.runTaskTimer(CrystamaeHistoria.getInstance(), 0, 1);
    }

    @Nonnull
    @Override
    public RecipeSpell getRecipe() {
        return new RecipeSpell(
            1,
            StoryType.ELEMENTAL,
            StoryType.ALCHEMICAL,
            StoryType.ANIMAL
        );
    }

    @Nonnull
    @Override
    public String[] getLore() {
        return new String[]{
            "使用強大的魔法在你面對的",
            "方向鑽出一條隧道.",
            "不會掉落物品."
        };
    }

    @Nonnull
    @Override
    public String getId() {
        return "TUNNEL_BORE";
    }

    @Nonnull
    @Override
    public String getSpName() {
        return "隧道鑽孔";
    }

    @Nonnull
    @Override
    public Material getMaterial() {
        return Material.GOAT_SPAWN_EGG;
    }

}
