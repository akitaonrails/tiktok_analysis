package com.ss.android.ugc.aweme.im.service.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class QuickReplyRepostTabConfig {

    @C09CT("daily_display_count_limit")
    public final int dailyDisplayCountLimit;

    @C09CT("enable_like")
    public final int enableLike;

    @C09CT("enable_replay")
    public final int enableReplay;

    @C09CT("global_dismiss_days")
    public final int globalDismissDays;

    @C09CT("global_display_count_limit")
    public final int globalDisplayCountLimit;

    @C09CT("repost_top_k_affinity_ranking")
    public final int topKAffinityRanking;

    public QuickReplyRepostTabConfig() {
        this(0, 0, 0, 0, 0, 0);
    }

    public QuickReplyRepostTabConfig(int i, int i2, int i3, int i4, int i5, int i6) {
        this.enableLike = i;
        this.enableReplay = i2;
        this.globalDisplayCountLimit = i3;
        this.globalDismissDays = i4;
        this.dailyDisplayCountLimit = i5;
        this.topKAffinityRanking = i6;
    }
}
