package com.ss.android.ugc.aweme.music.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class DspLinkType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ DspLinkType[] $VALUES;
    public final String eventName;
    public final int value;
    public static final DspLinkType OTHER = new DspLinkType("OTHER", 0, 0, "");
    public static final DspLinkType UNLINK = new DspLinkType("UNLINK", 1, 1, "unlink");
    public static final DspLinkType LINK = new DspLinkType("LINK", 2, 2, "link");
    public static final DspLinkType ALWAYS_SHOW_IN_FYP_SWITCH_ON = new DspLinkType("ALWAYS_SHOW_IN_FYP_SWITCH_ON", 3, 3, "always_show_in_fyp_on");
    public static final DspLinkType ALWAYS_SHOW_IN_FYP_SWITCH_OFF = new DspLinkType("ALWAYS_SHOW_IN_FYP_SWITCH_OFF", 4, 4, "always_show_in_fyp_off");

    public static final /* synthetic */ DspLinkType[] $values() {
        return new DspLinkType[]{OTHER, UNLINK, LINK, ALWAYS_SHOW_IN_FYP_SWITCH_ON, ALWAYS_SHOW_IN_FYP_SWITCH_OFF};
    }

    public static InterfaceC2044707zh<DspLinkType> getEntries() {
        return $ENTRIES;
    }

    static {
        DspLinkType[] dspLinkTypeArr$values = $values();
        $VALUES = dspLinkTypeArr$values;
        $ENTRIES = new C2254308sP(dspLinkTypeArr$values);
    }

    public static DspLinkType[] values() {
        return (DspLinkType[]) $VALUES.clone();
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final int getValue() {
        return this.value;
    }

    public static DspLinkType valueOf(String str) {
        return (DspLinkType) C08FF.LIZ(DspLinkType.class, str);
    }

    public DspLinkType(String str, int i, int i2, String str2) {
        this.value = i2;
        this.eventName = str2;
    }
}
