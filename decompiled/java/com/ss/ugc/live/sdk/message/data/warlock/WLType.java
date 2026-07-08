package com.ss.ugc.live.sdk.message.data.warlock;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class WLType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ WLType[] $VALUES;
    public final String value;
    public static final WLType COMMON = new WLType("COMMON", 0, "Common");
    public static final WLType JSB = new WLType("JSB", 1, "JSB");
    public static final WLType MESSAGE = new WLType("MESSAGE", 2, "LiveMessage");
    public static final WLType NETWORK = new WLType("NETWORK", 3, "Network");
    public static final WLType SCHEMA = new WLType("SCHEMA", 4, "Schema");
    public static final WLType EVENT = new WLType("EVENT", 5, "event");
    public static final WLType APPLOG = new WLType("APPLOG", 6, "applog");
    public static final WLType MONITOR = new WLType("MONITOR", 7, "monitor");

    public static final /* synthetic */ WLType[] $values() {
        return new WLType[]{COMMON, JSB, MESSAGE, NETWORK, SCHEMA, EVENT, APPLOG, MONITOR};
    }

    public static InterfaceC2044707zh<WLType> getEntries() {
        return $ENTRIES;
    }

    static {
        WLType[] wLTypeArr$values = $values();
        $VALUES = wLTypeArr$values;
        $ENTRIES = new C2254308sP(wLTypeArr$values);
    }

    public static WLType[] values() {
        return (WLType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public static WLType valueOf(String str) {
        return (WLType) C08FF.LIZ(WLType.class, str);
    }

    public WLType(String str, int i, String str2) {
        this.value = str2;
    }
}
