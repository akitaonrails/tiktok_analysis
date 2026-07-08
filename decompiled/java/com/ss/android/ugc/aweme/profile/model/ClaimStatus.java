package com.ss.android.ugc.aweme.profile.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ClaimStatus {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ ClaimStatus[] $VALUES;
    public static final Companion Companion;
    public final int value;
    public static final ClaimStatus UNCLAIMED = new ClaimStatus("UNCLAIMED", 0, 0);
    public static final ClaimStatus UNDER_REVIEW = new ClaimStatus("UNDER_REVIEW", 1, 1);
    public static final ClaimStatus APPROVED = new ClaimStatus("APPROVED", 2, 2);
    public static final ClaimStatus REJECTED = new ClaimStatus("REJECTED", 3, 3);

    public static final /* synthetic */ ClaimStatus[] $values() {
        return new ClaimStatus[]{UNCLAIMED, UNDER_REVIEW, APPROVED, REJECTED};
    }

    public static InterfaceC2044707zh<ClaimStatus> getEntries() {
        return $ENTRIES;
    }

    static {
        ClaimStatus[] claimStatusArr$values = $values();
        $VALUES = claimStatusArr$values;
        $ENTRIES = new C2254308sP(claimStatusArr$values);
        Companion = new Companion();
    }

    public static ClaimStatus[] values() {
        return (ClaimStatus[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static final class Companion {
        public final ClaimStatus of(Integer num) {
            for (ClaimStatus claimStatus : ClaimStatus.values()) {
                int value = claimStatus.getValue();
                if (num != null && value == num.intValue()) {
                    return claimStatus;
                }
            }
            return ClaimStatus.UNCLAIMED;
        }
    }

    public static ClaimStatus valueOf(String str) {
        return (ClaimStatus) C08FF.LIZ(ClaimStatus.class, str);
    }

    public ClaimStatus(String str, int i, int i2) {
        this.value = i2;
    }
}
