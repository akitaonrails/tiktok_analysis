package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SecondVideoPreloadConfig {

    @C09CT("enable_search_second_video_preload")
    public final boolean enableSearchSecondVideoPreload;

    @C09CT("enable_search_second_video_preload_in_chunk")
    public final boolean enableSearchSecondVideoPreloadInChunk;

    @C09CT("enable_search_second_video_prepare")
    public final boolean enableSearchSecondVideoPrepare;

    @C09CT("enable_search_second_video_prepare_in_main_thread")
    public final boolean enableSearchSecondVideoPrepareInMainThread;

    @C09CT("preload_delay_time")
    public final long preloadDelayTime;

    public SecondVideoPreloadConfig() {
        this(false, false, false, false, 0L);
    }

    public SecondVideoPreloadConfig(boolean z, boolean z2, boolean z3, boolean z4, long j) {
        this.enableSearchSecondVideoPreload = z;
        this.enableSearchSecondVideoPrepare = z2;
        this.enableSearchSecondVideoPreloadInChunk = z3;
        this.enableSearchSecondVideoPrepareInMainThread = z4;
        this.preloadDelayTime = j;
    }
}
