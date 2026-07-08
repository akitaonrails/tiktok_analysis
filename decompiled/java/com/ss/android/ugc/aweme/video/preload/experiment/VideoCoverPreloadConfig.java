package com.ss.android.ugc.aweme.video.preload.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class VideoCoverPreloadConfig {

    @C09CT("enable_preload")
    public final boolean enablePreload;

    @C09CT("preload_cover_cnt")
    public final int preloadCoverCnt;

    @C09CT("preload_when_download_complete")
    public final boolean preloadWhenDownloadComplete;

    @C09CT("preload_when_preload_next_video_done")
    public final boolean preloadWhenPreloadNextVideoDown;

    public VideoCoverPreloadConfig() {
        this(false, false, false, 0);
    }

    public VideoCoverPreloadConfig(boolean z, boolean z2, boolean z3, int i) {
        this.enablePreload = z;
        this.preloadWhenDownloadComplete = z2;
        this.preloadWhenPreloadNextVideoDown = z3;
        this.preloadCoverCnt = i;
    }
}
