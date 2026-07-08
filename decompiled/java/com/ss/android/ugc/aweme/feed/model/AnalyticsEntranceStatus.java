package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class AnalyticsEntranceStatus {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AnalyticsEntranceStatus[] $VALUES;
    public final int value;
    public static final AnalyticsEntranceStatus DEFAULT_FALLBACK = new AnalyticsEntranceStatus("DEFAULT_FALLBACK", 0, 0);
    public static final AnalyticsEntranceStatus SHOW_ENTRANCE_WITH_PRIVACY_SETTINGS = new AnalyticsEntranceStatus("SHOW_ENTRANCE_WITH_PRIVACY_SETTINGS", 1, 1);
    public static final AnalyticsEntranceStatus DISABLED_ENTRANCE_WITH_PRIVACY_SETTINGS = new AnalyticsEntranceStatus("DISABLED_ENTRANCE_WITH_PRIVACY_SETTINGS", 2, 2);
    public static final AnalyticsEntranceStatus SHOW_ENTRANCE_WITHOUT_PRIVACY_SETTINGS = new AnalyticsEntranceStatus("SHOW_ENTRANCE_WITHOUT_PRIVACY_SETTINGS", 3, 3);
    public static final AnalyticsEntranceStatus DISABLED_ENTRANCE_WITHOUT_PRIVACY_SETTINGS = new AnalyticsEntranceStatus("DISABLED_ENTRANCE_WITHOUT_PRIVACY_SETTINGS", 4, 4);

    public static final /* synthetic */ AnalyticsEntranceStatus[] $values() {
        return new AnalyticsEntranceStatus[]{DEFAULT_FALLBACK, SHOW_ENTRANCE_WITH_PRIVACY_SETTINGS, DISABLED_ENTRANCE_WITH_PRIVACY_SETTINGS, SHOW_ENTRANCE_WITHOUT_PRIVACY_SETTINGS, DISABLED_ENTRANCE_WITHOUT_PRIVACY_SETTINGS};
    }

    public static InterfaceC2044707zh<AnalyticsEntranceStatus> getEntries() {
        return $ENTRIES;
    }

    static {
        AnalyticsEntranceStatus[] analyticsEntranceStatusArr$values = $values();
        $VALUES = analyticsEntranceStatusArr$values;
        $ENTRIES = new C2254308sP(analyticsEntranceStatusArr$values);
    }

    public static AnalyticsEntranceStatus[] values() {
        return (AnalyticsEntranceStatus[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static AnalyticsEntranceStatus valueOf(String str) {
        return (AnalyticsEntranceStatus) C08FF.LIZ(AnalyticsEntranceStatus.class, str);
    }

    public AnalyticsEntranceStatus(String str, int i, int i2) {
        this.value = i2;
    }
}
