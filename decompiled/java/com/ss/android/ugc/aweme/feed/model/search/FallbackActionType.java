package com.ss.android.ugc.aweme.feed.model.search;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class FallbackActionType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ FallbackActionType[] $VALUES;
    public final int value;
    public static final FallbackActionType DEFAULT = new FallbackActionType(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
    public static final FallbackActionType CIRCLE_TO_SEARCH = new FallbackActionType("CIRCLE_TO_SEARCH", 1, 1);

    public static final /* synthetic */ FallbackActionType[] $values() {
        return new FallbackActionType[]{DEFAULT, CIRCLE_TO_SEARCH};
    }

    public static InterfaceC2044707zh<FallbackActionType> getEntries() {
        return $ENTRIES;
    }

    static {
        FallbackActionType[] fallbackActionTypeArr$values = $values();
        $VALUES = fallbackActionTypeArr$values;
        $ENTRIES = new C2254308sP(fallbackActionTypeArr$values);
    }

    public static FallbackActionType[] values() {
        return (FallbackActionType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static FallbackActionType valueOf(String str) {
        return (FallbackActionType) C08FF.LIZ(FallbackActionType.class, str);
    }

    public FallbackActionType(String str, int i, int i2) {
        this.value = i2;
    }
}
