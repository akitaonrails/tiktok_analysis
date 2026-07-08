package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ClickHotAreaType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ ClickHotAreaType[] $VALUES;
    public static final ClickHotAreaType UNKNOWN = new ClickHotAreaType("UNKNOWN", 0);
    public static final ClickHotAreaType MACH_CONTAINER = new ClickHotAreaType("MACH_CONTAINER", 1);
    public static final ClickHotAreaType WRAP_CONTENT = new ClickHotAreaType("WRAP_CONTENT", 2);

    public static final /* synthetic */ ClickHotAreaType[] $values() {
        return new ClickHotAreaType[]{UNKNOWN, MACH_CONTAINER, WRAP_CONTENT};
    }

    public static InterfaceC2044707zh<ClickHotAreaType> getEntries() {
        return $ENTRIES;
    }

    static {
        ClickHotAreaType[] clickHotAreaTypeArr$values = $values();
        $VALUES = clickHotAreaTypeArr$values;
        $ENTRIES = new C2254308sP(clickHotAreaTypeArr$values);
    }

    public static ClickHotAreaType[] values() {
        return (ClickHotAreaType[]) $VALUES.clone();
    }

    public static ClickHotAreaType valueOf(String str) {
        return (ClickHotAreaType) C08FF.LIZ(ClickHotAreaType.class, str);
    }

    public ClickHotAreaType(String str, int i) {
    }
}
