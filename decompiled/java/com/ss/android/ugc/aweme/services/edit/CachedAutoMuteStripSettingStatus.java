package com.ss.android.ugc.aweme.services.edit;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class CachedAutoMuteStripSettingStatus {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ CachedAutoMuteStripSettingStatus[] $VALUES;
    public final int value;
    public static final CachedAutoMuteStripSettingStatus NOT_QUERIED = new CachedAutoMuteStripSettingStatus("NOT_QUERIED", 0, -1);
    public static final CachedAutoMuteStripSettingStatus DISABLED = new CachedAutoMuteStripSettingStatus("DISABLED", 1, 0);
    public static final CachedAutoMuteStripSettingStatus OFF = new CachedAutoMuteStripSettingStatus("OFF", 2, 1);
    public static final CachedAutoMuteStripSettingStatus ON = new CachedAutoMuteStripSettingStatus("ON", 3, 2);

    public static final /* synthetic */ CachedAutoMuteStripSettingStatus[] $values() {
        return new CachedAutoMuteStripSettingStatus[]{NOT_QUERIED, DISABLED, OFF, ON};
    }

    public static InterfaceC2044707zh<CachedAutoMuteStripSettingStatus> getEntries() {
        return $ENTRIES;
    }

    static {
        CachedAutoMuteStripSettingStatus[] cachedAutoMuteStripSettingStatusArr$values = $values();
        $VALUES = cachedAutoMuteStripSettingStatusArr$values;
        $ENTRIES = new C2254308sP(cachedAutoMuteStripSettingStatusArr$values);
    }

    public static CachedAutoMuteStripSettingStatus[] values() {
        return (CachedAutoMuteStripSettingStatus[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static CachedAutoMuteStripSettingStatus valueOf(String str) {
        return (CachedAutoMuteStripSettingStatus) C08FF.LIZ(CachedAutoMuteStripSettingStatus.class, str);
    }

    public CachedAutoMuteStripSettingStatus(String str, int i, int i2) {
        this.value = i2;
    }
}
