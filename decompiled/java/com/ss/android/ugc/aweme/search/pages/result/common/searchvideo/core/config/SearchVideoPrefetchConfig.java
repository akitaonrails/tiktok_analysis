package com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchVideoPrefetchConfig {

    @C09CT("enable_normal_prefetch")
    public final boolean enableNormalPrefetch;

    @C09CT("enable_normal_prepare")
    public final boolean enableNormalPrepare;

    @C09CT("enable_pressed_prefetch")
    public final boolean enablePressedPrefetch;

    @C09CT("enable_pressed_prepare")
    public final boolean enablePressedPrepare;

    public SearchVideoPrefetchConfig() {
        this(false, false, false, false);
    }

    public SearchVideoPrefetchConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.enableNormalPrefetch = z;
        this.enableNormalPrepare = z2;
        this.enablePressedPrefetch = z3;
        this.enablePressedPrepare = z4;
    }
}
