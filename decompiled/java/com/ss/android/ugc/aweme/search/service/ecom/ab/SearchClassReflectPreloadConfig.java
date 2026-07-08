package com.ss.android.ugc.aweme.search.service.ecom.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchClassReflectPreloadConfig {

    @C09CT("preload_delay_time")
    public final long preloadDelayTime;

    @C09CT("search_class_reflect_preload_phase")
    public final String searchClassReflectPreloadPhase;

    public SearchClassReflectPreloadConfig() {
        this(0L, "");
    }

    public SearchClassReflectPreloadConfig(long j, String str) {
        this.preloadDelayTime = j;
        this.searchClassReflectPreloadPhase = str;
    }
}
