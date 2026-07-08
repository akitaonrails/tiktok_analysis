package com.ss.android.ugc.aweme.feed.model.live;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class PreviewCardType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ PreviewCardType[] $VALUES;
    public final int value;
    public static final PreviewCardType UNKNOWN = new PreviewCardType("UNKNOWN", 0, 0);
    public static final PreviewCardType TASK_CARD = new PreviewCardType("TASK_CARD", 1, 1);

    public static final /* synthetic */ PreviewCardType[] $values() {
        return new PreviewCardType[]{UNKNOWN, TASK_CARD};
    }

    public static InterfaceC2044707zh<PreviewCardType> getEntries() {
        return $ENTRIES;
    }

    static {
        PreviewCardType[] previewCardTypeArr$values = $values();
        $VALUES = previewCardTypeArr$values;
        $ENTRIES = new C2254308sP(previewCardTypeArr$values);
    }

    public static PreviewCardType[] values() {
        return (PreviewCardType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static PreviewCardType valueOf(String str) {
        return (PreviewCardType) C08FF.LIZ(PreviewCardType.class, str);
    }

    public PreviewCardType(String str, int i, int i2) {
        this.value = i2;
    }
}
