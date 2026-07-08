package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class AnoleVideoPreloadModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_auto_clean")
    public final boolean enableAutoClean;

    @C09CT("auto_clean_file_ttl")
    public final Long fileTTL;

    @C09CT("auto_clean_max_size")
    public final Integer maxCacheSize;

    @C09CT("auto_clean_strategy")
    public final String videoPreloadStrategy;

    public AnoleVideoPreloadModel() {
        this(false, false, "LRU", 209715200, 1296000000L);
    }

    public AnoleVideoPreloadModel(boolean z, boolean z2, String str, Integer num, Long l) {
        this.enable = z;
        this.enableAutoClean = z2;
        this.videoPreloadStrategy = str;
        this.maxCacheSize = num;
        this.fileTTL = l;
    }
}
