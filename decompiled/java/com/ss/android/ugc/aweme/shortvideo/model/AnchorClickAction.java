package com.ss.android.ugc.aweme.shortvideo.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class AnchorClickAction {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AnchorClickAction[] $VALUES;
    public final int type;
    public static final AnchorClickAction NONE = new AnchorClickAction("NONE", 0, -1);
    public static final AnchorClickAction CUSTOM = new AnchorClickAction("CUSTOM", 1, 0);
    public static final AnchorClickAction DIRECTADD = new AnchorClickAction("DIRECTADD", 2, 1);
    public static final AnchorClickAction COMMONHYBRID = new AnchorClickAction("COMMONHYBRID", 3, 2);

    public static final /* synthetic */ AnchorClickAction[] $values() {
        return new AnchorClickAction[]{NONE, CUSTOM, DIRECTADD, COMMONHYBRID};
    }

    public static InterfaceC2044707zh<AnchorClickAction> getEntries() {
        return $ENTRIES;
    }

    static {
        AnchorClickAction[] anchorClickActionArr$values = $values();
        $VALUES = anchorClickActionArr$values;
        $ENTRIES = new C2254308sP(anchorClickActionArr$values);
    }

    public static AnchorClickAction[] values() {
        return (AnchorClickAction[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }

    public static AnchorClickAction valueOf(String str) {
        return (AnchorClickAction) C08FF.LIZ(AnchorClickAction.class, str);
    }

    public AnchorClickAction(String str, int i, int i2) {
        this.type = i2;
    }
}
