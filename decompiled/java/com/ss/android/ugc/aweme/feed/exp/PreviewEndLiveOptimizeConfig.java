package com.ss.android.ugc.aweme.feed.exp;

import X.C09CT;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes34.dex */
public final class PreviewEndLiveOptimizeConfig {

    @C09CT("apply_style_optimization")
    public boolean applyStyleOptimization;

    @C09CT("auto_slide_interval")
    public long autoSlideInterval;

    @C09CT("enable")
    public boolean enable;

    public PreviewEndLiveOptimizeConfig() {
        this(false, false, Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    public PreviewEndLiveOptimizeConfig(boolean z, boolean z2, long j) {
        this.enable = z;
        this.applyStyleOptimization = z2;
        this.autoSlideInterval = j;
    }
}
