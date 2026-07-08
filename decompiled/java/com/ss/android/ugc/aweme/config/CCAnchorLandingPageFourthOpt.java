package com.ss.android.ugc.aweme.config;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class CCAnchorLandingPageFourthOpt {

    @C09CT("android_score")
    public final Float androidScore;

    @C09CT("video_preload_on_click")
    public final Boolean enablePreloadOnClick;

    @C09CT("video_preload_on_show")
    public final Boolean enablePreloadOnShow;

    @C09CT("use_prewarm")
    public final Boolean usePreWarm;

    @C09CT("use_simplayer")
    public final Boolean useSimPlayer;

    @C09CT("video_preload_size")
    public final Long videoPreloadSize;

    public CCAnchorLandingPageFourthOpt() {
        this(Boolean.FALSE, Float.valueOf(6.6f), Boolean.FALSE, Boolean.FALSE, 0L, Boolean.FALSE);
    }

    public CCAnchorLandingPageFourthOpt(Boolean bool, Float f, Boolean bool2, Boolean bool3, Long l, Boolean bool4) {
        this.usePreWarm = bool;
        this.androidScore = f;
        this.enablePreloadOnClick = bool2;
        this.enablePreloadOnShow = bool3;
        this.videoPreloadSize = l;
        this.useSimPlayer = bool4;
    }
}
