package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class RenderType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ RenderType[] $VALUES;
    public static final RenderType LYNX_VIEW = new RenderType("LYNX_VIEW", 0, 1);
    public static final RenderType REACT_LYNX_DYNAMIC_COMPONENT = new RenderType("REACT_LYNX_DYNAMIC_COMPONENT", 1, 2);
    public final int value;

    public static final /* synthetic */ RenderType[] $values() {
        return new RenderType[]{LYNX_VIEW, REACT_LYNX_DYNAMIC_COMPONENT};
    }

    public static InterfaceC2044707zh<RenderType> getEntries() {
        return $ENTRIES;
    }

    static {
        RenderType[] renderTypeArr$values = $values();
        $VALUES = renderTypeArr$values;
        $ENTRIES = new C2254308sP(renderTypeArr$values);
    }

    public static RenderType[] values() {
        return (RenderType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static RenderType valueOf(String str) {
        return (RenderType) C08FF.LIZ(RenderType.class, str);
    }

    public RenderType(String str, int i, int i2) {
        this.value = i2;
    }
}
