package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class RecentActivityStickerConfig {

    @C09CT("post")
    public final RecentActivitySticker post;

    @C09CT("repost")
    public final RecentActivitySticker repost;

    public RecentActivityStickerConfig() {
        this(null, null);
    }

    public RecentActivityStickerConfig(RecentActivitySticker recentActivitySticker, RecentActivitySticker recentActivitySticker2) {
        this.post = recentActivitySticker;
        this.repost = recentActivitySticker2;
    }
}
