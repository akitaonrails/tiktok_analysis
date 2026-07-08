package com.ss.android.ugc.aweme.tools.mvtemplate.net;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class VideoItemInfo extends DataBaseResponse {
    public static final int $stable = 8;

    @C09CT("video")
    public VideoItem videoItem;

    public final VideoItem getVideoItem() {
        return this.videoItem;
    }

    public final void setVideoItem(VideoItem videoItem) {
        this.videoItem = videoItem;
    }
}
