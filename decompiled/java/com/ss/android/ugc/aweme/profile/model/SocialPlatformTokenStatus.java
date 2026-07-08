package com.ss.android.ugc.aweme.profile.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class SocialPlatformTokenStatus {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ SocialPlatformTokenStatus[] $VALUES;
    public final int value;
    public static final SocialPlatformTokenStatus STATUS_UNKNOWN = new SocialPlatformTokenStatus("STATUS_UNKNOWN", 0, 0);
    public static final SocialPlatformTokenStatus STATUS_VALID = new SocialPlatformTokenStatus("STATUS_VALID", 1, 1);
    public static final SocialPlatformTokenStatus STATUS_INVALID = new SocialPlatformTokenStatus("STATUS_INVALID", 2, 2);

    public static final /* synthetic */ SocialPlatformTokenStatus[] $values() {
        return new SocialPlatformTokenStatus[]{STATUS_UNKNOWN, STATUS_VALID, STATUS_INVALID};
    }

    public static InterfaceC2044707zh<SocialPlatformTokenStatus> getEntries() {
        return $ENTRIES;
    }

    static {
        SocialPlatformTokenStatus[] socialPlatformTokenStatusArr$values = $values();
        $VALUES = socialPlatformTokenStatusArr$values;
        $ENTRIES = new C2254308sP(socialPlatformTokenStatusArr$values);
    }

    public static SocialPlatformTokenStatus[] values() {
        return (SocialPlatformTokenStatus[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static SocialPlatformTokenStatus valueOf(String str) {
        return (SocialPlatformTokenStatus) C08FF.LIZ(SocialPlatformTokenStatus.class, str);
    }

    public SocialPlatformTokenStatus(String str, int i, int i2) {
        this.value = i2;
    }
}
