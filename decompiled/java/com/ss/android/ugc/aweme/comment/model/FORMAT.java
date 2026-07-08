package com.ss.android.ugc.aweme.comment.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class FORMAT {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ FORMAT[] $VALUES;
    public static final Companion Companion;
    public final int value;
    public static final FORMAT DEFAULT = new FORMAT(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
    public static final FORMAT POSTANYWAY = new FORMAT("POSTANYWAY", 1, 1);
    public static final FORMAT EDIT = new FORMAT("EDIT", 2, 2);

    public static final /* synthetic */ FORMAT[] $values() {
        return new FORMAT[]{DEFAULT, POSTANYWAY, EDIT};
    }

    public static InterfaceC2044707zh<FORMAT> getEntries() {
        return $ENTRIES;
    }

    static {
        FORMAT[] formatArr$values = $values();
        $VALUES = formatArr$values;
        $ENTRIES = new C2254308sP(formatArr$values);
        Companion = new Companion();
    }

    public static FORMAT[] values() {
        return (FORMAT[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static final class Companion {
        public final FORMAT fromInt(int i) {
            for (FORMAT format : FORMAT.values()) {
                if (format.getValue() == i) {
                    return format;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }

    public static FORMAT valueOf(String str) {
        return (FORMAT) C08FF.LIZ(FORMAT.class, str);
    }

    public FORMAT(String str, int i, int i2) {
        this.value = i2;
    }
}
