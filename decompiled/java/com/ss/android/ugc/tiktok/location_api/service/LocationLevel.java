package com.ss.android.ugc.tiktok.location_api.service;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class LocationLevel {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ LocationLevel[] $VALUES;
    public final int level;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final LocationLevel LEVEL_L0 = new LocationLevel("LEVEL_L0", 0, 0);

    @C09CT("1")
    public static final LocationLevel LEVEL_L1 = new LocationLevel("LEVEL_L1", 1, 1);

    @C09CT("2")
    public static final LocationLevel LEVEL_L2 = new LocationLevel("LEVEL_L2", 2, 2);

    @C09CT("3")
    public static final LocationLevel LEVEL_L3 = new LocationLevel("LEVEL_L3", 3, 3);

    @C09CT("4")
    public static final LocationLevel LEVEL_L4 = new LocationLevel("LEVEL_L4", 4, 4);

    @C09CT("100")
    public static final LocationLevel LEVEL_L100 = new LocationLevel("LEVEL_L100", 5, 100);

    @C09CT("101")
    public static final LocationLevel LEVEL_L101 = new LocationLevel("LEVEL_L101", 6, 101);

    @C09CT("200")
    public static final LocationLevel LEVEL_L200 = new LocationLevel("LEVEL_L200", 7, 200);

    public static final /* synthetic */ LocationLevel[] $values() {
        return new LocationLevel[]{LEVEL_L0, LEVEL_L1, LEVEL_L2, LEVEL_L3, LEVEL_L4, LEVEL_L100, LEVEL_L101, LEVEL_L200};
    }

    public static InterfaceC2044707zh<LocationLevel> getEntries() {
        return $ENTRIES;
    }

    static {
        LocationLevel[] locationLevelArr$values = $values();
        $VALUES = locationLevelArr$values;
        $ENTRIES = new C2254308sP(locationLevelArr$values);
    }

    public static LocationLevel[] values() {
        return (LocationLevel[]) $VALUES.clone();
    }

    public final int getLevel() {
        return this.level;
    }

    public static LocationLevel valueOf(String str) {
        return (LocationLevel) C08FF.LIZ(LocationLevel.class, str);
    }

    public LocationLevel(String str, int i, int i2) {
        this.level = i2;
    }
}
