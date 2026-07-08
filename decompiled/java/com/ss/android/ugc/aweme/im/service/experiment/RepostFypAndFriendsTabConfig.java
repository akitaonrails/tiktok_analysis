package com.ss.android.ugc.aweme.im.service.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class RepostFypAndFriendsTabConfig {

    @C09CT("daily_display_count_limit")
    public final int dailyDisplayCountLimit;

    @C09CT("enable_like")
    public final int enableLike;

    @C09CT("global_dismiss_days")
    public final int globalDismissDays;

    @C09CT("global_display_count_limit")
    public final int globalDisplayCountLimit;

    @C09CT("repost_top_k_affinity_ranking")
    public final int topKAffinityRanking;

    public RepostFypAndFriendsTabConfig() {
        this(0, 0, 0, 0, 0);
    }

    public RepostFypAndFriendsTabConfig(int i, int i2, int i3, int i4, int i5) {
        this.enableLike = i;
        this.globalDisplayCountLimit = i2;
        this.globalDismissDays = i3;
        this.dailyDisplayCountLimit = i4;
        this.topKAffinityRanking = i5;
    }
}
