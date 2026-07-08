package com.ss.android.ugc.aweme.model;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class InsightTypeResponseV2 {

    @C09CT("video_like_distribution_7d")
    public final InsighRetentionRateList videoLikeDistributionHistory;

    @C09CT("video_like_distribution_realtime")
    public final InsightRealtimeEngagementList videoLikeDistributionRealtime;

    @C09CT("video_retention_rate_history_7d")
    public final InsighRetentionRateList videoRetentionRateHistory;

    @C09CT("video_retention_rate_realtime")
    public final InsightRealtimeEngagementList videoRetentionRateRealtime;

    public InsightTypeResponseV2() {
        this(null, null, null, null);
    }

    public InsightTypeResponseV2(InsightRealtimeEngagementList insightRealtimeEngagementList, InsightRealtimeEngagementList insightRealtimeEngagementList2, InsighRetentionRateList insighRetentionRateList, InsighRetentionRateList insighRetentionRateList2) {
        this.videoRetentionRateRealtime = insightRealtimeEngagementList;
        this.videoLikeDistributionRealtime = insightRealtimeEngagementList2;
        this.videoRetentionRateHistory = insighRetentionRateList;
        this.videoLikeDistributionHistory = insighRetentionRateList2;
    }
}
