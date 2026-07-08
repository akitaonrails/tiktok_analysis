package com.ss.android.ugc.aweme.im.streak.impl.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakPetExitStrategyConfig {

    @C09CT("active_streak_threshold")
    public final int activeStreakThreshold;

    @C09CT("egg_streak_threshold")
    public final int eggStreakThreshold;

    public StreakPetExitStrategyConfig() {
        this(5, 3);
    }

    public StreakPetExitStrategyConfig(int i, int i2) {
        this.activeStreakThreshold = i;
        this.eggStreakThreshold = i2;
    }
}
