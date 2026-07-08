package com.ss.android.ugc.aweme.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class RecommendCreateGroupConfig {

    @C09CT("fetch_recommend_group_time_interval_in_ms")
    public final long fetchRecommendInMs;

    @C09CT("fetch_related_friends_time_interval_in_ms")
    public final long relatedFriendsTimeInMs;

    public RecommendCreateGroupConfig() {
        this(259200000L, 86400000L);
    }

    public RecommendCreateGroupConfig(long j, long j2) {
        this.fetchRecommendInMs = j;
        this.relatedFriendsTimeInMs = j2;
    }
}
