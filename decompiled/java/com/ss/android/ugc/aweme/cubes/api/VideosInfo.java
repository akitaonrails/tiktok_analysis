package com.ss.android.ugc.aweme.cubes.api;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class VideosInfo implements Serializable {

    @C09CT("link_info")
    public final VideoItemLinks itemLinks;

    @C09CT("item_info")
    public final VideoItemInfo videoItem;

    public VideosInfo(VideoItemInfo videoItemInfo, VideoItemLinks videoItemLinks) {
        this.videoItem = videoItemInfo;
        this.itemLinks = videoItemLinks;
    }
}
