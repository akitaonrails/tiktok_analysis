package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class InsightsEligibilityStatus {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ InsightsEligibilityStatus[] $VALUES;
    public final String eventParam;
    public final boolean isIneligible;
    public final boolean isTest;
    public static final InsightsEligibilityStatus CONTROL = new InsightsEligibilityStatus("CONTROL", 0, null, false, false);
    public static final InsightsEligibilityStatus AVAILABLE = new InsightsEligibilityStatus("AVAILABLE", 1, "clickable", false, true);
    public static final InsightsEligibilityStatus NOT_AVAILABLE_NEW = new InsightsEligibilityStatus("NOT_AVAILABLE_NEW", 2, "not_available_new", true, true);
    public static final InsightsEligibilityStatus NOT_AVAILABLE_TTL = new InsightsEligibilityStatus("NOT_AVAILABLE_TTL", 3, "not_available_ttl", true, true);

    public static final /* synthetic */ InsightsEligibilityStatus[] $values() {
        return new InsightsEligibilityStatus[]{CONTROL, AVAILABLE, NOT_AVAILABLE_NEW, NOT_AVAILABLE_TTL};
    }

    public static InterfaceC2044707zh<InsightsEligibilityStatus> getEntries() {
        return $ENTRIES;
    }

    static {
        InsightsEligibilityStatus[] insightsEligibilityStatusArr$values = $values();
        $VALUES = insightsEligibilityStatusArr$values;
        $ENTRIES = new C2254308sP(insightsEligibilityStatusArr$values);
    }

    public static InsightsEligibilityStatus[] values() {
        return (InsightsEligibilityStatus[]) $VALUES.clone();
    }

    public final String getEventParam() {
        return this.eventParam;
    }

    public final boolean isIneligible() {
        return this.isIneligible;
    }

    public final boolean isTest() {
        return this.isTest;
    }

    public static InsightsEligibilityStatus valueOf(String str) {
        return (InsightsEligibilityStatus) C08FF.LIZ(InsightsEligibilityStatus.class, str);
    }

    public InsightsEligibilityStatus(String str, int i, String str2, boolean z, boolean z2) {
        this.eventParam = str2;
        this.isIneligible = z;
        this.isTest = z2;
    }
}
