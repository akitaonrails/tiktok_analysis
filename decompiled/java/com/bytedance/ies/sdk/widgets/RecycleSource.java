package com.bytedance.ies.sdk.widgets;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class RecycleSource {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ RecycleSource[] $VALUES;
    public static final RecycleSource FROM_ROOM_CHANGE = new RecycleSource("FROM_ROOM_CHANGE", 0);
    public static final RecycleSource FROM_CONFIG_CHANGE = new RecycleSource("FROM_CONFIG_CHANGE", 1);

    public static final /* synthetic */ RecycleSource[] $values() {
        return new RecycleSource[]{FROM_ROOM_CHANGE, FROM_CONFIG_CHANGE};
    }

    public static InterfaceC2044707zh<RecycleSource> getEntries() {
        return $ENTRIES;
    }

    static {
        RecycleSource[] recycleSourceArr$values = $values();
        $VALUES = recycleSourceArr$values;
        $ENTRIES = new C2254308sP(recycleSourceArr$values);
    }

    public static RecycleSource[] values() {
        return (RecycleSource[]) $VALUES.clone();
    }

    public static RecycleSource valueOf(String str) {
        return (RecycleSource) C08FF.LIZ(RecycleSource.class, str);
    }

    public RecycleSource(String str, int i) {
    }
}
