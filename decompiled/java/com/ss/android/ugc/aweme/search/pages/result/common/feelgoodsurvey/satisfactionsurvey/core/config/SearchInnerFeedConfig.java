package com.ss.android.ugc.aweme.search.pages.result.common.feelgoodsurvey.satisfactionsurvey.core.config;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchInnerFeedConfig implements Serializable {

    @C09CT("bgd_video")
    public SearchForceVideo forceVideo;

    @C09CT("bgd_video_cover")
    public SearchForceVideo videoCover;

    public SearchInnerFeedConfig() {
        this(null, null);
    }

    public final void setForceVideo(SearchForceVideo searchForceVideo) {
        this.forceVideo = searchForceVideo;
    }

    public final void setVideoCover(SearchForceVideo searchForceVideo) {
        this.videoCover = searchForceVideo;
    }

    public SearchInnerFeedConfig(SearchForceVideo searchForceVideo, SearchForceVideo searchForceVideo2) {
        this.forceVideo = searchForceVideo;
        this.videoCover = searchForceVideo2;
    }
}
