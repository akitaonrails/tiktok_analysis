package com.ss.android.ugc.aweme.music.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class PreSaveButtonType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ PreSaveButtonType[] $VALUES;
    public static final Companion Companion;
    public final String eventValue;
    public final int value;
    public static final PreSaveButtonType UNKNOWN = new PreSaveButtonType("UNKNOWN", 0, 0, "null");
    public static final PreSaveButtonType BIG = new PreSaveButtonType("BIG", 1, 1, "big");
    public static final PreSaveButtonType SMALL = new PreSaveButtonType("SMALL", 2, 2, "small");

    public static final /* synthetic */ PreSaveButtonType[] $values() {
        return new PreSaveButtonType[]{UNKNOWN, BIG, SMALL};
    }

    public static InterfaceC2044707zh<PreSaveButtonType> getEntries() {
        return $ENTRIES;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.music.model.PreSaveButtonType$Companion] */
    static {
        PreSaveButtonType[] preSaveButtonTypeArr$values = $values();
        $VALUES = preSaveButtonTypeArr$values;
        $ENTRIES = new C2254308sP(preSaveButtonTypeArr$values);
        Companion = new Object() { // from class: com.ss.android.ugc.aweme.music.model.PreSaveButtonType.Companion
            public final PreSaveButtonType from(Integer num) {
                if (num != null) {
                    num.intValue();
                    for (PreSaveButtonType preSaveButtonType : PreSaveButtonType.values()) {
                        if (preSaveButtonType.getValue() == num.intValue()) {
                            return preSaveButtonType;
                        }
                    }
                    return PreSaveButtonType.UNKNOWN;
                }
                return PreSaveButtonType.UNKNOWN;
            }

            public final PreSaveButtonType from(String str) {
                if (str == null) {
                    return PreSaveButtonType.UNKNOWN;
                }
                for (PreSaveButtonType preSaveButtonType : PreSaveButtonType.values()) {
                    if (Intrinsics.LJFF(preSaveButtonType.getEventValue(), str)) {
                        return preSaveButtonType;
                    }
                }
                return PreSaveButtonType.UNKNOWN;
            }
        };
    }

    public static PreSaveButtonType[] values() {
        return (PreSaveButtonType[]) $VALUES.clone();
    }

    public final String getEventValue() {
        return this.eventValue;
    }

    public final int getValue() {
        return this.value;
    }

    public static PreSaveButtonType valueOf(String str) {
        return (PreSaveButtonType) C08FF.LIZ(PreSaveButtonType.class, str);
    }

    public PreSaveButtonType(String str, int i, int i2, String str2) {
        this.value = i2;
        this.eventValue = str2;
    }
}
