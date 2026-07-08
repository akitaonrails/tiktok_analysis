package com.ss.android.ugc.aweme.explore.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreVideoPreloadConfig {

    @C09CT("delay_time_second")
    public final double delayTimeSecond;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_slide_preload")
    public final boolean enableSlidePreload;

    @C09CT("preload_video_count")
    public final int preloadVideoCount;

    @C09CT("preload_video_size_kbs")
    public final int preloadVideoSizeKBs;

    @C09CT("wait_image_preload_max_second")
    public final double waitImagePreloadMaxSecond;

    public ExploreVideoPreloadConfig() {
        this(false, false, 1.0d, 2, 50, 3.0d);
    }

    public ExploreVideoPreloadConfig(boolean z, boolean z2, double d, int i, int i2, double d2) {
        this.enable = z;
        this.enableSlidePreload = z2;
        this.delayTimeSecond = d;
        this.preloadVideoCount = i;
        this.preloadVideoSizeKBs = i2;
        this.waitImagePreloadMaxSecond = d2;
    }
}
