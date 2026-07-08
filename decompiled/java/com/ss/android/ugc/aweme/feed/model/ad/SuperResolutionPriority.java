package com.ss.android.ugc.aweme.feed.model.ad;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SuperResolutionPriority {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ SuperResolutionPriority[] $VALUES;
    public static final SuperResolutionPriority LOW = new SuperResolutionPriority("LOW", 0, 0);
    public static final SuperResolutionPriority NORMAL = new SuperResolutionPriority("NORMAL", 1, 1);
    public static final SuperResolutionPriority MEDIUM = new SuperResolutionPriority("MEDIUM", 2, 2);
    public static final SuperResolutionPriority HIGH = new SuperResolutionPriority("HIGH", 3, 3);

    public static final /* synthetic */ SuperResolutionPriority[] $values() {
        return new SuperResolutionPriority[]{LOW, NORMAL, MEDIUM, HIGH};
    }

    public static InterfaceC2044707zh<SuperResolutionPriority> getEntries() {
        return $ENTRIES;
    }

    static {
        SuperResolutionPriority[] superResolutionPriorityArr$values = $values();
        $VALUES = superResolutionPriorityArr$values;
        $ENTRIES = new C2254308sP(superResolutionPriorityArr$values);
    }

    public static SuperResolutionPriority[] values() {
        return (SuperResolutionPriority[]) $VALUES.clone();
    }

    public static SuperResolutionPriority valueOf(String str) {
        return (SuperResolutionPriority) C08FF.LIZ(SuperResolutionPriority.class, str);
    }

    public SuperResolutionPriority(String str, int i, int i2) {
    }
}
