package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class PrefetchSchemaConfig {

    @C09CT("sku_prefetch")
    public final SkuPrefetchConfig skuPrefetch;

    public PrefetchSchemaConfig() {
        this(null);
    }

    public PrefetchSchemaConfig(SkuPrefetchConfig skuPrefetchConfig) {
        this.skuPrefetch = skuPrefetchConfig;
    }
}
