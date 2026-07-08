package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class FeedAdsContent {

    @C09CT("video")
    public final FeedAdsVideo videos;

    public FeedAdsContent() {
        this(null);
    }

    public FeedAdsContent(FeedAdsVideo feedAdsVideo) {
        this.videos = feedAdsVideo;
    }
}
