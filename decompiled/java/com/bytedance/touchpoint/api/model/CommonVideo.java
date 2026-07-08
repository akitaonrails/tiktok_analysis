package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class CommonVideo {

    @C09CT("is_ads")
    public final boolean isAds;

    @C09CT("item_id")
    public final String itemId;

    @C09CT("page_type")
    public final String pageType;

    @C09CT("timestamp")
    public final long timeStampMs;

    @C09CT("video_type")
    public final int videoType;

    public CommonVideo() {
        this("", "", 0, false, 0L);
    }

    public CommonVideo(String str, String str2, int i, boolean z, long j) {
        this.itemId = str;
        this.pageType = str2;
        this.videoType = i;
        this.isAds = z;
        this.timeStampMs = j;
    }
}
