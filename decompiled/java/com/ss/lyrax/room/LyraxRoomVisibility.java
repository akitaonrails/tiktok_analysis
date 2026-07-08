package com.ss.lyrax.room;

import X.C08FF;

/* JADX INFO: loaded from: classes4.dex */
public enum LyraxRoomVisibility {
    NONE(0),
    INNER(1);

    public final int val;

    public int value() {
        return this.val;
    }

    public static LyraxRoomVisibility fromId(int i) {
        for (LyraxRoomVisibility lyraxRoomVisibility : values()) {
            if (lyraxRoomVisibility.value() == i) {
                return lyraxRoomVisibility;
            }
        }
        return NONE;
    }

    public static LyraxRoomVisibility valueOf(String str) {
        return (LyraxRoomVisibility) C08FF.LIZ(LyraxRoomVisibility.class, str);
    }

    LyraxRoomVisibility(int i) {
        this.val = i;
    }
}
