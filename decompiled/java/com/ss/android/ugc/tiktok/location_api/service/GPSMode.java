package com.ss.android.ugc.tiktok.location_api.service;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class GPSMode {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ GPSMode[] $VALUES;
    public final int mode;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final GPSMode UNKNOWN = new GPSMode("UNKNOWN", 0, 0);

    @C09CT("1")
    public static final GPSMode COARSE = new GPSMode("COARSE", 1, 1);

    @C09CT("2")
    public static final GPSMode PRECISE = new GPSMode("PRECISE", 2, 2);

    public static final /* synthetic */ GPSMode[] $values() {
        return new GPSMode[]{UNKNOWN, COARSE, PRECISE};
    }

    public static InterfaceC2044707zh<GPSMode> getEntries() {
        return $ENTRIES;
    }

    static {
        GPSMode[] gPSModeArr$values = $values();
        $VALUES = gPSModeArr$values;
        $ENTRIES = new C2254308sP(gPSModeArr$values);
    }

    public static GPSMode[] values() {
        return (GPSMode[]) $VALUES.clone();
    }

    public final int getMode() {
        return this.mode;
    }

    public static GPSMode valueOf(String str) {
        return (GPSMode) C08FF.LIZ(GPSMode.class, str);
    }

    public GPSMode(String str, int i, int i2) {
        this.mode = i2;
    }
}
