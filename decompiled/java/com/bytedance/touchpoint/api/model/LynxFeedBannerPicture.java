package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class LynxFeedBannerPicture {

    @C09CT("js_source")
    public final String jsSource;

    @C09CT("multi_show_count")
    public final Integer multiShowCount;

    @C09CT("music_url")
    public final String musicUrl;

    public LynxFeedBannerPicture(String str, Integer num, String str2) {
        this.jsSource = str;
        this.multiShowCount = num;
        this.musicUrl = str2;
    }
}
