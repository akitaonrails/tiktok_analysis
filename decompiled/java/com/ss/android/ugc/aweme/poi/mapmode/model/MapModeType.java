package com.ss.android.ugc.aweme.poi.mapmode.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class MapModeType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ MapModeType[] $VALUES;
    public final String type;
    public static final MapModeType LOCAL = new MapModeType("LOCAL", 0, "local");
    public static final MapModeType REMOTE = new MapModeType("REMOTE", 1, "remote");
    public static final MapModeType OTHERS = new MapModeType("OTHERS", 2, "others");

    public static final /* synthetic */ MapModeType[] $values() {
        return new MapModeType[]{LOCAL, REMOTE, OTHERS};
    }

    public static InterfaceC2044707zh<MapModeType> getEntries() {
        return $ENTRIES;
    }

    static {
        MapModeType[] mapModeTypeArr$values = $values();
        $VALUES = mapModeTypeArr$values;
        $ENTRIES = new C2254308sP(mapModeTypeArr$values);
    }

    public static MapModeType[] values() {
        return (MapModeType[]) $VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }

    public static MapModeType valueOf(String str) {
        return (MapModeType) C08FF.LIZ(MapModeType.class, str);
    }

    public MapModeType(String str, int i, String str2) {
        this.type = str2;
    }
}
