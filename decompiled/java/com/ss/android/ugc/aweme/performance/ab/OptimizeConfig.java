package com.ss.android.ugc.aweme.performance.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes12.dex */
public final class OptimizeConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("display_image_async")
    public final boolean enableImageLoaderAsync;

    @C09CT("opt_async_report_mob")
    public final boolean optAsyncReportMob;

    @C09CT("opt_video_progressbar_component")
    public final boolean optProgressBarComponent;

    public OptimizeConfig() {
        this(false, false, false, false);
    }

    public OptimizeConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enable = z;
        this.enableImageLoaderAsync = z2;
        this.optProgressBarComponent = z3;
        this.optAsyncReportMob = z4;
    }
}
