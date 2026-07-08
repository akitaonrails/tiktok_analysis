package com.ss.android.ugc.aweme.performance.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes21.dex */
public final class PhotoImageLightenConfig {

    @C09CT("custom_cache_size")
    public final int customCacheSize;

    @C09CT("enable_custom_cache")
    public final boolean enable;

    @C09CT("enable_fallback_main_disk")
    public final boolean enableFallBackMainDisk;

    @C09CT("include_explore")
    public final boolean includeExplore;

    @C09CT("include_general_search")
    public final boolean includeGeneralSearch;

    @C09CT("low_storage_cache_size")
    public final int lowStorageCacheSize;

    public PhotoImageLightenConfig() {
        this(false, 30, 12, false, false, false);
    }

    public PhotoImageLightenConfig(boolean z, int i, int i2, boolean z2, boolean z3, boolean z4) {
        this.enable = z;
        this.customCacheSize = i;
        this.lowStorageCacheSize = i2;
        this.enableFallBackMainDisk = z2;
        this.includeGeneralSearch = z3;
        this.includeExplore = z4;
    }
}
