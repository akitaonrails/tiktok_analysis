package com.bytedance.android.livesdk.feed.preloadfeed;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class FeedLiveTopLivePrefetchModel {

    @C09CT("duplicates_feed_data")
    public final boolean duplicatesFeedData;

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("enabled_android_opt")
    public final boolean enabledAndroidOpt;

    @C09CT("not_request_sky_data")
    public final boolean notRequestSkyData;

    @C09CT("only_for_skylight")
    public final boolean onlyForSkylight;

    @C09CT("phases")
    public final List<FeedLiveTopLivePrefetchStrategy> phasesStrategy;

    @C09CT("prefetch_req")
    public final String reqFrom;

    @C09CT("start_delay")
    public final long startDelayTime;

    public FeedLiveTopLivePrefetchModel() {
        this(false, "tiktok_message_toplive_preload", false, false, false, -1L, false, new ArrayList());
    }

    public FeedLiveTopLivePrefetchModel(boolean z, String str, boolean z2, boolean z3, boolean z4, long j, boolean z5, List<FeedLiveTopLivePrefetchStrategy> list) {
        this.enabled = z;
        this.reqFrom = str;
        this.notRequestSkyData = z2;
        this.duplicatesFeedData = z3;
        this.enabledAndroidOpt = z4;
        this.startDelayTime = j;
        this.onlyForSkylight = z5;
        this.phasesStrategy = list;
    }
}
