package com.bytedance.ies.cutsame.source.api;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class VideoItemInfo extends DataBaseResponse {

    @C09CT("video")
    public VideoItem videoItem;

    public final VideoItem getVideoItem() {
        return this.videoItem;
    }

    public final void setVideoItem(VideoItem videoItem) {
        this.videoItem = videoItem;
    }
}
