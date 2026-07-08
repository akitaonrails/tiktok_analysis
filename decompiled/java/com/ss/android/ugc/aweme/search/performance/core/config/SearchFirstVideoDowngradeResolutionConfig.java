package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchFirstVideoDowngradeResolutionConfig {

    @C09CT("downgrade_resolution")
    public final String downgradeResolution;

    @C09CT("enable_downgrade_resolution")
    public final boolean enableDowngradeResolution;

    public SearchFirstVideoDowngradeResolutionConfig() {
        this(false, "540p");
    }

    public SearchFirstVideoDowngradeResolutionConfig(boolean z, String str) {
        this.enableDowngradeResolution = z;
        this.downgradeResolution = str;
    }
}
