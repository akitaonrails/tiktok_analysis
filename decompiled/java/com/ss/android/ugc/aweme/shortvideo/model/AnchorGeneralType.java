package com.ss.android.ugc.aweme.shortvideo.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class AnchorGeneralType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AnchorGeneralType[] $VALUES;
    public static final AnchorGeneralType DEFAULT = new AnchorGeneralType(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
    public static final AnchorGeneralType E2E_GENERAL_TYPE = new AnchorGeneralType("E2E_GENERAL_TYPE", 1, 2);
    public final int type;

    public static final /* synthetic */ AnchorGeneralType[] $values() {
        return new AnchorGeneralType[]{DEFAULT, E2E_GENERAL_TYPE};
    }

    public static InterfaceC2044707zh<AnchorGeneralType> getEntries() {
        return $ENTRIES;
    }

    static {
        AnchorGeneralType[] anchorGeneralTypeArr$values = $values();
        $VALUES = anchorGeneralTypeArr$values;
        $ENTRIES = new C2254308sP(anchorGeneralTypeArr$values);
    }

    public static AnchorGeneralType[] values() {
        return (AnchorGeneralType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }

    public static AnchorGeneralType valueOf(String str) {
        return (AnchorGeneralType) C08FF.LIZ(AnchorGeneralType.class, str);
    }

    public AnchorGeneralType(String str, int i, int i2) {
        this.type = i2;
    }
}
