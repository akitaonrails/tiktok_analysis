package com.ss.android.ugc.aweme.music.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class DspSheetType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ DspSheetType[] $VALUES;
    public static final Companion Companion;
    public static final DspSheetType SELECT_DSP = new DspSheetType("SELECT_DSP", 0);
    public static final DspSheetType SELECT_PLAYLIST = new DspSheetType("SELECT_PLAYLIST", 1);

    public static final /* synthetic */ DspSheetType[] $values() {
        return new DspSheetType[]{SELECT_DSP, SELECT_PLAYLIST};
    }

    public static InterfaceC2044707zh<DspSheetType> getEntries() {
        return $ENTRIES;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.music.model.DspSheetType$Companion] */
    static {
        DspSheetType[] dspSheetTypeArr$values = $values();
        $VALUES = dspSheetTypeArr$values;
        $ENTRIES = new C2254308sP(dspSheetTypeArr$values);
        Companion = new Object() { // from class: com.ss.android.ugc.aweme.music.model.DspSheetType.Companion
            public final DspSheetType from(Integer num) {
                for (DspSheetType dspSheetType : DspSheetType.values()) {
                    int iOrdinal = dspSheetType.ordinal();
                    if (num != null && iOrdinal == num.intValue()) {
                        return dspSheetType;
                    }
                }
                return DspSheetType.SELECT_DSP;
            }
        };
    }

    public static DspSheetType[] values() {
        return (DspSheetType[]) $VALUES.clone();
    }

    public static DspSheetType valueOf(String str) {
        return (DspSheetType) C08FF.LIZ(DspSheetType.class, str);
    }

    public DspSheetType(String str, int i) {
    }
}
