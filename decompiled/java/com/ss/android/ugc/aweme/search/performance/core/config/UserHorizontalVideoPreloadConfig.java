package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class UserHorizontalVideoPreloadConfig {

    @C09CT("enable_user_horizontal_card_video_opt")
    public final boolean enableUserVideoOpt;

    @C09CT("enable_user_horizontal_card_video_preload")
    public final boolean enableUserVideoPreload;

    @C09CT("enable_user_horizontal_card_video_prepare")
    public final boolean enableUserVideoPrepare;

    @C09CT("preload_delay_time")
    public final long preloadDelayTime;

    @C09CT("prepare_buffering_percent")
    public final long prepareBufferingPercent;

    public UserHorizontalVideoPreloadConfig() {
        this(false, false, false, 0L, 0L);
    }

    public UserHorizontalVideoPreloadConfig(boolean z, boolean z2, boolean z3, long j, long j2) {
        this.enableUserVideoOpt = z;
        this.enableUserVideoPreload = z2;
        this.enableUserVideoPrepare = z3;
        this.preloadDelayTime = j;
        this.prepareBufferingPercent = j2;
    }
}
