package com.bytedance.sdk.xbridge.registry.core.annotation;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class DefaultType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ DefaultType[] $VALUES;
    public static final DefaultType STRING = new DefaultType("STRING", 0);
    public static final DefaultType DOUBLE = new DefaultType("DOUBLE", 1);
    public static final DefaultType INT = new DefaultType("INT", 2);
    public static final DefaultType LONG = new DefaultType("LONG", 3);
    public static final DefaultType BOOL = new DefaultType("BOOL", 4);
    public static final DefaultType NONE = new DefaultType("NONE", 5);

    public static final /* synthetic */ DefaultType[] $values() {
        return new DefaultType[]{STRING, DOUBLE, INT, LONG, BOOL, NONE};
    }

    public static InterfaceC2044707zh<DefaultType> getEntries() {
        return $ENTRIES;
    }

    static {
        DefaultType[] defaultTypeArr$values = $values();
        $VALUES = defaultTypeArr$values;
        $ENTRIES = new C2254308sP(defaultTypeArr$values);
    }

    public static DefaultType[] values() {
        return (DefaultType[]) $VALUES.clone();
    }

    public static DefaultType valueOf(String str) {
        return (DefaultType) C08FF.LIZ(DefaultType.class, str);
    }

    public DefaultType(String str, int i) {
    }
}
