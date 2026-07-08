package com.ss.android.ugc.aweme.im.streak.impl.utils;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakUnlockAnimInfo {

    @C09CT("fake_milestone_streak_level")
    public final Integer animLevel;

    @C09CT("is_unlock_anim_available")
    public final Boolean isAnimConsumed;

    public StreakUnlockAnimInfo() {
        this(null, null);
    }

    public StreakUnlockAnimInfo(Boolean bool, Integer num) {
        this.isAnimConsumed = bool;
        this.animLevel = num;
    }
}
