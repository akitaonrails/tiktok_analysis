package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class WatchedVideo {

    @C09CT("duration")
    public final int duration;

    @C09CT("is_ads")
    public final boolean isAds;

    @C09CT("item_duration")
    public final int itemDuration;

    @C09CT("item_id")
    public final String itemId;

    @C09CT("page_type")
    public final String pageType;

    @C09CT("timestamp")
    public final long timeStampMs;

    @C09CT("video_type")
    public final int videoType;

    public WatchedVideo() {
        this("", 0, 0, "", 0, false, 0L);
    }

    public WatchedVideo(String str, int i, int i2, String str2, int i3, boolean z, long j) {
        this.itemId = str;
        this.duration = i;
        this.itemDuration = i2;
        this.pageType = str2;
        this.videoType = i3;
        this.isAds = z;
        this.timeStampMs = j;
    }
}
