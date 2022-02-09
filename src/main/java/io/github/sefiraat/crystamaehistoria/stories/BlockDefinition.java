package io.github.sefiraat.crystamaehistoria.stories;

import io.github.sefiraat.crystamaehistoria.stories.definition.StoryType;
import lombok.Getter;
import org.bukkit.Material;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

@Getter
public class BlockDefinition {

    private final Material material;
    private final BlockTier blockTier;
    private final List<StoryType> pools;
    private final Story unique;

    @ParametersAreNonnullByDefault
    public BlockDefinition(Material material, BlockTier tier, List<StoryType> pools, Story unique) {
        this.material = material;
        this.blockTier = tier;
        this.pools = pools;
        this.unique = unique;
    }
}
