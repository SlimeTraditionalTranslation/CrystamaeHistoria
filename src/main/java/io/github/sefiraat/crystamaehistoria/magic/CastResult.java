package io.github.sefiraat.crystamaehistoria.magic;

import lombok.Getter;

public enum CastResult {
    CAST_SUCCESS("成功的"),
    CAST_FAIL_NO_CRYSTA("沒有足夠的水晶在板子內"),
    CAST_FAIL_SLOT_EMPTY("欄位內沒有板子"),
    ON_COOLDOWN("法術正在冷卻"),
    SPELL_DISABLED("這個法術已被停用");

    @Getter
    protected static final CastResult[] cachedValues = values();
    private final String message;

    CastResult(String message) {
        this.message = message;
    }

    public String getMessage() {
        return getMessage(null);
    }

    public String getMessage(String detail) {
        if (detail == null) {
            return message;
        } else {
            return message + ": " + detail;
        }
    }

}
