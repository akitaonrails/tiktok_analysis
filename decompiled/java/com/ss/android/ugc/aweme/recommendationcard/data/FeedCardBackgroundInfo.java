package com.ss.android.ugc.aweme.recommendationcard.data;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class FeedCardBackgroundInfo {

    @C09CT("bg_music_url")
    public final String bgMusicUrl;

    @C09CT("bg_picture_url")
    public final String bgPictureUrl;

    @C09CT("bg_video")
    public final FeedCardBackgroundVideoInfo feedCardBackgroundVideoInfo;

    @C09CT("need_show")
    public final Boolean needShow;

    @C09CT("title_text")
    public final String titleText;

    @C09CT("type")
    public final String type;

    public FeedCardBackgroundInfo(Boolean bool, String str, FeedCardBackgroundVideoInfo feedCardBackgroundVideoInfo, String str2, String str3, String str4) {
        this.needShow = bool;
        this.type = str;
        this.feedCardBackgroundVideoInfo = feedCardBackgroundVideoInfo;
        this.bgPictureUrl = str2;
        this.bgMusicUrl = str3;
        this.titleText = str4;
    }
}
