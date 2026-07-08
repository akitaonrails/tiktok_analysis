package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class AutoPullUpTriggerType {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AutoPullUpTriggerType[] $VALUES;
    public final int value;
    public static final AutoPullUpTriggerType TEMPLATE_READY = new AutoPullUpTriggerType("TEMPLATE_READY", 0, 0);
    public static final AutoPullUpTriggerType USER_DATA_READY = new AutoPullUpTriggerType("USER_DATA_READY", 1, 1);
    public static final AutoPullUpTriggerType USER_AND_POST_DATA_READY = new AutoPullUpTriggerType("USER_AND_POST_DATA_READY", 2, 2);
    public static final AutoPullUpTriggerType PROFILE_INITIAL = new AutoPullUpTriggerType("PROFILE_INITIAL", 3, 3);

    public static final /* synthetic */ AutoPullUpTriggerType[] $values() {
        return new AutoPullUpTriggerType[]{TEMPLATE_READY, USER_DATA_READY, USER_AND_POST_DATA_READY, PROFILE_INITIAL};
    }

    public static InterfaceC2044707zh<AutoPullUpTriggerType> getEntries() {
        return $ENTRIES;
    }

    static {
        AutoPullUpTriggerType[] autoPullUpTriggerTypeArr$values = $values();
        $VALUES = autoPullUpTriggerTypeArr$values;
        $ENTRIES = new C2254308sP(autoPullUpTriggerTypeArr$values);
    }

    public static AutoPullUpTriggerType[] values() {
        return (AutoPullUpTriggerType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static AutoPullUpTriggerType valueOf(String str) {
        return (AutoPullUpTriggerType) C08FF.LIZ(AutoPullUpTriggerType.class, str);
    }

    public AutoPullUpTriggerType(String str, int i, int i2) {
        this.value = i2;
    }
}
