package com.ss.android.ugc.aweme.music.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class MDPTemplatePinType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ MDPTemplatePinType[] $VALUES;
    public static final MDPTemplatePinType NORMAL_PINNED = new MDPTemplatePinType("NORMAL_PINNED", 0, 0);
    public static final MDPTemplatePinType OPS_MANUAL_PINNED = new MDPTemplatePinType("OPS_MANUAL_PINNED", 1, 1);
    public final int value;

    public static final /* synthetic */ MDPTemplatePinType[] $values() {
        return new MDPTemplatePinType[]{NORMAL_PINNED, OPS_MANUAL_PINNED};
    }

    public static InterfaceC2044707zh<MDPTemplatePinType> getEntries() {
        return $ENTRIES;
    }

    static {
        MDPTemplatePinType[] mDPTemplatePinTypeArr$values = $values();
        $VALUES = mDPTemplatePinTypeArr$values;
        $ENTRIES = new C2254308sP(mDPTemplatePinTypeArr$values);
    }

    public static MDPTemplatePinType[] values() {
        return (MDPTemplatePinType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static MDPTemplatePinType valueOf(String str) {
        return (MDPTemplatePinType) C08FF.LIZ(MDPTemplatePinType.class, str);
    }

    public MDPTemplatePinType(String str, int i, int i2) {
        this.value = i2;
    }
}
