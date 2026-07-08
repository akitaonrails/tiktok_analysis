package com.ss.android.ugc.aweme.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class GeckoCountConfig {

    @C09CT("ad_landing_page_preload_cache_count")
    public final int h5PageGeckoCacheCount;

    @C09CT("ad_iab_loading_format_preload_cache_count")
    public final int loadingFormatGeckoCacheCount;

    @C09CT("ad_lynx_page_preload_cache_count")
    public final int lynxPageGeckoCacheCount;

    @C09CT("ad_splash_page_preload_cache_count")
    public final int splashPageGeckoCacheCount;

    public GeckoCountConfig() {
        this(0, 0, 0, 2);
    }

    public GeckoCountConfig(int i, int i2, int i3, int i4) {
        this.h5PageGeckoCacheCount = i;
        this.splashPageGeckoCacheCount = i2;
        this.lynxPageGeckoCacheCount = i3;
        this.loadingFormatGeckoCacheCount = i4;
    }
}
