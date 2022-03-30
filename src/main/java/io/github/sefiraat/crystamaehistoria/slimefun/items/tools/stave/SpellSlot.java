package io.github.sefiraat.crystamaehistoria.slimefun.items.tools.stave;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.Objects;

public enum SpellSlot {
    LEFT_CLICK(1),
    RIGHT_CLICK(2),
    SHIFT_LEFT_CLICK(3),
    SHIFT_RIGHT_CLICK(4);

    @Getter
    private static final SpellSlot[] cashedValues = values();

    @Getter
    private final int slot;

    SpellSlot(int slot) {
        this.slot = slot;
    }

    @Nullable
    public static SpellSlot getBySlot(int slot) {
        for (SpellSlot spellSlot : values()) {
            if (spellSlot.slot == slot) {
                return spellSlot;
            }
        }
        return null;
    }

    @Nullable
    @ParametersAreNonnullByDefault
    public static SpellSlot getByPlayerAndAction(Player player, Action action) {
        if (action == Action.LEFT_CLICK_AIR || action == Action.LEFT_CLICK_BLOCK) {
            return player.isSneaking() ? SpellSlot.SHIFT_LEFT_CLICK : SpellSlot.LEFT_CLICK;
        } else if (action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK) {
            return player.isSneaking() ? SpellSlot.SHIFT_RIGHT_CLICK : SpellSlot.RIGHT_CLICK;
        }
        return null;
    }

    public static String getByActionName(String name) {
        if (Objects.equals(name, "LEFT_CLICK")) {
            return "左鍵點擊";
        } else if (Objects.equals(name, "SHIFT_LEFT_CLICK")) {
            return "蹲下左鍵點擊";
        } else if (Objects.equals(name, "RIGHT_CLICK")) {
            return "右鍵點擊";
        } else if (Objects.equals(name, "SHIFT_RIGHT_CLICK")) {
            return "蹲下右鍵點擊";
        }
        return name;
    }
}
