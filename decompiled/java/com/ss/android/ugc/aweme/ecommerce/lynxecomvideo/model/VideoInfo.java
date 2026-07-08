package com.ss.android.ugc.aweme.ecommerce.lynxecomvideo.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Video;

/* JADX INFO: loaded from: classes24.dex */
public final class VideoInfo {

    @C09CT("video_info")
    public final Video video;

    @C09CT("item_id")
    public final String videoId;

    public VideoInfo() {
        this(null, null);
    }

    public VideoInfo(String str, Video video) {
        this.videoId = str;
        this.video = video;
    }
}
