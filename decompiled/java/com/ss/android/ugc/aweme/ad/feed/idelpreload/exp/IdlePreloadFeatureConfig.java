package com.ss.android.ugc.aweme.ad.feed.idelpreload.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class IdlePreloadFeatureConfig {

    @C09CT("feature_name")
    public final String resourceName;

    @C09CT("weight")
    public final double weight;

    public IdlePreloadFeatureConfig() {
        this("", 1.0d);
    }

    public IdlePreloadFeatureConfig(String str, double d) {
        this.resourceName = str;
        this.weight = d;
    }
}
