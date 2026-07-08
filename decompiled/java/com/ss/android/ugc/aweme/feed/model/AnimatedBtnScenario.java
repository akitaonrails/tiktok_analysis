package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class AnimatedBtnScenario {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ AnimatedBtnScenario[] $VALUES;
    public final int value;
    public static final AnimatedBtnScenario UNKNOWN = new AnimatedBtnScenario("UNKNOWN", 0, 0);
    public static final AnimatedBtnScenario LIKE_GUIDE = new AnimatedBtnScenario("LIKE_GUIDE", 1, 1);

    public static final /* synthetic */ AnimatedBtnScenario[] $values() {
        return new AnimatedBtnScenario[]{UNKNOWN, LIKE_GUIDE};
    }

    public static InterfaceC2044707zh<AnimatedBtnScenario> getEntries() {
        return $ENTRIES;
    }

    static {
        AnimatedBtnScenario[] animatedBtnScenarioArr$values = $values();
        $VALUES = animatedBtnScenarioArr$values;
        $ENTRIES = new C2254308sP(animatedBtnScenarioArr$values);
    }

    public static AnimatedBtnScenario[] values() {
        return (AnimatedBtnScenario[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static AnimatedBtnScenario valueOf(String str) {
        return (AnimatedBtnScenario) C08FF.LIZ(AnimatedBtnScenario.class, str);
    }

    public AnimatedBtnScenario(String str, int i, int i2) {
        this.value = i2;
    }
}
