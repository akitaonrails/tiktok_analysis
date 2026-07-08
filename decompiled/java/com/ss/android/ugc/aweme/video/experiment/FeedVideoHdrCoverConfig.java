package com.ss.android.ugc.aweme.video.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class FeedVideoHdrCoverConfig {

    @C09CT("background_color")
    public final Integer backgroundColor;

    @C09CT("dim_factor")
    public final float dimFactor;

    @C09CT("enable")
    public final boolean enable;

    public FeedVideoHdrCoverConfig() {
        this(0, false, 0.0f);
    }

    public FeedVideoHdrCoverConfig(Integer num, boolean z, float f) {
        this.backgroundColor = num;
        this.enable = z;
        this.dimFactor = f;
    }
}
