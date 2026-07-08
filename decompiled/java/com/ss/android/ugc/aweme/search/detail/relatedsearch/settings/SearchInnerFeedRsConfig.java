package com.ss.android.ugc.aweme.search.detail.relatedsearch.settings;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchInnerFeedRsConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("new_rs")
    public final NewRs newRs;

    @C09CT("bgd_video_cover")
    public final BackgroundVideoCover videoCover;

    public SearchInnerFeedRsConfig() {
        this(null, null);
    }

    public SearchInnerFeedRsConfig(BackgroundVideoCover backgroundVideoCover, NewRs newRs) {
        this.videoCover = backgroundVideoCover;
        this.newRs = newRs;
    }
}
