package com.ss.android.ugc.aweme.recommendationcard.data;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class FeedCardBackgroundVideoInfo {

    @C09CT("default_pic_url")
    public final String defaultPicUrl;

    @C09CT("height")
    public final Integer height;

    @C09CT("poster")
    public final String poster;

    @C09CT("src")
    public final String src;

    @C09CT("video_id")
    public final String videoId;

    @C09CT("width")
    public final Integer width;

    public FeedCardBackgroundVideoInfo(String str, Integer num, Integer num2, String str2, String str3, String str4) {
        this.src = str;
        this.height = num;
        this.width = num2;
        this.videoId = str2;
        this.poster = str3;
        this.defaultPicUrl = str4;
    }
}
