package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class SkuPrefetchConfig {

    @C09CT("duration")
    public final int duration;

    @C09CT("enable")
    public final Boolean enable;

    public SkuPrefetchConfig() {
        this(null, 0);
    }

    public SkuPrefetchConfig(Boolean bool, int i) {
        this.enable = bool;
        this.duration = i;
    }
}
