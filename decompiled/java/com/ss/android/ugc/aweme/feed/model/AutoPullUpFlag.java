package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class AutoPullUpFlag {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AutoPullUpFlag[] $VALUES;
    public final int value;
    public static final AutoPullUpFlag IDLE = new AutoPullUpFlag("IDLE", 0, 0);
    public static final AutoPullUpFlag ENABLE_LIVE_ROOM = new AutoPullUpFlag("ENABLE_LIVE_ROOM", 1, 1);
    public static final AutoPullUpFlag ENABLE_MESSAGE = new AutoPullUpFlag("ENABLE_MESSAGE", 2, 2);
    public static final AutoPullUpFlag ENABLE_LANDING_PAGE = new AutoPullUpFlag("ENABLE_LANDING_PAGE", 3, 3);
    public static final AutoPullUpFlag ENABLE_MIDDLE_PAGE = new AutoPullUpFlag("ENABLE_MIDDLE_PAGE", 4, 4);
    public static final AutoPullUpFlag ENABLE_IN_APP_OPEN_URL = new AutoPullUpFlag("ENABLE_IN_APP_OPEN_URL", 5, 5);

    public static final /* synthetic */ AutoPullUpFlag[] $values() {
        return new AutoPullUpFlag[]{IDLE, ENABLE_LIVE_ROOM, ENABLE_MESSAGE, ENABLE_LANDING_PAGE, ENABLE_MIDDLE_PAGE, ENABLE_IN_APP_OPEN_URL};
    }

    public static InterfaceC2044707zh<AutoPullUpFlag> getEntries() {
        return $ENTRIES;
    }

    static {
        AutoPullUpFlag[] autoPullUpFlagArr$values = $values();
        $VALUES = autoPullUpFlagArr$values;
        $ENTRIES = new C2254308sP(autoPullUpFlagArr$values);
    }

    public static AutoPullUpFlag[] values() {
        return (AutoPullUpFlag[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static AutoPullUpFlag valueOf(String str) {
        return (AutoPullUpFlag) C08FF.LIZ(AutoPullUpFlag.class, str);
    }

    public AutoPullUpFlag(String str, int i, int i2) {
        this.value = i2;
    }
}
