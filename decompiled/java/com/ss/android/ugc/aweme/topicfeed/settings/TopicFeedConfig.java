package com.ss.android.ugc.aweme.topicfeed.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class TopicFeedConfig {

    @C09CT("bkgd_video")
    public final UrlStruct bkgdVideo;

    @C09CT("bkgd_video_cover")
    public final UrlStruct bkgdVideoCover;

    public TopicFeedConfig() {
        this(null, null);
    }

    public TopicFeedConfig(UrlStruct urlStruct, UrlStruct urlStruct2) {
        this.bkgdVideo = urlStruct;
        this.bkgdVideoCover = urlStruct2;
    }
}
