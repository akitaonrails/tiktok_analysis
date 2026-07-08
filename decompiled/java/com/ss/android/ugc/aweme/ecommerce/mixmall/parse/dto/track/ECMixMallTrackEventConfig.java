package com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class ECMixMallTrackEventConfig {

    @C09CT("ignore_cache")
    public int ignoreCache;

    @C09CT("once")
    public int isReportOnce;

    @C09CT("page_visible")
    public Integer pageVisible;

    public ECMixMallTrackEventConfig() {
        this(0, 0, null);
    }

    public ECMixMallTrackEventConfig(int i, int i2, Integer num) {
        this.isReportOnce = i;
        this.ignoreCache = i2;
        this.pageVisible = num;
    }
}
