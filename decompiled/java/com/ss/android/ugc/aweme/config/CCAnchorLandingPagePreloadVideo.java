package com.ss.android.ugc.aweme.config;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class CCAnchorLandingPagePreloadVideo {

    @C09CT("android_score")
    public final PreloadVideoConfigAndroidScore androidScore;

    @C09CT("preload_size")
    public final PreloadVideoConfigSize preloadSize;

    public CCAnchorLandingPagePreloadVideo() {
        this(null, null);
    }

    public CCAnchorLandingPagePreloadVideo(PreloadVideoConfigAndroidScore preloadVideoConfigAndroidScore, PreloadVideoConfigSize preloadVideoConfigSize) {
        this.androidScore = preloadVideoConfigAndroidScore;
        this.preloadSize = preloadVideoConfigSize;
    }
}
