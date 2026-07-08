package com.ss.android.ugc.aweme.coldcache.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ColdCacheExtensionsConfig {

    @C09CT("enable_topview_brand_safety")
    public final boolean enableTopviewBrandSafety;

    @C09CT("retain_brand_safety_video")
    public final boolean retainBrandSafetyVideo;

    public ColdCacheExtensionsConfig() {
        this(false, false);
    }

    public ColdCacheExtensionsConfig(boolean z, boolean z2) {
        this.enableTopviewBrandSafety = z;
        this.retainBrandSafetyVideo = z2;
    }
}
