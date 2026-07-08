package com.ss.android.ugc.aweme.profile.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class AccessTokenApp {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AccessTokenApp[] $VALUES;
    public final int value;
    public static final AccessTokenApp ACCESS_TOKEN_APP_UNKNOWN = new AccessTokenApp("ACCESS_TOKEN_APP_UNKNOWN", 0, 0);
    public static final AccessTokenApp ACCESS_TOKEN_APP_TIKTOK_LITE = new AccessTokenApp("ACCESS_TOKEN_APP_TIKTOK_LITE", 1, 1);
    public static final AccessTokenApp ACCESS_TOKEN_APP_TIKTOK_M = new AccessTokenApp("ACCESS_TOKEN_APP_TIKTOK_M", 2, 2);
    public static final AccessTokenApp ACCESS_TOKEN_APP_TIKTOK_T = new AccessTokenApp("ACCESS_TOKEN_APP_TIKTOK_T", 3, 3);

    public static final /* synthetic */ AccessTokenApp[] $values() {
        return new AccessTokenApp[]{ACCESS_TOKEN_APP_UNKNOWN, ACCESS_TOKEN_APP_TIKTOK_LITE, ACCESS_TOKEN_APP_TIKTOK_M, ACCESS_TOKEN_APP_TIKTOK_T};
    }

    public static InterfaceC2044707zh<AccessTokenApp> getEntries() {
        return $ENTRIES;
    }

    static {
        AccessTokenApp[] accessTokenAppArr$values = $values();
        $VALUES = accessTokenAppArr$values;
        $ENTRIES = new C2254308sP(accessTokenAppArr$values);
    }

    public static AccessTokenApp[] values() {
        return (AccessTokenApp[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static AccessTokenApp valueOf(String str) {
        return (AccessTokenApp) C08FF.LIZ(AccessTokenApp.class, str);
    }

    public AccessTokenApp(String str, int i, int i2) {
        this.value = i2;
    }
}
