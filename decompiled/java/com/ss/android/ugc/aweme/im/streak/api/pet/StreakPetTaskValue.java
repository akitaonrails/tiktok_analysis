package com.ss.android.ugc.aweme.im.streak.api.pet;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakPetTaskValue {

    @C09CT("completed")
    public final boolean completed;

    @C09CT("description")
    public final String description;

    @C09CT("reward_points")
    public final int rewordPoints;

    public StreakPetTaskValue() {
        this("", 0, false);
    }

    public StreakPetTaskValue(String str, int i, boolean z) {
        this.description = str;
        this.rewordPoints = i;
        this.completed = z;
    }
}
