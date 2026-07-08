package com.ss.android.ugc.aweme.friendstab.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class FriendsTabAvatarOrderOptConfig {

    @C09CT("affinity_score_base_item")
    public final float affinityScoreBaseItem;

    @C09CT("affinity_score_threshold")
    public final float affinityScoreThreshold;

    @C09CT("calculating_avatar_notice_unconsumed_times_period_measured_in_hours")
    public final int avatarShowTimeCountHour;

    @C09CT("enable_affinity_score_threshold")
    public final boolean enableAffinityScoreThreshold;

    @C09CT("enable_reduce_strategy")
    public final boolean enableReduceStrategy;

    @C09CT("reduce_coefficient")
    public final float reduceCoefficient;

    public FriendsTabAvatarOrderOptConfig() {
        this(false, false, 1.0f, 0.0f, 0, 0.0f);
    }

    public FriendsTabAvatarOrderOptConfig(boolean z, boolean z2, float f, float f2, int i, float f3) {
        this.enableReduceStrategy = z;
        this.enableAffinityScoreThreshold = z2;
        this.reduceCoefficient = f;
        this.affinityScoreThreshold = f2;
        this.avatarShowTimeCountHour = i;
        this.affinityScoreBaseItem = f3;
    }
}
